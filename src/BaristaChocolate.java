// BaristaChocolate.java
// CREADOR CONCRETO nuevo: la pareja de Chocolate.
public class BaristaChocolate extends Barista {

    @Override
    protected Bebida crearBebida() {
        return new Chocolate();
    }
}