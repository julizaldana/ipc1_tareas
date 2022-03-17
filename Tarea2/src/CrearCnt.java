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



public class CrearCnt extends JInternalFrame {

    int ncuenta = 0;

    private Cliente clientes[];

    public CrearCnt(Cliente[] clientes) {
        this.clientes = clientes;
        this.init();
    }

    private void init() {
        
        GridBagConstraints gridBagConstraints;
        getContentPane().setLayout(new GridBagLayout());

       
        setTitle("Crear curso");                         // -> Se configura la ventana como tal
        setMinimumSize(new Dimension(250, 200));
        setPreferredSize(new Dimension(500, 400));
        setIconifiable(true);
        setClosable(true);
        setResizable(true);
        setMaximizable(true);


    
        JLabel CUI = new JLabel("CUI:",SwingConstants.CENTER);     // -> Se crean las etiquetas de la ventana
        CUI.setFont(new Font("Bookman Old Style",Font.BOLD,15));      
        add(CUI);


        JLabel fondo = new JLabel("Fondos:",SwingConstants.CENTER);                         //Se podrá ingresar la cantidad de dinero para crear la cuenta
        fondo.setFont(new Font("Bookman Old Style",Font.BOLD,15));        
        add(fondo);
    

        // Se inicializarán los campos de texto
        this.txtCUI = new JTextField();                                         
        this.txtfondo = new JTextField();


        this.btnCrear = new JButton("Crear");
        
        this.btnCrear.addActionListener(new ActionListener() {          //-> Realiza la acción del botón
            @Override
            public void actionPerformed(ActionEvent evt) {
                crearcuenta(CUI.getText(), fondo.getText());
            }
        });


        // Agrega etiqueta de CUI
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = GridBagConstraints.BOTH;
        this.add(CUI, gridBagConstraints);
        // Agrega campo de texto para el CUI
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 1;
        this.add(txtCUI, gridBagConstraints);

        // Agrega etiqueta de fondos
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = GridBagConstraints.BOTH;
        this.add(fondo, gridBagConstraints);
        // Agrega campo de texto para fondos
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 1;
        this.add(txtfondo, gridBagConstraints);

        // Agrega boton
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.fill = GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 1;
        gridBagConstraints.insets = new Insets(10,10,10,10);
        this.add(btnCrear, gridBagConstraints);
        pack();




    }




        public void crearcuenta(String cui, String fondo){
            String NoCuenta="";
            int ctn;
            int cuenta1 = 1;
            try{
        

                while(cuenta1 != 0){
                    cuenta1 = 0;
                    ctn = ((int)(Math.random() * 999999999 + 100000000));                // -> Se generará una cuenta para el cliente, con un numero al azar.
                    NoCuenta = ctn + "";
                    for(int i =0;i< ncuenta;i++){

                    }
                }
                int fondos = Integer.parseInt(fondo);
                if(fondos < 100){
                    JOptionPane.showMessageDialog(this,"Los fondos para comenzar deben ser mayores a 100","Nuevo",JOptionPane.WARNING_MESSAGE);
                }
  
            }
            catch(Exception ie){
                JOptionPane.showMessageDialog(this, "Cuenta registrado existosamente, Apunte su numero de cuenta: " + NoCuenta,"Nuevo",JOptionPane.INFORMATION_MESSAGE);
            }
        
            }
    


    private JTextField txtCUI;
    private JTextField txtfondo;
    private JButton btnCrear;
}