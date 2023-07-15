package com.ticketTracker.ticketTracker.repsitory;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ticketTracker.ticketTracker.entity.Ticket;

public interface TicketRepository extends JpaRepository<Ticket, Integer> {
}


