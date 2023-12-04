package practice;

public class Practice7_1 {
    public static void main(String[] args) {
        SutdaDeck deck = new SutdaDeck();

        System.out.println(deck.pick(0));
        System.out.println(deck.pick());
        deck.shuffle();

        for(int i=0; i<deck.cards.length; i++)
            System.out.print(deck.cards[i] + ",");

        System.out.println();
        System.out.println(deck.pick(0));
    }
}

class SutdaDeck {
    final int CARD_NUM = 20;
    SutdaCard[] cards = new SutdaCard[CARD_NUM];
    SutdaDeck() {
        for(int i=1; i<=CARD_NUM; i++) {
            if(i==1 || i==3 || i==8) {
                cards[i-1] = new SutdaCard(i, true);
            } else {
                cards[i-1] = new SutdaCard(i%10==0? 10:i%10, false);
            }
        }
    }

    void shuffle() {
        for(int i=0; i<cards.length; i++) {
            int rand = (int)(Math.random() * cards.length);
            SutdaCard temp = cards[i];
            cards[i] = cards[rand];
            cards[rand] = temp;
        }
    }

    SutdaCard pick (int index) {
        if(index < 0 || index >= CARD_NUM)
            return null;
        return cards[index];
    }

    SutdaCard pick () {
        int rand = (int)(Math.random() * cards.length);
        return pick(rand); // 또는 return cards[rand]
    }
}
class SutdaCard {
    int num;
    boolean isKwang;
    SutdaCard() {
        this(1, true);
    }
    SutdaCard(int num, boolean isKwang) {
        this.num = num;
        this.isKwang = isKwang;
    }
    // info() Object toString() . 대신 클래스의 을 오버라이딩했다
    public String toString() {
        return num + ( isKwang ? "K":"");
    }
}