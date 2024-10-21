import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    
    static Scanner scanner= new Scanner(System.in);

    public static void main(String[] args) {
        double inicStanje=505.50;
        System.out.println("Unesite iznos novca koji želite podići sa računa");
        Card card=new Card(inicStanje);
        card.setNaplata(scanner.nextDouble());
        card.charge();

    }
}