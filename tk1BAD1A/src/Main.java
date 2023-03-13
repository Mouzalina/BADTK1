import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        System.out.println("masukan string");
        Scanner kalimat = new Scanner(System.in);
        String inputKalimat = kalimat.nextLine();
        StringBuffer inputKalimatNew = new StringBuffer(inputKalimat);
        for (int i=0;i<inputKalimat.length();i++){
            if (Character.isLowerCase(inputKalimat.charAt(i))){
                inputKalimatNew.setCharAt(i,Character.toUpperCase(inputKalimat.charAt(i)));
            }
            else if (Character.isUpperCase(inputKalimat.charAt(i))) {
                inputKalimatNew.setCharAt(i,Character.toLowerCase(inputKalimatNew.charAt(i)));
            }

        }
        System.out.println(inputKalimatNew);
    }

}