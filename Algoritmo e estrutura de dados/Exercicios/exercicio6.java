package exercicios.ex6;

import java.util.Scanner;

public class Lista4_Exer6 {
    public static float media(int vet[]){
        int media = 0;
        for (int i = 0; i < vet.length; i++) {
            media += vet[i];
        }
        return media/vet.length;
    }
    public static Scanner sc = new Scanner(System.in);
    public static void main (String[] args){
        int num = sc.nextInt();
        int vet[] = new int[num];
        for (int i = 0; i < vet.length; i++) {
            vet[i] = sc.nextInt();
        }
        System.out.println("Media: " + media(vet));
    }    
}
