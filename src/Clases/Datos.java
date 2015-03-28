package Clases;

public class Datos {
    
    private Usuario misUsuarios[] = new Usuario[50];
    private int contUsuarios = 0;
    
    public Datos() {
        Usuario miUsuario = new Usuario("cramirez", "christian", "ramirez", "123", 1);
        misUsuarios[contUsuarios] = miUsuario;
        contUsuarios++;
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
    
    public Usuario[] getUsuarios() {
        return misUsuarios;
    }
    
}
