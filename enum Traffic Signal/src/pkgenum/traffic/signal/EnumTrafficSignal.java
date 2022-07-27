package pkgenum.traffic.signal;

/**
 *
 * @author Jheremy Morales
 */
public class EnumTrafficSignal {

    enum TrafficSignal{
        RED(25),
        GREEN(20),
        YELLOW(4),
        WALK(21),
        DONT_WALK(22);
        
        // declare integer variable value
        private int value;
        // declare a constuctor to assign value
        private TrafficSignal(int value){
            // assign given value
            this.value = value;
        }
    }
    
	public static void main(String[] args) {
	    // print the details of traffic singnals
		System.out.println("Traffic Signals details are: \n");
		
		// use for each loop to print all enum values
		for(TrafficSignal t : TrafficSignal.values()){
		    System.out.println(t + " in " + t.value + " seconds\n");
		}
	}
}


