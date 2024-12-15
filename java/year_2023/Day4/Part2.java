package Day4;

import java.util.ArrayList;
import util.FileUtils;

public class Part2 {
    public static void main(String[] args) {
        ArrayList<String> lines = FileUtils.readFile("year_2023/Day4/Input.txt");
        ArrayList<Card> cards = new ArrayList<>();
        int total = 0;
        
        // Create card list
        for (String line : lines) {
            String numbers = line.split(":")[1].trim();
            String[] winningNumbers = (numbers.split("\\|")[0].trim()).split(" ");
            String[] pulledNumbers = (numbers.split("\\|")[1].trim()).split(" ");
            
            // Remove whitespace from arrays
            ArrayList<String> pulledNumbersFixed = FileUtils.fixWhiteSpace(pulledNumbers);
            ArrayList<String> winningNumbersFixed = FileUtils.fixWhiteSpace(winningNumbers);

            Card thisCard = new Card();
            thisCard.winningNumbers = winningNumbersFixed;
            thisCard.pulledNumbers = pulledNumbersFixed;
            cards.add(thisCard);
        }

        // Find matches and add cards
        for (int i = 0; i < cards.size(); i++) {
            Card thisCard = cards.get(i);
            thisCard.pulledNumbers.retainAll(thisCard.winningNumbers);

            for (int x = 0; x < thisCard.pulledNumbers.size(); x++) {
                Card nextCard = cards.get(i + x + 1);
                nextCard.count += thisCard.count;
            }
        }

        for (Card card : cards) {
            total += card.count;
        }

        System.out.println("Total: " + total);
    }
}