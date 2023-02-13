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

public class Vista extends JFrame {

	public JPanel jPCantanteComunidad3, jPCantanteComunidad1, jPCantanteComunidad2, panel, contentPane, jPInicio, jPCantantes, jPBotones, jPCantante1, jPCantante2, jPCantante3, jPCantante4, jPCantante5, jPCantante6, jPCantante7, jPCantante8, jPCantante9, jPCantante10, jPVerProbincia;
	public JPanel jPVerNacional, jPCantanteComunidad2_1, jPCantanteComunidad1_1, jPCantanteComunidad3_1, jPVerRango, panel_1, jPCantanteRango2, jPCantanteRango1, jPCantanteRango3;
	public JButton btnComenzar, btnVotar, btnVotacionesComunidad, btnVotacionesNacionales, btnVotacionesRango;
	public JLabel lblCNombreC3, lblCApellidoC3, lblCNombreC1, lblCNombreC2, lblCNombre1, lblCNombre2, lblCNombre3, lblCNombre4, lblCNombre5, lblCNombre6, lblCNombre7, lblCNombre8, lblCNombre9, lblCNombre10;
	public JLabel lblCApellidoC1, lblCApellidoC2, lblCApellido1, lblCApellido2, lblCApellido3, lblCApellido4, lblCApellido5, lblCApellido6, lblCApellido7, lblCApellido8, lblCApellido9, lblCApellido10;
	public JLabel lblCCancion1, lblCCancion2, lblCCancion3, lblCCancion4, lblCCancion5, lblCCancion6, lblCCancion7, lblCCancion8, lblCCancion9, lblCCancion10;
	public JProgressBar pBCantante1, pBCantante2, pBCantante3, pBCantante4, pBCantante5, pBCantante6, pBCantante7, pBCantante8, pBCantante9, pBCantante10;
	public JList jLConcursantesComunidad, jLConcursantesRango;
	public JButton btnGanadoresRango, btnGanadoresComunidades;
	private JLabel lblNewLabel_4;
	private JLabel lblNewLabel_5;
	private JLabel lblNewLabel_6;
	public JLabel lblCApellidoR3, lblCNombreR3, lblCApellidoR1, lblCNombreR1, lblCApellidoR2, lblCNombreR2, lblCApellidoC3_1, lblCNombreC3_1, lblCApellidoC1_1, lblCNombreC1_1, lblCApellidoC2_1, lblCNombreC2_1;
	
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
				
				jPVerRango = new JPanel();
				jPVerRango.setLayout(null);
				jPVerRango.setBounds(10, 11, 1019, 661);
				contentPane.add(jPVerRango);
				
				panel_1 = new JPanel();
				panel_1.setLayout(null);
				panel_1.setBounds(10, 11, 999, 437);
				jPVerRango.add(panel_1);
				
				jLConcursantesRango = new JList();
				jLConcursantesRango.setBounds(10, 11, 979, 379);
				panel_1.add(jLConcursantesRango);
				
						btnGanadoresRango = new JButton("Ver ganadores");
						btnGanadoresRango.setBounds(433, 401, 132, 23);
						panel_1.add(btnGanadoresRango);
						
						jPCantanteRango2 = new JPanel();
						jPCantanteRango2.setLayout(null);
						jPCantanteRango2.setBounds(444, 459, 130, 88);
						jPVerRango.add(jPCantanteRango2);
						
						lblCNombreR2 = new JLabel("Nombre");
						lblCNombreR2.setHorizontalAlignment(SwingConstants.CENTER);
						lblCNombreR2.setBounds(10, 36, 110, 14);
						jPCantanteRango2.add(lblCNombreR2);
						
						lblCApellidoR2 = new JLabel("Apellidos");
						lblCApellidoR2.setHorizontalAlignment(SwingConstants.CENTER);
						lblCApellidoR2.setBounds(10, 61, 110, 14);
						jPCantanteRango2.add(lblCApellidoR2);
						
						JLabel lblNewLabel_4_2 = new JLabel("2\u00BA Puesto");
						lblNewLabel_4_2.setHorizontalAlignment(SwingConstants.CENTER);
						lblNewLabel_4_2.setBounds(10, 11, 110, 14);
						jPCantanteRango2.add(lblNewLabel_4_2);
						
