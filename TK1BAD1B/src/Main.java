import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        System.out.println("masukan string");
        Scanner kalimat = new Scanner(System.in);
        String inputKalimat = kalimat.nextLine();
        int PanjangKalimat = inputKalimat.replaceAll("\\s","").length();
        System.out.println("panjang kalimat");
        System.out.println(PanjangKalimat);


    }

}