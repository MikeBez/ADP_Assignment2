package za.ac.cput.projects.Assignment2;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class SetApp {

    public static void main(String []args){
        //Hash set does not retain order
       // Set<String> animalset = new HashSet<String>();

        //Linked Hash set retains order you added them in
        Set<String> animalset = new LinkedHashSet<String>();


        animalset.add("Tiger");
        animalset.add("Monkey");
        animalset.add("Zebra");
        animalset.add("Lemur");
        animalset.add("Cheetah");
        animalset.add("Panda");

        //Iteration
        for (String element: animalset){
            System.out.println(element);
        }

        //Does set contain specific item
        if (animalset.contains("Tiger")){
            System.out.println("\nContains Tiger");
        }

    }
}
