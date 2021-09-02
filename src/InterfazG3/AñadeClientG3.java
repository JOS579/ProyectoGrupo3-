package InterfazG3;



import javax.swing.JFrame;
import javax.swing.JOptionPane;
import HotelG3.ClienteG3;

public class AñadeClientG3 extends JFrame{

	 int numeroDeHabitacion;
	    private static ClienteG3 retorno;

	    public AñadeClientG3() {
	        initComponents();
	        this.setLocationRelativeTo(this);
	        this.setVisible(true);
	    }

	    private void initComponents() {

	        jPanel1 = new javax.swing.JPanel();
	        jPanel2 = new javax.swing.JPanel();
	        jLabel1 = new javax.swing.JLabel();
	        jLabel2 = new javax.swing.JLabel();
	        jLabel3 = new javax.swing.JLabel();
	        jLabel4 = new javax.swing.JLabel();
	        jLabel5 = new javax.swing.JLabel();
	        jLabel7 = new javax.swing.JLabel();
	        NombreText = new javax.swing.JTextField();
	        ApellidosText = new javax.swing.JTextField();
	        EdadText = new javax.swing.JTextField();
	        TelefonoText = new javax.swing.JTextField();
	        CedulaText = new javax.swing.JTextField();
	        jLabel8 = new javax.swing.JLabel();
	        PersonaCBox = new javax.swing.JComboBox<>();
	        CancelarButton = new javax.swing.JButton();
	        addButton = new javax.swing.JButton();

	        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

	        jPanel1.setBackground(new java.awt.Color(204, 204, 255));

	        jPanel2.setBackground(new java.awt.Color(51, 102, 255));

	        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
	        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
	        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/icons8-añadir-usuario-masculino-100.png"))); // NOI18N
	        jLabel1.setText("AÑADIR RESERVANTE");

	        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
	        jPanel2.setLayout(jPanel2Layout);
	        jPanel2Layout.setHorizontalGroup(
	            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
	            .addGroup(jPanel2Layout.createSequentialGroup()
	                .addGap(19, 19, 19)
	                .addComponent(jLabel1)
	                .addContainerGap(33, Short.MAX_VALUE))
	        );
	        jPanel2Layout.setVerticalGroup(
	            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
	            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
	                .addContainerGap(16, Short.MAX_VALUE)
	                .addComponent(jLabel1)
	                .addContainerGap())
	        );

	        jLabel2.setForeground(new java.awt.Color(51, 51, 51));
	        jLabel2.setText("Nombres:");

	        jLabel3.setForeground(new java.awt.Color(51, 51, 51));
	        jLabel3.setText("Apellidos:");

	        jLabel4.setForeground(new java.awt.Color(51, 51, 51));
	        jLabel4.setText("Edad:");

	        jLabel5.setForeground(new java.awt.Color(51, 51, 51));
	        jLabel5.setText("Cedula:");

	        jLabel7.setForeground(new java.awt.Color(51, 51, 51));
	        jLabel7.setText("Numero de Personas: ");

	        NombreText.addActionListener(new java.awt.event.ActionListener() {
	            public void actionPerformed(java.awt.event.ActionEvent evt) {
	                NombreTextActionPerformed(evt);
	            }
	        });

	        jLabel8.setForeground(new java.awt.Color(51, 51, 51));
	        jLabel8.setText("Télefono: ");

	        PersonaCBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5" }));
	        PersonaCBox.addActionListener(new java.awt.event.ActionListener() {
	            public void actionPerformed(java.awt.event.ActionEvent evt) {
	                PersonaCBoxActionPerformed(evt);
	            }
	        });

	        CancelarButton.setText("Cancelar");
	        CancelarButton.addActionListener(new java.awt.event.ActionListener() {
	            public void actionPerformed(java.awt.event.ActionEvent evt) {
	                CancelarButtonActionPerformed(evt);
	            }
	        });

