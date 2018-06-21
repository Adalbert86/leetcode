
public class Solution {

    public int letterValue(char l) {

        switch(l) {

            case 'I':
                return 1;

            case 'V':
                return 5;

            case 'X':
                return 10;

            case 'L':
                return 50;

            case 'C':
                return 100;

            case 'D':
                return 500;

            case 'M':
                return 1000;

            default:
                throw new RuntimeException("Invalid letter");
        }

    }

    public int romanToInt(String s) {
        
        int value = 0;
        int minusValue = 0;

        for (int i = 0; i < s.length(); i++) {

            int currentValue = letterValue(s.charAt(i));
            value += currentValue;

            if ( i > 0 && minusValue < currentValue) {

                value -= 2*minusValue;
            }

            minusValue = currentValue;
        }

        return value;
    }

    public static void main(String[] args) {
       
        Solution app = new Solution();

        String input;
        int gg, expectedOut;

        input = "III";
        expectedOut = 3;
        if ( (gg = app.romanToInt(input)) != expectedOut )
            throw new RuntimeException(String.format("For %s expected %d and got %d", input, expectedOut, gg));

        input = "IV";
        expectedOut = 4;
        if ( (gg = app.romanToInt(input)) != expectedOut )
            throw new RuntimeException(String.format("For %s expected %d and got %d", input, expectedOut, gg));

        input = "IX";
        expectedOut = 9;
        if ( (gg = app.romanToInt(input)) != expectedOut )
        throw new RuntimeException(String.format("For %s expected %d and got %d", input, expectedOut, gg));

        input = "LVIII";
        expectedOut = 58;
        if ( (gg = app.romanToInt(input)) != expectedOut )
        throw new RuntimeException(String.format("For %s expected %d and got %d", input, expectedOut, gg));

        input = "MCMXCIV";
        expectedOut = 1994;
        if ( (gg = app.romanToInt(input)) != expectedOut )
        throw new RuntimeException(String.format("For %s expected %d and got %d", input, expectedOut, gg));

        System.out.println("All good!");

    }


}