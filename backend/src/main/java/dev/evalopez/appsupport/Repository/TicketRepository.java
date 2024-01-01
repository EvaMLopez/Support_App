package dev.evalopez.appsupport.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import dev.evalopez.appsupport.Model.Ticket;

public interface TicketRepository extends JpaRepository <Ticket, Long> {
    
}
