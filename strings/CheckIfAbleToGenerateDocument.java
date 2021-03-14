/**
 * Domain      :   Strings
 * Level       :   Easy
 * Problem     :   You're given a string of available characters and a string representing a
                   document that you need to generate. Write a function that determines if you
                   can generate the document using the available characters. If you can generate
                   the document, your function should return true; otherwise it should return false
 * Complexity  :   O( n + m ) Time | O(c) Space ∈ n, m are the length of the input characters
                   and document strings and c is number of unique characters in characters string
 */
import java.util.*;

class Program {

    public boolean checkIfAbleTogenerateDocument(String characters, String document) {
        HashMap<Character, Integer> countByCharacter = new HashMap<>();
        for (int i = 0; i < characters.length(); i++) {
            Character currentChar = characters.charAt(i);
            countByCharacter.put(currentChar, countByCharacter.getOrDefault(currentChar, 0) + 1);
        }

        for (int i = 0; i < document.length(); i++) {
            Character currentChar = document.charAt(i);
            if (!countByCharacter.containsKey(currentChar) || countByCharacter.get(currentChar) == 0) {
                return false;
            }
            countByCharacter.put(currentChar, countByCharacter.get(currentChar) - 1);
        }
        return true;
    }
}