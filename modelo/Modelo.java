package modelo;


public class Modelo {
    
    private static int[] vectorA = new int[10];
    private static int[] vectorB = new int[10];
    public static int productoEscalar;
    public static int resultado;

    
    public void setvectorA(int[] vectorA) {
        Modelo.vectorA = vectorA;
    }

   
    public void setvectorB(int[] vectorB) {
        Modelo.vectorB = vectorB;
    }

    public void setProductoEscalar(int productoEscalar) {
        Modelo.productoEscalar = productoEscalar;
    }

    
    public int getProductoEscalar() {
        return productoEscalar;
    }

    
    public static void hallarProductoEscalar() {
        for (int i = 0; i < 10; i++) {
            resultado = vectorA[i] * vectorB[i];
            productoEscalar += resultado;
        }
    }
}

