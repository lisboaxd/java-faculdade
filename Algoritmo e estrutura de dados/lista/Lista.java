
/**
 * Lista estatica
 *
 * @author Mateus Lisboa
 * @version 11/2017
 */
class Lista {

    private int[] array;
    private int n;

    /**
     * Construtor da classe.
     *
     * @param tamanho Tamanho da lista.
     */
    public Lista() {
        array = new int[6];
        n = 0;
    }

    public Lista(int tamanho) {
        array = new int[tamanho];
        n = 0;
    }

    /**
     * Insere um elemento na primeira posicao da lista e move os demais
     * elementos para o fim da lista.
     *
     * @param x int elemento a ser inserido.
     */
    public void inserirInicio(int x) {

        //validar insercao
        if (n >= array.length) {
            System.out.println("Erro ao inserir!");
            System.exit(1);
        }

        //levar elementos para o fim do array
        for (int i = n; i > 0; i--) {
            array[i] = array[i - 1];
        }

        array[0] = x;
        n++;
    }

    /**
     * Insere um elemento na ultima posicao da lista.
     *
     * @param x int elemento a ser inserido.
     */
    public void inserirFim(int x) {

        //validar insercao
        if (n >= array.length) {
            System.out.println("Erro ao inserir!");
            System.exit(1);
        }

        array[n] = x;
        n++;
    }

    /**
     * Insere um elemento em uma posicao especifica e move os demais elementos
     * para o fim da lista.
     *
     * @param x int elemento a ser inserido.
     * @param pos Posicao de insercao.
     */
    public void inserir(int x, int pos) {

        //validar insercao
        if (n >= array.length || pos < 0 || pos >= n) {
            System.out.println("Erro ao inserir!");
            System.exit(1);
        }

        //levar elementos para o fim do array
        for (int i = n; i > pos; i--) {
            array[i] = array[i - 1];
        }

        array[pos] = x;
        n++;
    }

    /**
     * Remove um elemento da primeira posicao da lista e movimenta os demais
     * elementos para o inicio da mesma.
     *
     * @return resp int elemento a ser removido.
     */
    public int removerInicio() {

        //validar remocao
        if (n == 0) {
            System.out.println("Erro ao remover!");
            System.exit(1);
        }

        int resp = array[0];
        n--;

        for (int i = 0; i < n; i++) {
            array[i] = array[i + 1];
        }

        return resp;
    }

    /**
     * Remove um elemento da ultima posicao da lista.
     *
     * @return resp int elemento a ser removido.
     */
    public int removerFim() {

        //validar remocao
        if (n == 0) {
            System.out.println("Erro ao remover!");
            System.exit(1);
        }
        --n;
        return array[n];
    }

    /**
     * Remove um elemento de uma posicao especifica da lista e movimenta os
     * demais elementos para o inicio da mesma.
     *
     * @param pos Posicao de remocao.
     * @return resp int elemento a ser removido.
     */
    public int remover(int pos) {

        //validar remocao
        if (n == 0 || pos < 0 || pos >= n) {
            System.out.println("Erro ao remover!");
            System.exit(1);
        }

        int resp = array[pos];
        n--;
        for (int i = pos; i < n; i++) {
            array[i] = array[i + 1];
        }

        return resp;
    }

    /**
     * Mostra os array separados por espacos.
     */
    public void mostrar() {
        System.out.print("[ ");
        for (int i = 0; i < n; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println("]");
    }

    public boolean pesquisaSequencial(int x) {
        /**
         * Pesquisa Sequencial
         *
         * @author Mateus Lisboa
         * @since 11/2017
         */
        boolean resposta = false;
        for (int i = 0; i < n; i++) {
            if (array[i] == x) {
                resposta = true;
                i = n;
            }
        }
        return resposta;
    }

    public boolean pesquisaBinaria(int x) {
        /**
         * Pesquisa Binaria
         *
         * @author Mateus Lisboa
         * @since 11/2017
         */
        boolean resposta = false;
        int dir = n - 1, esq = 0, meio;
        while (esq <= dir) {
            meio = (esq + dir) / 2;
            if (x == array[meio]) {
                resposta = true;
                esq = n;
            } else if (x > array[meio]) {
                esq = meio + 1;
            } else {
                dir = meio - 1;
            }
        }
        return resposta;
    }
    
    public int maior(){
    /*
        Retorna o maior numero da lista
     */
        int maior = 0,comp=0;
        for(int i=0; i < n; i++){
            ++comp;
            if(array[i] > maior){
            maior = array[i];
            }
        }
        System.out.println("Total comparacoes: "+comp+"\nMaior numero: "+maior);
        return maior;        
    }
    
    public int menor(){
        /*
        * Retorna o menor numero da lista
        **/
        int comp = 0, menor = 0;
        if(n > 0){
            menor = array[0];
        }
        for(int i = n-1; i >= 0; i--){
            ++comp;
            if(array[i] < menor){
                menor = array[i];
            }
        }
        System.out.println("Total comparacoes: "+comp+"\nMenor numero: "+menor);
        return menor;
    
    }
    
    public int soma(){
        /*
        * Retorna a soma de todos elementos da lista
        **/
        int soma = 0;
        for(int i = 0;i < n; i++){
            soma += array[i];
        }
        return soma;
    }
    
    public double media(){
        /*
        * Retorna a media de todos elementos da lista
        **/
        int soma = 0;
        double media;
        soma = this.soma();
        media = soma/array.length;
        System.out.println("A media da lista é: "+ media);
        return media;
    }
    public int quantidadeNumerosPares(){
        /*
        * Retorna a media de todos elementos da lista
        **/
        int par = 0;
        for(int i = 0;i < n; i++){
            if( (array[i] % 2) == 0){
            par++;
            }
        }
        System.out.println("A quantidade de numeros pares da lista é: "+ par);
        return par;
    }

}
