
package controlador;

import vista.PanelEntradaDatos;
import vista.VentanaPrincipal;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;

import modelo.Modelo;


public class controlador implements ActionListener {
    private VentanaPrincipal miVentanaPrincipal;
    private Modelo modelo;

    public controlador(VentanaPrincipal miVentanaPrincipal, Modelo modelo) {
        this.miVentanaPrincipal = miVentanaPrincipal;
        this.modelo = modelo;
        this.miVentanaPrincipal.miPanelProceso.btnAgregar.addActionListener(this);
        this.miVentanaPrincipal.miPanelProceso.btnCalcular.addActionListener(this);
        this.miVentanaPrincipal.miPanelProceso.btnBorrar.addActionListener(this);
        this.miVentanaPrincipal.miPanelProceso.btnSalir.addActionListener(this);
    }

   
    public void actionPerformed(ActionEvent ae) {
        String comando = ae.getActionCommand();

        
        if (comando.equals("agregarValor")) {
            PanelEntradaDatos.agregarValor();
        } else if (comando.equals("calcularProducto")) {
            Modelo.hallarProductoEscalar();
            this.miVentanaPrincipal.miPanelSalida.mostrarResultados(this.modelo.getProductoEscalar());
        } else if (comando.equals("borrarTexto")) {
            vista.PanelEntradaDatos.borrarTf();
            this.miVentanaPrincipal.miPanelSalida.borrarTa();
        } else if (comando.equals("cerrarVentana")) {
            JOptionPane.showMessageDialog(null, "El programa se cerrará...", "Producto Escalar",
                    JOptionPane.WARNING_MESSAGE);
            System.exit(0);
        }
    }
}