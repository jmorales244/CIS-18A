/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package software.reuse.and.pkgprotected.versus.pkgprivate.members;

/**
 *
 * @author Jheremy
 */

    class Vehicle {
        protected String brand = "Ford";        // Vehicle attribute
        public void honk() {                    // Vehicle method
            System.out.println("Tuut, tuut!");
        }
    }

    class Car extends Vehicle {
        public String modelName = "Mustang";    // Car attribute
    }

    public class SoftwareReuseAndProtectedVersusPrivateMembers {

        public static void main(String[] args) {
            
            Car myCar = new Car();
            
            // Call the honk() method (from the Vehicle class) on the myCar object
            myCar.honk();

            // Display the value of the brand attribute (from the Vehicle class) 
            //and the value of the modelName from the Car class
            //Change line 20 from public to private and this cannot compile!
            System.out.println(myCar.brand + " " + myCar.modelName); 
        }
    
}


