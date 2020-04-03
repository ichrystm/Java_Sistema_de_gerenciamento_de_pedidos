
package barman2000;

import java.util.Scanner;
public class Barman2000 {

   
    public static void main(String[] args) {
        filaestaticab2 fila = new filaestaticab2(10);
        System.out.println("bem vindo ao barman 2000");
        
        Scanner entrada = new Scanner(System.in);
        
        int resposta = 1;
        while(resposta == 1){
        
        System.out.println("escolha uma opção:");
        System.out.println("1. fazer pedido");
        System.out.println("2. processar pedido");
        System.out.println("3. mostrar pedidos");
        System.out.println("4. proximo pedido");
        System.out.println("5. finalizar");
        
        int menu;
        menu = entrada.nextInt();
        
        
        
            switch(menu){
            case 1:
                
                System.out.println("Digite a bebida:");
                System.out.println("1. cerveja");
                System.out.println("2. vodka");
                int bebidaaux;
                int bebida;
                bebidaaux = entrada.nextInt();
                while(bebidaaux <= 0 || bebidaaux >2){
                    System.out.println("Digite um valor válido:");
                    System.out.println("1. cerveja");
                    System.out.println("2. vodka");
                    bebidaaux = entrada.nextInt();
                }
                bebida = bebidaaux;
                System.out.println("quantidade:");
                int quantidade;
                quantidade = entrada.nextInt();
                pedido elemento = new pedido();
                elemento.setBebida(bebida);
                elemento.setQuantidade(quantidade);
                fila.enqueue(elemento);
                System.out.println("Pedido realizado, aguarde.");
                System.out.println(" ");
                System.out.println("Seu pedido:");
                if(bebida == 1){
                    System.out.println("Bebida: cerveja");
                }
                if(bebida == 2){
                    System.out.println("Bebida: Vodka");
                }
                System.out.println("Quantidade:"+ " " + quantidade);
                System.out.println(" ");
        break;
        
            case 2: 
                fila.dequeue();
                System.out.println("enviado para o controle diário");
                break;
                
            case 3:
                System.out.println("pedidos:");
               fila.impr();
        break;
        
            case 4:
                fila.front();
            default:
                System.out.println("digite uma opção válida");
                break;
        }
            
        
        }
        
    }
    
}
