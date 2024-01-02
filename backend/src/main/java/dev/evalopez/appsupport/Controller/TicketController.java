package dev.evalopez.appsupport.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import dev.evalopez.appsupport.Model.Ticket;
import dev.evalopez.appsupport.Service.TicketService;

@RestController
// @RequestMapping("/api/tickets")
@RequestMapping("${api-endpoint}/tickets") 
public class TicketController {

    private final TicketService ticketService;

    @Autowired
    public TicketController(TicketService ticketService) {
        this.ticketService = ticketService;
    }

    @GetMapping
    public List<Ticket> listAll() {
        return ticketService.getAll();
    }

    @PostMapping
    public Ticket save(@RequestBody Ticket entity) {
        return ticketService.save(entity);
    }

    @PostMapping("/editTicket/{id}")
    public Ticket update(@PathVariable Long id, @RequestBody Ticket entity) {
        return ticketService.save(entity);
    }

    @DeleteMapping("/deleteTicket/{id}")
    public void delete(@PathVariable Long id) {  
        ticketService.delete(ticketService.findById(id));
    }

    @GetMapping("/findById")
    public ResponseEntity<Ticket> findById(@RequestParam Long id) {
    Ticket ticket = ticketService.findById(id);    
    if (ticket != null) {
        return new ResponseEntity<>(ticket, HttpStatus.OK);
    } else {
        return new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }
    }    
}


  
    

