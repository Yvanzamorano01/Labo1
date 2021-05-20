/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bonjourname;
import aleatoire.*;
/**
 *
 * @author yzamo
 */
public class BonjourName {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Person john = new Person("John", "Joe", 35);
        System.out.println("Prenom : " + john.getFirstName());
        System.out.println("Nom : " + john.getLastName());
        Person yan = new Person("yan", "leclerc", 24);
        System.out.println("Bonjour John Doe !");
        
    }
}
