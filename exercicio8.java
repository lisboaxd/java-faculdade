package exercicios.ex8;

import java.util.Scanner;

public class Lista4_Exer8 {
public static int menor(int vet[]){
        int menor = 0;
        for (int i = 0; i < vet.length; i++) {
            if(i == 0 ){
                menor = vet[i];
            }else if(menor > vet[i]){
                menor = vet[i];
            }
        }
        return menor;
 }
 public static Scanner sc = new Scanner(System.in);
    public static void main (String[] args){
        int num = sc.nextInt();
        int vet[] = new int[num];
        for (int i = 0; i < vet.length; i++) {
            vet[i] = sc.nextInt();
        }
        System.out.println("Menor = " + menor(vet));
    }    
}
