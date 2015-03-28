package Clases;

import Formularios.frmLogin;


public class JavaEscritorio {

    public static void main(String[] args) {
        Datos misDatos = new Datos();
        
        //llamamos al formulario login
        frmLogin miLogin = new frmLogin();
        miLogin.setDatos(misDatos);
        miLogin.setLocationRelativeTo(null);
        miLogin.setVisible(true);
    }
    
}
