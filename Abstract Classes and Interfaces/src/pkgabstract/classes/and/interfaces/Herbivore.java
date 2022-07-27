/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkgabstract.classes.and.interfaces;

/**
 *
 * @author Jheremy
 */
public class Herbivore extends Animal {

    public Herbivore(){
    }

    @Override
    public void eat() {
        System.out.println(" " + getName() + " eat Plants");
    }

    @Override
    public void speak() {
        System.out.println(" " + getName() + " can speak");
    }

}