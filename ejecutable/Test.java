package ejecutable;

import controlador.controlador;
import modelo.Modelo;
import vista.VentanaPrincipal;


public class Test {
   
    public static void main(String[] args) {
        Modelo miModelo = new Modelo();
        VentanaPrincipal miVentana = new VentanaPrincipal();
        new controlador(miVentana, miModelo);
    }
}