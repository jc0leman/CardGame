import java.util.Scanner;
import java.util.ArrayList;
import java.util.Random;
public class Deck {
    //declare arraylist of cards
    static ArrayList<Card> cards = new ArrayList<Card>();
    public Deck() {


    }
    int cardsLeft;
    int counter;

    public Deck(String[] ranks, String[] suits, int[] values)
    {
//assignment of values for each rank
        counter = 0;

        for(int i = 0; i < ranks.length; i++)
        {
            for(int j = 0; j < suits.length; j++)
            {
                //ace set value to one --- wanted to set to 11 or 1 but ran out of time
                if(ranks[i].equals("A"))
                {
                    Card c = new Card(ranks[i], suits[j], 1);
                    cards.add(c);
                    //adds one to the card count
                    counter++;
                    //cards.add(ranks[i], suits[j], 1);
                }

                //set face card values
                else if(ranks[i].equals("J") || ranks[i].equals("Q") || ranks[i].equals("K"))
                {
                    Card d = new Card(ranks[i], suits[j], 10);

                    cards.add(d);
                    counter++;;
                }
                else
                {
                    //rest of the cards are already integers-use value of to convert the strings to ints
                    Card e = new Card(ranks[i], suits[j], Integer.valueOf(ranks[i]));
                    cards.add(e);
                    counter++;
                }

            }
        }
        cardsLeft = counter;

       // for 0 - 52 add random card to cardList

    }
    //I dont use this method
    public void print()
    {
        for(int i = 0; i < cards.size(); i++)
        {
            System.out.println(cards.get(i));

        }

    }
    //Checks to make sure we dont null pointer exception
    public Boolean isEmpty()
    {
        if(cardsLeft == 0)
        {
            return true;
        }
        return false;
    }

    //returns the number of cards left - null if empty - never really gets there tho in black jack - its impossible to
    public java.lang.Integer deal()
    {
        if(isEmpty()) {
            return null;
        }
        return cardsLeft;


    }

    public void removeCard()
    {
        cardsLeft--;
    }

    public void shuffle()
    {
        int j = 0;

        //shuffles the deck - starts at 0, adds cards to random indeces, then removes the original index

            for (int i = 0; i < (cards.size()); i++) {
                j = (int) (Math.random() * i) + 1;
                cards.add(j, cards.get(i));
               if(j < i ) {
                   cards.remove(i + 1);
               }
               else {
                   cards.remove(i);
               }


            }

        cardsLeft = counter;
    }
    public Card cardAtIndex(Integer i)
    {
        return cards.get(i);
    }





}
