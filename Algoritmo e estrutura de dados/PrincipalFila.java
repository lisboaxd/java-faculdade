package algoritmo;

import java.util.Scanner;

public class PrincipalFila {

     
     public static Scanner teclado = new Scanner(System.in);
     
     
     public static void main(String[] args) {
        
        System.out.println("==== FILA ESTATICA ====");
        Fila fila = new Fila(6);
        int cont = 1, num;
        boolean decisao = true;
        do{
            System.out.println("Digite um um numero: ");
            num = teclado.nextInt();
            fila.inserirInicio(num);
            System.out.println("Inserir novamente? sim [1] NÃO [0]: ");
            num = teclado.nextInt();
            if(num == 0){
                decisao = false;
            }else{
                decisao = true;
            }
            cont++;
        }while(decisao == true);
        
        fila.mostrar();

        fila.removerFim();
        
        fila.mostrar();
        
        fila.removerFim();
        
        fila.mostrar();
        
        fila.removerFim();
        
        fila.mostrar();
     }
}
