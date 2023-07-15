package com.ticketTracker.ticketTracker.entity;


	
	import javax.persistence.Column;
	import javax.persistence.Entity;
	import javax.persistence.GeneratedValue;
	import javax.persistence.GenerationType;
	import javax.persistence.Id;
	import javax.persistence.Table;

	import lombok.AllArgsConstructor;
	import lombok.Data;
	import lombok.NoArgsConstructor;

	@Data
	@NoArgsConstructor
	@AllArgsConstructor
	@Table(name = "tickets")
	@Entity
	public class Ticket {

		@GeneratedValue(strategy = GenerationType.IDENTITY)
		@Id
		@Column(name = "id")
		private int id;
		@Column(name = "tkt_title")
		private String ticketTitle;
		@Column(name = "tkt_short_desc")
		private String ticketShortDesc;
		@Column(name = "tkt_created_on")
		private String ticketCreatedOn;
		@Column(name = "tkt_content")
		private String ticketContent;
		public int getId() {
			return id;
		}
		public void setId(int id) {
			this.id = id;
		}
		public String getTicketTitle() {
			return ticketTitle;
		}
		public void setTicketTitle(String ticketTitle) {
			this.ticketTitle = ticketTitle;
		}
		public String getTicketShortDesc() {
			return ticketShortDesc;
		}
		public void setTicketShortDesc(String ticketShortDesc) {
			this.ticketShortDesc = ticketShortDesc;
		}
		public String getTicketCreatedOn() {
			return ticketCreatedOn;
		}
		public void setTicketCreatedOn(String ticketCreatedOn) {
			this.ticketCreatedOn = ticketCreatedOn;
		}
		public String getTicketContent() {
			return ticketContent;
		}
		public void setTicketContent(String ticketContent) {
			this.ticketContent = ticketContent;
		}

	}
