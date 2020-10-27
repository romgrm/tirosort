package fr.romgrm;

import java.util.ArrayList;
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

    ArrayList<String> name = new ArrayList<String>();
    
    public  String remplirTableau(){
        name.add("Romain"); 
        name.add("Trystan");
        name.add("Lucas");
        name.add("Amin"); 
    }
    public static void main(String[] args) {
        System.out.println(name);
    }
}
