import java.util.*;

class Program {

    public static final int ALBHABATE_COUNT = 26;

    public static String CaesarCypherEncryptor(String inputString, int shiftBy) {
        shiftBy = shiftBy % ALBHABATE_COUNT;
        String outputString = "";
        if (shiftBy == 0) {
            outputString = inputString;
        } else {
            Character[] alphabates = new Character[]{'a', 'b', 'c', 'd', 'e', 'f',
                    'g', 'h', 'i', 'j', 'k', 'l',
                    'm', 'n', 'o', 'p', 'q', 'r',
                    's', 't', 'u', 'v', 'w', 'x',
                    'y', 'z'};
            Map<Character, Character> toCharMapping = new HashMap<>();
            for (int i = 0; i < alphabates.length; i++) {
                toCharMapping.put(alphabates[i], alphabates[(i + shiftBy) % ALBHABATE_COUNT]);
            }

            for (int i = 0; i < inputString.length(); i++) {
                outputString += toCharMapping.get(inputString.charAt(i));
            }

        }
        return outputString;
    }
}
