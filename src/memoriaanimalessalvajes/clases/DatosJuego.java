package memoriaanimalessalvajes.clases;
import javazoom.jl.player.Player;

public class DatosJuego {

    private int numeroPares;
    private String jugador;
    private String tiempo;
    private String hora;
    private String fecha;
    private String intentos;
    private String acertadas;
    private boolean sonido;
 


    private Player reproductor;
    

    public Player getReproductor() {
        return reproductor;
    }

  
    public void setReproductor(Player reproductor) {
   
        this.reproductor = reproductor;
    }
  
    public boolean isSonido() {
        return sonido;
    }

    public void setSonido(boolean sonido) {
        this.sonido = sonido;
    }
    
    private boolean cambio;

    public boolean isCambio() {
        return cambio;
    }

    public void setCambio(boolean cambio) {
        this.cambio = cambio;
    }

    public String getIntentos() {
        return intentos;
    }

    public void setIntentos(String intentos) {
        this.intentos = intentos;
    }

    public String getAcertadas() {
        return acertadas;
    }

    public void setAcertadas(String acertadas) {
        this.acertadas = acertadas;
    }

    public String getTiempo() {
        return tiempo;
    }

    public void setTiempo(String tiempo) {
        this.tiempo = tiempo;
    }

    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getJugador() {
        return jugador;
    }

    public void setJugador(String jugador) {
        this.jugador = jugador;
    }

    public DatosJuego() {
    }

    public int getNumeroPares() {
        return numeroPares;
    }

    public void setNumeroPares(int numeroPares) {
        this.numeroPares = numeroPares;
    }

}
