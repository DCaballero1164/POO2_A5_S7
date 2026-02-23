package view;

import data.RegistroPedido;
import model.Pedido;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;

public class VentanaListaPedidos extends JFrame {
    private JTable table1;
    private JPanel panel1;
    private JButton refrescarButton;

    private DefaultTableModel modelo;

    public VentanaListaPedidos(RegistroPedido registro) {
        setTitle("SpeddFast  -  Lista de Pedidos");             //Titulo
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);      //Define la accion al cerrar la ventana
        setContentPane(panel1);                                 //Panel raíz del .form
        pack();                                                 //Ajusta el tamaño de la ventana para que se adapte al contenido

        setLocationRelativeTo(null);                            //Centrar ventana

        // Configurar modelo de la tabla - se utiliza DefaultTableModel
        modelo = new DefaultTableModel(new Object[]{"ID", "Dirección", "Tipo"}, 0);
        table1.setModel(modelo);

        // Acción del botón refrescar
        refrescarButton.addActionListener(e -> refrescarTabla(registro));

        // Cargar pedidos al abrir la ventana
        refrescarTabla(registro);
    }

    //Metodo que refresca los datos de la tabla
    private void refrescarTabla(RegistroPedido registro) {
        modelo.setRowCount(0); // limpia la tabla
        for (Pedido p : registro.getPedidos()) {
            modelo.addRow(p.toArray());
        }
    }
}
