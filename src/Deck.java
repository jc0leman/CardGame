import java.util.Scanner;
import java.util.ArrayList;
import java.util.Random;
public class Deck {
    static ArrayList<Card> cards = new ArrayList<Card>();
    public Deck() {


    }
    int cardsLeft;
    int counter;

    public Deck(String[] ranks, String[] suits, int[] values)
    {

        counter = 0;

        for(int i = 0; i < ranks.length; i++)
        {
            for(int j = 0; j < suits.length; j++)
            {
                if(ranks[i].equals("A"))
                {
                    Card c = new Card(ranks[i], suits[j], 1);
                    cards.add(c);
                    counter++;
                    //cards.add(ranks[i], suits[j], 1);
                }
                else if(ranks[i].equals("J") || ranks[i].equals("Q") || ranks[i].equals("K"))
                {
                    Card d = new Card(ranks[i], suits[j], 10);

                    cards.add(d);
                    counter++;;
                }
                else
                {
                    Card e = new Card(ranks[i], suits[j], Integer.valueOf(ranks[i]));
                    cards.add(e);
                    counter++;
                }

            }
        }
        cardsLeft = counter;

       // for 0 - 52 add random card to cardist

    }
    public void print()
    {
        for(int i = 0; i < cards.size(); i++)
        {
            System.out.println(cards.get(i));

        }

    }

    public Boolean isEmpty()
    {
        if(cardsLeft == 0)
        {
            return true;
        }
        return false;
    }

    public java.lang.Integer deal()
    {
        if(isEmpty())
        {
            return null;
        }
        return cardsLeft;

    }



    public void shuffle()
    {
        for(int i = cards.size() - 1; i >= 0; i--)
        {
            int j =(int) Math.random() * i;
            cards.add(j, cards.get(i));
            cards.remove(i + 1);

        }
        cardsLeft = counter;
    }





}
