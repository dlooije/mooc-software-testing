package tudelft.roman;

import java.util.HashMap;
import java.util.Map;

public class RomanNumeral {

    private static Map<Character, Integer> map;

    static {
        map = new HashMap<Character, Integer>();
        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);
    }

    public int convertDaphne(String s) {
        //Convert a roman numeral string to a decimal
        //There are two rules:
        // 1. Read from left to right
        // 2. If the character at position i is less than the character at position i+1, subtract it

        // Check if all the characters are in the map, if not, return -1
        for (int i = 0; i < s.length(); ++i)
        {
            if (!map.containsKey(s.charAt(i)))
            {
                return -1;
            }
        }

        String temp = s;
        int result = 0;
        while (temp.length() > 0) {
            //If there is only one character, look it up and add it to the result
            if (temp.length() == 1) {
                result += map.get(temp.charAt(0));
                return result;
            }
            //If there is more than one character, but the first two characters are the same, the string is invalid
            else if (map.get(temp.charAt(1)) == map.get(temp.charAt(0)))
            {
                return -1;
            }
            //If the first character is less than the second, we have to subtract
            else if (map.get(temp.charAt(0)) < map.get(temp.charAt(1))) {
                //But if the difference between the characters is represented by some other character, the string is invalid
                if (map.containsValue(map.get(temp.charAt(1)) - map.get(temp.charAt(0))))
                {
                    return -1;
                }
                //Otherwise we can add the difference between the two characters to the result and remove the characters from the string
                else
                {
                    result += map.get(temp.charAt(1));
                    result -= map.get(temp.charAt(0));
                    temp = temp.substring(2);
                }
            }
            //Final situation, just add the value of the first character to the result and remove the character from the string
            else {
                result += map.get(temp.charAt(0));
                temp = temp.substring(1);
            }
        }
        return result;
    }

    public int convert(String s) {

        int convertedNumber = 0;
        for(int i = 0; i < s.length(); i++) {
            int currentNumber = map.get(s.charAt(i));
            int next = i+1 < s.length() ? map.get(s.charAt(i+1)) : 0;

            if(currentNumber >= next)
                convertedNumber += currentNumber;
            else
                convertedNumber -= currentNumber;
        }

        return convertedNumber;

    }
}
