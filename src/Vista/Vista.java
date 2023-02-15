package Vista;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import Controlador.Controlador;

import javax.swing.JButton;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.JProgressBar;
import javax.swing.JComboBox;
import javax.swing.JList;
import javax.swing.DefaultComboBoxModel;

public class Vista extends JFrame {

	public JPanel panel, contentPane, jPInicio, jPCantantes, jPBotones, jPCantante1, jPCantante2, jPCantante3, jPCantante4, jPCantante5, jPCantante6, jPCantante7, jPCantante8, jPCantante9, jPCantante10, jPVerProbincia;
	public JPanel jPVerNacional, jPVerRango, panel_1;
	public JButton btnComenzar, btnVotar, btnVotacionesComunidad, btnVotacionesNacionales, btnVotacionesRango;
	public JLabel lblCNombre1, lblCNombre2, lblCNombre3, lblCNombre4, lblCNombre5, lblCNombre6, lblCNombre7, lblCNombre8, lblCNombre9, lblCNombre10;
	public JLabel lblCApellido1, lblCApellido2, lblCApellido3, lblCApellido4, lblCApellido5, lblCApellido6, lblCApellido7, lblCApellido8, lblCApellido9, lblCApellido10;
	public JLabel lblCCancion1, lblCCancion2, lblCCancion3, lblCCancion4, lblCCancion5, lblCCancion6, lblCCancion7, lblCCancion8, lblCCancion9, lblCCancion10;
	public JList jLConcursantesComunidad, jLConcursantesRango;
	public JButton btnGanadoresRango, btnGanadoresComunidades;
	public JComboBox comboBox_1;
	private JLabel lblNewLabel_4;
	public JLabel lblNombreCO;
	private JLabel lblNewLabel_5;
	public JLabel lblApellidoCO;
	private JLabel lblNewLabel_9_2;
	public JLabel lblCanciónCO;
	private JLabel lblNewLabel_9_1_2;
	public JLabel lblApellidoCo;
	public JList jListNacional;
	public JButton btnSacarCantante;
	public JLabel lblNombreN;
	public JLabel lblApellidoN;
	public JLabel lblCancionN;
	public JLabel lblPuntosN;
	public JComboBox comboBox;
	public JLabel lblNombreR;
	public JLabel lblApellidoR;
	public JLabel lblCanciónR;
	public JLabel lblPuntosR;
	public JButton btnAtras1, btnAtras2, btnAtras3;
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Vista frame = new Vista();
					Controlador accesos = new Controlador(frame);
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Vista() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1055, 722);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
								
								jPVerNacional = new JPanel();
								jPVerNacional.setLayout(null);
								jPVerNacional.setBounds(10, 11, 1019, 661);
								contentPane.add(jPVerNacional);
								
								JLabel lblNewLabel_7 = new JLabel("Ganadores a nivel Nacional");
								lblNewLabel_7.setFont(new Font("Tahoma", Font.PLAIN, 15));
								lblNewLabel_7.setHorizontalAlignment(SwingConstants.CENTER);
								lblNewLabel_7.setBounds(404, 11, 214, 14);
								jPVerNacional.add(lblNewLabel_7);
								
								jListNacional = new JList();
								jListNacional.setBounds(10, 28, 999, 297);
								jPVerNacional.add(jListNacional);
								
								btnSacarCantante = new JButton("Ver Cantante");
								btnSacarCantante.setBounds(449, 351, 120, 23);
								jPVerNacional.add(btnSacarCantante);
								
								JLabel lblNewLabel_6 = new JLabel("Nombre");
								lblNewLabel_6.setFont(new Font("Tahoma", Font.PLAIN, 15));
								lblNewLabel_6.setBounds(10, 405, 76, 14);
								jPVerNacional.add(lblNewLabel_6);
								
								JLabel lblNewLabel_10 = new JLabel("Apellido");
								lblNewLabel_10.setFont(new Font("Tahoma", Font.PLAIN, 15));
								lblNewLabel_10.setBounds(10, 430, 76, 23);
								jPVerNacional.add(lblNewLabel_10);
								
								JLabel lblNewLabel_11 = new JLabel("Cancion");
								lblNewLabel_11.setFont(new Font("Tahoma", Font.PLAIN, 15));
								lblNewLabel_11.setBounds(10, 464, 76, 14);
								jPVerNacional.add(lblNewLabel_11);
								
								JLabel lblNewLabel_12 = new JLabel("Puntos");
								lblNewLabel_12.setFont(new Font("Tahoma", Font.PLAIN, 15));
								lblNewLabel_12.setBounds(10, 489, 76, 14);
								jPVerNacional.add(lblNewLabel_12);
								
								lblNombreN = new JLabel("");
								lblNombreN.setFont(new Font("Tahoma", Font.PLAIN, 15));
								lblNombreN.setBounds(96, 407, 135, 14);
								jPVerNacional.add(lblNombreN);
								
								lblApellidoN = new JLabel("");
								lblApellidoN.setFont(new Font("Tahoma", Font.PLAIN, 15));
								lblApellidoN.setBounds(96, 436, 135, 14);
								jPVerNacional.add(lblApellidoN);
								
								lblCancionN = new JLabel("");
								lblCancionN.setFont(new Font("Tahoma", Font.PLAIN, 15));
								lblCancionN.setBounds(96, 466, 135, 14);
								jPVerNacional.add(lblCancionN);
								
								lblPuntosN = new JLabel("");
								lblPuntosN.setFont(new Font("Tahoma", Font.PLAIN, 15));
								lblPuntosN.setBounds(96, 491, 135, 14);
								jPVerNacional.add(lblPuntosN);
								
								btnAtras1 = new JButton("Atras");
								btnAtras1.setBounds(465, 385, 89, 23);
								jPVerNacional.add(btnAtras1);
								
								jPVerRango = new JPanel();
								jPVerRango.setLayout(null);
								jPVerRango.setBounds(10, 11, 1019, 661);
								contentPane.add(jPVerRango);
								
								panel_1 = new JPanel();
								panel_1.setLayout(null);
								panel_1.setBounds(10, 11, 999, 437);
								jPVerRango.add(panel_1);
								
								jLConcursantesRango = new JList();
								jLConcursantesRango.setBounds(10, 44, 979, 274);
								panel_1.add(jLConcursantesRango);
								
										btnGanadoresRango = new JButton("Ver Cantante");
										btnGanadoresRango.setBounds(433, 329, 132, 23);
										panel_1.add(btnGanadoresRango);
										
										comboBox = new JComboBox();
										comboBox.setModel(new DefaultComboBoxModel(new String[] {"Rango_18_25", "Rango_26_40", "Rango_41_65", "Rango_Mas_65"}));
										comboBox.setBounds(10, 11, 122, 22);
										panel_1.add(comboBox);
										
										btnAtras2 = new JButton("Atras");
										btnAtras2.setBounds(455, 363, 89, 23);
										panel_1.add(btnAtras2);
										
										JLabel lblNewLabel_8 = new JLabel("Nombre");
										lblNewLabel_8.setFont(new Font("Tahoma", Font.PLAIN, 15));
										lblNewLabel_8.setBounds(10, 459, 78, 14);
										jPVerRango.add(lblNewLabel_8);
										
										lblNombreR = new JLabel("");
										lblNombreR.setFont(new Font("Tahoma", Font.PLAIN, 15));
										lblNombreR.setBounds(98, 459, 78, 14);
										jPVerRango.add(lblNombreR);
										
										JLabel lblNewLabel_9 = new JLabel("Apellido");
										lblNewLabel_9.setFont(new Font("Tahoma", Font.PLAIN, 15));
										lblNewLabel_9.setBounds(10, 484, 78, 24);
										jPVerRango.add(lblNewLabel_9);
										
										lblApellidoR = new JLabel("");
										lblApellidoR.setFont(new Font("Tahoma", Font.PLAIN, 15));
										lblApellidoR.setBounds(98, 491, 78, 14);
										jPVerRango.add(lblApellidoR);
										
										JLabel lblNewLabel_9_1 = new JLabel("Canci\u00F3n");
										lblNewLabel_9_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
										lblNewLabel_9_1.setBounds(10, 519, 78, 24);
										jPVerRango.add(lblNewLabel_9_1);
										
										lblCanciónR = new JLabel("");
										lblCanciónR.setFont(new Font("Tahoma", Font.PLAIN, 15));
										lblCanciónR.setBounds(98, 526, 177, 14);
										jPVerRango.add(lblCanciónR);
										
										JLabel lblNewLabel_9_1_1 = new JLabel("Puntos");
										lblNewLabel_9_1_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
										lblNewLabel_9_1_1.setBounds(10, 554, 78, 24);
										jPVerRango.add(lblNewLabel_9_1_1);
										
										lblPuntosR = new JLabel("");
										lblPuntosR.setFont(new Font("Tahoma", Font.PLAIN, 15));
										lblPuntosR.setBounds(98, 561, 78, 14);
										jPVerRango.add(lblPuntosR);
										
										jPCantantes = new JPanel();
										jPCantantes.setBounds(10, 11, 1019, 661);
										contentPane.add(jPCantantes);
										jPCantantes.setLayout(null);
										
										jPBotones = new JPanel();
										jPBotones.setBounds(10, 11, 258, 162);
										jPCantantes.add(jPBotones);
										jPBotones.setLayout(null);
										
										btnVotar = new JButton("Comenzar Votaciones");
										btnVotar.setBounds(10, 11, 234, 23);
										jPBotones.add(btnVotar);
										btnVotar.setFont(new Font("Tahoma", Font.PLAIN, 15));
										
										btnVotacionesComunidad = new JButton("Votaciones por Comunidad");
										btnVotacionesComunidad.setBounds(10, 45, 234, 23);
										jPBotones.add(btnVotacionesComunidad);
										btnVotacionesComunidad.setFont(new Font("Tahoma", Font.PLAIN, 15));
										
										btnVotacionesNacionales = new JButton("Votaciones nacienales");
										btnVotacionesNacionales.setBounds(10, 79, 234, 23);
										jPBotones.add(btnVotacionesNacionales);
										btnVotacionesNacionales.setFont(new Font("Tahoma", Font.PLAIN, 15));
										
										btnVotacionesRango = new JButton("Votaciones por rango de Edad");
										btnVotacionesRango.setBounds(10, 113, 234, 23);
										jPBotones.add(btnVotacionesRango);
										btnVotacionesRango.setFont(new Font("Tahoma", Font.PLAIN, 15));
										
										jPCantante1 = new JPanel();
										jPCantante1.setBounds(10, 184, 130, 204);
										jPCantantes.add(jPCantante1);
										jPCantante1.setLayout(null);
										
										lblCNombre1 = new JLabel("Nombre");
										lblCNombre1.setHorizontalAlignment(SwingConstants.CENTER);
										lblCNombre1.setBounds(10, 26, 110, 14);
										jPCantante1.add(lblCNombre1);
										
										lblCApellido1 = new JLabel("Apellidos");
										lblCApellido1.setHorizontalAlignment(SwingConstants.CENTER);
										lblCApellido1.setBounds(10, 80, 110, 14);
										jPCantante1.add(lblCApellido1);
										
										lblCCancion1 = new JLabel("Canci\u00F3n");
										lblCCancion1.setFont(new Font("Tahoma", Font.PLAIN, 10));
										lblCCancion1.setHorizontalAlignment(SwingConstants.CENTER);
										lblCCancion1.setBounds(0, 133, 130, 14);
										jPCantante1.add(lblCCancion1);
										
										jPCantante2 = new JPanel();
										jPCantante2.setLayout(null);
										jPCantante2.setBounds(172, 184, 130, 204);
										jPCantantes.add(jPCantante2);
										
										lblCNombre2 = new JLabel("Nombre");
										lblCNombre2.setHorizontalAlignment(SwingConstants.CENTER);
										lblCNombre2.setBounds(10, 26, 110, 14);
										jPCantante2.add(lblCNombre2);
										
										lblCApellido2 = new JLabel("Apellidos");
										lblCApellido2.setHorizontalAlignment(SwingConstants.CENTER);
										lblCApellido2.setBounds(10, 80, 110, 14);
										jPCantante2.add(lblCApellido2);
										
										lblCCancion2 = new JLabel("Canci\u00F3n");
										lblCCancion2.setFont(new Font("Tahoma", Font.PLAIN, 10));
										lblCCancion2.setHorizontalAlignment(SwingConstants.CENTER);
										lblCCancion2.setBounds(10, 133, 110, 14);
										jPCantante2.add(lblCCancion2);
										
										jPCantante3 = new JPanel();
										jPCantante3.setLayout(null);
										jPCantante3.setBounds(333, 184, 130, 204);
										jPCantantes.add(jPCantante3);
										
										lblCNombre3 = new JLabel("Nombre");
										lblCNombre3.setHorizontalAlignment(SwingConstants.CENTER);
										lblCNombre3.setBounds(10, 26, 110, 14);
										jPCantante3.add(lblCNombre3);
										
										lblCApellido3 = new JLabel("Apellidos");
										lblCApellido3.setHorizontalAlignment(SwingConstants.CENTER);
										lblCApellido3.setBounds(10, 80, 110, 14);
										jPCantante3.add(lblCApellido3);
										
										lblCCancion3 = new JLabel("Canci\u00F3n");
										lblCCancion3.setFont(new Font("Tahoma", Font.PLAIN, 10));
										lblCCancion3.setHorizontalAlignment(SwingConstants.CENTER);
										lblCCancion3.setBounds(10, 133, 110, 14);
										jPCantante3.add(lblCCancion3);
										
										jPCantante4 = new JPanel();
										jPCantante4.setLayout(null);
										jPCantante4.setBounds(491, 184, 130, 204);
										jPCantantes.add(jPCantante4);
										
										lblCNombre4 = new JLabel("Nombre");
										lblCNombre4.setHorizontalAlignment(SwingConstants.CENTER);
										lblCNombre4.setBounds(10, 26, 110, 14);
										jPCantante4.add(lblCNombre4);
										
										lblCApellido4 = new JLabel("Apellidos");
										lblCApellido4.setHorizontalAlignment(SwingConstants.CENTER);
										lblCApellido4.setBounds(10, 80, 110, 14);
										jPCantante4.add(lblCApellido4);
										
										lblCCancion4 = new JLabel("Canci\u00F3n");
										lblCCancion4.setFont(new Font("Tahoma", Font.PLAIN, 10));
										lblCCancion4.setHorizontalAlignment(SwingConstants.CENTER);
										lblCCancion4.setBounds(10, 133, 110, 14);
										jPCantante4.add(lblCCancion4);
										
										jPCantante5 = new JPanel();
										jPCantante5.setLayout(null);
										jPCantante5.setBounds(648, 184, 130, 204);
										jPCantantes.add(jPCantante5);
										
										lblCNombre5 = new JLabel("Nombre");
										lblCNombre5.setHorizontalAlignment(SwingConstants.CENTER);
										lblCNombre5.setBounds(10, 26, 110, 14);
										jPCantante5.add(lblCNombre5);
										
										lblCApellido5 = new JLabel("Apellidos");
										lblCApellido5.setHorizontalAlignment(SwingConstants.CENTER);
										lblCApellido5.setBounds(10, 80, 110, 14);
										jPCantante5.add(lblCApellido5);
										
										lblCCancion5 = new JLabel("Canci\u00F3n");
										lblCCancion5.setFont(new Font("Tahoma", Font.PLAIN, 10));
										lblCCancion5.setHorizontalAlignment(SwingConstants.CENTER);
										lblCCancion5.setBounds(10, 133, 110, 14);
										jPCantante5.add(lblCCancion5);
										
										jPCantante6 = new JPanel();
										jPCantante6.setLayout(null);
										jPCantante6.setBounds(10, 418, 130, 204);
										jPCantantes.add(jPCantante6);
										
										lblCNombre6 = new JLabel("Nombre");
										lblCNombre6.setHorizontalAlignment(SwingConstants.CENTER);
										lblCNombre6.setBounds(10, 26, 110, 14);
										jPCantante6.add(lblCNombre6);
										
										lblCApellido6 = new JLabel("Apellidos");
										lblCApellido6.setHorizontalAlignment(SwingConstants.CENTER);
										lblCApellido6.setBounds(10, 80, 110, 14);
										jPCantante6.add(lblCApellido6);
										
										lblCCancion6 = new JLabel("Canci\u00F3n");
										lblCCancion6.setFont(new Font("Tahoma", Font.PLAIN, 10));
										lblCCancion6.setHorizontalAlignment(SwingConstants.CENTER);
										lblCCancion6.setBounds(10, 133, 110, 14);
										jPCantante6.add(lblCCancion6);
										
										jPCantante7 = new JPanel();
										jPCantante7.setLayout(null);
										jPCantante7.setBounds(172, 418, 130, 204);
										jPCantantes.add(jPCantante7);
										
										lblCNombre7 = new JLabel("Nombre");
										lblCNombre7.setHorizontalAlignment(SwingConstants.CENTER);
										lblCNombre7.setBounds(10, 26, 110, 14);
										jPCantante7.add(lblCNombre7);
										
										lblCApellido7 = new JLabel("Apellidos");
										lblCApellido7.setHorizontalAlignment(SwingConstants.CENTER);
										lblCApellido7.setBounds(10, 80, 110, 14);
										jPCantante7.add(lblCApellido7);
										
										lblCCancion7 = new JLabel("Canci\u00F3n");
										lblCCancion7.setFont(new Font("Tahoma", Font.PLAIN, 10));
										lblCCancion7.setHorizontalAlignment(SwingConstants.CENTER);
										lblCCancion7.setBounds(10, 133, 110, 14);
										jPCantante7.add(lblCCancion7);
										
										jPCantante8 = new JPanel();
										jPCantante8.setLayout(null);
										jPCantante8.setBounds(333, 418, 130, 204);
										jPCantantes.add(jPCantante8);
										
										lblCNombre8 = new JLabel("Nombre");
										lblCNombre8.setHorizontalAlignment(SwingConstants.CENTER);
										lblCNombre8.setBounds(10, 26, 110, 14);
										jPCantante8.add(lblCNombre8);
										
										lblCApellido8 = new JLabel("Apellidos");
										lblCApellido8.setHorizontalAlignment(SwingConstants.CENTER);
										lblCApellido8.setBounds(10, 80, 110, 14);
										jPCantante8.add(lblCApellido8);
										
										lblCCancion8 = new JLabel("Canci\u00F3n");
										lblCCancion8.setFont(new Font("Tahoma", Font.PLAIN, 10));
										lblCCancion8.setHorizontalAlignment(SwingConstants.CENTER);
										lblCCancion8.setBounds(10, 133, 110, 14);
										jPCantante8.add(lblCCancion8);
										
										jPCantante9 = new JPanel();
										jPCantante9.setLayout(null);
										jPCantante9.setBounds(491, 418, 130, 204);
										jPCantantes.add(jPCantante9);
										
										lblCNombre9 = new JLabel("Nombre");
										lblCNombre9.setHorizontalAlignment(SwingConstants.CENTER);
										lblCNombre9.setBounds(10, 26, 110, 14);
										jPCantante9.add(lblCNombre9);
										
										lblCApellido9 = new JLabel("Apellidos");
										lblCApellido9.setHorizontalAlignment(SwingConstants.CENTER);
										lblCApellido9.setBounds(10, 80, 110, 14);
										jPCantante9.add(lblCApellido9);
										
										lblCCancion9 = new JLabel("Canci\u00F3n");
										lblCCancion9.setFont(new Font("Tahoma", Font.PLAIN, 10));
										lblCCancion9.setHorizontalAlignment(SwingConstants.CENTER);
										lblCCancion9.setBounds(10, 133, 110, 14);
										jPCantante9.add(lblCCancion9);
										
										jPCantante10 = new JPanel();
										jPCantante10.setLayout(null);
										jPCantante10.setBounds(648, 418, 130, 204);
										jPCantantes.add(jPCantante10);
										
										lblCNombre10 = new JLabel("Nombre");
										lblCNombre10.setHorizontalAlignment(SwingConstants.CENTER);
										lblCNombre10.setBounds(10, 26, 110, 14);
										jPCantante10.add(lblCNombre10);
										
										lblCApellido10 = new JLabel("Apellidos");
										lblCApellido10.setHorizontalAlignment(SwingConstants.CENTER);
										lblCApellido10.setBounds(10, 80, 110, 14);
										jPCantante10.add(lblCApellido10);
										
										lblCCancion10 = new JLabel("Canci\u00F3n");
										lblCCancion10.setFont(new Font("Tahoma", Font.PLAIN, 10));
										lblCCancion10.setHorizontalAlignment(SwingConstants.CENTER);
										lblCCancion10.setBounds(10, 133, 110, 14);
										jPCantante10.add(lblCCancion10);
										
										JLabel lblNewLabel_1 = new JLabel("1. Voton Comenzar Votaciones: Inicia el proceso de votos ");
										lblNewLabel_1.setBounds(278, 36, 731, 14);
										jPCantantes.add(lblNewLabel_1);
										
										JLabel lblNewLabel_2 = new JLabel("2. Votaciones por Comunidad/Nacionales/RangoEdad: muestran los votos de cada concursante respectivamente");
										lblNewLabel_2.setBounds(278, 61, 731, 14);
										jPCantantes.add(lblNewLabel_2);
										
										JLabel lblNewLabel_3 = new JLabel("3. Ver votos: Muestra el porcentaje de votantes respecto al total que tiene cada concursante");
										lblNewLabel_3.setBounds(278, 86, 731, 14);
										jPCantantes.add(lblNewLabel_3);
										
										JLabel lblNewLabel = new JLabel("Instrucciones:");
										lblNewLabel.setBounds(278, 11, 731, 14);
										jPCantantes.add(lblNewLabel);
										
										jPInicio = new JPanel();
										jPInicio.setBounds(10, 11, 1019, 661);
										contentPane.add(jPInicio);
										jPInicio.setLayout(null);
										
										btnComenzar = new JButton("Iniciar Aplicaci\u00F3n");
										btnComenzar.setFont(new Font("Tahoma", Font.PLAIN, 15));
										btnComenzar.setBounds(428, 319, 163, 23);
										jPInicio.add(btnComenzar);
										
										jPVerProbincia = new JPanel();
										jPVerProbincia.setBounds(10, 11, 1019, 661);
										contentPane.add(jPVerProbincia);
										jPVerProbincia.setLayout(null);
										
										panel = new JPanel();
										panel.setBounds(10, 11, 999, 437);
										jPVerProbincia.add(panel);
										panel.setLayout(null);
										
										jLConcursantesComunidad = new JList();
										jLConcursantesComunidad.setBounds(10, 43, 979, 347);
										panel.add(jLConcursantesComunidad);
										
										btnGanadoresComunidades = new JButton("Ver ganadores");
										btnGanadoresComunidades.setBounds(433, 401, 132, 23);
										panel.add(btnGanadoresComunidades);
										
										comboBox_1 = new JComboBox();
										comboBox_1.setModel(new DefaultComboBoxModel(new String[] {"Andalucia", "Aragon", "Asturias", "Baleares", "Canarias", "Cantabria", "Castilla La Mancha", "Castilla y Leon", "Catalunia", "Comunidad Valenciana", "Extremadura", "Galicia", "Madrid", "Murcia", "Navarra", "Pais Vasco", "La Rioja", "Ceuta", "Melilla"}));
										comboBox_1.setBounds(10, 10, 132, 22);
										panel.add(comboBox_1);
										
										lblNewLabel_4 = new JLabel("Nombre");
										lblNewLabel_4.setFont(new Font("Tahoma", Font.PLAIN, 15));
										lblNewLabel_4.setBounds(10, 459, 78, 14);
										jPVerProbincia.add(lblNewLabel_4);
										
										lblNombreCO = new JLabel("");
										lblNombreCO.setFont(new Font("Tahoma", Font.PLAIN, 15));
										lblNombreCO.setBounds(98, 459, 78, 14);
										jPVerProbincia.add(lblNombreCO);
										
										lblNewLabel_5 = new JLabel("Apellido");
										lblNewLabel_5.setFont(new Font("Tahoma", Font.PLAIN, 15));
										lblNewLabel_5.setBounds(10, 484, 78, 24);
										jPVerProbincia.add(lblNewLabel_5);
										
										lblApellidoCO = new JLabel("");
										lblApellidoCO.setFont(new Font("Tahoma", Font.PLAIN, 15));
										lblApellidoCO.setBounds(98, 491, 78, 14);
										jPVerProbincia.add(lblApellidoCO);
										
										lblNewLabel_9_2 = new JLabel("Canci\u00F3n");
										lblNewLabel_9_2.setFont(new Font("Tahoma", Font.PLAIN, 15));
										lblNewLabel_9_2.setBounds(10, 519, 78, 24);
										jPVerProbincia.add(lblNewLabel_9_2);
										
										lblCanciónCO = new JLabel("");
										lblCanciónCO.setFont(new Font("Tahoma", Font.PLAIN, 15));
										lblCanciónCO.setBounds(85, 529, 177, 14);
										jPVerProbincia.add(lblCanciónCO);
										
										lblNewLabel_9_1_2 = new JLabel("Puntos");
										lblNewLabel_9_1_2.setFont(new Font("Tahoma", Font.PLAIN, 15));
										lblNewLabel_9_1_2.setBounds(10, 554, 78, 24);
										jPVerProbincia.add(lblNewLabel_9_1_2);
										
										lblApellidoCo = new JLabel("");
										lblApellidoCo.setFont(new Font("Tahoma", Font.PLAIN, 15));
										lblApellidoCo.setBounds(85, 564, 78, 14);
										jPVerProbincia.add(lblApellidoCo);
										
										btnAtras3 = new JButton("Atras");
										btnAtras3.setBounds(465, 457, 89, 23);
										jPVerProbincia.add(btnAtras3);
										jPVerProbincia.setVisible(false);
										btnVotacionesComunidad.setVisible(false);
										btnVotacionesNacionales.setVisible(false);
										btnVotacionesRango.setVisible(false);
										
										jPCantantes.setVisible(false);
										jPVerRango.setVisible(false);
								jPVerNacional.setVisible(false);
	}
}
