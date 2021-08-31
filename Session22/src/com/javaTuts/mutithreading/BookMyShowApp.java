package com.javaTuts.mutithreading;


import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;

class MovieTicket{
	
	String movieName;
	int seatNumber;
	char rowNumber;
	String timings;
	boolean isBooked = false;
	// int price;
	String customerEmail;
	String customerPhone;
	
	MovieTicket(){
		
	}
	
	

	MovieTicket(String movieName, int seatNumber, char rowNumber, String timings) {
		this.movieName = movieName;
		this.seatNumber = seatNumber;
		this.rowNumber = rowNumber;
		this.timings = timings;
	}



	@Override
	public String toString() {
		return "MovieTicket [movieName=" + movieName + ", seatNumber=" + seatNumber + ", rowNumber=" + rowNumber
				+ ", timings=" + timings + ", isBooked=" + isBooked + ", customerEmail=" + customerEmail
				+ ", customerPhone=" + customerPhone + "]";
	}


	
}
class BookMovieTicketTask extends Thread{

	String email;
	String phone;
	boolean isPrime;
	char rowNumber;
	int seatNumber;
	MovieTicket ticket;
	Map<Character, ArrayList<MovieTicket>> cinemaHall;
	
     BookMovieTicketTask() {
		
	}

	
	
	



BookMovieTicketTask(String email, String phone, boolean isPrime, char rowNumber, int seatNumber, 
			Map<Character, ArrayList<MovieTicket>> cinemaHall) {
		this.email = email;
		this.phone = phone;
		this.isPrime = isPrime;
		this.rowNumber = rowNumber;
		this.seatNumber = seatNumber;
		this.cinemaHall = cinemaHall;
	}







//   synchronized  void selectSeat() {
	   void selectSeat() {
		
		 ticket = cinemaHall.get(rowNumber).get(seatNumber-1);
		 
	}
	
//   synchronized void pay() {
	   void pay() {
		
		if(!ticket.isBooked) {
			System.out.println("Dear,"+email+" Pay Rs.200");
			System.out.println(email+"Please Wait. Transacting amount......");
			try {
				Thread.sleep(2000);
			} catch (Exception e) {
				e.printStackTrace();
			}
			
			System.out.println(email+ " Amount Transacted :)");
		
			ticket.isBooked = true;
			ticket.customerEmail = email;
			ticket.customerPhone = phone;
			
			System.out.println("~~~~~~~~~~~~~~~~~~~~~");
			System.out.println(email+ " YOUR MOVIE TICKET IS BOOKED");
			System.out.println(ticket);
			System.out.println("~~~~~~~~~~~~~~~~~~~~~");
			
			ticket.notify();
			
		}else {
			System.out.println("Sorry "+email+" Ticket "+rowNumber+" is already booked");
		}
		
	
	}
	
	@Override
	public void run() {
		
		
	

		selectSeat();
		// synchronized Block , take object reference and lock it, block other the access it until first one complete it's execution (this code run for this specific object only , than for other)
		synchronized (ticket) { // ticket must not be null
			if(!isPrime) {
			try {
				
				ticket.wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			  }
			}
			pay();
		}
		
		
	}
}

// Nodejs -> server used to 
// tomcat -> server run website , 10000 customer make 10000 threads 

public class BookMyShowApp {

	public static void main(String[] args) {
	
		System.out.println("BookMyShow app Started");
		
		Map<Character, ArrayList<MovieTicket>> cinemaHall = new LinkedHashMap<Character, ArrayList<MovieTicket>>();
		
		ArrayList<MovieTicket> list = new ArrayList<MovieTicket>();
		for(int i=1; i<=20; i++) {
//			MovieTicket ticket = new MovieTicket("Bell Bottom", i, 'A', "06:00 PM" );
//			list.add(ticket);
			
			list.add(new MovieTicket("Bell Bottom", i, 'A', "06:00 PM" ));
		}
		
		cinemaHall.put('A', list);
		
		list.forEach((ticket)->{
			System.out.println(ticket);
		});
		
		BookMovieTicketTask task1 = new BookMovieTicketTask("john@example.com", "9999911111", false, 'A',  1, cinemaHall);
		BookMovieTicketTask task2 = new BookMovieTicketTask("fionna@example.com", "9999922222",true,  'A', 1, cinemaHall);
		BookMovieTicketTask task3 = new BookMovieTicketTask("dave@example.com", "9999933333",true,  'A', 1, cinemaHall);
		
		task1.start();
		
//		task1.join();
		
		task2.start();
		task3.start();
		
		try {
			Thread.sleep(5000);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		list.forEach((ticket)->{
			System.out.println(ticket);
		});
		
		System.out.println("BookMyShow app Finished");

	}

}
