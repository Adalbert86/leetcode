
public class Solution {

    public String letterValue(int i) {

        switch(l) {

            case 1:
                return 'I';

            case 5:
                return 'V';

            case 10:
                return 'X';

            case 50:
                return 'L';

            case 100:
                return 'C';

            case 500:
                return 'D';

            case 1000:
                return 'M';

            default:
                throw new RuntimeException("Invalid letter");
        }

    }

    public String intToRoman(int num) {
        
        return "jhovno";
    }

    public static void main(String[] args) {
       
        Solution app = new Solution();

        int input;
        String gg, expectedOut;

        input = 3;
        expectedOut = "III";
        if ( (gg = app.intToRoman(input)) != expectedOut )
            throw new RuntimeException(String.format("For %d expected %s and got %s", input, expectedOut, gg));

        input = 4;
        expectedOut = "IV";
        if ( (gg = app.intToRoman(input)) != expectedOut )
            throw new RuntimeException(String.format("For %d expected %s and got %s", input, expectedOut, gg));

        input = 58;
        expectedOut = "LVIII";
        if ( (gg = app.intToRoman(input)) != expectedOut )
            throw new RuntimeException(String.format("For %d expected %s and got %s", input, expectedOut, gg));
                
        input = 1994;
        expectedOut = "MCMXCIV";
        if ( (gg = app.intToRoman(input)) != expectedOut )
            throw new RuntimeException(String.format("For %d expected %s and got %s", input, expectedOut, gg));

        System.out.println("All good!");

    }


}