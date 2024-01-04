package dev.evalopez.appsupport.Controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import dev.evalopez.appsupport.Model.Ticket;
import dev.evalopez.appsupport.Service.TicketService;

@RestController
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

    @DeleteMapping("/delete/{id}")
    public void delete(@PathVariable Long id) {  
        ticketService.delete(ticketService.findById(id));
    }    

    @GetMapping("/{id}")
    public ResponseEntity<?> findById(@PathVariable Long id) {
    Ticket ticket = ticketService.findById(id);    
    if (ticket != null) {
        return new ResponseEntity<>(ticket, HttpStatus.OK);
    } else {
        Map<String, String> response = new HashMap<>();
        response.put("message", "Ticket no encontrado");
        return new ResponseEntity<>(response, HttpStatus.NOT_FOUND);
    }
    }
}


  
    

