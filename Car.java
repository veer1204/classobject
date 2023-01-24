/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author veerc
 */
    
    class Color{
    public String color="red";
    public void Display(){
    System.out.println("red color");
    }
}
class Body{
    public String type="sedan";
    public void Display2(){
    System.out.println("sedan");
    }
}
public class Car{
    public static void main(String[] args){
    Color Car1= new Color();
    Car1.Display();
    Body Car2= new Body();
    Car2.Display2();
    }
}


