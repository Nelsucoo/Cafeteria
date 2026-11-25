public class SinDescuento implements EstrategiaDescuento {

    @Override
    public int aplicar(int subtotal) {
        return subtotal;
    }
}