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

        ArrayList<Integer> numArray = new ArrayList<>();

        try{
            Scanner scanner = new Scanner(new FileReader("input.txt"));

            while(scanner.hasNextInt()){
                numArray.add(scanner.nextInt());
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        System.out.println("\nFinal Answer: " + partOne(numArray));
        System.out.println("\nFinal Answer: " + partTwo(numArray));

    }

    public static int partOne(ArrayList<Integer> numArray){
        int finalAns = 0;
        HashSet<Integer> numberSet = new HashSet<>();

        for (int currentNum : numArray) {
            //find the corresponding number that matches up wit the current number
            int missingNum = 2020 - currentNum;

            //check if the number is in the set
            if (numberSet.contains(missingNum)) {
                finalAns = currentNum * missingNum;
            }
            numberSet.add(currentNum);
        }

        return finalAns;

    }


    public static int partTwo(ArrayList<Integer> numArray){
        int finalAns = 0;

        HashSet<Integer> numberSet = new HashSet<>();

        for (int currentNum : numArray) {
            for(int currentNum2 : numArray){
                int missingNum = 2020 - currentNum - currentNum2;

                if (numberSet.contains(missingNum)) {
                    finalAns = currentNum * currentNum2 * missingNum;
                }
            }
            numberSet.add(currentNum);
        }

        return finalAns;

    }
}

