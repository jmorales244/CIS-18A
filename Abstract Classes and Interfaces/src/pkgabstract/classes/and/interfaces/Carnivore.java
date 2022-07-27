/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkgabstract.classes.and.interfaces;

/**
 *
 * @author Jheremy
 */
public class Carnivore extends Animal {

    public void Carnivores(){
    }
    @Override
    public void eat() {
        System.out.println(" " + getName() + " eats Meat");
    }

    @Override
    public void speak() {
        System.out.println(" " + getName() + " Can Speak");
    }
}
