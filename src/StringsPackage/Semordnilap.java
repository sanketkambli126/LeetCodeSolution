package StringsPackage;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/*Semordnilap✩
Write a function that takes in a list of unique strings and returns a list of semordnilap pairs.
A semordnilap pair is defined as a set of different strings where the reverse of one word is the same as the forward version of the other. For example the words "diaper" and "repaid" are a semordnilap pair, as are the words "palindromes" and "semordnilap".
The order of the returned pairs and the order of the strings within each pair does not matter.*/
public class Semordnilap {

    public ArrayList<ArrayList<String>> semordnilap(String[] words) {
        Set<String> setStrings = new HashSet<String>();
        setStrings.addAll(Arrays.asList(words));
        ArrayList<ArrayList<String>> opArraylist = new ArrayList<ArrayList<String>>();
        for (String word : words) {
            String reverseWord = new StringBuilder(word).reverse().toString();
            if (setStrings.contains(reverseWord)&&!reverseWord.equals(word)) {
                ArrayList<String> innerList = new ArrayList<>();
                innerList.add(word);
                innerList.add(reverseWord);
                opArraylist.add(innerList);
                setStrings.remove(word);
                setStrings.remove(reverseWord);
            }
        }
        return opArraylist;
    }

    public static void main(String[] args) {
        Semordnilap semordnilap = new Semordnilap();
        System.out.println(semordnilap.semordnilap(new String[]{"diaper", "abc", "test", "cba", "repaid"}));
    }
}
