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
 * Complexity  :   O(n) Time | O(1) Space ∈ n is the length of the input string
 */

import java.util.*;
import java.util.*;

class Program {

    public String runLengthEncoding(String string) {
        int size = string.length();
        String result = "";
        int i = 1;
        int currentRunLength = 1;
        for (; i < size ; i++) {
            Character prevChar = string.charAt(i-1);
            Character currentChar = string.charAt(i);

            if( (prevChar != currentChar) || (currentRunLength == 9)){
                result += currentRunLength;
                result += prevChar;
                currentRunLength =0;
            }
            currentRunLength++;
        }
        result += currentRunLength;
        result += string.charAt(size-1);

        return result;
    }
}

