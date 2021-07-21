public class Main {
    public static void main(String[] args) {
        BankAccount bankAccount = new BankAccount("1234567890", "Piotr","Szymczyk");
        bankAccount.addCard("1987654321","12/12/1238");
        bankAccount.addCard("7777777777","12/12/1238");
        bankAccount.addCard("9999999999","99/57/1996");

        bankAccount.displayAllCards();
    }
}
