import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ingresarPalabra();
    }
    static Scanner sc = new Scanner(System.in);
    public static String ingresarPalabra(){
        System.out.print("Introduce una frase: ");
        String s = sc.next() + sc.nextLine();
        System.out.print(s);
        s = s.replace(" ", "");
        s = s.replace(",", "");
        s = s.replace(".", "");
        return s;

    }
}
