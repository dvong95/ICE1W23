package exercise1;
import java.util.*;

/**
 * A class that fills a hand of 7 cards with random Card Objects and then asks the user to pick a card.
 * It then searches the array of cards for the match to the user's card. 
 * To be used as starting code in Exercise
 *
 * @author dancye
 * @author Paul Bonenfant Jan 25, 2022 
 */
public class CardTrick {
    
    public static void main(String[] args) {
        Random random = new Random();
        Scanner input = new Scanner(System.in);
        Card[] hand = new Card[7];
        int cardValue, cardSuit;

        for (int i = 0; i < hand.length; i++) {
            Card card = new Card();
            //card.setValue(insert call to random number generator here)
            card.setValue(random.nextInt(13));
            //card.setSuit(Card.SUITS[insert call to random number between 0-3 here])
            card.setSuit(Card.SUITS[random.nextInt(4)]);
            // Hint: You can use Random -> random.nextInt(n) to get a random number between 0 and n-1 (inclusive)
            //       Don't worry about duplicates at this point
            hand[i] = card;
          }

        // insert code to ask the user for Card value and suit, create their card
        // and search the hand here. 
        // Hint: You can ask for values 1 to 10, and then
        //       11 for jack, 12 for queen, etc. (remember arrays are 0-based though)
        //       1 for Hearts, 2 for Diamonds, etc. (remember arrays are 0-based though)
        System.out.print("Enter card value 1 - 13 (1 for Ace, 11 for Jack, 12 for Queen, 13 for King): ");
        cardValue = input.nextInt();
        System.out.print("Enter card suit 1 - 4 (1 for Hearts, 2 for Diamonds, 3 for Spades, 4 for Clubs): ");
        cardSuit = input.nextInt() - 1;
        // Then loop through the cards in the array to see if there's a match.
        for (Card c: hand) {
            if (c.getValue() == cardValue && c.getSuit().equals(Card.SUITS[cardSuit]))
                printInfo();
        }
        // If the guess is successful, invoke the printInfo() method below.
        
    }

    /**
     * A simple method to print out personal information. Follow the instructions to 
     * replace this information with your own.
     * @author Paul Bonenfant Jan 2022
     */
    private static void printInfo() {
    
        System.out.println("Congratulations, you guessed right!");
        System.out.println();
        
        System.out.println("My name is David, but you can call me David, master or sir");
        System.out.println();
        
        System.out.println("My career ambitions:");
        System.out.println("-- Get a well-paying job");
        System.out.println("-- Learn as much as I can from amazing profs like Ronak!");
	System.out.println();	

        System.out.println("My hobbies:");
        System.out.println("-- Coding");
        System.out.println("-- Learning to code");
        System.out.println("-- Watching TV");
        System.out.println("-- Sleeping");

        System.out.println();
        
    
    }

}
