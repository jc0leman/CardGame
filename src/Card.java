public class Card {
    String rank;
    String suit;
    int values;
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
