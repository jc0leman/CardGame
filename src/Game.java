import java.sql.SQLOutput;
import java.util.Random;
import java.util.Scanner;

public class Game {

    public static void main(String[] args) {
        //initialize the opjects
        String[] ranks = {"A", "2", "3", "4","5","6","7","8","9","10","J","Q","K"};
        String[] suits = {"Hearts", "Clubs","Diamonds","Spades"};

        int[] values = {1,2,3,4,5,6,7,8,9,10,11};
        Deck d = new Deck(ranks, suits, values);
        //name the player objects
        Player a = new Player("User");
        Player b = new Player("Dealer");
        //call the game
         playGame(d,a,b);
    }
    public static void playGame(Deck d, Player a, Player b)
    {
        Integer cur = 0;
        //call instructions
        printInstructions();
        Scanner s = new Scanner(System.in);
        d.shuffle();


        int theHouse = d.deal() - 1;
        //shuffles the cards, and adds the last one, adds its points and removes that card from the deck (first dealer card)
        b.addCard(d.cardAtIndex(theHouse));
        b.addPoints(d.cardAtIndex(theHouse).getValues());
        d.removeCard();
        System.out.println(b);
        System.out.println("Press 1 to hit");
        System.out.println("Press 2 to stand");
        int i = s.nextInt();
        while(i == 1)
        {
            d.removeCard();
            cur = d.deal() -  1;
            //d.removeCard();
            a.addCard(d.cardAtIndex(cur));
//shuffles the cards, and adds the last one, adds its points and removes that card from the deck (your turn)
            a.addPoints(d.cardAtIndex(cur).getValues());
            //essentially a to string method
            System.out.println(d.cardAtIndex(cur).getValues() + " of " + d.cardAtIndex(cur).getSuit());
            System.out.println("Score: " + a.getPoints());
            if(a.getPoints() > 21)
            {
                //end if over 21
                break;
            }
            System.out.println("Press 1 to hit");
            System.out.println("Press 2 to stand");
            i = s.nextInt();

        }

        while(b.getPoints() < 17)
        {
            //shuffles the cards, and adds the last one, adds its points and removes that card from the deck (last dealer turn)
            theHouse = d.deal() - 1;
            b.addCard(d.cardAtIndex(theHouse));
            b.addPoints(d.cardAtIndex(theHouse).getValues());
            d.removeCard();
            System.out.println(d.cardAtIndex(theHouse).getValues() + " of " + d.cardAtIndex(theHouse).getSuit());
            System.out.println("Dealers Score:" + b.getPoints());

        }
        if((a.getPoints() > b.getPoints() && a.getPoints() <= 21)|| a.getPoints() <= 21 && b.getPoints() > 21 )
        {
            System.out.println("You win!");
        }
        else
        {
            System.out.println("You lose!");
        }


    }
    public static void printInstructions()
    {
        System.out.println("Welcome to BlackJack!");

    }


}

