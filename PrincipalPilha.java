package algoritmo;

import java.util.Scanner;

public class PrincipalPilha {
    public static Scanner ler = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("==== PILHA ESTATICA ====");
        Pilha pilha = new Pilha(6);
        int cont = 1, num;
        boolean decisao = true;
        do{
            System.out.println("Insira um numero: ");
            num = ler.nextInt();
            pilha.empilharFim(num);
            System.out.println("Quer inserir de novo 1-sim 0-nao: ");
            num = ler.nextInt();
            if(num == 0){
                decisao = false;
            }else{
                decisao = true;
            }
            cont++;
        }while(decisao == true);
        pilha.mostrar();

        pilha.desempilharFim();
        
        pilha.mostrar();
        
        pilha.desempilharFim();
        
        pilha.mostrar();
        
        pilha.desempilharFim();
        
        pilha.mostrar();
        
    }    
}
