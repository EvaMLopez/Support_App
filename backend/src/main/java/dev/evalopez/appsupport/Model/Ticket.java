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
    private Long idTicket;

    @Column(name = "status_ticket")
    private String statusTicket;

    @Column(name = "type_ticket")
    private String typeTicket;

    @Column(name = "date_ticket")
    @CreatedDate
    private Date dateTicket;

    public Ticket() {
    }

    public Ticket(Long idTicket, String statusTicket, String typeTicket, Date dateTicket) {
        this.idTicket = idTicket;
        this.statusTicket = statusTicket;
        this.typeTicket = typeTicket;
        this.dateTicket = dateTicket;
    }

    public Long getIdTicket() {
        return idTicket;
    }

    public void setIdTicket(Long idTicket) {
        this.idTicket = idTicket;
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

}
