/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package B_Java_Classes_Objects;

/**
 *
 * @author Dananjaya
 */
public class PersonMainClass {
    
     public static void main(String args[]){
         
         
         Person p1 = new Person();
         p1.setPID("101010");
         p1.setName("Dananajya");
         
         
         p1.displayDetails();
         
         
         System.out.println();
         
         
         Person p2 = new Person("Dilan");
         p2.displayDetails();
         
         
     }
    
}
