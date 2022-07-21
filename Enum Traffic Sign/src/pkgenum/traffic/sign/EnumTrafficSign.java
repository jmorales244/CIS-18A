package pkgenum.traffic.sign;

import java.util.*;
import java.util.concurrent.TimeUnit;


/**
 *
 * @author Jheremy Morales
 */
public class EnumTrafficSign {

    enum TrafficSignal {
        RED,
        GREEN,
        YELLOW,
        WALK,
        DONT_WALK
    }
    
    public static void main(String[] args) {
        
        TrafficSignal myRedSign = TrafficSignal.RED;
        TrafficSignal myYLWSign = TrafficSignal.RED;
        TrafficSignal myGRNSign = TrafficSignal.RED;

        
        System.out.println(myRedSign); 
        try{
            Thread.sleep(5000);
        }
        catch(Exception ex){
            System.out.println(myYLWSign); 

        }
        
        
    }
}

