package StringsPackage;

import java.util.HashMap;
import java.util.Map;

/*Generate Document✩
You're given a string of available characters and a string representing a document that you need to generate. Write a function that determines if you can generate the document using the available characters. If you can generate the document, your function should return true; otherwise, it should return false
You're only able to generate the document if the frequency of unique characters in the characters string is greater than or equal to the frequency of unique characters in the document string. For example, if you're given characters = "abcabc" and document = "aabbccc" you cannot generate the document because you're
missing one
The document that you need to create may contain any characters, including special characters, capital letters, numbers, and spaces.
Note: you can always generate the empty string ("")*/
public class Generate_Document {

    public boolean generateDocument(String characters, String document) {
        
        Map<Character, Integer> mapChracters = new HashMap<>();
        Map<Character, Integer> mapDocument = new HashMap<>();
        for (int i = 0; i < characters.length(); i++) {
            insertMap(mapChracters, characters.charAt(i));
        }
        for (int i = 0; i < document.length(); i++) {
            insertMap(mapDocument, document.charAt(i));
        }
        for (Map.Entry<Character, Integer> entry : mapDocument.entrySet()) {
            Character key = entry.getKey();
            Integer value = entry.getValue();
            if(!mapChracters.containsKey(key)||value>mapChracters.get(key))
                return false;
            
        }
        return true;
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
        Generate_Document generate_Document = new Generate_Document();
        System.out.println(generate_Document.generateDocument("Bste!hetsi ogEAxpelrt x ", "AlgoExpert is the Best!"));
    }
}
