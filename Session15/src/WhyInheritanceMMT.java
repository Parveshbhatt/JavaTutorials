
class FlightBooking{
	
	String from;
	String to;
	String departureDate;
	int numOfTravellers;
	String travelClass;
	
	FlightBooking(){
		
	}

	FlightBooking(String from, String to, String departureDate, int numOfTravellers, String travelClass) {
		this.from = from;
		this.to = to;
		this.departureDate = departureDate;
		this.numOfTravellers = numOfTravellers;
		this.travelClass = travelClass;
	}
	
	void show() {
		System.out.println("~~~~~~~~~~~~~~");
		System.out.println("Flight Details");
		System.out.println("~~~~~~~~~~~~~~~~~~");
		System.out.println("FROM: "+from+" TO: "+to);
		System.out.println("DEPARTURE: "+departureDate);
		System.out.println("TRAVELLERS: "+numOfTravellers+" CLASS: "+travelClass);
	}
}


// RoundTripFlightBooking IS-A  FlightBooking

class RoundTripFlightBooking extends FlightBooking{
	
	String returnDate;

	RoundTripFlightBooking() {
		super();
		// TODO Auto-generated constructor stub
	}

	RoundTripFlightBooking(String from, String to, String departureDate, int numOfTravellers, String travelClass, String returnDate) {
		super(from, to, departureDate, numOfTravellers, travelClass);
		this.returnDate = returnDate;
	}
	
	void show() {
		super.show();
		System.out.println("RETURN: "+returnDate);
	}
	
}


public class WhyInheritanceMMT {

	public static void main(String[] args) {

		FlightBooking oneWay = new FlightBooking("Delhi", "Bangalore", "7 Aug 2021", 1, "economy");
		oneWay.show();
		
		// Direct Object Construction
		// RoundTripFlightBooking twoWay = new RoundTripFlightBooking(null, null, null, 0, null, null);
		
		// Polymorphic Object Construction
		// Reference of Parent can refer to the Object Of Child :) *But vice versa is not possible
		
		FlightBooking twoWay = new RoundTripFlightBooking("Delhi", "Bangalore", "7 Aug 2021", 1, "economy", "8 Aug 2021");
	    
		twoWay.from = "Ludhiana";
		
	/// 	twoWay.returnDate = "9 Aug";  => not accessible 
		
		twoWay.show();
	
		Object i = 10; 
		System.out.println(i);
		
		
		
	}

}
