import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        System.out.println("masukan stringA");
        Scanner kalimatA = new Scanner(System.in);
        String inputKalimatA = kalimatA.nextLine();
        System.out.println("masukan String B");
        Scanner kalimatB = new Scanner(System.in);
        String inputKAlimatB = kalimatB.nextLine();
        System.out.println(inputKalimatA + ", " + inputKAlimatB );
    }

}