						jPCantanteRango1 = new JPanel();
						jPCantanteRango1.setLayout(null);
						jPCantanteRango1.setBounds(144, 459, 130, 88);
						jPVerRango.add(jPCantanteRango1);
						
						lblCNombreR1 = new JLabel("Nombre");
						lblCNombreR1.setHorizontalAlignment(SwingConstants.CENTER);
						lblCNombreR1.setBounds(10, 36, 110, 14);
						jPCantanteRango1.add(lblCNombreR1);
						
						lblCApellidoR1 = new JLabel("Apellidos");
						lblCApellidoR1.setHorizontalAlignment(SwingConstants.CENTER);
						lblCApellidoR1.setBounds(10, 61, 110, 14);
						jPCantanteRango1.add(lblCApellidoR1);
						
						JLabel lblNewLabel_5_2 = new JLabel("1\u00BA Puesto");
						lblNewLabel_5_2.setHorizontalAlignment(SwingConstants.CENTER);
						lblNewLabel_5_2.setBounds(10, 11, 110, 14);
						jPCantanteRango1.add(lblNewLabel_5_2);
						
						jPCantanteRango3 = new JPanel();
						jPCantanteRango3.setLayout(null);
						jPCantanteRango3.setBounds(748, 459, 130, 88);
						jPVerRango.add(jPCantanteRango3);
						
						lblCNombreR3 = new JLabel("Nombre");
						lblCNombreR3.setHorizontalAlignment(SwingConstants.CENTER);
						lblCNombreR3.setBounds(10, 36, 110, 14);
						jPCantanteRango3.add(lblCNombreR3);
						
						lblCApellidoR3 = new JLabel("Apellidos");
						lblCApellidoR3.setHorizontalAlignment(SwingConstants.CENTER);
						lblCApellidoR3.setBounds(10, 61, 110, 14);
						jPCantanteRango3.add(lblCApellidoR3);
						
						JLabel lblNewLabel_6_2 = new JLabel("3\u00BA Puesto");
						lblNewLabel_6_2.setHorizontalAlignment(SwingConstants.CENTER);
						lblNewLabel_6_2.setBounds(10, 11, 110, 14);
						jPCantanteRango3.add(lblNewLabel_6_2);
						
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
						
						pBCantante1 = new JProgressBar();
						pBCantante1.setBounds(10, 179, 110, 14);
						jPCantante1.add(pBCantante1);
						
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
						
						pBCantante2 = new JProgressBar();
						pBCantante2.setBounds(10, 179, 110, 14);
						jPCantante2.add(pBCantante2);
						
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
						
						pBCantante3 = new JProgressBar();
						pBCantante3.setBounds(10, 179, 110, 14);
						jPCantante3.add(pBCantante3);
						
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
						
						pBCantante4 = new JProgressBar();
						pBCantante4.setBounds(10, 179, 110, 14);
						jPCantante4.add(pBCantante4);
						
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
						
						pBCantante5 = new JProgressBar();
						pBCantante5.setBounds(10, 179, 110, 14);
						jPCantante5.add(pBCantante5);
						
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
						
						pBCantante6 = new JProgressBar();
						pBCantante6.setBounds(10, 179, 110, 14);
						jPCantante6.add(pBCantante6);
						
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
						
						pBCantante7 = new JProgressBar();
						pBCantante7.setBounds(10, 179, 110, 14);
						jPCantante7.add(pBCantante7);
						
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
						
						pBCantante8 = new JProgressBar();
						pBCantante8.setBounds(10, 179, 110, 14);
						jPCantante8.add(pBCantante8);
						
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
						
						pBCantante9 = new JProgressBar();
						pBCantante9.setBounds(10, 179, 110, 14);
						jPCantante9.add(pBCantante9);
						
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
						
						pBCantante10 = new JProgressBar();
						pBCantante10.setBounds(10, 179, 110, 14);
						jPCantante10.add(pBCantante10);
						
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
						jLConcursantesComunidad.setBounds(10, 11, 979, 379);
						panel.add(jLConcursantesComunidad);
						
