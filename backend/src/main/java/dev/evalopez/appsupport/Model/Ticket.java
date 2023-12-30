package dev.evalopez.appsupport.Model;

import java.sql.Date;


import org.springframework.data.annotation.CreatedDate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;


@Entity(name = "Ticket")
public class Ticket {    
  
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_ticket")
    private Long id;

    @Column(name = "status_ticket")
    private String statusTicket;

    @Column(name = "type_ticket")
    private String typeTicket;

    @Column(name = "date_ticket")
    @CreatedDate
    private Date dateTicket;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getStatusTicket() {
        return statusTicket;
    }

    public void setStatusTicket(String statusTicket) {
        this.statusTicket = statusTicket;
    }

    public String getTypeTicket() {
        return typeTicket;
    }

    public void setTypeTicket(String typeTicket) {
        this.typeTicket = typeTicket;
    }

    public Date getDateTicket() {
        return dateTicket;
    }

    public void setDateTicket(Date dateTicket) {
        this.dateTicket = dateTicket;
    }

    public Ticket() {
    }

    public Ticket(Long id, String statusTicket, String typeTicket, Date dateTicket) {
        this.id = id;
        this.statusTicket = statusTicket;
        this.typeTicket = typeTicket;
        this.dateTicket = dateTicket;
    }


}
