/*
*
* In the following 10 digit number:
* 123456789
* 67890 is the greatest sequence of 5 consecutive digits.
*
* Complete the solution so that it returns the greatest sequence of five consecutive digits found within the number given. The number will be passed in as a string of only digits. It should return a five digit integer. The number passed may be as large as 1000 digits.
*
* */

public class LargestFiveDigitNumber {

    public static void main(String[] args) {
        System.out.println(solve("1234567890")); //67890
        System.out.println(solve("283910")); //83910
        System.out.println(solve("987654321")); //98765
    }

//    public static int solve(final String digits) {
//        int digitLength = digits.length();
//
//        int startSub = 0;
//        int endSub = 5;
//
//        int largestDigit = 0;
//        int currentDigit;
//
//        for(int i = 0; i < digits.length(); i += 1) {
//            if(startSub > digitLength || endSub > digitLength){
//                return largestDigit;
//            }
//
//            currentDigit = Integer.parseInt(digits.substring(startSub, endSub));
//
//            largestDigit = Math.max(largestDigit, currentDigit);
//
//            startSub += 1;
//            endSub += 1;
//        }
//
//        return largestDigit;
//    }

    //Refactored!
    public static int solve(final String digits) {
        int largestDigit = 0;

        for(int i = 0; i < digits.length() - 4; i += 1) {
            int currentDigit = Integer.parseInt(digits.substring(i, i+5));
            largestDigit = Math.max(largestDigit, currentDigit);
        }

        return largestDigit;
    }
}
