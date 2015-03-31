package Clases;

public class Usuario {
    private String idUsuario;
    private String nombres;
    private String apellidos;
    private String clave;
    private int perfil;

    public Usuario(String idUsuario, String nombres, String apellidos, String clave, int perfil) {
        this.idUsuario = idUsuario;
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.clave = clave;
        this.perfil = perfil;
    }

    public String getIdUsuario() {
        return idUsuario;
    }
    public void setIdUsuario(String idUsuario) {
        this.idUsuario = idUsuario;
    }

    public String getNombres() {
        return nombres;
    }
    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApellidos() {
        return apellidos;
    }
    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getClave() {
        return clave;
    }
    public void setClave(String clave) {
        this.clave = clave;
    }

    public int getPerfil() {
        return perfil;
    }
    public void setPerfil(int perfil) {
        this.perfil = perfil;
    }
    
    @Override public String toString() {
        return idUsuario + "|"
                + nombres + "|"
                + apellidos + "|"
                + clave + "|"
                + perfil;
    }
    
}
