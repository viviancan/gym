package AdventOfCode;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;

public class AocD01 {

    public static void main(String[] args)  {
        System.out.println("********************");
        System.out.println("Advent of Code 2020");
        System.out.println("********************");

        try{
            Scanner scanner = new Scanner(new FileReader("input.txt"));

            ArrayList<Integer> numArray = new ArrayList<Integer>();

            while(scanner.hasNextInt()){
                numArray.add(scanner.nextInt());
            }

            HashSet<Integer> numberSet = new HashSet<>();

            for (int currentNum : numArray) {
                //find the corresponding number that matches up wit the current number
                int missingNum = 2020 - currentNum;

                //check if the number is in the set
                if (numberSet.contains(missingNum)) {
                    System.out.printf("%nFinal Answer: %d%n", (currentNum * missingNum));
                }
                numberSet.add(currentNum);
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }


//        int finalResult = 0;


//        for (int i = 0; i < numbers.length ; i += 1) {
//
//            for (int x = i + 1; x < numbers.length; x += 1) {
//                int numA = numbers[i];
//                int numB = numbers[x];
//                int total = numA + numB;
//
//                if (total == 2020) {
//                    finalResult = numA * numB;
//                    break;
//                }
//            }
//            if(finalResult >0){
//                System.out.println(finalResult);
//                break;
//            }
//        }
//
//        for (int i = 0; i < numbers.length-2 ; i += 1) {
//            for (int x = i + 1; x < numbers.length-1; x += 1) {
//                for(int y=x+1; y <numbers.length; y +=1){
//                    int numA = numbers[i];
//                    int numB = numbers[x];
//                    int numC = numbers[y];
//                    int total = numA + numB + numC;
//
//                    if (total == 2020) {
//                        finalResult = numA * numB * numC;
//                        System.out.println(finalResult);
//                        System.exit(0);
//
//                    }
//                }
//            }
//        }
    }
}

