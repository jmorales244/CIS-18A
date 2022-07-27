package pkgabstract.classes.and.interfaces;

/**
 *
 * @author Jheremy Morales
 */
public class AbstractClassesAndInterfaces {

    public static void main(String[] args) {
        Animal h, c;
        h = new Herbivore();
        h.setName("Giraffe");
        h.sleep();
        h.eat();
        h.drink();
        h.walk();
        h.speak();
        c = new Carnivore();
        c.setName("Leapord");
        c.sleep();
        c.eat();
        c.drink();
        c.walk();
        c.speak();
    }   
}
    

