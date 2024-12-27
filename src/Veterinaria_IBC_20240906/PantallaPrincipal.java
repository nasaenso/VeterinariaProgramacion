package Veterinaria_IBC_20240906;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;

public class PantallaPrincipal extends JFrame {
	private static final long serialVersionUID = 1L;

	// instanciar la capa de L�gica.
	private Logica miLogicaPrin = new Logica();
	
	private JPanel contentPane;
	// �rea de Listado
	private JTextArea txtaListaPacientes;
	private final JLabel lblListaTitulo = new JLabel("Lista de pacientes:");

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					PantallaPrincipal pantPrincipal = new PantallaPrincipal();
					pantPrincipal.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public PantallaPrincipal() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		txtaListaPacientes = new JTextArea();
		txtaListaPacientes.setFont(new Font("Monospaced", Font.PLAIN, 11));
		txtaListaPacientes.setBounds(176, 44, 248, 180);
		contentPane.add(txtaListaPacientes);
		
		JButton btnRegistroPerros = new JButton("Registrar Perros");
		btnRegistroPerros.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent event) {
				// mostrar la ventana de registro
				PantallaRegistroPerro pantRegPerro = new PantallaRegistroPerro(miLogicaPrin);
				pantRegPerro.setVisible(true);
			}
		});
		btnRegistroPerros.setBounds(27, 43, 139, 23);
		contentPane.add(btnRegistroPerros);
		
		JButton btnRegistroGatos = new JButton("Registrar Gatos");
		btnRegistroGatos.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent event) {
				// mostrar la ventana de registro
				PantallaRegistroGato pantRegGato = new PantallaRegistroGato(miLogicaPrin);
				pantRegGato.setVisible(true); 
			}
		});
		btnRegistroGatos.setBounds(27, 92, 139, 23);
		contentPane.add(btnRegistroGatos);
		

		JButton btnRegistroSerpientes = new JButton("Registrar Serpientes");
		btnRegistroSerpientes.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				PantallaRegistroSerpiente pantRegSerpiente = new PantallaRegistroSerpiente(miLogicaPrin);
				pantRegSerpiente.setVisible(true); 
			}
		});
		btnRegistroSerpientes.setBounds(27, 137, 139, 23);
		contentPane.add(btnRegistroSerpientes);
		
		lblListaTitulo.setBounds(176, 19, 149, 14);
		
		contentPane.add(lblListaTitulo);
		
		JButton btnListarPacientes = new JButton("Listar Pacientes");
		btnListarPacientes.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// pedir a L�gica el listado del los pacientes y mostrarlo en pantalla
				txtaListaPacientes.setText(miLogicaPrin.listaPacientes());
			}
		});
		btnListarPacientes.setBounds(27, 188, 139, 23);
		contentPane.add(btnListarPacientes);
		
	}
}
