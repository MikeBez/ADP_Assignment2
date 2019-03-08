package za.ac.cput.projects.Assignment2;

import java.util.HashMap;
import java.util.Map;

public class MapApp {

    public static void main(String [] args) {
        HashMap<Integer, String >  numbersMap = new HashMap<Integer, String>();

        numbersMap.put(1, "One");
        numbersMap.put(3, "Three");
        numbersMap.put(5, "Five");
        numbersMap.put(7, "Seven");
        numbersMap.put(9, "Nine");
        numbersMap.put(11, "Eleven");
        numbersMap.put(13, "Thirteen");

        //Iterate through map
        for (Map.Entry<Integer, String> entry: numbersMap.entrySet()){
            int key = entry.getKey();
            String value = entry.getValue();

            System.out.println(key + ": " + value);
        }
    }
}
