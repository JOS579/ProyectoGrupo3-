package InterfazG3;

import javax.swing.GroupLayout;
import javax.swing.JFrame;
import HotelG3.HabitacionG3;
import HotelG3.ListaHabitacionG3;
import HotelG3.ListaUsuarioG3;
import DatosG3.PersistenciaG3;
import HotelG3.UsuarioG3;

import java.awt.HeadlessException;
import java.util.Objects;
import javax.swing.JOptionPane;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.table.DefaultTableModel;

public class AdministraG3 extends JFrame {



	public AdministraG3(int usuarioPos) {
			initComponents();
			UsuarioG3 encabezado = ListaUsuarioG3.getUsuarioPosicion(usuarioPos);
			UsuarioLabel.setText("Bienvenido " + encabezado.getNombre() + " " + encabezado.getApellido()
			+" Saludos Att. Grupo 3 ");
			this.setLocationRelativeTo(this);
			this.setVisible(true);

		}

		private void initComponents() {

			jPanel2Fondo = new javax.swing.JPanel();
			jPanel1 = new javax.swing.JPanel();
			jLabel1 = new javax.swing.JLabel();
			BuscarText = new javax.swing.JTextField();
			BuscarButton = new javax.swing.JButton();
			EliminarButton = new javax.swing.JButton();
			jScrollPane1 = new javax.swing.JScrollPane();
			TablaRegistros = new javax.swing.JTable();
			SalirButton = new javax.swing.JButton();
			actualizarButton = new javax.swing.JButton();
			VerReservaButton = new javax.swing.JButton();
			UsuarioLabel = new javax.swing.JLabel();
			Panel1 = new javax.swing.JPanel();
			jLabel2 = new javax.swing.JLabel();
			jLabel3 = new javax.swing.JLabel();
			jLabel4 = new javax.swing.JLabel();
			jLabel5 = new javax.swing.JLabel();
			jLabel6 = new javax.swing.JLabel();
			GuardarButton = new javax.swing.JButton();
			CancelarButton = new javax.swing.JButton();
			NuevoButton = new javax.swing.JButton();
			NumeroText = new javax.swing.JTextField();
			PisoCBox = new javax.swing.JComboBox<>();
			PrecioDarioText = new javax.swing.JTextField();
			EstadoCBox = new javax.swing.JComboBox<>();
			TipoCBox = new javax.swing.JComboBox<>();
			jLabel7 = new javax.swing.JLabel();
			addOcupanteButton = new javax.swing.JButton();
			jLabel8 = new javax.swing.JLabel();
			FechaText = new javax.swing.JTextField();
			jLabel9 = new javax.swing.JLabel();
			FecharText = new javax.swing.JTextField();
			Subtittle1 = new javax.swing.JLabel();
			jPanel3 = new javax.swing.JPanel();
			Encabezado = new javax.swing.JLabel();

			setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
			setBackground(new java.awt.Color(255, 255, 0));

			jPanel2Fondo.setBackground(new java.awt.Color(202,37,19));

			jPanel1.setBackground(new java.awt.Color(165,115,107));
			jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Lista de Habitaciones",
					javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION,
					new java.awt.Font("Tahoma", 0, 11), new java.awt.Color(51, 51, 51))); // NOI18N

			jLabel1.setForeground(new java.awt.Color(51, 51, 51));
			jLabel1.setText("Buscar:");

			BuscarText.addActionListener(new java.awt.event.ActionListener() {
				public void actionPerformed(java.awt.event.ActionEvent evt) {
					BuscarTextActionPerformed(evt);
				}
			});

			BuscarButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/icons8-búsqueda-17.png"))); // NOI18N
			BuscarButton.setText("Buscar");
			BuscarButton.setMaximumSize(new java.awt.Dimension(98, 29));
			BuscarButton.setMinimumSize(new java.awt.Dimension(98, 29));
			BuscarButton.addActionListener(new java.awt.event.ActionListener() {
				public void actionPerformed(java.awt.event.ActionEvent evt) {
					BuscarButtonActionPerformed(evt);
				}
			});

			EliminarButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/icons8-eliminar-18.png"))); // NOI18N
			EliminarButton.setText("Eliminar");
			EliminarButton.addActionListener(new java.awt.event.ActionListener() {
				public void actionPerformed(java.awt.event.ActionEvent evt) {
					EliminarButtonActionPerformed(evt);
				}
			});

			TablaRegistros.setModel(new javax.swing.table.DefaultTableModel(new Object[][] {

			}, new String[] { "Numero", "Tipo", "Precio", "Estado", "Piso" }) {
				boolean[] canEdit = new boolean[] { false, false, false, false, false };

				public boolean isCellEditable(int rowIndex, int columnIndex) {
					return canEdit[columnIndex];
				}
			});
			TablaRegistros.addMouseListener(new java.awt.event.MouseAdapter() {
				public void mouseClicked(java.awt.event.MouseEvent evt) {
					TablaRegistrosMouseClicked(evt);
				}
			});
			jScrollPane1.setViewportView(TablaRegistros);

			SalirButton.setIcon(
					new javax.swing.ImageIcon(getClass().getResource("/Imagenes/icons8-salida-de-emergencia-18.png"))); // NOI18N
			SalirButton.setText("Salir");
			SalirButton.addActionListener(new java.awt.event.ActionListener() {
				public void actionPerformed(java.awt.event.ActionEvent evt) {
					SalirButtonActionPerformed(evt);
				}
			});

			actualizarButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/icons8-actualizar-18.png"))); // NOI18N
			actualizarButton.setText("Actualizar");
			actualizarButton.addActionListener(new java.awt.event.ActionListener() {
				public void actionPerformed(java.awt.event.ActionEvent evt) {
					actualizarButtonActionPerformed(evt);
				}
			});

			VerReservaButton.setText("Ver Reserva");
			VerReservaButton.setEnabled(false);
			VerReservaButton.addActionListener(new java.awt.event.ActionListener() {
				public void actionPerformed(java.awt.event.ActionEvent evt) {
					VerReservaButtonActionPerformed(evt);
				}
			});

			javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
			jPanel1.setLayout(jPanel1Layout);
			jPanel1Layout
					.setHorizontalGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
							.addGroup(jPanel1Layout.createSequentialGroup().addContainerGap()
									.addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
											.addGroup(jPanel1Layout.createSequentialGroup().addComponent(jLabel1).addGap(0,
													0, Short.MAX_VALUE))
											.addGroup(jPanel1Layout.createSequentialGroup()
													.addComponent(BuscarText, javax.swing.GroupLayout.PREFERRED_SIZE, 178,
															javax.swing.GroupLayout.PREFERRED_SIZE)
													.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
													.addComponent(BuscarButton, javax.swing.GroupLayout.PREFERRED_SIZE, 101,
															javax.swing.GroupLayout.PREFERRED_SIZE)
													.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
													.addComponent(EliminarButton, javax.swing.GroupLayout.PREFERRED_SIZE,
															117, javax.swing.GroupLayout.PREFERRED_SIZE)
													.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED,
															javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
													.addComponent(SalirButton, javax.swing.GroupLayout.PREFERRED_SIZE, 102,
															javax.swing.GroupLayout.PREFERRED_SIZE))
											.addComponent(jScrollPane1)
											.addGroup(jPanel1Layout.createSequentialGroup().addGap(6, 6, 6)
													.addComponent(actualizarButton)
													.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED,
															javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
													.addComponent(VerReservaButton, javax.swing.GroupLayout.PREFERRED_SIZE,
															200, javax.swing.GroupLayout.PREFERRED_SIZE)
													.addGap(21, 21, 21)))
									.addContainerGap()));
			jPanel1Layout.setVerticalGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
					.addGroup(jPanel1Layout.createSequentialGroup().addContainerGap().addComponent(jLabel1)
							.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
							.addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
									.addComponent(BuscarText, javax.swing.GroupLayout.PREFERRED_SIZE,
											javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
									.addComponent(EliminarButton, javax.swing.GroupLayout.PREFERRED_SIZE, 24,
											javax.swing.GroupLayout.PREFERRED_SIZE)
									.addComponent(BuscarButton, javax.swing.GroupLayout.PREFERRED_SIZE, 25,
											javax.swing.GroupLayout.PREFERRED_SIZE)
									.addComponent(SalirButton, javax.swing.GroupLayout.PREFERRED_SIZE, 24,
											javax.swing.GroupLayout.PREFERRED_SIZE))
							.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
							.addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 234,
									javax.swing.GroupLayout.PREFERRED_SIZE)
							.addGap(18, 18, 18)
							.addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
									.addComponent(actualizarButton, javax.swing.GroupLayout.PREFERRED_SIZE, 25,
											javax.swing.GroupLayout.PREFERRED_SIZE)
									.addComponent(VerReservaButton, javax.swing.GroupLayout.PREFERRED_SIZE, 25,
											javax.swing.GroupLayout.PREFERRED_SIZE))
							.addContainerGap(44, Short.MAX_VALUE)));

			UsuarioLabel.setBackground(new java.awt.Color(246, 246, 255));
			UsuarioLabel.setForeground(new java.awt.Color(246, 246, 255));
			UsuarioLabel.setIcon(
					new javax.swing.ImageIcon(getClass().getResource("/Imagenes/icons8-usuario-hombre-verificado-20.png"))); // NOI18N
			UsuarioLabel.setText("USUARIO");

			Panel1.setBackground(new java.awt.Color(165,115,107));
			Panel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Registro de Habitaciones Grupo 3",
					javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION,
					new java.awt.Font("Tahoma", 0, 11), new java.awt.Color(51, 51, 51))); // NOI18N
			Panel1.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
				public void mouseMoved(java.awt.event.MouseEvent evt) {
					Panel1MouseMoved(evt);
				}
			});

			jLabel2.setForeground(new java.awt.Color(51, 51, 51));
			jLabel2.setText("Número");

			jLabel3.setForeground(new java.awt.Color(51, 51, 51));
			jLabel3.setText("Tipo:");

			jLabel4.setForeground(new java.awt.Color(51, 51, 51));
			jLabel4.setText("Estado:");

			jLabel5.setForeground(new java.awt.Color(51, 51, 51));
			jLabel5.setText("Precio Diario: ");

			jLabel6.setForeground(new java.awt.Color(51, 51, 51));
			jLabel6.setText("Piso:");

			GuardarButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/icons8-guardar-20.png"))); // NOI18N
			GuardarButton.setText("Guardar");
			GuardarButton.addActionListener(new java.awt.event.ActionListener() {
				public void actionPerformed(java.awt.event.ActionEvent evt) {
					GuardarButtonActionPerformed(evt);
				}
			});

			CancelarButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/icons8-cancelar-2-20.png"))); // NOI18N
			CancelarButton.setText("Cancelar");
			CancelarButton.addActionListener(new java.awt.event.ActionListener() {
				public void actionPerformed(java.awt.event.ActionEvent evt) {
					CancelarButtonActionPerformed(evt);
				}
			});

			NuevoButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/icons8-crear-nuevo-20.png"))); // NOI18N
			NuevoButton.setText("Nuevo");
			NuevoButton.setEnabled(false);
			NuevoButton.addActionListener(new java.awt.event.ActionListener() {
				public void actionPerformed(java.awt.event.ActionEvent evt) {
					NuevoButtonActionPerformed(evt);
				}
			});

			NumeroText.addActionListener(new java.awt.event.ActionListener() {
				public void actionPerformed(java.awt.event.ActionEvent evt) {
					NumeroTextActionPerformed(evt);
				}
			});
			NumeroText.addKeyListener(new java.awt.event.KeyAdapter() {
				public void keyReleased(java.awt.event.KeyEvent evt) {
					NumeroTextKeyReleased(evt);
				}
			});

			PisoCBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5" }));

			PrecioDarioText.addActionListener(new java.awt.event.ActionListener() {
				public void actionPerformed(java.awt.event.ActionEvent evt) {
					PrecioDarioTextActionPerformed(evt);
				}
			});
			PrecioDarioText.addKeyListener(new java.awt.event.KeyAdapter() {
				public void keyReleased(java.awt.event.KeyEvent evt) {
					PrecioDarioTextKeyReleased(evt);
				}
			});

			EstadoCBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Disponible", "Ocupado" }));
			EstadoCBox.addItemListener(new java.awt.event.ItemListener() {
				public void itemStateChanged(java.awt.event.ItemEvent evt) {
					EstadoCBoxItemStateChanged(evt);
				}
			});
			EstadoCBox.addActionListener(new java.awt.event.ActionListener() {
				public void actionPerformed(java.awt.event.ActionEvent evt) {
					EstadoCBoxActionPerformed(evt);
				}
			});

			TipoCBox.setModel(
					new javax.swing.DefaultComboBoxModel<>(new String[] { "Personal", "Matrimonial", "Familiar" }));

			jLabel7.setForeground(new java.awt.Color(51, 51, 51));
			jLabel7.setText("Ocupante:");

			addOcupanteButton.setIcon(
					new javax.swing.ImageIcon(getClass().getResource("/Imagenes/icons8-añadir-usuario-masculino-18.png"))); // NOI18N
			addOcupanteButton.setText("Añadir");
			addOcupanteButton.setEnabled(false);
			addOcupanteButton.setMaximumSize(new java.awt.Dimension(98, 29));
			addOcupanteButton.setMinimumSize(new java.awt.Dimension(98, 29));
			addOcupanteButton.addActionListener(new java.awt.event.ActionListener() {
				public void actionPerformed(java.awt.event.ActionEvent evt) {
					addOcupanteButtonActionPerformed(evt);
				}
			});

			jLabel8.setForeground(new java.awt.Color(51, 51, 51));
			jLabel8.setText("Fecha de registro");

			FechaText.addActionListener(new java.awt.event.ActionListener() {
				public void actionPerformed(java.awt.event.ActionEvent evt) {
					FechaTextActionPerformed(evt);
				}
			});
			FechaText.addKeyListener(new java.awt.event.KeyAdapter() {
				public void keyReleased(java.awt.event.KeyEvent evt) {
					FechaTextKeyReleased(evt);
				}
			});

			jLabel9.setForeground(new java.awt.Color(51, 51, 51));
			jLabel9.setText("Fecha de retiro");

			FecharText.addActionListener(new java.awt.event.ActionListener() {
				public void actionPerformed(java.awt.event.ActionEvent evt) {
					FecharTextActionPerformed(evt);
				}
			});
			FecharText.addKeyListener(new java.awt.event.KeyAdapter() {
				public void keyReleased(java.awt.event.KeyEvent evt) {
					FecharTextKeyReleased(evt);
				}
			});

			javax.swing.GroupLayout Panel1Layout = new javax.swing.GroupLayout(Panel1);
			Panel1Layout.setHorizontalGroup(
				Panel1Layout.createParallelGroup(Alignment.LEADING)
					.addGroup(Panel1Layout.createSequentialGroup()
						.addContainerGap(14, Short.MAX_VALUE)
						.addComponent(NuevoButton, GroupLayout.PREFERRED_SIZE, 95, GroupLayout.PREFERRED_SIZE)
						.addGap(18)
						.addComponent(GuardarButton)
						.addGap(18)
						.addComponent(CancelarButton)
						.addGap(14))
					.addGroup(Panel1Layout.createSequentialGroup()
						.addGap(76)
						.addGroup(Panel1Layout.createParallelGroup(Alignment.LEADING)
							.addGroup(Panel1Layout.createSequentialGroup()
								.addGroup(Panel1Layout.createParallelGroup(Alignment.LEADING)
									.addComponent(jLabel5)
									.addComponent(jLabel4)
									.addComponent(jLabel3)
									.addComponent(jLabel2)
									.addComponent(jLabel6, GroupLayout.PREFERRED_SIZE, 39, GroupLayout.PREFERRED_SIZE))
								.addGap(21)
								.addGroup(Panel1Layout.createParallelGroup(Alignment.LEADING)
									.addComponent(EstadoCBox, 0, 134, Short.MAX_VALUE)
									.addComponent(TipoCBox, 0, 134, Short.MAX_VALUE)
									.addGroup(Panel1Layout.createSequentialGroup()
										.addGroup(Panel1Layout.createParallelGroup(Alignment.LEADING)
											.addComponent(PisoCBox, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
											.addGroup(Panel1Layout.createParallelGroup(Alignment.TRAILING)
												.addComponent(NumeroText, GroupLayout.PREFERRED_SIZE, 103, GroupLayout.PREFERRED_SIZE)
												.addComponent(PrecioDarioText, GroupLayout.PREFERRED_SIZE, 103, GroupLayout.PREFERRED_SIZE)))
										.addGap(0, 31, Short.MAX_VALUE)))
								.addGap(56))
							.addGroup(Panel1Layout.createSequentialGroup()
								.addGroup(Panel1Layout.createParallelGroup(Alignment.LEADING)
									.addComponent(jLabel8)
									.addComponent(jLabel7)
									.addComponent(jLabel9))
								.addPreferredGap(ComponentPlacement.UNRELATED)
								.addGroup(Panel1Layout.createParallelGroup(Alignment.LEADING)
									.addComponent(FecharText, GroupLayout.PREFERRED_SIZE, 103, GroupLayout.PREFERRED_SIZE)
									.addComponent(addOcupanteButton, GroupLayout.PREFERRED_SIZE, 97, GroupLayout.PREFERRED_SIZE)
									.addComponent(FechaText, GroupLayout.PREFERRED_SIZE, 114, GroupLayout.PREFERRED_SIZE))
								.addGap(16, 77, Short.MAX_VALUE))))
			);
			Panel1Layout.setVerticalGroup(
				Panel1Layout.createParallelGroup(Alignment.LEADING)
					.addGroup(Panel1Layout.createSequentialGroup()
						.addGap(23)
						.addGroup(Panel1Layout.createParallelGroup(Alignment.BASELINE)
							.addComponent(jLabel2)
							.addComponent(NumeroText, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
						.addGap(18)
						.addGroup(Panel1Layout.createParallelGroup(Alignment.BASELINE)
							.addComponent(jLabel6)
							.addComponent(PisoCBox, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
						.addGap(18)
						.addGroup(Panel1Layout.createParallelGroup(Alignment.BASELINE)
							.addComponent(jLabel5)
							.addComponent(PrecioDarioText, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
						.addGap(15)
						.addGroup(Panel1Layout.createParallelGroup(Alignment.BASELINE)
							.addComponent(EstadoCBox, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
							.addComponent(jLabel4))
						.addGap(15)
						.addGroup(Panel1Layout.createParallelGroup(Alignment.BASELINE)
							.addComponent(TipoCBox, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
							.addComponent(jLabel3))
						.addGap(18)
						.addGroup(Panel1Layout.createParallelGroup(Alignment.BASELINE)
							.addComponent(jLabel8)
							.addComponent(FechaText, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
						.addGap(7)
						.addGroup(Panel1Layout.createParallelGroup(Alignment.BASELINE)
							.addComponent(jLabel9)
							.addComponent(FecharText, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
						.addPreferredGap(ComponentPlacement.RELATED)
						.addGroup(Panel1Layout.createParallelGroup(Alignment.BASELINE)
							.addComponent(jLabel7)
							.addComponent(addOcupanteButton, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE))
						.addPreferredGap(ComponentPlacement.RELATED, 58, Short.MAX_VALUE)
						.addGroup(Panel1Layout.createParallelGroup(Alignment.BASELINE)
							.addComponent(GuardarButton)
							.addComponent(CancelarButton)
							.addComponent(NuevoButton))
						.addGap(16))
			);
			Panel1.setLayout(Panel1Layout);

			Subtittle1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
			Subtittle1.setText("Habitación:");
			Subtittle1.setBackground(new java.awt.Color(246, 246, 255));
			Subtittle1.setForeground(new java.awt.Color(246, 246, 255));

			jPanel3.setBackground(new java.awt.Color(165,115,107));

			Encabezado.setIcon(new javax.swing.ImageIcon(
					getClass().getResource("/Imagenes/Cool Text - RESERVACIONES 388285291837387 (1).png"))); // NOI18N

			javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
			jPanel3.setLayout(jPanel3Layout);
			jPanel3Layout.setHorizontalGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
					.addGroup(jPanel3Layout.createSequentialGroup().addGap(186, 186, 186).addComponent(Encabezado)
							.addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)));
			jPanel3Layout.setVerticalGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
					.addGroup(jPanel3Layout.createSequentialGroup().addContainerGap().addComponent(Encabezado)
							.addContainerGap(12, Short.MAX_VALUE)));

			javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2Fondo);
			jPanel2Fondo.setLayout(jPanel2Layout);
			jPanel2Layout.setHorizontalGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
					.addGroup(jPanel2Layout.createSequentialGroup().addContainerGap().addGroup(jPanel2Layout
							.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
							.addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE,
									javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
							.addGroup(jPanel2Layout.createSequentialGroup()
									.addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
											.addComponent(Panel1, javax.swing.GroupLayout.PREFERRED_SIZE,
													javax.swing.GroupLayout.DEFAULT_SIZE,
													javax.swing.GroupLayout.PREFERRED_SIZE)
											.addComponent(Subtittle1))
									.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
									.addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
											.addGroup(jPanel2Layout.createSequentialGroup()
													.addComponent(UsuarioLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 235,
															javax.swing.GroupLayout.PREFERRED_SIZE)
													.addGap(0, 0, Short.MAX_VALUE))
											.addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE,
													javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
							.addContainerGap()));
			jPanel2Layout.setVerticalGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
					.addGroup(jPanel2Layout.createSequentialGroup().addContainerGap()
							.addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE,
									javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
							.addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
									.addComponent(Subtittle1).addComponent(UsuarioLabel,
											javax.swing.GroupLayout.PREFERRED_SIZE, 20,
											javax.swing.GroupLayout.PREFERRED_SIZE))
							.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
							.addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
									.addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE,
											javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
									.addComponent(Panel1, javax.swing.GroupLayout.DEFAULT_SIZE,
											javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
							.addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)));

			javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
			getContentPane().setLayout(layout);
			layout.setHorizontalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addComponent(
					jPanel2Fondo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE));
			layout.setVerticalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addComponent(
					jPanel2Fondo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE,
					javax.swing.GroupLayout.PREFERRED_SIZE));

			pack();
		}// </editor-fold>//GEN-END:initComponents

		String[] titulo = { "Numero", "Tipo", "Precio", "Estado", "Piso", "Fecha", "Fechar" };
		DefaultTableModel refresh;

		private void BuscarButtonActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_BuscarButtonActionPerformed
			VerReservaButton.setEnabled(false);
			try {
				buscarRegistro(Integer.parseInt(BuscarText.getText()));
			} catch (NumberFormatException e) {
				JOptionPane.showMessageDialog(this, "Error: " + e);
			}
		}// GEN-LAST:event_BuscarButtonActionPerformed

		private void EliminarButtonActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_EliminarButtonActionPerformed
			VerReservaButton.setEnabled(false);
			if (seleccion > -1) {
				ListaHabitacionG3.Eliminar(Integer.parseInt(TablaRegistros.getValueAt(seleccion, 0).toString()));
				JOptionPane.showMessageDialog(this, "Se eliminó el registro con éxito");
			} else {
				JOptionPane.showMessageDialog(this, "Seleccione una habitación por favor.");
			}
			seleccion = -1;
			actualizarTabla();
			vaciarDatosHabitacion();
			NumeroText.setEditable(true);

		}// GEN-LAST:event_EliminarButtonActionPerformed

		private void SalirButtonActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_SalirButtonActionPerformed
			// TODO add your handling code here:
			int input = JOptionPane.showConfirmDialog(null, "¿Desea guardar los datos antes de Salir?");
			LoginG3 ventana;
			switch (input) {
			case 0:
				this.dispose();
				try {
					PersistenciaG3.guardarDatos();
				} catch (Exception e) {
					JOptionPane.showMessageDialog(this, "Ocurrió un error al guardar Datos");
				}
				ventana = new LoginG3();
				break;
			case 1:
				this.dispose();
				ventana = new LoginG3();
				break;
			case 2:
				break;
			}

		}// GEN-LAST:event_SalirButtonActionPerformed

		private void addOcupanteButtonActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_addOcupanteButtonActionPerformed
			// TODO add your handling code here:
			AñadeClientG3 ventana = new AñadeClientG3();
		}// GEN-LAST:event_addOcupanteButtonActionPerformed

		private void NuevoButtonActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_NuevoButtonActionPerformed
			// TODO add your handling code here:
			if (Integer.parseInt(NumeroText.getText()) > -1) {
				HabitacionG3 nuevo = new HabitacionG3();
				try {
					nuevo.setNumero(Integer.parseInt(NumeroText.getText()));
					nuevo.setPiso(Integer.parseInt(PisoCBox.getSelectedItem().toString()));
					nuevo.setPrecio(Double.parseDouble(PrecioDarioText.getText()));
					nuevo.setFecha(Integer.parseInt(FechaText.getText()));
					nuevo.setFechar(Integer.parseInt(FecharText.getText()));

					if (EstadoCBox.getSelectedItem().toString().equalsIgnoreCase("Disponible")) {
						nuevo.setEstado(true);
						nuevo.setOcupante(null);
					} else {
						nuevo.setEstado(false);
						nuevo.setOcupante(AñadeClientG3.ObteneClienteAñadido());
					}

					nuevo.setTipo(TipoCBox.getSelectedItem().toString());

					if (HabitacionG3.verificarNuevoHabitación(Integer.parseInt(NumeroText.getText()))) {
						ListaHabitacionG3.Agregar(nuevo);

						JOptionPane.showMessageDialog(this, "Registro creado con exito");
						AñadeClientG3.Reset();
						vaciarDatosHabitacion();
					} else {
						JOptionPane.showMessageDialog(this, "Ya existe este numero de Habitación");
					}
				} catch (HeadlessException | NumberFormatException e) {
					JOptionPane.showMessageDialog(this, "Error: " + e);
				}
				actualizarTabla();
			} else {
				JOptionPane.showMessageDialog(this, "Ingrese un numero valido");
			}

		}// GEN-LAST:event_NuevoButtonActionPerformed

		private void NumeroTextKeyReleased(java.awt.event.KeyEvent evt) {// GEN-FIRST:event_NumeroTextKeyReleased
			// TODO add your handling code here:
			activarButtonNuevo();
			activarButtonAddOcupante();
		}// GEN-LAST:event_NumeroTextKeyReleased

		private void PrecioDarioTextKeyReleased(java.awt.event.KeyEvent evt) {// GEN-FIRST:event_PrecioDarioTextKeyReleased
			// TODO add your handling code here:
			activarButtonNuevo();
		}// GEN-LAST:event_PrecioDarioTextKeyReleased

		int seleccion = -1;

		private void TablaRegistrosMouseClicked(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_TablaRegistrosMouseClicked
			// TODO add your handling code here:
			int selec = TablaRegistros.rowAtPoint(evt.getPoint());
			seleccion = TablaRegistros.rowAtPoint(evt.getPoint());
			int numero = Integer.parseInt(TablaRegistros.getValueAt(selec, 0).toString());

			colocarDatosHabitacion(numero);

			VerReservaButton.setEnabled(ActivarButtonVerReserva(numero));

			addOcupanteButton.setEnabled(false);

			NumeroText.setEditable(false);

		}// GEN-LAST:event_TablaRegistrosMouseClicked

		private boolean ActivarButtonVerReserva(int numero) {
			if (Objects.isNull(ListaHabitacionG3.ObtenerHabitacionNum(numero).getOcupante())) {
				return false;
			} else {
				return true;
			}
		}

		private void CancelarButtonActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_CancelarButtonActionPerformed
			// TODO add your handling code here:
			NumeroText.setEditable(true);
			activarButtonNuevo();
			vaciarDatosHabitacion();
			VerReservaButton.setEnabled(false);

		}// GEN-LAST:event_CancelarButtonActionPerformed

		private void GuardarButtonActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_GuardarButtonActionPerformed
			try {
				int item = Integer.parseInt(NumeroText.getText());

				for (int i = 0; i < ListaHabitacionG3.Obtener().size(); i++) {
					if (item == ListaHabitacionG3.ObtenerHabitacionPos(i).getNumero()) {
						ListaHabitacionG3.ObtenerHabitacionPos(i).setNumero(Integer.parseInt(NumeroText.getText()));
						ListaHabitacionG3.ObtenerHabitacionPos(i)
								.setPiso(Integer.parseInt(PisoCBox.getSelectedItem().toString()));
						ListaHabitacionG3.ObtenerHabitacionPos(i).setPrecio(Double.parseDouble(PrecioDarioText.getText()));
						ListaHabitacionG3.ObtenerHabitacionPos(i).setFecha(Integer.parseInt(FechaText.getText()));
						ListaHabitacionG3.ObtenerHabitacionPos(i).setFechar(Integer.parseInt(FecharText.getText()));
						if (EstadoCBox.getSelectedItem().toString().equalsIgnoreCase("Disponible")) {
							ListaHabitacionG3.ObtenerHabitacionPos(i).setEstado(true);
						} else {
							ListaHabitacionG3.ObtenerHabitacionPos(i).setEstado(false);
						}
						ListaHabitacionG3.ObtenerHabitacionPos(i).setTipo(TipoCBox.getSelectedItem().toString());
						JOptionPane.showMessageDialog(this, "Se Guardaron los datos con éxito");
					}
				}
				actualizarTabla();
			} catch (HeadlessException | NumberFormatException e) {
				JOptionPane.showMessageDialog(this, "Error: " + e);
			}
		}// GEN-LAST:event_GuardarButtonActionPerformed

		private void actualizarButtonActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_actualizarButtonActionPerformed
			VerReservaButton.setEnabled(false);
			actualizarTabla();
		}// GEN-LAST:event_actualizarButtonActionPerformed

		private void EstadoCBoxItemStateChanged(java.awt.event.ItemEvent evt) {// GEN-FIRST:event_EstadoCBoxItemStateChanged

			if (NumeroText.isEditable()) {
				activarButtonAddOcupante();
			}
		}// GEN-LAST:event_EstadoCBoxItemStateChanged

		private void VerReservaButtonActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_VerReservaButtonActionPerformed
			ReservaG3 ventana = new ReservaG3(Integer.parseInt(NumeroText.getText()));
		}// GEN-LAST:event_VerReservaButtonActionPerformed

		private void Panel1MouseMoved(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_Panel1MouseMoved
			activarButtonNuevo();
		}// GEN-LAST:event_Panel1MouseMoved

		private void FechaTextKeyReleased(java.awt.event.KeyEvent evt) {// GEN-FIRST:event_FechaTextKeyReleased
			// TODO add your handling code here:
		}// GEN-LAST:event_FechaTextKeyReleased

		private void PrecioDarioTextActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_PrecioDarioTextActionPerformed
			// TODO add your handling code here:
		}// GEN-LAST:event_PrecioDarioTextActionPerformed

		private void NumeroTextActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_NumeroTextActionPerformed
			// TODO add your handling code here:
		}// GEN-LAST:event_NumeroTextActionPerformed

		private void BuscarTextActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_BuscarTextActionPerformed
			// TODO add your handling code here:
		}// GEN-LAST:event_BuscarTextActionPerformed

		private void FechaTextActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_FechaTextActionPerformed
			// TODO add your handling code here:
		}// GEN-LAST:event_FechaTextActionPerformed

		private void EstadoCBoxActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_EstadoCBoxActionPerformed
			// TODO add your handling code here:
		}// GEN-LAST:event_EstadoCBoxActionPerformed

		private void FecharTextActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_FecharTextActionPerformed
			// TODO add your handling code here:
		}// GEN-LAST:event_FecharTextActionPerformed

		private void FecharTextKeyReleased(java.awt.event.KeyEvent evt) {// GEN-FIRST:event_FecharTextKeyReleased
			// TODO add your handling code here:
		}// GEN-LAST:event_FecharTextKeyReleased

		private void activarButtonNuevo() {

			if (!NumeroText.getText().isEmpty() && !PrecioDarioText.getText().isEmpty()
					&& EstadoCBox.getSelectedIndex() == 0) {
				NuevoButton.setEnabled(true);
			} else if (!NumeroText.getText().isEmpty() && !PrecioDarioText.getText().isEmpty()
					&& EstadoCBox.getSelectedIndex() == 1) {
				if (!Objects.isNull(AñadeClientG3.ObteneClienteAñadido())) {
					NuevoButton.setEnabled(true);
				} else {
					NuevoButton.setEnabled(false);
				}
			} else {
				NuevoButton.setEnabled(false);
			}
		}

		private void activarButtonAddOcupante() {
			if (!NumeroText.getText().isEmpty() && EstadoCBox.getSelectedItem().toString().equals("Ocupado")) {
				addOcupanteButton.setEnabled(true);
			} else {
				addOcupanteButton.setEnabled(false);
			}
		}

		private void actualizarTabla() {
			refresh = new DefaultTableModel(null, titulo);
			String estado;
			for (int i = 0; i < ListaHabitacionG3.Obtener().size(); i++) {
				if (ListaHabitacionG3.ObtenerHabitacionPos(i).isEstado()) {
					estado = "Disponible";
				} else {
					estado = "Ocupado";
				}
				String[] Filas = { Integer.toString(ListaHabitacionG3.ObtenerHabitacionPos(i).getNumero()),
						ListaHabitacionG3.ObtenerHabitacionPos(i).getTipo(),
						Double.toString((ListaHabitacionG3.ObtenerHabitacionPos(i).getPrecio())), estado,
						Integer.toString(ListaHabitacionG3.ObtenerHabitacionPos(i).getPiso()),
						Integer.toString((ListaHabitacionG3.ObtenerHabitacionPos(i).getFecha())),
						Integer.toString((ListaHabitacionG3.ObtenerHabitacionPos(i).getFechar())) };

				refresh.addRow(Filas);
			}
			TablaRegistros.setModel(refresh);
		}

		private void colocarDatosHabitacion(int numero) {
			HabitacionG3 lista;
			for (int i = 0; i < ListaHabitacionG3.Obtener().size(); i++) {
				lista = ListaHabitacionG3.ObtenerHabitacionPos(i);
				if (lista.getNumero() == numero) {
					NumeroText.setText(Integer.toString(lista.getNumero()));
					PisoCBox.setSelectedIndex(lista.getPiso() - 1);
					PrecioDarioText.setText(Double.toString(lista.getPrecio()));
					FechaText.setText(Integer.toString(lista.getFecha()));
					FecharText.setText(Integer.toString(lista.getFechar()));

					if (lista.isEstado()) {
						EstadoCBox.setSelectedIndex(0);
					} else {
						EstadoCBox.setSelectedIndex(1);
					}

					TipoCBox.setSelectedItem(lista.getTipo());
				}
			}
		}

		private void vaciarDatosHabitacion() {

			NumeroText.setText("");
			PisoCBox.setSelectedIndex(0);
			PrecioDarioText.setText("");
			FechaText.setText("");
			FecharText.setText("");
			EstadoCBox.setSelectedIndex(0);
			TipoCBox.setSelectedItem(0);
			activarButtonNuevo();
		}

		private void buscarRegistro(int numero) {
			if (numero > -1) {
				refresh = new DefaultTableModel(null, titulo);
				for (int i = 0; i < TablaRegistros.getRowCount(); i++) {
					if (numero == Integer.parseInt(TablaRegistros.getValueAt(i, 0).toString())) {
						String[] Filas = { TablaRegistros.getValueAt(i, 0).toString(),
								TablaRegistros.getValueAt(i, 1).toString(), TablaRegistros.getValueAt(i, 2).toString(),
								TablaRegistros.getValueAt(i, 3).toString(), TablaRegistros.getValueAt(i, 4).toString() };
						refresh.addRow(Filas);
					}
				}
				TablaRegistros.setModel(refresh);
			} else {
				JOptionPane.showMessageDialog(this, "Ingrese un numero valido");
			}
		}

		// Variables declaration - do not modify//GEN-BEGIN:variables
		private javax.swing.JButton BuscarButton;
		private javax.swing.JTextField BuscarText;
		private javax.swing.JButton CancelarButton;
		private javax.swing.JButton EliminarButton;
		private javax.swing.JLabel Encabezado;
		private javax.swing.JComboBox<String> EstadoCBox;
		private javax.swing.JTextField FechaText;
		private javax.swing.JTextField FecharText;
		private javax.swing.JButton GuardarButton;
		private javax.swing.JButton NuevoButton;
		private javax.swing.JTextField NumeroText;
		private javax.swing.JPanel Panel1;
		private javax.swing.JComboBox<String> PisoCBox;
		private javax.swing.JTextField PrecioDarioText;
		private javax.swing.JButton SalirButton;
		private javax.swing.JLabel Subtittle1;
		private javax.swing.JTable TablaRegistros;
		private javax.swing.JComboBox<String> TipoCBox;
		private javax.swing.JLabel UsuarioLabel;
		private javax.swing.JButton VerReservaButton;
		private javax.swing.JButton actualizarButton;
		private javax.swing.JButton addOcupanteButton;
		private javax.swing.JLabel jLabel1;
		private javax.swing.JLabel jLabel2;
		private javax.swing.JLabel jLabel3;
		private javax.swing.JLabel jLabel4;
		private javax.swing.JLabel jLabel5;
		private javax.swing.JLabel jLabel6;
		private javax.swing.JLabel jLabel7;
		private javax.swing.JLabel jLabel8;
		private javax.swing.JLabel jLabel9;
		private javax.swing.JPanel jPanel1;
		private javax.swing.JPanel jPanel2Fondo;
		private javax.swing.JPanel jPanel3;
		private javax.swing.JScrollPane jScrollPane1;
		}