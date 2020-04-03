
package barman2000;


public class pilhaestaticab2 {
    public pedido pilha[];
    public int topo;

    public pilhaestaticab2(int tamanho) {
        pilha = new pedido[tamanho];
        topo = -1;
    }

    public boolean isEmpty() {
        return topo == -1;
    }

    public boolean isFull() {
        return topo == pilha.length - 1;
    }

    public int size() {
        return topo + 1;
    }

    public void push(pedido aux) {
        if (!isFull()) {
            topo++;
            pilha[topo] = aux;
            //pilha[++topo] = elemento;
        } else {
            System.out.println("Está cheio!");
        }
    }

    public pedido pop() {
        if (!isEmpty()) {
            pedido retorno = pilha[topo];
            topo--;
            return retorno;
        }
        return null;
    }
    
    public pedido top() {
        if (!isEmpty()) {
            return pilha[topo];
        }
        return null;
    }
    
    public void imprimir(){
      if(isEmpty()){
          System.out.println("pilha vazia");
      }else{
          for (int i = 0; i < pilha.length; i++) {
              pedido aux = pilha[i];
              System.out.println("bebida:" + aux.getBebida());
              System.out.println("quantidade:" + aux.getQuantidade());
          }
      }
      
    }
}

