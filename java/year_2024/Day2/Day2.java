package year_2024.Day2;

import java.util.ArrayList;

import static util.FileUtils.readFile;

public class Day2 {

    private static int Part1(ArrayList<String> lines) {
        for (String line : lines) {
            // Parse strings to ints
            String[] levels = line.split("\\s+");
            int[] nums = new int[levels.length];
            for (int i = 0; i < levels.length; i++) {
                nums[i] = Integer.parseInt(levels[i]);
            }

            boolean decreasing;
            if (nums[0] > nums[1]) {
                decreasing = true;
            } else if (nums[0] < nums[1]) {
                decreasing = false;
            }

            for (int i = 0; i < nums.length; i++) {

            }
        }
        return 0;
    }

    public static void main(String[] args) {
        ArrayList<String> lines = readFile("C:\\Users\\josep\\Desktop\\Advent of Code\\2024\\Day2\\Example.txt");
        System.out.println(Part1(lines));
    }
}
