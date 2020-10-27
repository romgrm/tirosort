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
        Scanner entrerNom = new Scanner(System.in);

        System.out.println("Entrer le prénom d'un participant : ");
        String prenom = entrerNom.next("[[:alnum:]]");

        System.out.println("Le premier participant est : " + prenom);

        System.out.println("Entrer le prénom d'un autre participant : ");
        String prenom2 = entrerNom.next("[A-Za-z]*");

        System.out.println("Le second participant est : " + prenom2);

        ArrayList<String> name = new ArrayList<String>();
    
        name.add(prenom); 
        System.out.println(name);
        
        /*name.add("Trystan");
        name.add("Lucas");
        name.add("Amin");
        
        Random random = new Random();

        for (int i = 0; i < name.size(); i++) {
            System.out.println(name.get(random.nextInt(name.size())));
        }*/

        
    }
}
