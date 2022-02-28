// Nombre: Julio Alejandro Zaldaña Ríos
// Carnet: 202110206
// IPC 1 - TAREA 2 
//-------------------------------------------


import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import javax.swing.JInternalFrame;


public class Consulta extends JInternalFrame {

    private Cliente clientes[];

    public Consulta(Cliente[] clientes) {
        this.clientes = clientes;
        this.init();
    }

    int poscliente = 0;


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

        


        pack();

    }

}
