
package barman2000;


public class filaestaticab2 {
 
    pilhaestaticab2 pilha = new pilhaestaticab2(15);
     public pedido[] fila;
    public int inicio, fim;
     public int quantidade;

    public filaestaticab2(int tamanho) {
        fila = new pedido[tamanho];
        inicio = fim = -1;
        quantidade = 0;
    }

    public boolean isEmpty() {
        return inicio == -1;
    }

    public boolean isFull() {
        return fim == fila.length - 1;
    }

    public int size() {
        return quantidade;
    }

    public void enqueue(pedido elemento) {
        if (!isFull()) {
            fim++;
            fila[fim] = elemento;
            if (inicio == -1) {
                inicio++;
            }
            quantidade++;
        }
    } 
    public pedido dequeue() {
        if (!isEmpty()) {
            pedido aux = fila[inicio];
            pilha.push(aux);
            
            for (int i = 0; i < fim; i++) {
                fila[i] = fila[i + 1];
            }
            fim--;
            if (fim == -1) {
                inicio--;
            }
            quantidade--;
        }
        return null;
    }
    
    public void front() {
        if (!isEmpty()) {
            pedido aux = fila[inicio];
            System.out.println(aux);
        }
        
    }
    public void impr(){
        pilha.imprimir();
    }
}
