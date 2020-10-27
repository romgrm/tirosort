package fr.romgrm;

import java.util.ArrayList;
import java.util.Random;
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
