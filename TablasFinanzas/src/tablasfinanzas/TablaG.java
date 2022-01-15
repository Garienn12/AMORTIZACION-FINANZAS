/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tablasfinanzas;

import java.awt.Toolkit;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author BRAYAN
 */
public class TablaG extends javax.swing.JFrame {

  ArrayList<Amortizacion> lista=new ArrayList<Amortizacion>();
  String periodosg;
  int []periodosgr;
  int periodos,ndecimales;
  double sumatasas;
  double tasa,tasam;
  double cuota;
  double capital;
  boolean cont=false;
    public TablaG() {
        super("Tabla Amortizaciones con Peridos de gracia");
        initComponents();
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("/images/icon.png")));
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnCalcular = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel5 = new javax.swing.JLabel();
        txtLimpiar = new javax.swing.JButton();
        btnRegresar = new javax.swing.JButton();
        txtCuota = new javax.swing.JLabel();
        txtPrestamo = new javax.swing.JTextField();
        txtTEA = new javax.swing.JTextField();
        txtPeriodos = new javax.swing.JTextField();
        txtPeriodosG = new javax.swing.JTextField();
        txtDecimales = new javax.swing.JSpinner();
        jLabel4 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnCalcular.setBackground(new java.awt.Color(239, 239, 239));
        btnCalcular.setForeground(new java.awt.Color(255, 252, 252));
        btnCalcular.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/botont1.png"))); // NOI18N
        btnCalcular.setText("Calcular");
        btnCalcular.setBorderPainted(false);
        btnCalcular.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnCalcular.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/images/botont1.png"))); // NOI18N
        btnCalcular.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/images/botont2.png"))); // NOI18N
        btnCalcular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCalcularActionPerformed(evt);
            }
        });
        getContentPane().add(btnCalcular, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 80, 90, 32));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Periodos", "Capital", "Interes", "Cuota", "Amortizaciones", "Saldo"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 240, 554, 188));

        jLabel5.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 252, 252));
        jLabel5.setText("Amortizaciones con Periodos de Gracia");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 20, 350, 40));

        txtLimpiar.setBackground(new java.awt.Color(239, 239, 239));
        txtLimpiar.setForeground(new java.awt.Color(255, 252, 252));
        txtLimpiar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/botont1.png"))); // NOI18N
        txtLimpiar.setText("Limpiar");
        txtLimpiar.setBorderPainted(false);
        txtLimpiar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        txtLimpiar.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/images/botont1.png"))); // NOI18N
        txtLimpiar.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/images/botont2.png"))); // NOI18N
        txtLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtLimpiarActionPerformed(evt);
            }
        });
        getContentPane().add(txtLimpiar, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 120, 90, 32));

        btnRegresar.setBackground(new java.awt.Color(239, 239, 239));
        btnRegresar.setForeground(new java.awt.Color(255, 252, 252));
        btnRegresar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/botont1.png"))); // NOI18N
        btnRegresar.setText("Regresar");
        btnRegresar.setBorderPainted(false);
        btnRegresar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnRegresar.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/images/botont1.png"))); // NOI18N
        btnRegresar.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/images/botont2.png"))); // NOI18N
        btnRegresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegresarActionPerformed(evt);
            }
        });
        getContentPane().add(btnRegresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 160, 90, 32));

        txtCuota.setText(" ");
        getContentPane().add(txtCuota, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 180, 100, 30));
        getContentPane().add(txtPrestamo, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 80, 100, -1));
        getContentPane().add(txtTEA, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 110, 100, -1));
        getContentPane().add(txtPeriodos, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 140, 100, -1));
        getContentPane().add(txtPeriodosG, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 170, 100, -1));

        txtDecimales.setModel(new javax.swing.SpinnerNumberModel(2, 0, 4, 1));
        txtDecimales.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                txtDecimalesStateChanged(evt);
            }
        });
        getContentPane().add(txtDecimales, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 200, -1, -1));

        jLabel4.setText(" %");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 110, 20, 20));

        jLabel1.setText("Prestamo:");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 80, -1, 20));

        jLabel2.setText("TEA:");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 110, 30, 20));

        jLabel3.setText("Periodos:");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 140, -1, -1));

        jLabel6.setText("Periodos de gracias:");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 160, -1, 27));

        jLabel7.setText("N° de decimales:");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 200, -1, -1));

        jLabel9.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 252, 252));
        jLabel9.setText("x");
        jLabel9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel9MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 10, 20, 20));

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/tablai.png"))); // NOI18N
        jLabel8.setText("jLabel7");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 595, 435));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnCalcularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCalcularActionPerformed
         cont=true;
        try{
            while(cont){
                if(Double.parseDouble(txtPrestamo.getText())>0&Double.parseDouble( txtTEA.getText())>0&Integer.parseInt( txtPeriodos.getText())>0){          
                    cont=false;
                    Amortizacion amortizacion = new Amortizacion(Double.parseDouble(txtPrestamo.getText()),Double.parseDouble( txtTEA.getText()),Integer.parseInt( txtPeriodos.getText()));
                    lista.add(amortizacion);
                }else{
                    JOptionPane.showMessageDialog(null,"Los valores insertados deben ser mayores a 0");
                    cont=true;
                    limpiartabla();
                }
            }
        
        
        periodosg=txtPeriodosG.getText();
        capital=Double.parseDouble( txtPrestamo.getText());
         periodosdegraci();
        cuotagracia();
        ndecimales = (Integer)txtDecimales.getValue();
        mostrar();
        txtCuota.setText("Cuota: s/"+decimales(cuota));
         } catch(Exception e){
            JOptionPane.showMessageDialog(null,"Uno de los campos no esta correcto");
       limpiartabla();
        }
      
    }//GEN-LAST:event_btnCalcularActionPerformed

    
    public void periodosdegraci(){
        String []parts = periodosg.split(",");
        periodosgr=new int [parts.length];
        //llamando el for
        for (int i = 0; i < parts.length; i++) {
            periodosgr[i] = Integer.parseInt(parts[i].trim());
        } 
    }
    
    public void cuotagracia(){
        tasa=Double.parseDouble( txtTEA.getText());
        tasam = (Math.pow((1+tasa/100),((1.0)/(12.0)))-1);
        periodos = Integer.parseInt( txtPeriodos.getText());
        int l=1;
        //un for para realizar una suma 
        for (int i = 1; i <= periodos; i++) {
            if(l<=periodosgr.length&&periodosgr[l-1]!=i){
                sumatasas = sumatasas + (1.0/(Math.pow((1+tasam), i)));
            }else if(l>periodosgr.length){
                sumatasas = sumatasas + (1.0/(Math.pow((1+tasam), i)));
            }
            else {
                l++;
            }
        }
        //dividir el prestamo entre la suma, para hallar la cuota
        cuota = capital/sumatasas;
        sumatasas=0;
    }
    
  
    
