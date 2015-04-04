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
    public static String formatDate(Date fecha) {
        SimpleDateFormat formatoDelTexto = new SimpleDateFormat("yyyy/MM/dd");
        return formatoDelTexto.format(fecha);
    }
    public static String objectToString(Object obj) {
        String str = "";
        if (obj != null) {
            str = obj.toString();
        }
        return str;
    }
    public static int objectToInt(Object obj) {
        int numInt = Integer.parseInt(objectToString(obj));
        return numInt;
    }
    public static double objectToDouble(Object obj) {
        String str = obj.toString();
        double numDouble = Double.valueOf(str).doubleValue();
        return numDouble;
    }
}
