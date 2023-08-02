package StringsPackage;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.ConcurrentSkipListSet;

/*Common Characters ✩
Write a function that takes in a non-empty list of non-empty strings and returns a list of characters that are common to all strings in the list, ignoring multiplicity.
Note that the strings are not guaranteed to only contain alphanumeric characters. The list you
return can be in any order.*/
public class Common_Characters {

    public static String[] commonCharacters(String[] strings) {
        ConcurrentSkipListSet<Character> globalSet = new ConcurrentSkipListSet<Character>();

        for (int j = 0; j < strings.length; j++) {
            ConcurrentSkipListSet<Character> currentSet = new ConcurrentSkipListSet<Character>();
            String currentString = strings[j];
            for (int i = 0; i < currentString.length(); i++) {
                currentSet.add(currentString.charAt(i));
            }
            if (j == 0) {
                globalSet = currentSet;
            } else {
                for (Character character : globalSet) {
                    if (!currentSet.contains(character)) {
                        globalSet.remove(character);
                    }
                }
            }
        }
        String[] arrayOfString = new String[globalSet.size()];

        // Copy elements from set to string array
        // using advanced for loop
        int index = 0;
        for (Character str : globalSet) {
            arrayOfString[index++] = str.toString();
        }
        return arrayOfString;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(commonCharacters(new String[]{"abc", "bcd", "cbaccd"})));
    }
}
