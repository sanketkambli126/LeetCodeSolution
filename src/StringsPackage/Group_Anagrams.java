package StringsPackage;

import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
//import java.util.concurrent.CopyOnWriteArrayList;

/*✩ Group Anagrams ✩
Write a function that takes in an array of strings and groups anagrams together.
Anagrams are strings made up of exactly the same letters, where order doesn't matter. For example, "cinema" and "iceman" are anagrams; similarly, "foo" and "ofo" are
anagrams.
Your function should return a list of anagram groups in no particular order.*/
public class Group_Anagrams {

    public static List<List<String>> groupAnagrams(List<String> words) {
        List<List<String>> opList = new ArrayList<List<String>>();
        List<String> innerList = new ArrayList<String>();
        for (String elem : words) {
            char array[] = elem.toCharArray();
            Arrays.sort(array);
            innerList.add(String.valueOf(array));
        }
        List<String> innerOpList = new ArrayList<String>();
        /* for (int i = 0; i < innerList.size(); i++) {
            
            if (i = 0) {
                innerOpList.clear();
                innerOpList.add(words.get(0));
            } else if (innerList.get(0) == innerList.get(i)) {
                innerOpList.add(words.get(i));
                innerList.set(i, "")
            } else if (i == innerList.size() - 1) {
                i = 0;
            }

        }*/
        for (int i = 0; i < innerList.size(); i++) {
            String value = innerList.get(i);
            innerList.indexOf(value);
        }
        return  opList;
    }

    public static void main(String[] args) {
        System.out.println("hi");
        groupAnagrams(List.of("yo", "act", "flop", "tac", "foo", "cat", "oy", "olfp"));
    }

}
