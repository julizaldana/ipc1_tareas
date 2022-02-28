// Nombre: Julio Alejandro Zaldaña Ríos
// Carnet: 202110206
// IPC 1 - TAREA 2 
//-------------------------------------------



public class Cliente {

    public int cui;
    public String nombre;
    public String apellido;
    public Cuenta[] cuentas;

    public Cliente(int cui, String nombre, String apellido){
        this.cui = cui;
        this.nombre = nombre;
        this.apellido = apellido;
        this.cuentas = new Cuenta[14];


    }

    public void crear(Cuenta cuenta){
        for (int i =0; i < cuentas.length; i++){
            if (cuentas[i] == null) {
                cuentas[i] = cuenta;
                break;
            }
        }
    }
    

    public void obtenerDatos() {
        System.out.println(" ****** Lista de clientes ******");
        System.out.println(cui + ": " + nombre + "  " + apellido );
        System.out.println("********************************");
        for (int i = 0; i < cuentas.length; i++) {
            if (cuentas[i] == null) {
                continue;
            }
            cuentas[i].obtenerDatos();
        }
    }


    //buscar cuenta con cui

    public Cuenta buscarCuenta(int nocuenta) {
        Cuenta cuenta = null;
        for (int i=0; i<10; i++){
            if (cuentas[i] == null){
                continue;
            }
            if (cuentas[i].nocuenta == cui) {
                cuenta = cuentas[i];
            }
        }
        return cuenta;
    }

}
