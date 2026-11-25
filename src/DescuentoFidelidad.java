// DescuentoFidelidad.java
// ESTRATEGIA CONCRETA nueva: 15% de descuento para clientes frecuentes.
public class DescuentoFidelidad implements EstrategiaDescuento {

    @Override
    public int aplicar(int subtotal) {
        return subtotal * 85 / 100;
    }
}