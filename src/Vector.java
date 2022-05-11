public class Vector {

    public double[] vector;

    public Vector(double[] vector) {
        this.vector = vector.clone();
    }

    public void duplicarValores() {
        for (int i = 0; i < vector.length; i++) {
            vector[i] *= 2;
        }
    }

    public double obtenerMaximo() throws Exception {
        double max = vector[0];
        if (vector.length != 0) {
            for (double i : vector) {
                if (i > max) {
                    max = i;
                }
            }
        } else{
            throw new Exception("El vector está vacio");
        }
        return max;
    }

    public boolean contieneValor(double valor) {
        boolean contiene = false;
        int i = 0;
        while (i < vector.length && !contiene) {
            if (vector[i] == valor) contiene = true;
            i++;
        }
        return contiene;
    }
}
