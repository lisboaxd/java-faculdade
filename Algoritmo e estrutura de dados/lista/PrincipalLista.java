
import java.util.Scanner;

/**
 * Lista estatica
 *
 * @author Mateus Lisboa
 * @version 11/2017
 */
class PrincipalLista {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        Lista lista = new Lista(6);
        int numero;
        int pos;
        boolean Sair = true, resp = false;
        System.out.println("==== LISTA ESTATICA ====");        
        do {
            System.out.println(""
                    + "1) Inserir no início\n"
                    + "2) Inserir no fimm\n"
                    + "3) Inserir em qualquer posição \n"
                    + "4) Remover no início \n"
                    + "5) Remover no fim\n"
                    + "6) Remover em qualquer posição \n"
                    + "7) Mostrar todos os elementos da lista\n"
                    + "8) Pesquisa sequencial\n"
                    + "9) Pesquisa binária\n"
                    + "0) Sair"
                    + "\n Escolha uma opcao: ");
            int opcao = teclado.nextInt();
            switch (opcao){
                case 1:
                    System.out.println("Inserir no inicio: ");
                    numero = teclado.nextInt();
                    lista.inserirInicio(numero);
                    break;
                case 2:
                    System.out.println("Inserir no fim: ");
                    numero = teclado.nextInt();
                    lista.inserirFim(numero);
                    break;
                case 3:
                    System.out.println("Inserir em qualquer posicao\nDigite o numero: ");
                    numero = teclado.nextInt();
                    System.out.println("Digite a posicao: ");
                    pos = teclado.nextInt();
                    lista.inserir(numero, pos);
                    break;
                case 4:
                    lista.removerInicio();
                    break;
                case 5:
                    lista.removerFim();
                    break;
                case 6:
                    System.out.println("Remover na posicao\nDigite a posicao: ");
                    pos = teclado.nextInt();
                    lista.remover(pos);
                    break;
                case 7:
                    lista.mostrar();
                    break;
                case 8:
                    System.out.println("Pesquisa Sequencial\nDigite o numero: ");
                    numero = teclado.nextInt();
                    resp = lista.pesquisaSequencial(numero);
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
                    resp = lista.pesquisaBinaria(numero);
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
        
        lista.inserirInicio(1);
        lista.inserirInicio(0);
        lista.inserirFim(2);
        lista.inserirFim(3);
        lista.inserir(4, 3);
        lista.inserir(5, 2);

        System.out.print("Apos insercoes: ");
        lista.mostrar();

        int x1 = lista.removerInicio();
        int x2 = lista.removerFim();
        int x3 = lista.remover(2);

        System.out.print("Apos remocoes (" + x1 + ", " + x2 +"):");
        lista.mostrar();
    }
}
