package exercicios.ex5;

import java.util.Scanner;

public class Lista4_Exer5 {
    public static String inverte(String str){
        String invertida = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            invertida += str.charAt(i);
        }
        return invertida;
    }
    public static Scanner sc = new Scanner(System.in);
    public static void main (String[] args){
        System.out.println("Digite uma string:");
        String str = sc.nextLine();
        System.out.println(str.length());
        System.out.println(inverte(str));
    }
}
