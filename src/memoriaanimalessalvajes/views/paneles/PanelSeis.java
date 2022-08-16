package memoriaanimalessalvajes.views.paneles;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.ImageIcon;
import javax.swing.JLabel;

import javax.swing.Timer;
import memoriaanimalessalvajes.clases.DatosGenerales;
import memoriaanimalessalvajes.clases.DatosJuego;
import memoriaanimalessalvajes.clases.NumerosAleatorios;
import memoriaanimalessalvajes.enumeraciones.Pares;

import memoriaanimalessalvajes.views.ModalInformacion;
import org.netbeans.lib.awtextra.AbsoluteConstraints;

public class PanelSeis extends javax.swing.JPanel {

    DatosGenerales datos = new DatosGenerales();
    DatosJuego pares = DatosGenerales.pares;
    JLabel matriz[][];
    int mat[][] = new int[3][4];
    int mat2[][] = new int[3][4];
    int contador, turno = 0, aciertos = 0, ban, ban1, annum, anposx, anposy, acnum, acposx, acposy;
    Timer espera, espera2, tiempo;
    int consegund, seg, min;


    /**
     * Creates new form PanelSeis
     */
    public PanelSeis() {
        initComponents();

        NumerosAleatorios numeroaleatorios = new NumerosAleatorios();
        mat = numeroaleatorios.matrizNumeros(3, 4, Pares.SEIS.getNumPar());

        this.matrizImages();
        lblhora.setText(datos.HORA);
        lblfecha.setText(datos.fecha());
        lbljugador.setText(pares.getJugador());
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelCentral = new javax.swing.JPanel();
        panelSuperior = new javax.swing.JPanel();
        lblaciertos = new javax.swing.JLabel();
        lblfecha = new javax.swing.JLabel();
        lblhora = new javax.swing.JLabel();
        lbljugador = new javax.swing.JLabel();
        cronometro = new javax.swing.JLabel();
        lblturno = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setMinimumSize(new java.awt.Dimension(1500, 800));
        setPreferredSize(new java.awt.Dimension(1500, 473));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panelCentral.setBackground(new java.awt.Color(255, 255, 255));
        panelCentral.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        add(panelCentral, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 180, 710, 370));

        panelSuperior.setBackground(new java.awt.Color(0, 0, 0));
        panelSuperior.setMinimumSize(new java.awt.Dimension(1500, 60));
        panelSuperior.setPreferredSize(new java.awt.Dimension(1500, 60));
        panelSuperior.setLayout(new java.awt.GridLayout());

        lblaciertos.setFont(new java.awt.Font("Noto Sans", 1, 36)); // NOI18N
        lblaciertos.setForeground(new java.awt.Color(255, 255, 255));
        lblaciertos.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblaciertos.setText("0");
        lblaciertos.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)), "Acertadas", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 14), new java.awt.Color(255, 255, 255))); // NOI18N
        panelSuperior.add(lblaciertos);

        lblfecha.setFont(new java.awt.Font("Noto Sans", 1, 24)); // NOI18N
        lblfecha.setForeground(new java.awt.Color(255, 255, 255));
        lblfecha.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblfecha.setText("12/12/12");
        lblfecha.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)), "Fecha", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 14), new java.awt.Color(255, 255, 255))); // NOI18N
        panelSuperior.add(lblfecha);

        lblhora.setFont(new java.awt.Font("Noto Sans", 1, 24)); // NOI18N
        lblhora.setForeground(new java.awt.Color(255, 255, 255));
        lblhora.setText(" 2:00");
        lblhora.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)), "Hora", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 14), new java.awt.Color(255, 255, 255))); // NOI18N
        panelSuperior.add(lblhora);

        lbljugador.setFont(new java.awt.Font("Noto Sans", 1, 24)); // NOI18N
        lbljugador.setForeground(new java.awt.Color(255, 255, 255));
        lbljugador.setText(" EunicePerez");
        panelSuperior.add(lbljugador);

        cronometro.setBackground(new java.awt.Color(0, 0, 0));
        cronometro.setFont(new java.awt.Font("Noto Sans", 1, 36)); // NOI18N
        cronometro.setForeground(new java.awt.Color(255, 255, 255));
        cronometro.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        cronometro.setText("0:0");
        cronometro.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)), "Tiempo", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Noto Sans", 1, 14), new java.awt.Color(255, 255, 255))); // NOI18N
        panelSuperior.add(cronometro);

        lblturno.setFont(new java.awt.Font("Noto Sans", 1, 36)); // NOI18N
        lblturno.setForeground(new java.awt.Color(255, 255, 255));
        lblturno.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblturno.setText(" 0");
        lblturno.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)), "Turno", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 14), new java.awt.Color(255, 255, 255))); // NOI18N
        panelSuperior.add(lblturno);

        add(panelSuperior, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1500, 80));
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel cronometro;
    private javax.swing.JLabel lblaciertos;
    private javax.swing.JLabel lblfecha;
    private javax.swing.JLabel lblhora;
    private javax.swing.JLabel lbljugador;
    private javax.swing.JLabel lblturno;
    private javax.swing.JPanel panelCentral;
    private javax.swing.JPanel panelSuperior;
    // End of variables declaration//GEN-END:variables
