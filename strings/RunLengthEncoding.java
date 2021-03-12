/**
 * Domain      :   Strings
 * Level       :   Easy
 * Sample Input:
    1.  string = AAA
        output = 3A
    2.  string = AAAAAAAAAAAA
        output = 9A3A
        explination : However, the input string can contain all sorts of special characters,
                    including numbers. And since encoded data must be decodable,
                    this means that we can't naively run-length-encode long runs. For
                    example, the run AAAAAAAAAAAA => 12A. This 12A can also be decoded as 1AA
 * Complexity  :   O(n^2) Time | O(1) Space ∈ n is the length of the input string
 */

import java.util.*;

class Program {
    public String getCorrectEncodingIfLengthValueIsMultipleDigits(Character currentCharacter, int characterCount) {
        String correctEncoding = "";
        int timesToInsertEncodedCharacter = characterCount / 9;
        int remainingCount = characterCount % 9;
        for (int i = 0; i < timesToInsertEncodedCharacter; i++) {
            correctEncoding += 9 + "" + currentCharacter;
        }
        if (remainingCount > 0) {
            correctEncoding += remainingCount + "" + currentCharacter;
        }
        return correctEncoding;
    }

    public String runLengthEncoding(String string) {
        int size = string.length();
        String result = "";
        int i = 0;
        for (; i < size - 1; ) {
            Character currentChar = string.charAt(i);
            System.out.println(i + " " + currentChar);
            int count = 1;
            int j = i + 1;
            for (; j < size; j++) {
                if (currentChar == string.charAt(j)) {
                    count++;
                } else {
                    break;
                }
            }

            if (count <= 9) {
                result += count + "" + currentChar;
            } else {
                result += getCorrectEncodingIfLengthValueIsMultipleDigits(currentChar, count);
            }
            i = j;
            System.out.println(result);
        }

        if (i == size - 1) {
            result += 1 + "" + string.charAt(size - 1);
        }

        return result;
    }
}
