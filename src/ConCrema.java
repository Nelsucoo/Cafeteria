// ConCrema.java
// DECORATOR CONCRETO nuevo.
public class ConCrema extends ExtraBebida {

    public ConCrema(Bebida bebida) {
        super(bebida);
    }

    @Override
    public String descripcion() {
        return super.descripcion() + " con crema";
    }

    @Override
    public int precio() {
        return super.precio() + 1500;
    }
}