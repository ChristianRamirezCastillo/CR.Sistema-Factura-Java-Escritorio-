package Clases;

import java.util.Date;

public class Datos {
    
    private int maxUsuario = 50;
    private int maxProducto = 100;
    private int maxCliente = 100;
    
    
    private Usuario misUsuarios[] = new Usuario[maxUsuario];
    private Producto misProductos[] = new Producto[maxProducto];
    private Cliente misClientes[] = new Cliente[maxCliente];
    
    private int contUsuarios = 0;
    private int contProductos = 0;
    private int contClientes= 0;
    
    public Datos() {
        
        //usuarios
        Usuario miUsuario;
        
        miUsuario = new Usuario("cramirez", "christian", "ramirez", "123", 1);
        misUsuarios[contUsuarios] = miUsuario;
        contUsuarios++;
        
        miUsuario = new Usuario("acaceres", "angie", "caceres", "123", 2);
        misUsuarios[contUsuarios] = miUsuario;
        contUsuarios++;
        
        miUsuario = new Usuario("acastillo", "ana", "castillo", "123", 2);
        misUsuarios[contUsuarios] = miUsuario;
        contUsuarios++;
        
        //productos
        Producto miProducto;
        
        miProducto = new Producto("1", "Cocal Cola", 3.50, 0, "");
        misProductos[contProductos] = miProducto;
        contProductos++;
        
        miProducto = new Producto("2", "Pan", 0.20, 1, "se vende mejor caliente");
        misProductos[contProductos] = miProducto;
        contProductos++;
        
        miProducto = new Producto("3", "Queso fresco x 400 GR", 4.50, 1, "");
        misProductos[contProductos] = miProducto;
        contProductos++;
        
        //clientes
        Cliente miCliente;
        
        miCliente = new Cliente("1", 1, "Juan Carlos", "Zuluaga", "Direccion 01", "123-1234", 1, 
                Utilidades.stringToDate("1974/09/23"), Utilidades.stringToDate("2015/03/30"));
        misClientes[contClientes] = miCliente;
        contClientes++;
        
         miCliente = new Cliente("2", 1, "Angie", "Caceres", "Direccion 02", "123-1234", 1, 
                Utilidades.stringToDate("1985/09/23"), Utilidades.stringToDate("2015/03/27"));
        misClientes[contClientes] = miCliente;
        contClientes++;
        
    }
    
    //usuarios
    public String agregarUsuario(Usuario miUsuario) {
        if (contUsuarios == maxUsuario) {
            return "Se ha alcanzado el numbero maximo de usuarios";
        }
        
        misUsuarios[contUsuarios] = miUsuario;
        contUsuarios++;
        return "Usuario agregado";
    }
    public String modificarUsuario(Usuario miUsuario, int pos) { 
        misUsuarios[pos].setNombres(miUsuario.getNombres());
        misUsuarios[pos].setApellidos(miUsuario.getApellidos());
        misUsuarios[pos].setClave(miUsuario.getClave());
        misUsuarios[pos].setPerfil(miUsuario.getPerfil());
        return "Usuario modificado correctamente";
    }
    public String borrarUsuario(int pos) {
        for (int i = pos; i < contUsuarios - 1; i++) {
            misUsuarios[i] = misUsuarios[i + 1];
        }
        contUsuarios--;
        return "Usuario borrado correctamente";
    }
    public boolean validarUsuario(String usuario, String clave) {
        boolean aux = false;
        for (int i = 0; i < contUsuarios; i++) {
            if (misUsuarios[i].getIdUsuario().equals(usuario) && 
                    misUsuarios[i].getClave().equals(clave)) {
                return true;
            }
        }
        
        return false;
    }
    public int posicionUsuario(String usuario) {
        int aux = -1;
        for (int i = 0; i < contUsuarios; i++) {
            if (misUsuarios[i].getIdUsuario().equals(usuario)) 
                return 1;
        }
        
        return -1;
    }
    public int numeroUsuarios() {
        return contUsuarios;
    }
    public Usuario[] getUsuarios() {
        return misUsuarios;
    }
    
    //productos
    public Producto[] getProductos() {
        return misProductos;
    }
    public int numeroProductos() {
        return contProductos;
    }
    public int posicionProducto(String producto) {
        int aux = -1;
        for (int i = 0; i < contProductos; i++) {
            if (misProductos[i].getIdProducto().equals(producto)) 
                return 1;
        }
        
        return -1;
    }
    public String agregarProducto(Producto miProducto) {
        if (contProductos == maxProducto) {
            return "Se ha alcanzado el numbero maximo de usuarios";
        }
        
        misProductos[contProductos] = miProducto;
        contProductos++;
        return "Producto agregado correctamente";
    }
    public String modificarProducto(Producto miProducto, int pos) { 
        misProductos[pos].setDescripcion(miProducto.getDescripcion());
        misProductos[pos].setPrecio(miProducto.getPrecio());
        misProductos[pos].setIGV(miProducto.getIGV());
        misProductos[pos].setNota(miProducto.getNota());
        return "Producto modificado correctamente";
    }
    public String borrarProducto(int pos) {
        for (int i = pos; i < contProductos - 1; i++) {
            misProductos[i] = misProductos[i + 1];
        }
        contProductos--;
        return "Producto borrado correctamente";
    }
    
    //clientes
    public Cliente[] getClientes() {
        return misClientes;
    }
    public int numeroClientes() {
        return contClientes;
    }
    public int posicionCliente(String cliente) {
        int aux = -1;
        for (int i = 0; i < contClientes; i++) {
            if (misClientes[i].getIdCliente().equals(cliente)) 
                return 1;
        }
        
        return -1;
    }
    public String agregarCliente(Cliente miCliente) {
        if (contClientes == maxCliente) {
            return "Se ha alcanzado el numbero maximo de clientes";
        }
        
        misClientes[contClientes] = miCliente;
        contClientes++;
        return "Cliente agregado correctamente";
    }
    public String modificarCliente(Cliente miCliente, int pos) { 
        misClientes[pos].setTipoIdentificacion(miCliente.getTipoIdentificacion());
        misClientes[pos].setNombres(miCliente.getNombres());
        misClientes[pos].setApellidos(miCliente.getApellidos());
        misClientes[pos].setDireccion(miCliente.getDireccion());
        misClientes[pos].setTelefono(miCliente.getTelefono());
        misClientes[pos].setIdDistrito(miCliente.getIdDistrito());
        misClientes[pos].setFechaNacimiento(miCliente.getFechaIngreso());
        misClientes[pos].setFechaIngreso(miCliente.getFechaNacimiento());
        return "Cliente modificado correctamente";
    }
    public String borrarCliente(int pos) {
        for (int i = pos; i < contClientes - 1; i++) {
            misClientes[i] = misClientes[i + 1];
        }
        contClientes--;
        return "Cliente borrado correctamente";
    }
    
}
