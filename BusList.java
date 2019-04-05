package collections;
import java.util.*;
public class BusList {
	List<Busses> bus = new ArrayList<Busses>();
	public void busesList() {
		
		Busses b = new Busses();
		b.travels= "diwakar travels";
		b.busNo="diwakar 222";
		b.ac="non-ac";
		b.sleeper="semiSleeper";
		bus.add(b);
		b.ab = new Busesjourney();
		b.ab.pickupPoint ="peddapalli";
		b.ab.dropping ="Banagalore";
	
		
		Busses b1 = new Busses();
		b1.travels= "Apoorva travels";
		b1.busNo ="apoorva 325";
		b1.ac="ac";
		b1.sleeper="Sleeper";
		bus.add(b1);
		b1.ab = new Busesjourney();
		b1.ab.pickupPoint ="Banagalore";
		b1.ab.dropping ="Karimnagar";
		
		
		Busses b2 = new Busses();
		b2.travels= "ravi kiran travels";
		b2.busNo ="ravi kiran 35";
		b2.ac="non-ac";
		b2.sleeper="semiSleeper";
		bus.add(b2);
		b2.ab = new Busesjourney();
		b2.ab.pickupPoint ="Banagalore";
		b2.ab.dropping ="peddapalli";
		
		
		Busses b3 = new Busses();
		b3.travels= "diwakar travels";
		b3.busNo="diwakar 111";
		b3.ac="ac";
		b3.sleeper="Sleeper";
		bus.add(b3);
		b3.ab = new Busesjourney();
		b3.ab.pickupPoint ="Karimnagar";
		b3.ab.dropping ="Banagalore";
		
		

		Busses b4 = new Busses();
		b4.travels= "Apoorva travels";
		b4.busNo="apoorva 121";
		b4.ac="ac";
		b4.sleeper="semiSleeper";
		bus.add(b4);
		b4.ab = new Busesjourney();
		b4.ab.pickupPoint ="Rajamandri";
		b4.ab.dropping ="Hyderabad";
		
		//System.out.println("    travels"+"\t     "+"bus no"+"\t  "+"conditioning"+"\t"+"type"+"\t"+"from"+"\t"+"to");
	for(Busses bu:bus) {
	
		System.out.println(bu.travels+"\t "+bu.busNo+"\t "+bu.ac+"\t   "+bu.sleeper+"\t"+bu.ab.pickupPoint+"\t"+bu.ab.dropping);
	}
				
	}
}
