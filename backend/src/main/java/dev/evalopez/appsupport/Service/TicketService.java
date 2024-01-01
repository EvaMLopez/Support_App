package dev.evalopez.appsupport.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import dev.evalopez.appsupport.Model.Ticket;
import dev.evalopez.appsupport.Repository.TicketRepository;

@Service
public class TicketService implements GenericService<Ticket> {

    private final TicketRepository ticketRepository;

    @Autowired
    public TicketService(TicketRepository ticketRepository) {
        this.ticketRepository = ticketRepository;
    }

    @Override
    public List<Ticket> getAll() {
        return ticketRepository.findAll();
    }

    @Override
    public Ticket save(Ticket entity) {
        return ticketRepository.save(entity);
    }

    @Override
    public Ticket update(Ticket entity) {
        return ticketRepository.save(entity);
    }

    @Override
    public void delete(Ticket entity) {  
        ticketRepository.delete(entity);
    }

    @Override
    public Ticket findById(Long id) {
        return ticketRepository.findById(id).orElse(null);        
    }
}