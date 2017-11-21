package exercicios.ex4;

import java.util.Scanner;

public class Lista4_Exer4 {
    public static int elevado(int num, int num2) {
        int result = (int) Math.pow(num, num2);
        return result;
    }
    public static Scanner sc = new Scanner(System.in);
    public static void main (String[] args){
        int num, num2;
        num = sc.nextInt();
        num2 = sc.nextInt();
        System.out.println("Elevado: "+ elevado(num, num2));
    }    

    

}
