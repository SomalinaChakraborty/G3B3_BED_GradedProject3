package com.ticketTracker.ticketTracker.service;


import java.util.List;

import com.ticketTracker.ticketTracker.entity.Ticket;

	

	public interface TicketService {

		public List<Ticket> getAllTickets(String query);

		public void saveTicket(Ticket tkt);

		public int deleteTicket(int tkt_num);

		public Ticket findByNum(int tkt_num);

//		List<Ticket> searchTickets(String query);

	}

