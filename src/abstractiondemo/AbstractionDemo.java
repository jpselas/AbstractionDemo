/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package abstractiondemo;
import java.util.Scanner;
/**
 *
 * @author johnny
 */
public class AbstractionDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    Scanner input = new Scanner(System.in);
    int option = 0;
    int counter = -1;
    int year;
    int engineHP;
    String name;
    String manufacName;
    String engineSize;
    String color;
    String junk = "";
    String[] garage = new String[100];
    
        System.out.println("Welcome to What's in your Garage!");
    
    do{
        System.out.println("Please select type of vehicle [1]Car [2]Motorcylce [3]Boat ");
        option = input.nextInt();
        junk = input.nextLine();
        
        switch(option){
            
            case 1: 
                counter++;
                System.out.println("Please enter Year: ");
                year = input.nextInt();
                junk = input.nextLine();
                System.out.println("Please enter Engine HP: ");
                engineHP = input.nextInt();
                junk = input.nextLine();
                System.out.println("Please enter Name: ");
                name = input.nextLine();
                junk = input.nextLine();
                System.out.println("Please enter Manufacturer Name: ");
                manufacName = input.nextLine();
                junk = input.nextLine();
                System.out.println("Please enter Engine Size: ");
                engineSize = input.nextLine();
                junk = input.nextLine();
                System.out.println("Please enter color: ");
                color = input.nextLine();
                junk = input.nextLine();
                
                Vehicle car1 = new Car(year,engineHP,name,manufacName,engineSize,color);
                
                garage[counter] = car1.toString();
                
                break;
            
            case 2:  
                counter++;
                System.out.println("Please enter Year: ");
                year = input.nextInt();
                junk = input.nextLine();
                System.out.println("Please enter Engine HP: ");
                engineHP = input.nextInt();
                junk = input.nextLine();
                System.out.println("Please enter Name: ");
                name = input.nextLine();
                junk = input.nextLine();
                System.out.println("Please enter Manufacturer Name: ");
                manufacName = input.nextLine();
                junk = input.nextLine();
                System.out.println("Please enter Engine Size: ");
                engineSize = input.nextLine();
                junk = input.nextLine();
                System.out.println("Please enter color: ");
                color = input.nextLine();
                junk = input.nextLine();
                
                Vehicle motorcycle1 = new Motorcycle(year,engineHP,name,manufacName,engineSize,color);
                
                garage[counter] = motorcycle1.toString();
                
                break;
            
            case 3:
                counter++;
                System.out.println("Please enter Year: ");
                year = input.nextInt();
                junk = input.nextLine();
                System.out.println("Please enter Engine HP: ");
                engineHP = input.nextInt();
                junk = input.nextLine();
                System.out.println("Please enter Name: ");
                name = input.nextLine();
                junk = input.nextLine();
                System.out.println("Please enter Manufacturer Name: ");
                manufacName = input.nextLine();
                junk = input.nextLine();
                System.out.println("Please enter Engine Size: ");
                engineSize = input.nextLine();
                junk = input.nextLine();
                System.out.println("Please enter color: ");
                color = input.nextLine();
                junk = input.nextLine();
                
                Vehicle boat1 = new Boat(year,engineHP,name,manufacName,engineSize,color);
                
                garage[counter] = boat1.toString();
                
                break;
                
        }
        
        
        
        
        
        
    }while(option > 3 && option < 1);    
    
    
    
    
        
    }
    
}
