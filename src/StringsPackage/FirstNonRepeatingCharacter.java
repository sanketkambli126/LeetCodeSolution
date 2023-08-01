package StringsPackage;

import java.util.HashMap;
import java.util.Map;

/*First Non-Repeating Character
Write a function that takes in a string of lowercase English-alphabet letters and returns the
index of the string's first non-repeating character.
The first non-repeating character is the first character in a string that occurs only once.
If the input string doesn't have any non-repeating characters, your function should return
-1.*/
public class FirstNonRepeatingCharacter {
 public int firstNonRepeatingCharacter(String string) {
     Map<Character, Integer> mapChracters = new HashMap<>();
     for (int i = 0; i < string.length(); i++) {
            insertMap(mapChracters, string.charAt(i));
        }
      for (int i = 0; i < string.length(); i++) {
            if(mapChracters.get(string.charAt(i))==1)
                return i;
        }
    return -1;
  }
 public Map<Character, Integer> insertMap(Map<Character, Integer> insertMap, Character ch) {
        if (insertMap.containsKey(ch)) {
            Integer value = insertMap.get(ch);
            insertMap.put(ch, value + 1);
        } else {
            insertMap.put(ch, 1);
        }
        return insertMap;
    }
    public static void main(String[] args) {
        FirstNonRepeatingCharacter firstNonRepeatingCharacter=new FirstNonRepeatingCharacter();
        System.out.println(firstNonRepeatingCharacter.firstNonRepeatingCharacter("abcdad"));
    }
}
