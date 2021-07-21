import java.util.ArrayList;
import java.util.List;

public class BankAccount {
    private String accountNumber;
    private String ownerName;
    private String ownerSurname;
    private List <Card> cards;

    public BankAccount(String accountNumber, String ownerName, String ownerSurname) {
        this.accountNumber = accountNumber;
        this.ownerName = ownerName;
        this.ownerSurname = ownerSurname;
        this.cards = new ArrayList<>();
    }

    public void addCard(String cardNumber, String expirationDate){
        Card card = new Card(cardNumber, expirationDate);
        cards.add(card);
    }

    public void displayAllCards(){
        for (int i = 0; i < cards.size(); i++) {
            System.out.println("card-"+i+": "+cards.get(i));
        }
    }

    private class Card {
        private String cardNumber;
        private String expirationDate;

        public Card(String cardNumber, String expirationDate) {
            this.cardNumber = cardNumber;
            this.expirationDate = expirationDate;
        }

        @Override
        public String toString() {
            return "card number: " + cardNumber + " expiration date: " + expirationDate;
        }
    }
}
