package Clases;

import java.util.Date;

public class Cliente {
    
    private String idCliente;
    private int tipoIdentificacion;
    private String nombres;
    private String apellidos;
    private String direccion;
    private String telefono;
    private int idDistrito;
    private Date fechaNacimiento;
    private Date fechaIngreso;
    
    public Cliente(String idCliente, int tipoIdentificacion, String nombres, String apellidos,
            String direccion, String telefono, int idDistrito, Date fechaNacimiento, Date fechaIngreso) {
        this.idCliente = idCliente;
        this.tipoIdentificacion = tipoIdentificacion;
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.direccion = direccion;
        this.telefono = telefono;
        this.idDistrito = idDistrito;
        this.fechaNacimiento = fechaNacimiento;
        this.fechaIngreso = fechaIngreso;
    }

    public String getIdCliente() {
        return idCliente;
    }
    public void setIdCliente(String idCliente) {
        this.idCliente = idCliente;
    }

    public int getTipoIdentificacion() {
        return tipoIdentificacion;
    }
    public void setTipoIdentificacion(int tipoIdentificacion) {
        this.tipoIdentificacion = tipoIdentificacion;
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

    public String getDireccion() {
        return direccion;
    }
    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTelefono() {
        return telefono;
    }
    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public int getIdDistrito() {
        return idDistrito;
    }
    public void setIdDistrito(int idDistrito) {
        this.idDistrito = idDistrito;
    }

    public Date getFechaNacimiento() {
        return fechaNacimiento;
    }
    public void setFechaNacimiento(Date fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public Date getFechaIngreso() {
        return fechaIngreso;
    }
    public void setFechaIngreso(Date fechaIngreso) {
        this.fechaIngreso = fechaIngreso;
    }
    
    @Override public String toString() {
        return idCliente + "|"
                + tipoIdentificacion + "|"
                + nombres + "|"
                + apellidos + "|"
                + direccion + "|"
                + telefono + "|"
                + idDistrito + "|"
                + fechaNacimiento + "|"
                + fechaIngreso;
    }
    
    
}
