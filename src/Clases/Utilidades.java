package Clases;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Utilidades {
    
    public static boolean isNumeric(String cadena) {
        try {
            Integer.parseInt(cadena);
            return true;
        } catch (NumberFormatException nfe) {
            return false;
        }
    }
    public static boolean isDouble(String cadena) {
        try {
                Double.parseDouble(cadena);
                return true;
        } catch (NumberFormatException nfe) {
            return false;
        }
    }
    public static Date stringToDate(String fecha) {
        SimpleDateFormat formatoDelTexto = new SimpleDateFormat("yyyy/MM/dd");
        Date aux = null;
        
        try {
            aux = formatoDelTexto.parse(fecha);
        } catch (Exception e) {
        }
        return aux;
    }
    
    
}
