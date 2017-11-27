
import java.util.Scanner;

/**
 * Fila estatica
 *
 * @author Mateus Lisboa
 * @version 11/2017
 */
class PrincipalFila {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        Fila fila = new Fila(6);
        int numero;
        int pos;
        boolean Sair = true, resp = false;
        System.out.println("==== LISTA ESTATICA ====");        
        do {
            System.out.println(""
                    + "1) Enfileirar \n"
                    + "2) Desenfileirar\n"
                    + "7) Mostrar todos os elementos da fila\n"
                    + "8) Pesquisa Sequencial\n"
                    + "9) Pesquisa Binária\n"
                    + "0) Sair"
                    + "\n Escolha uma opcao: ");
            int opcao = teclado.nextInt();
            switch (opcao){
                case 1:
                    System.out.println("Enfileirar: ");
                    numero = teclado.nextInt();
                    fila.enfileirar(numero);
                    break;
                case 2:
                    System.out.println("Desenfileirar: ");
                    fila.desenfileirar();
                    fila.mostrar();
                    break;
                case 7:
                    fila.mostrar();
                    break;
                case 8:
                    System.out.println("Pesquisa Sequencial\nDigite o numero: ");
                    numero = teclado.nextInt();
                    resp = fila.pesquisaSequencial(numero);
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
                    resp = fila.pesquisaBinaria(numero);
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
    }
}
