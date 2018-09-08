import java.util.HashMap;
import java.util.Map;

public class CharNumber {


    public String[] splitArray(String sentance) {
        String[] splitSentance = sentance.toLowerCase().split(" ");
        return splitSentance;


    }

    public String [] changeCharacterToNumber(String[] array, Map<String, String> toCheck) {
        for (int i = 0; i < array.length; i++) {
            if (toCheck.containsKey(array[i])) {
                array[i] = toCheck.get(array[i]);
            }
        }
        return array;
    }

    public String printNewSentance(String [] array) {
        String sentance = "";
        for (int i=0; i<array.length; i++) {
           if (i==array.length-1) {
               sentance += array[i];
           } else  {
               sentance += array[i] + " ";
           }
        }
        return sentance;
    }
}

