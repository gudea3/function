import org.junit.Assert;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

public class CharNumberTest {

    Map<String, String> list = new HashMap<String, String>();

    @Test
    public void testSplit() {
        System.out.println("split corect");
        String a = "I want four apples";
        CharNumber charNumber = new CharNumber();
        String[] expectedResult = new String[]{"i", "want", "four", "apples"};
        String[] finalResult = charNumber.splitArray(a);
        Assert.assertEquals(expectedResult, finalResult);

    }

    @Test
    public void testChangeCharacterToNumber() {
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
        System.out.println("change corect");
        String a = "I want 4 apples";
        CharNumber charNumber = new CharNumber();
        String[] expectedResult = new String[]{"i", "want", "4", "apples"};
        String[] finalResult = charNumber.changeCharacterToNumber(charNumber.splitArray(a), list);
        Assert.assertEquals(expectedResult, finalResult);

    }

    @Test
    public void testPrintNewSentance() {
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
        System.out.println("print corect");
        String a = "I want four apples";
        CharNumber charNumber = new CharNumber();
        String expectedResult = "i want 4 apples";
        String finalResult = charNumber.printNewSentance(charNumber.changeCharacterToNumber(charNumber.splitArray(a), list));
        Assert.assertEquals(expectedResult, finalResult);

    }
}

