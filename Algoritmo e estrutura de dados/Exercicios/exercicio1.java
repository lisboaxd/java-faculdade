
package exercicios.ex1;

import java.util.Scanner;

public class Lista4_Exer1 {
    public static Scanner sc = new Scanner(System.in);
    public static int calculaPerimetro(int base, int altura){
        int perimetro = base * altura;
        return perimetro;
    }
    public static void main (String[] args){
        int base, altura;
        base = sc.nextInt();
        altura = sc.nextInt();
        System.out.println("Perimetro: "+ calculaPerimetro(base, altura));
                
    }        
}
