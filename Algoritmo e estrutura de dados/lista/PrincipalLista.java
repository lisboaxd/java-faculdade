
import java.util.Scanner;
import java.util.Random;

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
                    + "10) Criar uma lista com 100 elementos aleatorios \n"
                    + "11) Maior numero \n"
                    + "12) Menor numero \n"
                    + "13) Soma de todos numeros \n"
                    + "14) Media dos numeros da Lista \n"
                    + "15) Quantidade de numeros Pares \n"
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
                case 10:
                    lista = new Lista(100);
                    for(int i=0; i < 100; i++){
                        Random random = new Random();
                        numero = random.ints(0, 101).limit(1).findFirst().getAsInt();
                        lista.inserirFim(numero);
                    }
                    break;
                case 11:
                    numero = lista.maior();
                    break;
                case 12:
                    numero = lista.menor();
                    break;
                case 13:
                    numero = lista.soma();
                    System.out.println("A soma da lista é: "+numero);
                    break;
                case 14:
                    double num = lista.media();
                    break;
                case 15:
                    numero = lista.quantidadeNumerosPares();
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
