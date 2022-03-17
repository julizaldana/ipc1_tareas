// Nombre: Julio Alejandro Zaldaña Ríos
// Carnet: 202110206
// IPC 1 - TAREA 2 
//-------------------------------------------

public class Cuenta {

    public int nocuenta;
    public int cui;
    public String nombre;


    
    public Cuenta(int cui, String nombre, int nocuenta) {
        this.nocuenta = nocuenta;
        this.nombre = nombre;

    }



    public void obtenerDatos() {
        System.out.println(cui + " - " + nombre + " " + nocuenta );          //-> Se imprimirá en consola los clientes del sistema
    }

    
}
