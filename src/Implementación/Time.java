package Implementación;
/**
 *
 * @author glenn
 */
import java.util.Calendar;
import java.util.GregorianCalendar;

public class Time {
    
    Calendar fecha = new GregorianCalendar();
    
    String año = Integer.toString(fecha.get(Calendar.YEAR));
    String mes = Integer.toString(fecha.get(Calendar.MONTH)+1);
    String dia = Integer.toString(fecha.get(Calendar.DATE));
    
    String fechacompleta = dia+"/"+mes+"/"+año;
    
    String h = Integer.toString(fecha.get(Calendar.HOUR_OF_DAY));
    String m = Integer.toString(fecha.get(Calendar.MINUTE));
    String s = Integer.toString(fecha.get(Calendar.SECOND));
    
    String horacompleta = h+":"+m+":"+s;
    
}
