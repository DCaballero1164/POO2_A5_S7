package view;

import data.RegistroPedido;
import model.Pedido;

import javax.swing.*;

public class VentanaRegistroPedido extends JFrame {
    private JTextField textField1;          // ID Pedido
    private JTextField textField2;          // Dirección
    private JComboBox<String> comboBox1;    // Tipo de Pedido
    private JButton guardarButton;          //Boton guardar
    private JPanel registroPanel;           // panel raíz del .form

    public VentanaRegistroPedido(RegistroPedido registro) {
        setTitle("SpeedFast  -  Registro de pedido");           //Titulo
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);      //Define la accion al cerrar la ventana
        setContentPane(registroPanel);                          // enlaza el panel del .form
        pack();                                                 // ajusta tamaño según los componentes

        setLocationRelativeTo(null);    //Centrar ventana

        //Accion del boton guardar
        guardarButton.addActionListener(e -> {
            try {
                // Intentar convertir el texto a número entero
                int id = Integer.parseInt(textField1.getText());

                // Validar que sea positivo
                if (id <= 0) {
                    JOptionPane.showMessageDialog(this,
                            "El ID debe ser un número positivo.");
                    return;
                }

                String direccion = textField2.getText();
                String tipo = (String) comboBox1.getSelectedItem();

                if (direccion.isEmpty()) {
                    JOptionPane.showMessageDialog(this,
                            "La dirección es obligatoria.");
                    return;
                }

                // Validar que el ID no exista ya en el registro
                boolean existe = registro.getPedidos().stream()
                        .anyMatch(p -> p.getId().equals(String.valueOf(id)));

                if (existe) {
                    JOptionPane.showMessageDialog(this,
                            "El ID ya existe en la lista de pedidos.");
                    return;
                }

                // Si pasa todas las validaciones, crear y guardar
                Pedido nuevoPedido = new Pedido(String.valueOf(id), direccion, tipo);
                registro.AgregarPedido(nuevoPedido);
                JOptionPane.showMessageDialog(this, "Pedido agregado con éxito.");
                dispose();

            } catch (NumberFormatException ex) {
                // Captura si el ID no es un número válido
                JOptionPane.showMessageDialog(this,
                        "El ID debe ser un número entero válido.");
            }
        });

    }
}
