package Day4;

import util.FileUtils;
import java.util.ArrayList;

public class Part1 {
    public static void main(String[] args) {
        ArrayList<String> lines = FileUtils.readFile("year_2023/Day4/Input.txt");
        int total = 0;

        for (String line : lines) {
            String numbers = line.split(":")[1].trim();
            String[] winningNumbers = (numbers.split("\\|")[0]).split(" ");
            String[] pulledNumbers = (numbers.split("\\|")[1]).split(" ");
            int matches = 0;
            
            // Remove whitespace from arrays
            ArrayList<String> pulledNumbersFixed = FileUtils.fixWhiteSpace(pulledNumbers);
            ArrayList<String> winningNumbersFixed = FileUtils.fixWhiteSpace(winningNumbers);

            // Get winning numbers
            for (String s : pulledNumbersFixed) {
                if (winningNumbersFixed.contains(s)) {
                    matches += 1;
                }
            }

            // Add matches to total
            if (matches > 0) {
                total += Math.pow(2, matches - 1);
            }
        }
        
        System.out.println("Total: " + total);
    }
}