	        addButton.setText("Añadir");
	        addButton.addActionListener(new java.awt.event.ActionListener() {
	            public void actionPerformed(java.awt.event.ActionEvent evt) {
	                addButtonActionPerformed(evt);
	            }
	        });

	        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
	        jPanel1.setLayout(jPanel1Layout);
	        jPanel1Layout.setHorizontalGroup(
	            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
	            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
	            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
	                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
	                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
	                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
	                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
	                            .addGroup(jPanel1Layout.createSequentialGroup()
	                                .addComponent(jLabel7)
	                                .addGap(18, 18, 18))
	                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
	                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
	                                    .addComponent(jLabel5)
	                                    .addGap(102, 102, 102))
	                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
	                                    .addComponent(jLabel2)
	                                    .addGap(89, 89, 89))
	                                .addGroup(jPanel1Layout.createSequentialGroup()
	                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
	                                        .addComponent(jLabel8)
	                                        .addComponent(jLabel4)
	                                        .addComponent(jLabel3))
	                                    .addGap(89, 89, 89))))
	                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
	                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
	                                .addComponent(EdadText, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
	                                .addComponent(CedulaText, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
	                                .addComponent(TelefonoText, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
	                                .addComponent(PersonaCBox, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
	                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
	                                .addComponent(NombreText, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
	                                .addComponent(ApellidosText, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)))
	                        .addGap(37, 37, 37))
	                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
	                        .addComponent(CancelarButton)
	                        .addGap(57, 57, 57)
	                        .addComponent(addButton, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
	                        .addGap(65, 65, 65))))
	        );
	        jPanel1Layout.setVerticalGroup(
	            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
	            .addGroup(jPanel1Layout.createSequentialGroup()
	                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
	                .addGap(40, 40, 40)
	                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
	                    .addComponent(jLabel2)
	                    .addComponent(NombreText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
	                .addGap(18, 18, 18)
	                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
	                    .addComponent(jLabel3)
	                    .addComponent(ApellidosText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
	                .addGap(18, 18, 18)
	                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
	                    .addComponent(jLabel4)
	                    .addComponent(EdadText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
	                .addGap(18, 18, 18)
	                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
	                    .addComponent(jLabel8)
	                    .addComponent(TelefonoText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
	                .addGap(18, 18, Short.MAX_VALUE)
	                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
	                    .addComponent(CedulaText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
	                    .addComponent(jLabel5))
	                .addGap(18, 18, 18)
	                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
	                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
	                    .addComponent(PersonaCBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
	                .addGap(30, 30, 30)
	                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
	                    .addComponent(CancelarButton)
	                    .addComponent(addButton))
	                .addGap(24, 24, 24))
	        );

	        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
	        getContentPane().setLayout(layout);
	        layout.setHorizontalGroup(
	            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
	            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
	        );
	        layout.setVerticalGroup(
	            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
	            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
	        );

	        pack();
	    }// </editor-fold>//GEN-END:initComponents

	    private void PersonaCBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PersonaCBoxActionPerformed
	        // TODO add your handling code here:
	    }//GEN-LAST:event_PersonaCBoxActionPerformed

	    private void NombreTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NombreTextActionPerformed
	        // TODO add your handling code here:
	    }//GEN-LAST:event_NombreTextActionPerformed

	    private void addButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addButtonActionPerformed
	        try {
	            String nombre = NombreText.getText();
	            String apellido = ApellidosText.getText();
	            int edad = Integer.parseInt(EdadText.getText());
	            String numeroTelefono = TelefonoText.getText();
	            String Ci = CedulaText.getText();
	            int numPersonas = Integer.parseInt(PersonaCBox.getSelectedItem().toString());
	            if (!nombre.isEmpty() && !apellido.isEmpty() && !numeroTelefono.isEmpty()
	                    && !Ci.isEmpty()) {

	                ClienteG3 nuevo = new ClienteG3();

	                nuevo.setNombre(nombre);
	                nuevo.setApellido(apellido);
	                nuevo.setEdad(edad);
	                nuevo.setNumeroTelefono(numeroTelefono);
	                nuevo.setCi(Ci);
	                nuevo.setNumeroPersonas(numPersonas);

	                retorno = nuevo;

	                JOptionPane.showMessageDialog(this, "Ocupante Añadido con éxito");

	                this.dispose();

	            } else {
	                JOptionPane.showMessageDialog(this, "Por Favor, llenar todos los campos.");
	            }

	        } catch (NumberFormatException e) {
	            JOptionPane.showMessageDialog(this, "Error: " + e);
	        }
	    }//GEN-LAST:event_addButtonActionPerformed

	    private void CancelarButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CancelarButtonActionPerformed
	        this.dispose();
	    }//GEN-LAST:event_CancelarButtonActionPerformed

	    public static ClienteG3 ObteneClienteAñadido(){
	        return retorno;
	    }
	    
	    public static void Reset(){
	        retorno =  null;
	    }
	    
	    // Variables declaration - do not modify//GEN-BEGIN:variables
	    private javax.swing.JTextField ApellidosText;
	    private javax.swing.JButton CancelarButton;
	    private javax.swing.JTextField CedulaText;
	    private javax.swing.JTextField EdadText;
	    private javax.swing.JTextField NombreText;
	    private javax.swing.JComboBox<String> PersonaCBox;
	    private javax.swing.JTextField TelefonoText;
	    private javax.swing.JButton addButton;
	    private javax.swing.JLabel jLabel1;
	    private javax.swing.JLabel jLabel2;
	    private javax.swing.JLabel jLabel3;
	    private javax.swing.JLabel jLabel4;
	    private javax.swing.JLabel jLabel5;
	    private javax.swing.JLabel jLabel7;
	    private javax.swing.JLabel jLabel8;
	    private javax.swing.JPanel jPanel1;
	    private javax.swing.JPanel jPanel2;
	    // End of variables declaration//GEN-END:variables
	}