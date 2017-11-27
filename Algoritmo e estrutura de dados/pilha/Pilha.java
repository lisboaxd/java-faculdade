
/**
 * Pilha
 *
 * @author Mateus Lisboa
 * @version 11/2017
 */
class Pilha {

    private int[] array;
    private int n;

    /**
     * Construtor da classe.
     *
     * @param tamanho Tamanho da pilha.
     */
    public Pilha() {
        array = new int[6];
        n = 0;
    }

    public Pilha(int tamanho) {
        array = new int[tamanho];
        n = 0;
    }

    /**
     * Insere um elemento na primeira posicao da pilha e move os demais
     * elementos para o fim da pilha.
     *
     * @param x int elemento a ser inserido.
     */
    /**
     * Insere um elemento na ultima posicao da pilha.
     *
     * @param x int elemento a ser inserido.
     */
    public void empilhar(int x) {

        //validar insercao
        if (n >= array.length) {
            System.out.println("Erro ao empilhar!");
            System.exit(1);
        }

        array[n] = x;
        n++;
    }

    /**
     * Remove um elemento da ultima posicao da pilha.
     *
     * @return resp int elemento a ser removido.
     */
    public int desempilhar() {

        //validar remocao
        if (n == 0) {
            System.out.println("Erro ao desempilhar!");
            System.exit(1);
        }
        --n;
        return array[n];
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

}
