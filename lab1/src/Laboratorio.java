import java.util.LinkedList;
import java.util.Queue;

public class Laboratorio {
    public static void main (String [] args){
        Queue<String> pedidos = new LinkedList<>();

        pedidos.offer("Pedido #001");
        pedidos.offer("Pedido #002");
        pedidos.offer("Pedido #003");

        System.out.println("Procesando pedidos: ");
        while (!pedidos.isEmpty()){
            String pedidoActual = pedidos.poll();
            System.out.println("Procesando: " + pedidoActual);
        }
        System.out.println("\nPedidos pendientes: " + pedidos.size());
    }
}
