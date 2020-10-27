package fr.romgrm;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;
/**
 * Hello world!
 */
public final class App {
    private App() {
    }

    /**
     * Says hello to the world.
     * @param args The arguments of the program.
     */
    
    
    public static void main(String[] args) {
        java.util.Scanner entrerNom = new java.util.Scanner(System.in);

        System.out.println("Entrer le prénom d'un participant : ");
        String prenom = entrerNom.next();

        System.out.println(prenom);
        ArrayList<String> name = new ArrayList<String>();
    
        name.add("Romain"); 
        name.add("Trystan");
        name.add("Lucas");
        name.add("Amin");
        
        Random random = new Random();

        for (int i = 0; i < name.size(); i++) {
            System.out.println(name.get(random.nextInt(name.size())));
        }

        
    }
}
