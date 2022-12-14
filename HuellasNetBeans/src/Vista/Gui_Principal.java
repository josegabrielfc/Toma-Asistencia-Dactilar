/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import java.awt.Color;
import java.awt.Image;
import java.awt.Toolkit;
import java.io.File;
import javax.swing.JOptionPane;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JLabel;
import javax.swing.UIManager;
import javax.swing.filechooser.FileNameExtensionFilter;
import util.ArchivoLeerURL;

/**
 *
 * @author docenteauditorio
 */
public class Gui_Principal extends javax.swing.JFrame {

    private ImageIcon imagen;
    private Icon icono;
    int xMouse, yMouse;
    String text;

    /**
     * Creates new form Gui_Principal
     */
    public Gui_Principal() {

        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }

        initComponents();

        setIconImage(getIconImage());
        this.setLocationRelativeTo(this);
        this.pintarImagen(this.logo, "src/Vista/Images/ufps.PNG");
        this.pintarImagen(this.logo2, "src/Vista/Images/logo_ingsistemas_vertical_invertido.png");
    }

    //Icono
    @Override
    public Image getIconImage() {
        Image retValue = Toolkit.getDefaultToolkit().getImage(ClassLoader.getSystemResource("Vista/Images/ufps_Icon.jpg"));
        return retValue;
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
        header = new javax.swing.JPanel();
        btnExit = new javax.swing.JPanel();
        exitTxt = new javax.swing.JLabel();
        title = new javax.swing.JLabel();
        footer = new javax.swing.JLabel();
        image = new javax.swing.JLabel();
        logo = new javax.swing.JLabel();
        logo2 = new javax.swing.JLabel();
        txt_logo = new javax.swing.JLabel();
        txt2_logo = new javax.swing.JLabel();
        btnCrearDoc = new javax.swing.JPanel();
        iconCrear = new javax.swing.JLabel();
        btnSubirUrl = new javax.swing.JPanel();
        iconUrl = new javax.swing.JLabel();
        btnCargarDoc = new javax.swing.JPanel();
        iconCargar = new javax.swing.JLabel();
        txtCrearDoc = new javax.swing.JLabel();
        txtSubirUrl = new javax.swing.JLabel();
        txtCargarDoc = new javax.swing.JLabel();
        jLabelBackground = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocationByPlatform(true);
        setUndecorated(true);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setMinimumSize(new java.awt.Dimension(1100, 500));
        jPanel1.setPreferredSize(new java.awt.Dimension(1100, 500));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        header.setBackground(new java.awt.Color(0, 0, 0, 0));
        header.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                headerMouseDragged(evt);
            }
        });
        header.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                headerMousePressed(evt);
            }
        });

        btnExit.setBackground(new java.awt.Color(255, 255, 255));

        exitTxt.setFont(new java.awt.Font("Roboto Light", 0, 36)); // NOI18N
        exitTxt.setText(" X");
        exitTxt.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        exitTxt.setMaximumSize(new java.awt.Dimension(40, 40));
        exitTxt.setMinimumSize(new java.awt.Dimension(40, 40));
        exitTxt.setPreferredSize(new java.awt.Dimension(40, 40));
        exitTxt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                exitTxtMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                exitTxtMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                exitTxtMouseExited(evt);
            }
        });

        javax.swing.GroupLayout btnExitLayout = new javax.swing.GroupLayout(btnExit);
        btnExit.setLayout(btnExitLayout);
        btnExitLayout.setHorizontalGroup(
            btnExitLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btnExitLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(exitTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        btnExitLayout.setVerticalGroup(
            btnExitLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(exitTxt, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout headerLayout = new javax.swing.GroupLayout(header);
        header.setLayout(headerLayout);
        headerLayout.setHorizontalGroup(
            headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, headerLayout.createSequentialGroup()
                .addGap(0, 1060, Short.MAX_VALUE)
                .addComponent(btnExit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        headerLayout.setVerticalGroup(
            headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(headerLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(btnExit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jPanel1.add(header, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1100, 40));

        title.setFont(new java.awt.Font("Roboto Medium", 0, 62)); // NOI18N
        title.setText("EDIT UFPS");
        jPanel1.add(title, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 80, -1, -1));

        footer.setFont(new java.awt.Font("Quicksand Medium", 0, 14)); // NOI18N
        footer.setText("Desarrolladores: Jos?? Gabriel Fuentes - 1152085 / Yeison Andrey Mantilla Sanabria - 1152088");
        jPanel1.add(footer, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 480, -1, -1));

        image.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/Images/ads.png"))); // NOI18N
        jPanel1.add(image, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 100, -1, 40));

        logo.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 3));
        logo.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanel1.add(logo, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 70, 100, 100));
        jPanel1.add(logo2, new org.netbeans.lib.awtextra.AbsoluteConstraints(970, 400, 120, 140));

        txt_logo.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        txt_logo.setForeground(new java.awt.Color(255, 255, 255));
        txt_logo.setText("Universidad Francisco");
        txt_logo.setToolTipText("");
        txt_logo.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jPanel1.add(txt_logo, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 180, -1, -1));

        txt2_logo.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        txt2_logo.setForeground(new java.awt.Color(255, 255, 255));
        txt2_logo.setText("de Paula Santander");
        jPanel1.add(txt2_logo, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 190, -1, 30));

        btnCrearDoc.setBackground(new java.awt.Color(255, 255, 255));
        btnCrearDoc.setForeground(new java.awt.Color(255, 255, 255));

        iconCrear.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/Images/add.png"))); // NOI18N
        iconCrear.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        iconCrear.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                iconCrearMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout btnCrearDocLayout = new javax.swing.GroupLayout(btnCrearDoc);
        btnCrearDoc.setLayout(btnCrearDocLayout);
        btnCrearDocLayout.setHorizontalGroup(
            btnCrearDocLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 50, Short.MAX_VALUE)
            .addGroup(btnCrearDocLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(btnCrearDocLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(iconCrear, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        btnCrearDocLayout.setVerticalGroup(
            btnCrearDocLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 50, Short.MAX_VALUE)
            .addGroup(btnCrearDocLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(btnCrearDocLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(iconCrear)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        jPanel1.add(btnCrearDoc, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 210, 50, 50));

        btnSubirUrl.setBackground(new java.awt.Color(255, 255, 255));
        btnSubirUrl.setForeground(new java.awt.Color(255, 255, 255));

        iconUrl.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/Images/add_link.png"))); // NOI18N
        iconUrl.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        iconUrl.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                iconUrlMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout btnSubirUrlLayout = new javax.swing.GroupLayout(btnSubirUrl);
        btnSubirUrl.setLayout(btnSubirUrlLayout);
        btnSubirUrlLayout.setHorizontalGroup(
            btnSubirUrlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 50, Short.MAX_VALUE)
            .addGroup(btnSubirUrlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(btnSubirUrlLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(iconUrl, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        btnSubirUrlLayout.setVerticalGroup(
            btnSubirUrlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 50, Short.MAX_VALUE)
            .addGroup(btnSubirUrlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(btnSubirUrlLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(iconUrl, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        jPanel1.add(btnSubirUrl, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 210, 50, 50));

        btnCargarDoc.setBackground(new java.awt.Color(255, 255, 255));
        btnCargarDoc.setForeground(new java.awt.Color(255, 255, 255));

        iconCargar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/Images/file_upload.png"))); // NOI18N
        iconCargar.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        iconCargar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                iconCargarMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                iconCargarMouseEntered(evt);
            }
        });

        javax.swing.GroupLayout btnCargarDocLayout = new javax.swing.GroupLayout(btnCargarDoc);
        btnCargarDoc.setLayout(btnCargarDocLayout);
        btnCargarDocLayout.setHorizontalGroup(
            btnCargarDocLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 50, Short.MAX_VALUE)
            .addGroup(btnCargarDocLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(btnCargarDocLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(iconCargar, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        btnCargarDocLayout.setVerticalGroup(
            btnCargarDocLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 50, Short.MAX_VALUE)
            .addGroup(btnCargarDocLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(btnCargarDocLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(iconCargar, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        jPanel1.add(btnCargarDoc, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 210, 50, 50));

        txtCrearDoc.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        txtCrearDoc.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtCrearDoc.setText("Crear Nuevo Documento");
        jPanel1.add(txtCrearDoc, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 260, 200, -1));

        txtSubirUrl.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        txtSubirUrl.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtSubirUrl.setText("Subir Url");
        jPanel1.add(txtSubirUrl, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 260, 110, -1));

        txtCargarDoc.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        txtCargarDoc.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtCargarDoc.setText("Cargar Documento");
        jPanel1.add(txtCargarDoc, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 260, 140, -1));

        jLabelBackground.setBackground(new java.awt.Color(255, 255, 255));
        jLabelBackground.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/Images/city.png"))); // NOI18N
        jPanel1.add(jLabelBackground, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1100, 500));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 500, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void headerMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_headerMousePressed
        xMouse = evt.getX();
        yMouse = evt.getY();
    }//GEN-LAST:event_headerMousePressed

    private void headerMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_headerMouseDragged
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        this.setLocation(x - xMouse, y - yMouse);
    }//GEN-LAST:event_headerMouseDragged

    private void exitTxtMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitTxtMouseClicked
        System.exit(0);
    }//GEN-LAST:event_exitTxtMouseClicked

    private void exitTxtMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitTxtMouseEntered
        btnExit.setBackground(new java.awt.Color(190, 0, 0));
        exitTxt.setForeground(Color.white);
    }//GEN-LAST:event_exitTxtMouseEntered

    private void exitTxtMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitTxtMouseExited
        btnExit.setBackground(Color.white);
        exitTxt.setForeground(Color.black);
    }//GEN-LAST:event_exitTxtMouseExited

    private void iconUrlMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_iconUrlMouseClicked

        String url = javax.swing.JOptionPane.showInputDialog("Agregar mediante URL: ");

        Gui_Edit g = new Gui_Edit(url);

        if (url != null) {
            g.setVisible(true);
            this.setVisible(false);
        }

    }//GEN-LAST:event_iconUrlMouseClicked

    private void iconCargarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_iconCargarMouseClicked
        /*JFileChooser select;
        select = new JFileChooser(new File("").getAbsolutePath());
        select.setFileSelectionMode(JFileChooser.FILES_ONLY);
        select.setFileFilter(new FileNameExtensionFilter("Documentos PDF o Docx", "pdf", "docx"));
        int seleccion;
        File archivo = null;
        String ruta = null;

        seleccion = select.showSaveDialog(this);
        if (seleccion == JFileChooser.APPROVE_OPTION) {
            archivo = select.getSelectedFile();
        }
        if (archivo != null) {
            ruta = archivo.getAbsolutePath();
            System.out.println("Archivo extraido de: " + ruta);
        }
        Gui_Edit g = new Gui_Edit();
        //g.Gui_Edit_Doc(ruta);

        if (ruta != null) {
            g.setVisible(true);
            this.setVisible(false);
        }*/
    }//GEN-LAST:event_iconCargarMouseClicked

    private void iconCrearMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_iconCrearMouseClicked
        Gui_Edit g = new Gui_Edit();
        g.setVisible(true);
        this.setVisible(false);
        g.setEditableGetTxtDocumento();
    }//GEN-LAST:event_iconCrearMouseClicked

    private void iconCargarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_iconCargarMouseEntered
        this.iconCargar.setEnabled(false);
    }//GEN-LAST:event_iconCargarMouseEntered

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Gui_Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Gui_Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Gui_Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Gui_Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Gui_Principal().setVisible(true);
            }
        });
    }

    public void pintarImagen(JLabel lbl, String ruta) {
        this.imagen = new ImageIcon(ruta);
        this.icono = new ImageIcon(this.imagen.getImage().getScaledInstance(lbl.getWidth(), lbl.getHeight(), Image.SCALE_DEFAULT));

        lbl.setIcon(this.icono);
        this.repaint();
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel btnCargarDoc;
    private javax.swing.JPanel btnCrearDoc;
    private javax.swing.JPanel btnExit;
    private javax.swing.JPanel btnSubirUrl;
    private javax.swing.JLabel exitTxt;
    private javax.swing.JLabel footer;
    private javax.swing.JPanel header;
    private javax.swing.JLabel iconCargar;
    private javax.swing.JLabel iconCrear;
    private javax.swing.JLabel iconUrl;
    private javax.swing.JLabel image;
    private javax.swing.JLabel jLabelBackground;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel logo;
    private javax.swing.JLabel logo2;
    private javax.swing.JLabel title;
    private javax.swing.JLabel txt2_logo;
    private javax.swing.JLabel txtCargarDoc;
    private javax.swing.JLabel txtCrearDoc;
    private javax.swing.JLabel txtSubirUrl;
    private javax.swing.JLabel txt_logo;
    // End of variables declaration//GEN-END:variables
}