//reduccion a 2 decimales
    public double decimales(double n){
        double numero=0;
         switch(ndecimales) {
  case 0:
    numero = (double)Math.round(n) ;
    break;
  case 1:
    numero = (double)Math.round(n * 10d) / 10d;
    break;
  case 2:
    numero = (double)Math.round(n * 100d) / 100d;
    break;
  case 3:
    numero = (double)Math.round(n * 1000d) / 1000d;
    break;
   case 4:
    numero = (double)Math.round(n * 10000d) / 10000d;
    break;
}  
        return numero;
    }
    
   
     public void limpiartabla(){
        txtPrestamo.setText(null);
        txtTEA.setText(null);
        txtPeriodos.setText(null);
        txtPeriodosG.setText(null);
         txtCuota.setText(null);
         jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {},
            new String [] {
                "Periodos", "Capital", "Interes", "Cuota", "Amortizaciones", "Saldo"
            }
        ));
    }
    private void txtLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtLimpiarActionPerformed
        limpiartabla();
        cont=false;
    }//GEN-LAST:event_txtLimpiarActionPerformed

      //calculos e impresion en la tabla
    public void mostrar(){
        
       tasa=Double.parseDouble( txtTEA.getText());
        int l=0;
        double inte=0;
        periodos = Integer.parseInt( txtPeriodos.getText());
        tasam = (Math.pow((1+tasa/100),((1.0)/(12.0)))-1);      
        double amortizacion,interes,saldo,amortizaciong = 0;
         double sumaamortizacion=0,sumainteres=0,sumacuota=0;
        String matriz[] []=new String[Integer.parseInt( txtPeriodos.getText())+2][6];
        for (int i=0; i<(Integer.parseInt( txtPeriodos.getText())+2);i++ ){
             if(i==0){
                matriz [i][0]=(""+i);
                matriz[i][5]=("s/"+decimales(capital));
                
            }else if(i==(Integer.parseInt( txtPeriodos.getText())+1)){
                matriz [i][0]=("Total");
                matriz[i][2]=("s/"+decimales(sumainteres));
                matriz[i][3]=("s/"+decimales(sumacuota));
                matriz[i][4]=("s/"+decimales(sumaamortizacion));
            }else{
             if (periodosgr[l]==(i)) {
            interes=capital*tasam;
            inte=inte+interes;
            periodos=i;
            saldo = capital+ interes;
        
                sumainteres=sumainteres+interes;

            matriz [i][0]=(""+periodos);   
            matriz [i][1]=("s/"+decimales(capital));
            matriz [i][2]=("s/"+decimales(interes));
            matriz [i][3]=("-");    
            matriz [i][4]=("-");    
            matriz [i][5]=("s/"+decimales(saldo));  
            capital =capital+ interes;
                  if (l<(periodosgr.length-1)&&(periodosgr[l]+1)==(i+1)) {
                    l++;
                }
                }else if((periodosgr[l]+1)==(i)){
            interes=capital*tasam;
            amortizacion=cuota-interes;
            amortizaciong=cuota-(interes+inte);
            periodos=i;
            saldo = capital- amortizacion;
            sumaamortizacion=sumaamortizacion+amortizacion;
            sumainteres=sumainteres+interes;
            sumacuota=sumacuota+cuota;
            matriz [i][0]=(""+periodos);   
            matriz [i][1]=("s/"+decimales(capital));
            matriz [i][2]=("s/"+decimales(interes));
            matriz [i][3]=("s/"+decimales(cuota));    
            matriz [i][4]=("s/"+decimales(amortizaciong));    
            matriz [i][5]=("s/"+decimales(saldo));  
            capital = capital- amortizacion;
            inte=0;
                }
            //para la fila siguiente    
            else {
            interes=capital*tasam;
            amortizacion=cuota-interes;
            periodos=i;
            saldo = capital- amortizacion;
            sumaamortizacion=sumaamortizacion+amortizacion;
            sumainteres=sumainteres+interes;
            sumacuota=sumacuota+cuota;
            matriz [i][0]=(""+periodos);   
            matriz [i][1]=("s/"+decimales(capital));
            matriz [i][2]=("s/"+decimales(interes));
            matriz [i][3]=("s/"+decimales(cuota));    
            matriz [i][4]=("s/"+decimales(amortizacion));    
            matriz [i][5]=("s/"+decimales(saldo));  
            capital = capital- amortizacion;
            }}
           
        }
         jTable1.setModel(new javax.swing.table.DefaultTableModel(
           matriz,
            new String [] {
                "Periodos", "Capital", "Interes", "Cuota", "Amortizaciones", "Saldo"
            }
        ){
@Override
public boolean isCellEditable(int rowIndex, int columnIndex) {
       return false;
}
});
          
    }
    private void btnRegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegresarActionPerformed
        menuprincipal menup = new menuprincipal();
        menup.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnRegresarActionPerformed

    private void txtDecimalesStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_txtDecimalesStateChanged
        ndecimales = (Integer)txtDecimales.getValue();
        if (cont==true){
            capital=Integer.parseInt( txtPrestamo.getText());

            mostrar();

        }
    }//GEN-LAST:event_txtDecimalesStateChanged

    private void jLabel9MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel9MouseClicked
        this.dispose();
    }//GEN-LAST:event_jLabel9MouseClicked

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
            java.util.logging.Logger.getLogger(TablaG.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TablaG.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TablaG.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TablaG.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TablaG().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCalcular;
    private javax.swing.JButton btnRegresar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JLabel txtCuota;
    private javax.swing.JSpinner txtDecimales;
    private javax.swing.JButton txtLimpiar;
    private javax.swing.JTextField txtPeriodos;
    private javax.swing.JTextField txtPeriodosG;
    private javax.swing.JTextField txtPrestamo;
    private javax.swing.JTextField txtTEA;
    // End of variables declaration//GEN-END:variables
}
