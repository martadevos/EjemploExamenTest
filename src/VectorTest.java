import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class VectorTest {

    public Vector vector = new Vector(new double[]{1.5, 9.6, -8.7, 4.3});
    public Vector vector1Valor = new Vector(new double[]{1.5});
    public Vector vectorVacio = new Vector(new double[0]);

    @Test
    void duplicarValoresCN() {
        Vector vector2 = new Vector(new double[]{3, 19.2, -17.4, 8.6});
        vector.duplicarValores();
        assertArrayEquals(vector2.vector, vector.vector, "hola");
    }

    @Test
    void duplicarValoresCN2() {
        Vector vector2 = new Vector(new double[]{3});
        vector.duplicarValores();
        assertArrayEquals(vector2.vector, vector1Valor.vector, "hola");
    }

    @Test
    void duplicarValoresCN3() {
        Vector vector2 = new Vector(new double[0]);
        vector.duplicarValores();
        assertArrayEquals(vector2.vector, vectorVacio.vector, "hola");
    }

    @Test
    void obtenerMaximoCN() throws Exception {
        assertEquals(9.6, vector.obtenerMaximo(), "hola");
    }

    @Test
    void contieneValor() {

    }
}