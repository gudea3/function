import com.sun.corba.se.impl.orb.ParserTable;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {


        Map<String, String> list = new HashMap<String, String>();
        String sentance = "";

        list.put("zero", "0");
        list.put("one", "1");
        list.put("two", "2");
        list.put("three", "3");
        list.put("four", "4");
        list.put("five", "5");
        list.put("six", "6");
        list.put("seven", "7");
        list.put("eight", "8");
        list.put("nine", "9");

        String a = "I have four apples";
        String b = "I want twenty-nine dollars";
        String c = "I want twenty nine dollars";
        String d = "Five six SEVEN eiGHt!!";

        CharNumber charNumber = new CharNumber();

        System.out.println(charNumber.printNewSentance(charNumber.changeCharacterToNumber(charNumber.splitArray(a), list)));
    }
}