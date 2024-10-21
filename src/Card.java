public class Card {
    private double balance;
    //private double inicStanje;
    private double naplata;

    public Card(double inicStanje) {
        balance = inicStanje;
    }

    public void charge() {
        if (balance >= naplata) {
            System.out.println("Izvršena isplata");
            balance = balance - naplata;
            System.out.println("Stanje na računu je " + balance);
        } else {
            System.out.println("Nema dovoljno sredstava na računu. Isplatu nije moguće izvršiti");
        }
    }


    public void setNaplata(double naplata) {
        this.naplata = naplata;
    }


}
