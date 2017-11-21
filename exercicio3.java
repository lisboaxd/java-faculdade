package exercicios.ex3;

import java.util.Scanner;

public class Lista4_Exer3 {
public static Scanner sc = new Scanner(System.in);
    public static float media(float notas[]){
        float media = 0;
        for (int i = 0; i < notas.length; i++) {
            media += notas[i];
        }
        return media/3;
    }
    public static float media2Maiores(float notas[]){
        float aux;
        for (int i = 0; i < notas.length; i++) {
            for (int j = 0; j < notas.length; j++) {
                if(notas[i] > notas[j]){
                    aux = notas[j];
                    notas[j] = notas[i];
                    notas[i] = aux;
                }    
            }
            
        }
        return (notas[0]+notas[1])/2;
    }
    public static void main (String[] args){
        float notas[] = new float[3];
        for (int i = 0; i < notas.length; i++) {
            notas[i] = sc.nextInt();
        }
        
        System.out.println("Media Total: "+ media(notas));
        System.out.println("Media de duas notas: "+ media2Maiores(notas));
        System.out.println("Maior nota: " + notas[0]);
        System.out.println("Maior nota: " + notas[1]);
        for (int i = 0; i < notas.length; i++) {
            System.out.println(notas[i]+" ");
        }
                
    }    
}
