package Veterinaria_IBC_20240906;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JLabel;

import java.awt.Color;
import java.awt.Font;
import javax.swing.JComboBox;
import javax.swing.JDialog;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeEvent;

public class PantallaRegistroPerro extends JDialog{

	private static final long serialVersionUID = 1L;
	private final static boolean esModal = true;

	private JPanel contentPane;
	private JTextField txtEdad;
	private JTextField txtRaza;
	private JTextField txtNombre;
	private JComboBox<Tamanios> cbTamanio;
	
	private JLabel lblTitulo;
	private JLabel lblEspecie; 
	private JLabel lblNombreEspecie; 
	private JLabel lblRaza;
	private JLabel lblTamanio;
	private JLabel lblEdad;
	private JLabel lblNombre;
	
	Logica miLogicaPerro;
	
	/**
	 * Create the frame.
	 */
	public PantallaRegistroPerro(Logica auxLogica) {
		miLogicaPerro = auxLogica;

//		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setModal(esModal);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		txtEdad = new JTextField("0");
		txtEdad.setColumns(10);
		txtEdad.setBounds(165, 158, 96, 19);
		contentPane.add(txtEdad);
		
		txtRaza = new JTextField();
		txtRaza.setColumns(10);
		txtRaza.setBounds(165, 103, 96, 19);
		contentPane.add(txtRaza);
		
		txtNombre = new JTextField();
		txtNombre.setColumns(10);
		txtNombre.setBounds(165, 187, 96, 19);
		contentPane.add(txtNombre);
		
		lblTitulo = new JLabel("Registro de perros");
		lblTitulo.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblTitulo.setBounds(75, 11, 244, 31);
		contentPane.add(lblTitulo);
		
		lblEspecie = new JLabel("Especie");
		lblEspecie.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblEspecie.setBounds(44, 74, 111, 16);
		contentPane.add(lblEspecie);

		lblNombreEspecie = new JLabel(Perro.getNombreEspecie());
		lblNombreEspecie.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 12));
		lblNombreEspecie.setBounds(165, 76, 96, 14);
		contentPane.add(lblNombreEspecie);
		
		lblRaza = new JLabel("Raza");
		lblRaza.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblRaza.setBounds(44, 106, 111, 13);
		contentPane.add(lblRaza);
		
		lblTamanio = new JLabel("Tama\u00F1o");
		lblTamanio.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblTamanio.setBounds(44, 132, 111, 13);
		contentPane.add(lblTamanio);
		
		lblEdad = new JLabel("Edad");
		lblEdad.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblEdad.setBounds(44, 161, 111, 13);
		contentPane.add(lblEdad);
		
		lblNombre = new JLabel("Nombre");
		lblNombre.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNombre.setBounds(44, 190, 111, 13);
		contentPane.add(lblNombre);
		
		cbTamanio = new JComboBox(Tamanios.values());
		cbTamanio.setBounds(165, 130, 96, 22);
		contentPane.add(cbTamanio);
		
		JButton btnRegistrar = new JButton("Registrar");
		btnRegistrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// tomar los datos ingresados
				String raza = txtRaza.getText();
				int edad = Integer.valueOf(txtEdad.getText());
				String nombre = txtNombre.getText();
				Tamanios tamanio  = (Tamanios) cbTamanio.getSelectedItem();
				// registrar los datos
				miLogicaPerro.registrarPerro(raza,edad,nombre,tamanio);
			}
		});
		btnRegistrar.setBounds(299, 186, 89, 23);
		contentPane.add(btnRegistrar);
	}
	
}
