package exercicios.ex7;

import static exer16.pkg08.Lista4_Exer6.sc;
import java.util.Scanner;

public class Lista4_Exer7 {
 public static int maior(int vet[]){
        int maior = 0;
        for (int i = 0; i < vet.length; i++) {
            if(i == 0 ){
                maior = vet[i];
            }else if(maior < vet[i]){
                maior = vet[i];
            }
        }
        return maior;
 }
 public static Scanner sc = new Scanner(System.in);
    public static void main (String[] args){
        int num = sc.nextInt();
        int vet[] = new int[num];
        for (int i = 0; i < vet.length; i++) {
            vet[i] = sc.nextInt();
        }
        System.out.println("Maior = " + maior(vet));
    }       
}
