import java.util.ArrayList;

public class Player {

    static ArrayList hand = new ArrayList<>();
    String name;
    int points;
//player constructor with a name
    public Player(String name)
    {
        this.name = name;
        this.points = 0;

    }
    //player construcotr with a name and an arraylist, never use)
    public Player (String name, ArrayList<Card> hand)
    {
        this.name = name;
        this.points = 0;
        this.hand = new ArrayList<Card>();
        for(Card c : hand)
        {
            this.hand.add(hand);
        }
    }
    //gettersetters
    public static ArrayList getHand() {
        return hand;
    }

    public String getName() {
        return name;
    }

    public int getPoints() {
        return points;
    }
    public void addPoints(int add) {
        points += add;
    }
    public void addCard(Card c)
    {
        hand.add(c);
    }
    //tostring method
    public String toString() {
        return name + " has " + points + " points " + name + "'s cards: " + hand;
    }
}



