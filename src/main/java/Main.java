import java.util.Scanner;
import java.io.FileReader;

public class Main {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        ingresarPalabra();
        leerTexto();
    }

    public static void leerTexto() {
        try {
            FileReader s = new FileReader("");

        }catch (Exception e){

        }

    }


    public static String ingresarPalabra(){
        System.out.print("Introduce una frase: ");
        String s = sc.next() + sc.nextLine();
        System.out.print(s);
        s = s.replace(" ", "");
        s = s.replace(",", "");
        s = s.replace(".", "");
        return s;


    }
    public static boolean validar(String s) {
        int fin = s.length()-1;
        int ini=0;
        boolean b=true;

        while(ini < fin){
            if(s.charAt(ini)!=s.charAt(fin)){
                b=false;
            }
            ini++;
            fin--;
        }
        if(b)
            System.out.print("\nEs palindromo.");
        else
            System.out.print("\nNo es palindromo.");

        return b;
    }
}
