/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package memoriaanimalessalvajes.views.paneles;

import memoriaanimalessalvajes.clases.DatosGenerales;
import memoriaanimalessalvajes.clases.DatosJuego;
import memoriaanimalessalvajes.clases.Reproductor;


public class PanelPrincipal extends javax.swing.JPanel {

    Reproductor reproductor = new Reproductor();
    DatosJuego datosActualesJuego = DatosGenerales.pares;

    /**
     * Creates new form PanelPrincipal
     */
    public PanelPrincipal() {
        initComponents();
        lblNombre.setText("Bienvenido " + datosActualesJuego.getJugador());
        music.setIcon(new javax.swing.ImageIcon(getClass().getResource(
                datosActualesJuego.isSonido()
                ? "/memoriaanimalessalvajes/img/icons/Sound-off.png"
                : "/memoriaanimalessalvajes/img/icons/3208765.png"
        )));

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        btnOchoPares = new javax.swing.JButton();
        btnSeisPares = new javax.swing.JButton();
        btnDiezPares = new javax.swing.JButton();
        btnDocePares = new javax.swing.JButton();
        lblNombre = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        music = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setAutoscrolls(true);
        jPanel1.setMinimumSize(new java.awt.Dimension(780, 480));
        jPanel1.setPreferredSize(new java.awt.Dimension(1580, 880));
        jPanel1.setRequestFocusEnabled(false);
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnOchoPares.setBackground(new java.awt.Color(255, 153, 0));
        btnOchoPares.setFont(new java.awt.Font("Noto Sans", 1, 30)); // NOI18N
        btnOchoPares.setForeground(new java.awt.Color(255, 255, 255));
        btnOchoPares.setText("8 Pares");
        btnOchoPares.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnOchoPares.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnOchoPares.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOchoParesActionPerformed(evt);
            }
        });
        jPanel1.add(btnOchoPares, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 350, 270, 70));

        btnSeisPares.setBackground(new java.awt.Color(255, 153, 0));
        btnSeisPares.setFont(new java.awt.Font("Noto Sans", 1, 30)); // NOI18N
        btnSeisPares.setForeground(new java.awt.Color(255, 255, 255));
        btnSeisPares.setText("6 Pares");
        btnSeisPares.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnSeisPares.setCursor(new java.awt.Cursor(java.awt.Cursor.MOVE_CURSOR));
        btnSeisPares.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSeisParesActionPerformed(evt);
            }
        });
        jPanel1.add(btnSeisPares, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 350, 270, 70));

        btnDiezPares.setBackground(new java.awt.Color(255, 153, 0));
        btnDiezPares.setFont(new java.awt.Font("Noto Sans", 1, 30)); // NOI18N
        btnDiezPares.setForeground(new java.awt.Color(255, 255, 255));
        btnDiezPares.setText("10 Pares");
        btnDiezPares.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnDiezPares.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnDiezPares.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDiezParesActionPerformed(evt);
            }
        });
        jPanel1.add(btnDiezPares, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 490, 270, 70));

        btnDocePares.setBackground(new java.awt.Color(255, 153, 0));
        btnDocePares.setFont(new java.awt.Font("Noto Sans", 1, 30)); // NOI18N
        btnDocePares.setForeground(new java.awt.Color(255, 255, 255));
        btnDocePares.setText("12 Pares");
        btnDocePares.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnDocePares.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnDocePares.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDoceParesActionPerformed(evt);
            }
        });
        jPanel1.add(btnDocePares, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 490, 270, 70));

        lblNombre.setBackground(new java.awt.Color(0, 0, 0));
        lblNombre.setFont(new java.awt.Font("Noto Sans", 1, 36)); // NOI18N
        lblNombre.setForeground(new java.awt.Color(0, 204, 204));
        lblNombre.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblNombre.setText("Bienvenido Jugador 12");
        jPanel1.add(lblNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 170, 838, -1));

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setFont(new java.awt.Font("Noto Sans", 1, 80)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 153, 153));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("ESCOGE UN NIVEL");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 50, 750, -1));

        music.setBackground(new java.awt.Color(255, 255, 255));
        music.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        music.setIcon(new javax.swing.ImageIcon(getClass().getResource("/memoriaanimalessalvajes/img/icons/3208765.png"))); // NOI18N
        music.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        music.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        music.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                musicMouseClicked(evt);
            }
        });
        jPanel1.add(music, new org.netbeans.lib.awtextra.AbsoluteConstraints(1230, 20, -1, -1));

        add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1304, 839));
    }// </editor-fold>//GEN-END:initComponents

    private void btnOchoParesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOchoParesActionPerformed

        datosActualesJuego.setNumeroPares(8);
        datosActualesJuego.setCambio(true);


    }//GEN-LAST:event_btnOchoParesActionPerformed


    private void btnSeisParesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSeisParesActionPerformed

        datosActualesJuego.setNumeroPares(6);
        datosActualesJuego.setCambio(true);

    }//GEN-LAST:event_btnSeisParesActionPerformed

    private void btnDiezParesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDiezParesActionPerformed

        datosActualesJuego.setNumeroPares(10);
        datosActualesJuego.setCambio(true);


    }//GEN-LAST:event_btnDiezParesActionPerformed

    private void btnDoceParesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDoceParesActionPerformed

        datosActualesJuego.setNumeroPares(12);
        datosActualesJuego.setCambio(true);

    }//GEN-LAST:event_btnDoceParesActionPerformed

    private void musicMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_musicMouseClicked
      
   
        
        try
        {

            if (datosActualesJuego.isSonido())
            {
               
                music.setIcon(new javax.swing.ImageIcon(getClass().getResource("/memoriaanimalessalvajes/img/icons/3208765.png"))); // NOI18N
                datosActualesJuego.setSonido(false);
                reproductor.stopMP3();
               

            } else
            {
                
                music.setIcon(new javax.swing.ImageIcon(getClass().getResource("/memoriaanimalessalvajes/img/icons/Sound-off.png"))); // NOI18N
                datosActualesJuego.setSonido(true);
                reproductor.playMP3();
                
            }

        } catch (Exception ex)

        {
            System.out.print(ex.getMessage());
        }
    }//GEN-LAST:event_musicMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDiezPares;
    private javax.swing.JButton btnDocePares;
    private javax.swing.JButton btnOchoPares;
    private javax.swing.JButton btnSeisPares;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblNombre;
    private javax.swing.JLabel music;
    // End of variables declaration//GEN-END:variables
}
