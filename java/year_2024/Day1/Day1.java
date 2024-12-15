package year_2024.Day1;

import java.util.ArrayList;
import java.util.Collections;

import static util.FileUtils.readFile;

public class Day1 {
    public static int Part1(ArrayList<Integer> leftNums, ArrayList<Integer> rightNums) {
        int total = 0;

        Collections.sort(leftNums);
        Collections.sort(rightNums);

        for (int i = 0; i < leftNums.size(); i++) {
            total += Math.abs(leftNums.get(i) - rightNums.get(i));
        }

        return total;
    }

    public static int Part2(ArrayList<Integer> leftNums, ArrayList<Integer> rightNums) {
        int total = 0;

        for (Integer i : leftNums) {
            if (rightNums.contains(i)) {
                total += i * Collections.frequency(rightNums, i);
            }
        }

        return total;
    }


    public static void main(String[] args) {
        ArrayList<String> lines = readFile("java\\year_2024\\Day1\\" + args[0] + ".txt");
        ArrayList<Integer> leftNums = new ArrayList<Integer>();
        ArrayList<Integer> rightNums = new ArrayList<Integer>();
        int total = 0;

        for (String line : lines) {
            String[] nums = line.split("\\s+");
            int num1 = Integer.parseInt(nums[0]);
            int num2 = Integer.parseInt(nums[1]);

            leftNums.add(num1);
            rightNums.add(num2);
        }

        System.out.println(Part1(leftNums, rightNums));
        System.out.println(Part2(leftNums, rightNums));
    }
}