void matrizImages() {

        matriz = new JLabel[3][4];
        for (int i = 0; i < 3; i++)
        {
            for (int j = 0; j < 4; j++)
            {
                matriz[i][j] = new JLabel();

                matriz[i][j].setSize(matriz[i][j].getWidth(), matriz[i][j].getHeight());
                //aqui la demas espacios a la imagenes para que no salgan pegadas 
                matriz[i][j].setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
                //matriz[i][j].setBounds(200 + (j * 125), 30 + (i * 156), 125, 156);
                matriz[i][j].setMinimumSize(new java.awt.Dimension(150, 150));
                //declaramos la imagenes que tiene el los nombres de 1 a 10
                matriz[i][j].setIcon(new ImageIcon(getClass().getResource(datos.URLGENERAL + mat2[i][j] + ".png")));

                //colocamos que la matriz se muestre en pantalla
                matriz[i][j].setVisible(true);
                add(panelCentral, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 130));
                //aqui se añaden junto con la 0

                panelCentral.add(matriz[i][j], new AbsoluteConstraints((j * 130), (i * 156)));

            }

        }

        seg = 0;
        min = 0;

        //este lo colocamos para podermo mostrar el tiempo que 
        //transcurre durante el juego
        tiempo = new Timer(1000, (ActionEvent e) ->
        {
            seg++;
            if (seg == 60)
            {
                min++;
                seg = 0;
            }
            
            //declaramos en una variable cronometro el tiempo que transcurre
            cronometro.setText(min + ":" + seg);
        });
        tiempo.start();
        //declaramos en la variable espera la cual es otro tiempo el cual lo utilizamos 
        //para colocar un tiempo a la hora de que las cartas se voltean 
        consegund = 0;
        espera = new Timer(1000, (ActionEvent e) ->
        {
            consegund++;
        });
        espera.start();
        espera.stop();
        consegund = 0;
        ban = 0;
        ban1 = 0;

        //evento de clic en la cartas
        contador = 0;
        for (int i = 0; i < 3; i++)
        {
            for (int j = 0; j < 4; j++)
            {
                matriz[i][j].addMouseListener(new MouseAdapter() {
                    public void mousePressed(MouseEvent e) {
                        for (int k = 0; k < 3; k++)
                        {
                            for (int l = 0; l < 4; l++)
                            {
                                if (e.getSource() == matriz[k][l])
                                {
                                   

                                    //cuando se da click a la carta esta se volteara
                                    if (mat2[k][l] == 0 && contador != 2)
                                    {
                                        mat2[k][l] = mat[k][l];
                                        matriz[k][l].setIcon(new ImageIcon(getClass().getResource(datos.URLGENERAL + mat2[k][l] + ".png")));
                                        contador++;
                                        acnum = mat[k][l];
                                        acposx = k;
                                        acposy = l;
                                        if (contador == 1)
                                        {
                                            annum = mat[k][l];
                                            anposx = k;
                                            anposy = l;
                                        }

                                        //tiempo que se tarda en dar vuelta
                                        espera2 = new Timer(500, new ActionListener() {

                                            public void actionPerformed(ActionEvent e) {

                                                if (contador == 2 && ban1 == 0)
                                                {
                                                    espera.restart();
                                                    ban1 = 1;
                                                    turno++;
                                                    lblturno.setText(String.valueOf(turno));
                                                }
                                                if (contador == 2 && consegund == 2)
                                                {
                                                    espera.stop();
                                                    consegund = 0;

                                                    //Desaparecen las cartas que son iguales y deja las que aun no se encuentran
                                                    if (mat2[acposx][acposy] == mat2[anposx][anposy])
                                                    {
                                                        aciertos++;
                                                        mat2[acposx][acposy] = -1;
                                                        mat2[anposx][anposy] = -1;

                                                        matriz[acposx][acposy].setIcon(new ImageIcon(datos.URLGENERAL + mat2[acposx][acposy] + ".png"));
                                                        matriz[anposx][anposy].setIcon(new ImageIcon(datos.URLGENERAL + mat2[anposx][anposy] + ".png"));

                                                        contador = 0;
                                                        //gano si toda la mat2 es -1
                                                        int acum = 0;
                                                        for (int m = 0; m < 3; m++)
                                                        {
                                                            for (int n = 0; n < 4; n++)
                                                            {
                                                                if (mat2[m][n] == -1)
                                                                {
                                                                    acum++;
                                                                }
                                                            }
                                                        }
                                                        lblaciertos.setText(String.valueOf(aciertos));
                                                        //cuando no se encuentre ninguna para entonces aparecera
                                                        //un mensaje diciendo que gano y ejecutando automaticamente
                                                        //la ventana Recordjugador
                                                        if (acum == 12)
                                                        {
                                                            tiempo.stop();
                                                            pares.setHora(datos.HORA);
                                                            pares.setFecha(datos.fecha());
                                                            pares.setTiempo(min + ":" + seg);
                                                            pares.setAcertadas(String.valueOf(aciertos));
                                                            pares.setIntentos(String.valueOf(turno));
                                                            new ModalInformacion().setVisible(true);

                                                        }

                                                    }
                                                    for (int m = 0; m < 3; m++)
                                                    {
                                                        for (int n = 0; n < 4; n++)
                                                        {
                                                            //se coloca el valor -1 a las cartas pares
                                                            if (mat2[m][n] != 0 && mat2[m][n] != -1)
                                                            {
                                                                mat2[m][n] = 0;
                                                                matriz[m][n].setIcon(new ImageIcon(getClass().getResource(DatosGenerales.URLGENERAL + mat2[m][n] + ".png")));
                                                                contador = 0;

                                                            }

                                                        }

                                                    }
                                                    espera2.stop();
                                                    ban1 = 0;
                                                }
                                            }
                                        });
                                        if (ban == 0)
                                        {
                                            espera2.start();
                                        }
                                        ban = 1;
                                        if (contador == 2)
                                        {
                                            espera2.restart();
                                        }
                                    }

                                }

                            }

                        }
                    }

                });

            }

        }
    }

}
