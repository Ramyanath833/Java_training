package ticketing;

import java.util.ArrayList;
import java.util.List;


public class PassengerDao {
	
	public List<Passenger> getPassenger() {
	
	List<Passenger> pas = new ArrayList<>();
	
	pas.add(new Passenger(101,"Ram","Blr","Hyd",300));
	pas.add(new Passenger(102,"Rahul","chn","Hyd",500));
	pas.add(new Passenger(103,"Jevan","kol","Hyd",1000));
	pas.add(new Passenger(104,"Pratik","del","Hyd",1500));
	
	
	return pas;
	
	}

}
