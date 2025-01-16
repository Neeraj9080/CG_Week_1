// Importing Scanner class for user input
import java.util.Scanner;
// Importing Random clas for random number
import java.util.Random;

// creating a class DeckOfCards to print the cards and their players
class DeckOfCards
{
    // Method to initialize the deck of cards
    public static String[] initializeDeck()
    {
        String[] suits = {"Hearts", "Diamonds", "Clubs", "Spades"};
        String[] ranks = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King", "Ace"};
        String[] deck = new String[suits.length * ranks.length];
        int index = 0;

        // Initialize the deck with all combinations of suits and ranks
        for (String suit : suits)
        {
            for (String rank : ranks)
            {
                deck[index++] = rank + " of " + suit;
            }
        }
        return deck;
    }

    // Method to shuffle the deck of cards
    public static void shuffleDeck(String[] deck)
    {
        Random rand = new Random();

        // Shuffle the deck by swapping each card with a random card
        for (int i = 0; i < deck.length; i++)
        {
            int randomIndex = i + rand.nextInt(deck.length - i);
            String temp = deck[i];
            deck[i] = deck[randomIndex];
            deck[randomIndex] = temp;
        }
    }

    // Method to distribute the deck of cards to x players
    public static String[][] distributeCards(String[] deck, int numOfPlayers, int cardsPerPlayer)
    {
        String[][] players = new String[numOfPlayers][cardsPerPlayer];

        // Distribute the cards
        int cardIndex = 0;
        for (int i = 0; i < numOfPlayers; i++)
        {
            for (int j = 0; j < cardsPerPlayer; j++)
            {
                players[i][j] = deck[cardIndex++];
            }
        }

        return players;
    }

    // Method to print the cards of each player
    public static void printPlayersCards(String[][] players)
    {
        for (int i = 0; i < players.length; i++)
        {
            System.out.print("Player " + (i + 1) + " ");
            for (String card : players[i])
            {
                System.out.print(card + " | ");
            }
            System.out.println();
        }
    }

    // Main method to take user input and perform the operations
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        // Initialize the deck
        String[] deck = initializeDeck();

        // Shuffle the deck
        shuffleDeck(deck);

        // Taking user input for the number of players and cards per player
        System.out.println("Enter the number of players");
        int numOfPlayers = input.nextInt();
        System.out.println("Enter the number of cards per player");
        int cardsPerPlayer = input.nextInt();

        // Distribute the cards and print the result
        String[][] players = distributeCards(deck, numOfPlayers, cardsPerPlayer);
        printPlayersCards(players);
    }
}
