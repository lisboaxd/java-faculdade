
/**
 * Fila estatica
 *
 * @author Max do Val Machado
 * @version 2 01/2015
 */
class Fila {

    private int[] array;
    private int n;

    /**
     * Construtor da classe.
     *
     * @param tamanho Tamanho da fila.
     */
    public Fila() {
        array = new int[6];
        n = 0;
    }

    public Fila(int tamanho) {
        array = new int[tamanho];
        n = 0;
    }

    /**
     * Insere um elemento na ultima posicao da fila.
     *
     * @param x int elemento a ser inserido.
     */
    public void enfileirar(int x) {

        //validar insercao
        if (n >= array.length) {
            System.out.println("Erro ao inserir!");
            System.exit(1);
        }

        array[n] = x;
        n++;
    }

    /**
     * Remove um elemento da primeira posicao da fila e movimenta os demais
     * elementos para o inicio da mesma.
     *
     * @return resp int elemento a ser removido.
     */
    public int desenfileirar() {

        //validar remocao
        if (n == 0) {
            System.out.println("Erro ao desenfileirar!");
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
