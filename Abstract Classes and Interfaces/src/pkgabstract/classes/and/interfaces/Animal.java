/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkgabstract.classes.and.interfaces;

/**
 *
 * @author Jheremy
 */
public abstract class Animal {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public void walk() {
        System.out.println(" " + name + " Can Walk");
    }

    public void drink() {
        System.out.println(" " + name + " Can Drink");
    }

    public void sleep() {
        System.out.println(" " + name + " Can Sleep");
    }

    public abstract void eat();
    public abstract void speak();

}
