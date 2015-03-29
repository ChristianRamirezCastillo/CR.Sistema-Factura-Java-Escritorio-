package Clases;

public class Datos {
    
    private int maxUsuario = 50;
    private Usuario misUsuarios[] = new Usuario[50];
    private int contUsuarios = 0;
    
    public Datos() {
        Usuario miUsuario = new Usuario("cramirez", "christian", "ramirez", "123", 1);
        misUsuarios[contUsuarios] = miUsuario;
        contUsuarios++;
    }
    
    public int posicionUsuario(String usuario) {
        int aux = -1;
        for (int i = 0; i < contUsuarios; i++) {
            if (misUsuarios[i].getIdUsuario().equals(usuario)) 
                return 1;
        }
        
        return -1;
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
    
    public String agregarUsuario(Usuario miUsuario) {
        if (contUsuarios == maxUsuario) {
            return "Se ha alcanzado el numbero maximo de usuarios";
        }
        
        misUsuarios[contUsuarios] = miUsuario;
        contUsuarios++;
        return "Usuario agregado";
    }
    
    public Usuario[] getUsuarios() {
        return misUsuarios;
    }
    
}
