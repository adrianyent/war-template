import java.util.Arrays;

/**
 * War game class
 *
 * @author Mr. Jaffe
 * @version 2022-10-19
 */
public class War
{
    private Deck mainDeck;
    private Deck player1Deck;
    private Deck player2Deck;
    /**
     * Constructor for the game
     * Include your initialization here -- card decks, shuffling, etc
     * Run the event loop after you've done the initializations
     */
    public War()
    {
        mainDeck = new Deck();
        mainDeck.initializeNewDeck();
        mainDeck.shuffle();
        
        Deck[] playerDecks = mainDeck.dealDeck();
        player1Deck = playerDecks[0];
        player2Deck = playerDecks[1];
        
        this.runEventLoop();
    }
    
    /**
     * This is the game's event loop. The code in here should come
     * from the War flowchart you created for this game
     */
    public void runEventLoop() {
        while (!isDeckEmpty(player1Deck) && !isDeckEmpty(player2Deck)) {
            if (isDeckEmpty(player1Deck)) {
            System.out.println("Player 2 wins!");
            } else {
            System.out.println("Player 1 wins!");
            }
        }
    }
    
    private boolean isDeckEmpty(Deck deck) {
        return deck.getDeckSize() == 0;
    }
    
    /**
     * The main method is called when Java starts your program
     */
    public static void main(String[] args) {
        War war = new War();
    }

}
