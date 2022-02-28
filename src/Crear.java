// Nombre: Julio Alejandro Zaldaña Ríos
// Carnet: 202110206
// IPC 1 - TAREA 2 
//-------------------------------------------


import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JInternalFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class Crear extends JInternalFrame {

    private Cliente clientes[];

    public Crear(Cliente[] clientes) {
        this.clientes = clientes;
        this.init();
    }

    private void init() {
        
        GridBagConstraints gridBagConstraints;          // -> Se configura la ventana como tal
        getContentPane().setLayout(new GridBagLayout());

        setTitle("Creación de Cliente");
        setMinimumSize(new Dimension(250, 200));
        setPreferredSize(new Dimension(500, 400));
        setIconifiable(true);
        setClosable(true);
        setResizable(true);
        setMaximizable(true);


        JLabel lblCUI = new JLabel("CUI:");
        lblCUI.setHorizontalAlignment(SwingConstants.CENTER);
        lblCUI.setFont(new Font("Bookman Old Style",Font.BOLD,18));
        JLabel lblNombre = new JLabel("Nombre:");
        lblNombre.setHorizontalAlignment(SwingConstants.CENTER);
        lblNombre.setFont(new Font("Bookman Old Style",Font.BOLD,18));
        JLabel lblApellido = new JLabel("Apellido:");
        lblApellido.setHorizontalAlignment(SwingConstants.CENTER);
        lblApellido.setFont(new Font("Bookman Old Style",Font.BOLD,18));
        this.txtNombre = new JTextField();
        this.txtApellido = new JTextField();
        this.txtCUI = new JTextField();
        this.btnCrear = new JButton("Crear Cliente");

        this.btnCrear.addActionListener(new ActionListener() {                  // -> Función para crear cliente
            @Override
            public void actionPerformed(ActionEvent evt) {
                agregarCliente();
            }
        });

        // Agrega etiqueta CUI
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = GridBagConstraints.BOTH;
        this.add(lblCUI, gridBagConstraints);

        // / Agrega campo de texto para el CUI
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 1;
        this.add(txtCUI, gridBagConstraints);

        // Agrega etiqueta Nombre
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = GridBagConstraints.BOTH;
        this.add(lblNombre, gridBagConstraints);

        // Agrega campo de texto para nombre
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 1;
        this.add(txtNombre, gridBagConstraints);


        // Agrega etiqueta Apellido
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.fill = GridBagConstraints.BOTH;
        this.add(lblApellido, gridBagConstraints);

        // Agrega campo de texto para apellido
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.fill = GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 1;
        this.add(txtApellido, gridBagConstraints);

        // Se crea el botón de crear cliente
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.fill = GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 1;
        gridBagConstraints.insets = new Insets(10, 10, 10, 10);
        this.add(btnCrear, gridBagConstraints);

        pack();
    }

    private void agregarCliente() {
        
        for (int i = 0; i < clientes.length; i++) {
            if (clientes[i] != null) {
                
                continue;
            } else {
               
                clientes[i] = new Cliente(Integer.parseInt(this.txtCUI.getText()),
                        this.txtNombre.getText(), this.txtApellido.getText());
                
                JOptionPane.showMessageDialog(this, "Cliente creado exitosamente", "Nuevo", JOptionPane.INFORMATION_MESSAGE);
                break;
            }
        }
    }

    private JTextField txtCUI;
    private JTextField txtNombre;
    private JTextField txtApellido;
    private JButton btnCrear;
}