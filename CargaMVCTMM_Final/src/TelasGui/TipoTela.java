/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TelasGui;

import Model.Tipo;
import Valids.LimiteLetras;
import View.IViewSimplesCRUD;
import java.util.List;



/**
 *
 * @author aluno
 */
public class TipoTela extends ViewGuiSimples implements IViewSimplesCRUD<Tipo> {

     private static TipoTela tela;
    private boolean retornoOk;
    
    public boolean isRetornoOk(){
        return retornoOk;
    }
    /**
     * Creates new form ViewGuiMesaCadastro
     */
    
    public static TipoTela GetInstance(java.awt.Frame parent, boolean modal) {
        if (tela == null) {
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
            java.util.logging.Logger.getLogger(TipoTela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TipoTela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TipoTela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TipoTela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
            return new TipoTela(parent, modal);
        }
        else{
            return tela;
        }
  
    }
    
    /**
     * Creates new form ViewGuiCadastroCategoria
     */
    public TipoTela(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblTitulo = new javax.swing.JLabel();
        lblCategoria = new javax.swing.JLabel();
        btnCancelar = new javax.swing.JButton();
        btnOk = new javax.swing.JButton();
        txtCategoria = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        lblTitulo.setFont(new java.awt.Font("Nimbus Mono L", 1, 18)); // NOI18N
        lblTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitulo.setText("Tipo");
        lblTitulo.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        lblCategoria.setText("Tipo:");

        btnCancelar.setBackground(new java.awt.Color(255, 0, 0));
        btnCancelar.setText("Cancelar");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        btnOk.setBackground(new java.awt.Color(102, 255, 51));
        btnOk.setText("Cadastrar");
        btnOk.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOkActionPerformed(evt);
            }
        });

        txtCategoria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCategoriaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblTitulo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnOk, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnCancelar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(19, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(lblTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnOk)
                    .addComponent(lblCategoria)
                    .addComponent(txtCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(btnCancelar)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtCategoriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCategoriaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCategoriaActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        // TODO add your handling code here:
        retornoOk = false;
        
        this.dispose();
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void btnOkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOkActionPerformed
        // TODO add your handling code here:
        if (txtCategoria.getText().trim().isEmpty()){
            this.showErrorMessage("Campo vazio!");        
        }
        else{
            retornoOk = true;
            this.dispose();
        }
    }//GEN-LAST:event_btnOkActionPerformed

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
            java.util.logging.Logger.getLogger(TipoTela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TipoTela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TipoTela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TipoTela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                TipoTela dialog = new TipoTela(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnOk;
    private javax.swing.JLabel lblCategoria;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JTextField txtCategoria;
    // End of variables declaration//GEN-END:variables

    @Override
    public Tipo criar() {
        this.limpaTela();
        this.prepararCriar();
//        this.setVisible(true);
//        Tipo categoria = null;

//        return categoria;
            
        Tipo categoria = null;    
        

        

        //btnCancelar.setVisible(true);
        this.setVisible(true);
        if(retornoOk){
            this.getScreenObject();
        }
        return categoria;
    }
    
    public Tipo getScreenObject(){

        Tipo novo = new Tipo();
        novo.setNome(txtCategoria.getText());
        
        return novo;
    }
    
    public Tipo limpaTela(){
        
        txtCategoria.setText("");
        
        return null;
    }
    public void preencherTela(Tipo preencha){
        txtCategoria.setText(preencha.getNome());
       
    }
    


    @Override
    public void mostrar(Tipo mostrar) {

        this.prepararMostra(mostrar);
        this.setVisible(true);
    }

    @Override
    public Tipo editar(Tipo categoria) {
//        this.limpaTela();
        
        this.prepararEditar(categoria);
        this.setVisible(true);
        if(retornoOk){
            categoria.setNome(txtCategoria.getText());
        }
        
        
        return categoria;
        
//           if(retornoOk){
//               categoria.setNome(txtCategoria.getText());
//           }
//           else if(retornoOk == false){
//           showMessage("CANCELADO PELO USUÁRIO!");
//           }
//           else if (categoria == null) {
//               showMessage("NÃO ENCONTRADO!");
//           }
//           else{
//               showMessage("ALTERADO COM SUCESSO!");
//           }
//           return categoria;
    }

    @Override
    public boolean excluir(Tipo deletar) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void listar(List<Tipo> listas) {
        String lista = "";
        for (Tipo categoria : listas) {
            if (categoria != null) {
                lista += categoria.toString() + "\n";
            }
        }
        showMessage(lista);
    }

    @Override
    public void read(Tipo Type) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    public void prepararCriar(){
        lblTitulo.setText("Cadastro de Categoria");
        
        txtCategoria.setText("");
        txtCategoria.setEditable(true);
        txtCategoria.setEnabled(true);

        btnOk.setText("Salvar");
        btnOk.setVisible(true);
        
        btnCancelar.setText("Cancelar");
        btnCancelar.setVisible(true);

        

        
    }
    
    
    public void prepararEditar(Tipo categoria){

        lblTitulo.setText("Alterar Categoria");
        
        txtCategoria.setText(categoria.getNome());
        txtCategoria.setEditable(true);
        txtCategoria.setEnabled(true);
        
        
        btnOk.setText("Alterar");
        btnOk.setVisible(true);
        
        btnCancelar.setText("Cancelar");
        btnCancelar.setVisible(true);
        
        

                
    }
    
    
    public void prepararMostra(Tipo mostrar ){
        lblTitulo.setText("Dados Categoria");
        
        txtCategoria.setText(mostrar.getNome());
        txtCategoria.setEditable(false);
        txtCategoria.setEnabled(false);
        

        btnOk.setText("Ok");
        btnOk.setVisible(true);
        
        btnCancelar.setText("Cancelar");
        btnCancelar.setVisible(false);
        

        
    }
}