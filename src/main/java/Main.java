
import java.io.BufferedReader;
import java.io.FileReader;

import java.util.Scanner;


public class Main {
    static Scanner sc = new Scanner(System.in);
    static  String ruta = new String("C:\\Users\\hp\\Downloads\\cadenas.txt");
    public static void main(String[] args) {
    leerArchivo();

    }

    public static String leerArchivo() {
        String frase = "";
        try{
            FileReader archivo = new FileReader("C:\\Users\\hp\\Documents\\NetBeansProjects\\TallerNumero2\\cadenas.txt");
            BufferedReader leer= new BufferedReader(archivo);
           ;
            while ((frase= leer.readLine()) != null ){
                System.out.println(""+frase);
                frase =frase.replace(" ", "");
                frase = frase.replace(",", "");
                frase = frase.replace(".", "");
                int fin = frase.length()-1;
                int ini=0;
                boolean b=true;

                while(ini < fin){
                    if(frase.charAt(ini)!=frase.charAt(fin)){
                        b=false;
                    }
                    ini++;
                    fin--;
                }
                if(b)
                    System.out.print("\nEs palindromo.");
                else
                    System.out.print("\nNo es palindromo.");


            }
        } catch (Exception ex){

        }
        return frase;
    }




    }













