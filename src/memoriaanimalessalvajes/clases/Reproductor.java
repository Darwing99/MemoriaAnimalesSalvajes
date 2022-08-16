
package memoriaanimalessalvajes.clases;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.logging.Level;
import java.util.logging.Logger;

import javazoom.jl.decoder.JavaLayerException;
import javazoom.jl.player.Player;

public class Reproductor {

    private FileInputStream fis;
    private Thread hilo;
    private BufferedInputStream bis;
    DatosJuego reproductorJUEGO = DatosGenerales.pares;

    String URL = "src/memoriaanimalessalvajes/music/principal.mp3";

    public Reproductor() {
        if(reproductorJUEGO.getReproductor()==null){
              openMP3(URL);
        }
      
    }

    public void openMP3(String url) {

        try
        {
            fis = new FileInputStream(url);

            bis = new BufferedInputStream(fis);
            try
            {

                reproductorJUEGO.setReproductor(new Player(bis));

            } catch (JavaLayerException ex)
            {
                Logger.getLogger(Reproductor.class.getName()).log(Level.SEVERE, null, ex);
            }

        } catch (FileNotFoundException ex)
        {
            Logger.getLogger(Reproductor.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public void playMP3() {
        openMP3(URL);

        hilo = new Thread(() ->
        {
            try
            {
                reproductorJUEGO.getReproductor().play();

                while(reproductorJUEGO.getReproductor().isComplete())
                {

                    this.playMP3();
                }

            } catch (JavaLayerException ex)
            {
                Logger.getLogger(Reproductor.class.getName()).log(Level.SEVERE, null, ex);
            }

        });
        hilo.start();
        reproductorJUEGO.setSonido(true);
    }

    public void stopMP3() {
        reproductorJUEGO.getReproductor().close();
        reproductorJUEGO.setSonido(false);

    }

}
