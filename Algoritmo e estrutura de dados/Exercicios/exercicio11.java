package exercicios.ex11;

import java.io.IOException;
import java.util.Scanner;

public class Lista4_Exer11 {
     public static int verifica(String str, char carac){
         int soma = 0;
         for (int i = 0; i < str.length(); i++) {
             if(str.charAt(i) == carac){
                 soma++;
             }
         }
         return soma; 
    }
    public static Scanner sc = new Scanner(System.in);
    public static void main (String[] args) throws IOException{
        System.out.println("Digite uma string:");
        String str = sc.nextLine();
        char carac =  (char)System.in.read();
        System.out.println(verifica(str, carac));
    }
}
