package algoritmo;

public class Fila {

    private int[] array;
    private int n;
    
    public Fila(){
        array = new int[10];
        n = 0;
    }
    
    public Fila(int tamanho){
        array = new int[tamanho];
        n = 0;
    }
    
    public void inserirInicio(int num){
        if(n >= array.length){
            System.out.println("Array cheio");
            System.exit(0);
        }
        
        if(n == 0){
            array[n] = num;
        }else{
            for(int i = n; i > 0; i--){
                array[i] = array[i - 1]; 
            }
        }
        array[0] = num;
        n++;
        
    }
    
    public int removerFim(){
        if(n == 0){
            System.out.println("Array vazio");
            System.exit(0);
        }
        int guarda = array[n];
        n--;
        System.out.println("Retirado: " + guarda);
        return guarda;
    }
    
    public void mostrar (){
      System.out.print("[ ");
      for(int i = 0; i < n; i++){
         System.out.print(array[i] + " , ");
      }
      System.out.println("]");
   }
    
}
