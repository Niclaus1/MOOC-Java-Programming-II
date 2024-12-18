import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

public class Hand implements Comparable<Hand> {
    private List<Card> hands;

    public Hand(){
        this.hands = new ArrayList<>();
    }

    public void add(Card card){
        hands.add(card);
    }

    public void print(){
        hands.forEach(System.out::println);
    }

    public void sort(){
        Comparator<Card> sorting = Comparator.comparing(Card::getValue)
        .thenComparingInt(card -> card.getSuit().ordinal());

        Collections.sort(hands, sorting);
    }

    @Override
    public int compareTo(Hand newHand) {

        int value1 = hands.stream().mapToInt(Card::getValue).sum();
        int value2 = newHand.hands.stream().mapToInt(Card::getValue).sum();

        return Integer.compare(value1, value2);
    }

    public void sortBySuit(){
        sort();
        Collections.sort(hands, (c1,c2) -> Integer.compare(c1.getSuit().ordinal(), c2.getSuit().ordinal()));
    }
}
