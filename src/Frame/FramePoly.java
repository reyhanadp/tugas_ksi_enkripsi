/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Frame;

import java.awt.event.KeyEvent;
import java.util.Vector;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import javax.swing.WindowConstants;

/**
 *
 * @author reyhanadp
 */
public class FramePoly extends javax.swing.JFrame {
    
    Vector tabel_model = new Vector();
    /**
     * Creates new form FramePoly
     */
    public FramePoly() {
        initComponents();
        this.setLocationRelativeTo(null);
        
        tabel_model.add("a");
        tabel_model.add("b");
        tabel_model.add("c");
        tabel_model.add("d");
        tabel_model.add("e");
        tabel_model.add("f");
        tabel_model.add("g");
        tabel_model.add("h");
        tabel_model.add("i");
        tabel_model.add("j");
        tabel_model.add("k");
        tabel_model.add("l");
        tabel_model.add("m");
        tabel_model.add("n");
        tabel_model.add("o");
        tabel_model.add("p");
        tabel_model.add("q");
        tabel_model.add("r");
        tabel_model.add("s");
        tabel_model.add("t");
        tabel_model.add("u");
        tabel_model.add("v");
        tabel_model.add("w");
        tabel_model.add("x");
        tabel_model.add("y");
        tabel_model.add("z");
        
//        for (int i = 0; i < 10; i++) {
//            for (int j = 0; j < 10; j++) {
//                
//                if (i == 7) {
//                    return;
//                }
//                System.out.println(i + " " + j);
//            }
//            if (i == 7) {
//                System.out.println("done");
//            }
//        }

//        for (int i = 0; i < 5; i++) {
//            for (int j = 0; j < 5; j++) {
//                if (i * j > 6) {
//                    System.out.println("Breaking");
//                    return;
//                }
//                System.out.println(i + " " + j);
//            }
//        }
//        for (int j = 2; 0 < j; j--) {
//            System.out.println(j);
//        }
//        int i = 0;
//        while (i++ < 10) {
//            if (i == 5) {
//                break;
//            }
//        }
//        System.out.println(i);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        fieldPlaintext = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        fieldKunci = new javax.swing.JTextField();
        btnProses = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        fieldChipertext = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        jLabel1.setText("Plaintext");

        jLabel2.setText("Kunci");

        fieldKunci.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                fieldKunciKeyTyped(evt);
            }
        });

        btnProses.setText("Proses");
        btnProses.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProsesActionPerformed(evt);
            }
        });

        jLabel3.setText("Chipertext");

        fieldChipertext.setColumns(20);
        fieldChipertext.setRows(5);
        jScrollPane1.setViewportView(fieldChipertext);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(jLabel2)
                    .addComponent(jLabel1))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnProses, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(fieldKunci)
                    .addComponent(fieldPlaintext)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 230, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(fieldPlaintext, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(fieldKunci, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnProses)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnProsesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProsesActionPerformed
        // TODO add your handling code here:
        Vector kunci_vector = new Vector();
        String kunci = fieldKunci.getText();
        String[] kunci_array = kunci.toLowerCase().split("");
        String kunci_hasil = "";
        String kunci_final = "";
        int index = 0;

        for (int i = 0; i < kunci_array.length; i++) {
            index=0;
            if (i == 0) {
                kunci_hasil = kunci_hasil + kunci_array[0];
                kunci_vector.add(kunci_array[i]);
            } else {
                for (int j = i-1; 0 <= j; j--) {
                    if (kunci_array[i].compareTo(kunci_array[j]) == 0) {
                        index=1;
                        break;
                    }
                }
                
                if(index == 0 && kunci_array[i].compareTo(" ") != 0){
                    kunci_hasil = kunci_hasil + kunci_array[i];
                    kunci_vector.add(kunci_array[i]);
                }
                
            }

        }
        
        System.out.println(kunci_hasil);
        
        String[] kunci_hasil_array = kunci_hasil.toLowerCase().split("");
        int ulang = 26 - kunci_hasil_array.length;
//        kunci_final = kunci_hasil;
        for(int i = 0; i < 26 ; i++){
            index = 0;
            for(int j = 0 ; j < kunci_hasil_array.length ; j++){
                if(tabel_model.get(i).equals(kunci_hasil_array[j])){
                    index = 1;
                    break;
                }
            }
            
            if(index == 0){
                kunci_vector.add(tabel_model.get(i));
//                kunci_final = kunci_final + tabel_model.get(i);
            }
        }
        
//        for(int i = 0 ; i< kunci_vector.size() ; i++){
//            System.out.println(kunci_vector.get(i));
//        }

        String plaintext = fieldPlaintext.getText();
        String[] temp = plaintext.toLowerCase().split("");
        String chipertext = "";
        index = 0;
        for(int i = 0; i < temp.length ; i++){
            if(temp[i].compareTo(" ") == 0){
                chipertext = chipertext + " ";
            }else{
                if ("a".equals(temp[i])) {
                    index = 0;
                } else if ("b".equals(temp[i])) {
                    index = 1;
                } else if ("c".equals(temp[i])) {
                    index = 2;
                } else if ("d".equals(temp[i])) {
                    index = 3;
                } else if ("e".equals(temp[i])) {
                    index = 4;
                } else if ("f".equals(temp[i])) {
                    index = 5;
                } else if ("g".equals(temp[i])) {
                    index = 6;
                } else if ("h".equals(temp[i])) {
                    index = 7;
                } else if ("i".equals(temp[i])) {
                    index = 8;
                } else if ("j".equals(temp[i])) {
                    index = 9;
                } else if ("k".equals(temp[i])) {
                    index = 10;
                } else if ("l".equals(temp[i])) {
                    index = 11;
                } else if ("m".equals(temp[i])) {
                    index = 12;
                } else if ("n".equals(temp[i])) {
                    index = 13;
                } else if ("o".equals(temp[i])) {
                    index = 14;
                } else if ("p".equals(temp[i])) {
                    index = 15;
                } else if ("q".equals(temp[i])) {
                    index = 16;
                } else if ("r".equals(temp[i])) {
                    index = 17;
                } else if ("s".equals(temp[i])) {
                    index = 18;
                } else if ("t".equals(temp[i])) {
                    index = 19;
                } else if ("u".equals(temp[i])) {
                    index = 20;
                } else if ("v".equals(temp[i])) {
                    index = 21;
                } else if ("w".equals(temp[i])) {
                    index = 22;
                } else if ("x".equals(temp[i])) {
                    index = 23;
                } else if ("y".equals(temp[i])) {
                    index = 24;
                } else if ("z".equals(temp[i])) {
                    index = 25;
                }
                
                chipertext = chipertext + kunci_vector.get(index);
            }
        }
        fieldChipertext.setText(chipertext.toUpperCase());
        
    }//GEN-LAST:event_btnProsesActionPerformed

    private void fieldKunciKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_fieldKunciKeyTyped
        // TODO add your handling code here:
//        char karakter = evt.getKeyChar();
//        
//        if (karakter == KeyEvent.VK_MULTIPLY) {
//            JOptionPane.showMessageDialog(null, "Hanya Boleh Huruf!");
//            evt.consume();
//        }
    }//GEN-LAST:event_fieldKunciKeyTyped

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        // TODO add your handling code here:
        this.setDefaultCloseOperation(WindowConstants.DO_NOTHING_ON_CLOSE);
        int pilih = JOptionPane.showConfirmDialog(null, "Apakah Anda yakin ingin keluar ?", "Konfirmasi", JOptionPane.YES_NO_OPTION);
        if (pilih == JOptionPane.YES_OPTION) {
            FrameHome frameHome = new FrameHome();
            frameHome.setVisible(true);
            this.dispose();
        }
    }//GEN-LAST:event_formWindowClosing

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
            com.jtattoo.plaf.noire.NoireLookAndFeel.setTheme("Large-Font", "Java Swing", "");
            UIManager.setLookAndFeel("com.jtattoo.plaf.acryl.AcrylLookAndFeel");
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FramePoly().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnProses;
    private javax.swing.JTextArea fieldChipertext;
    private javax.swing.JTextField fieldKunci;
    private javax.swing.JTextField fieldPlaintext;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}