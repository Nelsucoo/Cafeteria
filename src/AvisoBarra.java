// AvisoBarra.java
// OBSERVADOR CONCRETO nuevo: avisa a la barra de que hay algo por preparar.
public class AvisoBarra implements ObservadorPedido {

    @Override
    public void alConfirmar(Pedido pedido) {
        System.out.println("[Barra] Preparar: " + pedido.descripcion());
    }
}