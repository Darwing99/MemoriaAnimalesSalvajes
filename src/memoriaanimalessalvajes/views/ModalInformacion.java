package memoriaanimalessalvajes.views;

import memoriaanimalessalvajes.clases.DatosGenerales;
import memoriaanimalessalvajes.clases.DatosJuego;

public class ModalInformacion extends javax.swing.JFrame {

    DatosJuego pares = DatosGenerales.pares;

    /**
     * Creates new form ModalInformacion
     */
    public ModalInformacion() {
        
        this.setUndecorated(true);
        initComponents();
        this.setLocationRelativeTo(this);
        lbljugador.setText(pares.getJugador() != null ? "Felicidades! " + pares.getJugador() : "Felicidades Jugador");
        lblfecha.setText(pares.getFecha());
        lbltiempo.setText(pares.getTiempo());
        lblhora.setText(pares.getHora());
        lblpares.setText(pares.getAcertadas());
        lblintentos.setText(pares.getIntentos());
 
    
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        lbljugador = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        lblhora = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        lblfecha = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        lbltiempo = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        lblpares = new javax.swing.JLabel();
        jPanel8 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        lblintentos = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel3.setBackground(new java.awt.Color(0, 102, 102));
        jPanel3.setLayout(new java.awt.GridLayout(1, 0));

        lbljugador.setFont(new java.awt.Font("Noto Sans", 1, 36)); // NOI18N
        lbljugador.setForeground(new java.awt.Color(255, 255, 255));
        lbljugador.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbljugador.setText("Felicidades!");
        jPanel3.add(lbljugador);

        jPanel2.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 660, 90));

        jPanel4.setBackground(new java.awt.Color(0, 102, 102));
        jPanel4.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel4.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanel4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel4MouseClicked(evt);
            }
        });
        jPanel4.setLayout(new java.awt.GridLayout(1, 0));

        jLabel3.setFont(new java.awt.Font("Noto Sans", 1, 36)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Aceptar");
        jLabel3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel4.add(jLabel3);

        jPanel2.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 460, 280, 70));

        jLabel4.setFont(new java.awt.Font("Noto Sans", 1, 36)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Datos de Partida");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 90, 660, 60));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new java.awt.GridLayout(1, 0));

        jLabel7.setFont(new java.awt.Font("Noto Sans", 1, 24)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 0, 0));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel7.setText("Hora Inicio:");
        jPanel1.add(jLabel7);

        lblhora.setFont(new java.awt.Font("Noto Sans", 0, 24)); // NOI18N
        lblhora.setForeground(new java.awt.Color(0, 0, 0));
        jPanel1.add(lblhora);

        jPanel2.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 150, 410, 40));

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));
        jPanel5.setLayout(new java.awt.GridLayout(1, 0));

        jLabel8.setFont(new java.awt.Font("Noto Sans", 1, 24)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 0, 0));
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel8.setText("Fecha:");
        jPanel5.add(jLabel8);

        lblfecha.setFont(new java.awt.Font("Noto Sans", 0, 24)); // NOI18N
        lblfecha.setForeground(new java.awt.Color(0, 0, 0));
        jPanel5.add(lblfecha);

        jPanel2.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 190, 410, 50));

        jPanel6.setBackground(new java.awt.Color(255, 255, 255));
        jPanel6.setLayout(new java.awt.GridLayout(1, 0));

        jLabel2.setFont(new java.awt.Font("Noto Sans", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Tiempo:");
        jPanel6.add(jLabel2);

        lbltiempo.setFont(new java.awt.Font("Noto Sans", 0, 24)); // NOI18N
        lbltiempo.setForeground(new java.awt.Color(0, 0, 0));
        jPanel6.add(lbltiempo);

        jPanel2.add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 240, 410, 50));

        jPanel7.setBackground(new java.awt.Color(255, 255, 255));
        jPanel7.setLayout(new java.awt.GridLayout(1, 0));

        jLabel6.setFont(new java.awt.Font("Noto Sans", 1, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 0));
        jLabel6.setText("Pares:");
        jPanel7.add(jLabel6);

        lblpares.setFont(new java.awt.Font("Noto Sans", 0, 24)); // NOI18N
        lblpares.setForeground(new java.awt.Color(0, 0, 0));
        jPanel7.add(lblpares);

        jPanel2.add(jPanel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 290, 410, 60));

        jPanel8.setBackground(new java.awt.Color(255, 255, 255));
        jPanel8.setLayout(new java.awt.GridLayout(1, 0));

        jLabel1.setFont(new java.awt.Font("Noto Sans", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("No Intentos");
        jPanel8.add(jLabel1);

        lblintentos.setFont(new java.awt.Font("Noto Sans", 0, 24)); // NOI18N
        lblintentos.setForeground(new java.awt.Color(0, 0, 0));
        jPanel8.add(lblintentos);

        jPanel2.add(jPanel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 350, 410, 50));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 662, 583));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jPanel4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel4MouseClicked
        this.setVisible(false);
        pares.setNumeroPares(5);
        pares.setCambio(true);
        
    
       
    }//GEN-LAST:event_jPanel4MouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try
        {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels())
            {
                if ("Nimbus".equals(info.getName()))
                {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex)
        {
            java.util.logging.Logger.getLogger(ModalInformacion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex)
        {
            java.util.logging.Logger.getLogger(ModalInformacion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex)
        {
            java.util.logging.Logger.getLogger(ModalInformacion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex)
        {
            java.util.logging.Logger.getLogger(ModalInformacion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() ->
        {
            new ModalInformacion().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JLabel lblfecha;
    private javax.swing.JLabel lblhora;
    private javax.swing.JLabel lblintentos;
    private javax.swing.JLabel lbljugador;
    private javax.swing.JLabel lblpares;
    private javax.swing.JLabel lbltiempo;
    // End of variables declaration//GEN-END:variables
}
