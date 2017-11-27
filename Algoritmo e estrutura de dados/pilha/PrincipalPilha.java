
import java.util.Scanner;

/**
 * Lista estatica
 *
 * @author Mateus Lisboa
 * @version 11/2017
 */
class PrincipalPilha {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        Pilha pilha = new Pilha(6);
        int numero;
        int pos;
        boolean Sair = true, resp = false;
        System.out.println("==== PILHA ESTATICA ====");        
        do {
            System.out.println(""
                    + "1) Empilhar \n"
                    + "2) Desempilhar \n"
                    + "7) Mostrar Pilha \n"
                    + "8) Pesquisa Senquencial\n"
                    + "9) Pesquisa Binária\n"
                    + "0) Sair\n"
                    + "Escolha uma opcao: ");
            int opcao = teclado.nextInt();
            switch (opcao){
                case 1:
                    System.out.println("Empilhar\n Digite o numero: ");
                    numero = teclado.nextInt();
                    pilha.empilhar(numero);
                    break;
                case 2:
                    pilha.desempilhar();
                    break;
                case 7:
                    pilha.mostrar();
                    break;
                case 8:
                    System.out.println("Pesquisa Sequencial\nDigite o numero: ");
                    numero = teclado.nextInt();
                    resp = pilha.pesquisaSequencial(numero);
                    if(resp){
                        System.out.println("Elemento encontrado");
                    }else{
                        System.out.println("Elemento nao encontrado");
                    }
                    opcao = -1;
                    break;
                case 9:
                    System.out.println("Pesquisa Binária \nDigite o numero: ");
                    numero = teclado.nextInt();
                    resp = pilha.pesquisaBinaria(numero);
                    if(resp){
                        System.out.println("Elemento encontrado");
                    }else{
                        System.out.println("Elemento nao encontrado");
                    }
                    opcao = -1;
                    break;
                default:
                    System.out.println("Programa Finalizado");
            }
            if (opcao == 0) {
                Sair = false;
            }
        } while (Sair);
        
        pilha.mostrar();
    }
}
