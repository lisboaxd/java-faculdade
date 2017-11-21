package exercicios.ex9;

import java.util.Scanner;

public class Lista4_Exer9 {
    public static int verifica(String str, String str2){
        if(str.length() == str2.length()){
            return 0;
        }else if(str.length() < str2.length()){
            return -1;
        }else{
            return 1;
        }
            
    }
    public static Scanner sc = new Scanner(System.in);
    public static void main (String[] args){
        System.out.println("Digite uma string:");
        String str = sc.nextLine();
        String str2 = sc.nextLine();
        System.out.println(verifica(str, str2));
    }
}