						btnGanadoresComunidades = new JButton("Ver ganadores");
						btnGanadoresComunidades.setBounds(433, 401, 132, 23);
						panel.add(btnGanadoresComunidades);
						
						jPCantanteComunidad2 = new JPanel();
						jPCantanteComunidad2.setLayout(null);
						jPCantanteComunidad2.setBounds(444, 459, 130, 88);
						jPVerProbincia.add(jPCantanteComunidad2);
						
						lblCNombreC2 = new JLabel("Nombre");
						lblCNombreC2.setHorizontalAlignment(SwingConstants.CENTER);
						lblCNombreC2.setBounds(10, 36, 110, 14);
						jPCantanteComunidad2.add(lblCNombreC2);
						
						lblCApellidoC2 = new JLabel("Apellidos");
						lblCApellidoC2.setHorizontalAlignment(SwingConstants.CENTER);
						lblCApellidoC2.setBounds(10, 61, 110, 14);
						jPCantanteComunidad2.add(lblCApellidoC2);
						
						lblNewLabel_4 = new JLabel("2\u00BA Puesto");
						lblNewLabel_4.setHorizontalAlignment(SwingConstants.CENTER);
						lblNewLabel_4.setBounds(10, 11, 110, 14);
						jPCantanteComunidad2.add(lblNewLabel_4);
						
						jPCantanteComunidad1 = new JPanel();
						jPCantanteComunidad1.setLayout(null);
						jPCantanteComunidad1.setBounds(144, 459, 130, 88);
						jPVerProbincia.add(jPCantanteComunidad1);
						
						lblCNombreC1 = new JLabel("Nombre");
						lblCNombreC1.setHorizontalAlignment(SwingConstants.CENTER);
						lblCNombreC1.setBounds(10, 36, 110, 14);
						jPCantanteComunidad1.add(lblCNombreC1);
						
						lblCApellidoC1 = new JLabel("Apellidos");
						lblCApellidoC1.setHorizontalAlignment(SwingConstants.CENTER);
						lblCApellidoC1.setBounds(10, 61, 110, 14);
						jPCantanteComunidad1.add(lblCApellidoC1);
						
						lblNewLabel_5 = new JLabel("1\u00BA Puesto");
						lblNewLabel_5.setHorizontalAlignment(SwingConstants.CENTER);
						lblNewLabel_5.setBounds(10, 11, 110, 14);
						jPCantanteComunidad1.add(lblNewLabel_5);
						
						jPCantanteComunidad3 = new JPanel();
						jPCantanteComunidad3.setLayout(null);
						jPCantanteComunidad3.setBounds(748, 459, 130, 88);
						jPVerProbincia.add(jPCantanteComunidad3);
						
						lblCNombreC3 = new JLabel("Nombre");
						lblCNombreC3.setHorizontalAlignment(SwingConstants.CENTER);
						lblCNombreC3.setBounds(10, 36, 110, 14);
						jPCantanteComunidad3.add(lblCNombreC3);
						
						lblCApellidoC3 = new JLabel("Apellidos");
						lblCApellidoC3.setHorizontalAlignment(SwingConstants.CENTER);
						lblCApellidoC3.setBounds(10, 61, 110, 14);
						jPCantanteComunidad3.add(lblCApellidoC3);
						
						lblNewLabel_6 = new JLabel("3\u00BA Puesto");
						lblNewLabel_6.setHorizontalAlignment(SwingConstants.CENTER);
						lblNewLabel_6.setBounds(10, 11, 110, 14);
						jPCantanteComunidad3.add(lblNewLabel_6);
						
						jPVerNacional = new JPanel();
						jPVerNacional.setLayout(null);
						jPVerNacional.setBounds(10, 11, 1019, 661);
						contentPane.add(jPVerNacional);
						
						jPCantanteComunidad2_1 = new JPanel();
						jPCantanteComunidad2_1.setLayout(null);
						jPCantanteComunidad2_1.setBounds(444, 286, 130, 88);
						jPVerNacional.add(jPCantanteComunidad2_1);
						
