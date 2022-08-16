package memoriaanimalessalvajes.clases;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class DatosGenerales {

    Calendar calendario = new GregorianCalendar();
    public static DatosJuego pares = new DatosJuego();
    public static final String URLGENERAL = "/memoriaanimalessalvajes/img/icons/";
    public int hora = calendario.get(Calendar.HOUR_OF_DAY);
    public int minuto = calendario.get(Calendar.MINUTE);
    public int segundo = calendario.get(Calendar.SECOND);
    public String HORA = hora + ":" + minuto + ":" + segundo;
    private String jugador;

    public String getJugador() {
        return jugador;
    }

    public void setJugador(String jugador) {
        this.jugador = jugador;
    }

    public DatosGenerales() {
    }

    // este metodo obtiene la fecha del dia mediante el dispositivo
    public String fecha() {
        Date fecha = new Date();
        SimpleDateFormat formatofecha = new SimpleDateFormat("dd/MM/YYYY");
        return formatofecha.format(fecha);

    }

}
