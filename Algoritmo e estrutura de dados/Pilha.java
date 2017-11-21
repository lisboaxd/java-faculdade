package algoritmo;

public class Pilha {
    private int[] array;
    private int n;
    
    public Pilha(){
        array = new int[10];
        n = 0;
    }
    
    public Pilha(int len){
        array = new int[len];
        n = 0;
    }
    
    public void empilharFim(int x){
        if(n >= array.length){
            System.out.println("O array está cheio");
            System.exit(0);
        }
        array[n] = x;
        n++;
    }
    
    public int desempilharFim(){
        if(n == 0){
            System.out.println("O array está vazio");
            System.exit(0);
        }
        int removido = array[n];
        n--;
        System.out.println("Removido: " + removido);
        return removido;
    }
    
    public void mostrar (){
      System.out.print("[ ");
      for(int i = 0; i < n; i++){
         System.out.print(array[i] + " , ");
      }
      System.out.println("]");
   }
}