						lblCNombreC2_1 = new JLabel("Nombre");
						lblCNombreC2_1.setHorizontalAlignment(SwingConstants.CENTER);
						lblCNombreC2_1.setBounds(10, 37, 110, 14);
						jPCantanteComunidad2_1.add(lblCNombreC2_1);
						
						lblCApellidoC2_1 = new JLabel("Apellidos");
						lblCApellidoC2_1.setHorizontalAlignment(SwingConstants.CENTER);
						lblCApellidoC2_1.setBounds(10, 61, 110, 14);
						jPCantanteComunidad2_1.add(lblCApellidoC2_1);
						
						JLabel lblNewLabel_4_1 = new JLabel("2\u00BA Puesto");
						lblNewLabel_4_1.setHorizontalAlignment(SwingConstants.CENTER);
						lblNewLabel_4_1.setBounds(10, 11, 110, 14);
						jPCantanteComunidad2_1.add(lblNewLabel_4_1);
						
						jPCantanteComunidad1_1 = new JPanel();
						jPCantanteComunidad1_1.setLayout(null);
						jPCantanteComunidad1_1.setBounds(155, 286, 130, 88);
						jPVerNacional.add(jPCantanteComunidad1_1);
						
						lblCNombreC1_1 = new JLabel("Nombre");
						lblCNombreC1_1.setHorizontalAlignment(SwingConstants.CENTER);
						lblCNombreC1_1.setBounds(10, 36, 110, 14);
						jPCantanteComunidad1_1.add(lblCNombreC1_1);
						
						lblCApellidoC1_1 = new JLabel("Apellidos");
						lblCApellidoC1_1.setHorizontalAlignment(SwingConstants.CENTER);
						lblCApellidoC1_1.setBounds(10, 61, 110, 14);
						jPCantanteComunidad1_1.add(lblCApellidoC1_1);
						
						JLabel lblNewLabel_5_1 = new JLabel("1\u00BA Puesto");
						lblNewLabel_5_1.setHorizontalAlignment(SwingConstants.CENTER);
						lblNewLabel_5_1.setBounds(10, 11, 110, 14);
						jPCantanteComunidad1_1.add(lblNewLabel_5_1);
						
						jPCantanteComunidad3_1 = new JPanel();
						jPCantanteComunidad3_1.setLayout(null);
						jPCantanteComunidad3_1.setBounds(732, 286, 130, 88);
						jPVerNacional.add(jPCantanteComunidad3_1);
						
						lblCNombreC3_1 = new JLabel("Nombre");
						lblCNombreC3_1.setHorizontalAlignment(SwingConstants.CENTER);
						lblCNombreC3_1.setBounds(10, 36, 110, 14);
						jPCantanteComunidad3_1.add(lblCNombreC3_1);
						
						lblCApellidoC3_1 = new JLabel("Apellidos");
						lblCApellidoC3_1.setHorizontalAlignment(SwingConstants.CENTER);
						lblCApellidoC3_1.setBounds(10, 61, 110, 14);
						jPCantanteComunidad3_1.add(lblCApellidoC3_1);
						
						JLabel lblNewLabel_6_1 = new JLabel("3\u00BA Puesto");
						lblNewLabel_6_1.setHorizontalAlignment(SwingConstants.CENTER);
						lblNewLabel_6_1.setBounds(10, 11, 110, 14);
						jPCantanteComunidad3_1.add(lblNewLabel_6_1);
						
						JLabel lblNewLabel_7 = new JLabel("Ganadores a nivel Nacional");
						lblNewLabel_7.setFont(new Font("Tahoma", Font.PLAIN, 15));
						lblNewLabel_7.setHorizontalAlignment(SwingConstants.CENTER);
						lblNewLabel_7.setBounds(402, 187, 214, 14);
						jPVerNacional.add(lblNewLabel_7);
						jPVerNacional.setVisible(false);
						jPVerProbincia.setVisible(false);
						btnVotacionesComunidad.setVisible(false);
						btnVotacionesNacionales.setVisible(false);
						btnVotacionesRango.setVisible(false);
						
						jPCantantes.setVisible(false);
						jPVerRango.setVisible(false);
	}
}
