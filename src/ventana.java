// Nombre: Julio Alejandro Zaldaña Ríos
// Carnet: 202110206
// IPC 1 - TAREA 2 
//-------------------------------------------

import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.ImageIcon;
import javax.swing.JDesktopPane;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;




public class ventana extends JFrame{

    public Cliente[] cliente;
    public Cuenta[] cuentas;


    public ventana() {
        cliente = new Cliente[14];
        cuentas = new Cuenta[14];
        this.init();


    }

    private void init(){

        GridBagConstraints gridBagConstraints;
        getContentPane().setLayout(new GridBagLayout());

        setTitle("Mi Banca Virtual");
        setMinimumSize(new Dimension(800, 600));
        setPreferredSize(new Dimension(800, 600));

        this.desktopPane = new JDesktopPane();


        this.desktopPane.setBackground(new Color(236, 236, 236));
        JLabel background = new JLabel(new ImageIcon("bancavirtual.png"));
        background.setOpaque(true);
        background.setHorizontalAlignment(SwingConstants.CENTER);
        background.setBounds(0, 0, 500, 60);
        add(background);

     this.desktopPane.setDragMode(JDesktopPane.LIVE_DRAG_MODE);



        JMenuBar menuBar = new JMenuBar();           //-> Barra de menú
        JMenu cliente = new JMenu("Cliente");
        JMenu cuentas = new JMenu("Cuentas");
        JMenu transferencia = new JMenu("Transferencias");

        //Submenús para clientes
        JMenuItem crearCliente = new JMenuItem("Nuevo Cliente");
        crearCliente.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent evt) {
                agregarInternalFrame(1);
                setVisible(true);

            }
        });

        JMenuItem mostrarClientes = new JMenuItem("Clientes en el sistema");
        mostrarClientes.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent evt){
                listaCliente();
            }

        });

        //Submenús para cuentas

        JMenuItem crearCuenta = new JMenuItem("Crear Cuenta");
        crearCuenta.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                agregarInternalFrame(2);
            }

        });

        JMenuItem consultarCuenta = new JMenuItem("Consultar cuenta");
        consultarCuenta.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent evt){
                agregarInternalFrame(3);
            }

        });


        //Submenús para transferencias
        JMenuItem crearTransferencia = new JMenuItem("Realizar transferencia");
        consultarCuenta.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent evt){
                //agregarInternalFrame(5);
            }

        });




        //Se agregan los submenús a menús del cliente

        cliente.add(crearCliente);
        cliente.add(mostrarClientes);

        //Se agregan los submenús para cuentas

        cuentas.add(crearCuenta);
        cuentas.add(consultarCuenta);


        transferencia.add(crearTransferencia);

        menuBar.add(cliente);
        menuBar.add(cuentas);
        menuBar.add(transferencia);

        // Para poder cerrar la aplicación
        this.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
        this.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        //Se agrega menú a ventana
        this.setJMenuBar(menuBar);

        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 1;
        gridBagConstraints.weighty = 1;
        this.add(this.desktopPane, gridBagConstraints);
        pack();



    }

    private void agregarInternalFrame(int option) {
        switch (option) {
            case 1:
                Crear crear = new Crear(this.cliente);
                desktopPane.add(crear);
                crear.toFront();
                crear.setVisible(true);
                try {
                    crear.setSelected(true);
                } catch (Exception ex) {
                    System.out.println(ex);
                }
                break;

            case 2:
                CrearCnt cuentaCrear = new CrearCnt(this.cliente);
                desktopPane.add(cuentaCrear);
                cuentaCrear.toFront();
                cuentaCrear.setVisible(true);
                try {
                    cuentaCrear.setSelected(true);
                } catch (Exception ex) {
                    System.out.println(ex);
                }
                break;

            case 3:
                Consulta consultaCrear = new Consulta(this.cliente);
                desktopPane.add(consultaCrear);
                consultaCrear.toFront();
                consultaCrear.setVisible(true);
                try {
                    consultaCrear.setSelected(true);
                } catch (Exception ex) {
                    System.out.println(ex);
                }
                break;    
                
       }

        
    }

    
    private void formWindowClosing(WindowEvent evt) {
        int res = JOptionPane.showConfirmDialog(this, "¿Desea salir de la Banca Virtual?", "Banca Virtual",
                JOptionPane.YES_NO_CANCEL_OPTION);
        if (res == JOptionPane.YES_OPTION) {
            this.dispose();
        }
    }

    private void listaCliente() {
        for (int i=0; i< cliente.length; i++) {
            if (cliente[i] != null){
                cliente[i].obtenerDatos();
            }
        }
    }

    public static void main(String args[]) {
        ventana ventana = new ventana();
        ventana.setVisible(true);
    }
        private JDesktopPane desktopPane;






}