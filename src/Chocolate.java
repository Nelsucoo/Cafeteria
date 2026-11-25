// Chocolate.java
// PRODUCTO CONCRETO nuevo: no se modifica ninguna clase existente para crearlo.
public class Chocolate implements Bebida {

    @Override
    public String descripcion() {
        return "Chocolate";
    }

    @Override
    public int precio() {
        return 6000;
    }
}