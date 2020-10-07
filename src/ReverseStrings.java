/**
 *  Codewars
 *  Created by: https://www.codewars.com/users/jhoffner
 *  Instructions: Complete the solution so that it reverses the string passed into it.
 */

public class ReverseStrings {
    public static void main(String[] args) {
        System.out.println(reverseAString("world"));
    }

//  https://stackoverflow.com/questions/7569335/reverse-a-string-in-java
    public static String reverseAString(String str){
        return new StringBuffer(str).reverse().toString();
    }
}
