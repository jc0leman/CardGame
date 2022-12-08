public class Card {
    String rank;
    String suit;
    int values;
    //constructor that takes in a rank, suit, and assigns it a value
    public Card(String rank, String suit, int values)
    {
     this.rank = rank;
     this.suit = suit;
     this.values = values;

    }
    public Card(String rank)
    {
        this.rank = rank;
    }
    //Whole bunch of getter setter methods that I dont use but are on the criteria for completion
    public String getRank() {
        return rank;
    }

    public void setRank(String rank) {
        this.rank = rank;
    }

    public String getSuit() {
        return suit;
    }

    public void setSuit(String suit) {
        this.suit = suit;
    }

    public int getValues() {
        return values;
    }

    public void setValues(int values) {
        this.values = values;
    }


    public String toString() {
        return rank + " of " + suit;

    }
}
