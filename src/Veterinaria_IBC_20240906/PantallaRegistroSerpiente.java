package Veterinaria_IBC_20240906;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

public class PantallaRegistroSerpiente extends JDialog {

	private static final long serialVersionUID = 1L;
	private final static boolean esModal = true;

	private JPanel vene;
	private JTextField txtEdad;
	private JTextField txtVenenosa;
	private JComboBox<Habitat> cbHabitat;
	private JComboBox<Tamanios> cbTamanio;
	
	private JLabel lblTitulo;
	private JLabel lblEspecie; 
	private JLabel lblNombreEspecie; 
	private JLabel lblVenenosa;
	private JLabel lblTamanio;
	private JLabel lblEdad;
	private JLabel lblHabitat;
	
	Logica miLogicaSerpiente;
	
	/**
	 * Create the frame.
	 */
	public PantallaRegistroSerpiente(Logica auxLogica) {
		miLogicaSerpiente = auxLogica;

//		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setModal(esModal);
		setBounds(100, 100, 450, 300);
		vene = new JPanel();
		vene.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(vene);
		vene.setLayout(null);
		
		txtEdad = new JTextField("0");
		txtEdad.setColumns(10);
		txtEdad.setBounds(165, 158, 96, 19);
		vene.add(txtEdad);
		
		txtVenenosa = new JTextField();
		txtVenenosa.setColumns(10);
		txtVenenosa.setBounds(165, 103, 96, 19);
		vene.add(txtVenenosa);
		
		cbHabitat = new JComboBox(Habitat.values());
		cbHabitat.setBounds(165, 187, 96, 19);
		vene.add(cbHabitat);
		
		lblTitulo = new JLabel("Registro de Serpientes");
		lblTitulo.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblTitulo.setBounds(75, 11, 244, 31);
		vene.add(lblTitulo);
		
		lblEspecie = new JLabel("Especie");
		lblEspecie.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblEspecie.setBounds(44, 74, 111, 16);
		vene.add(lblEspecie);

		lblNombreEspecie = new JLabel(Serpiente.getNombreEspecie());
		lblNombreEspecie.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 12));
		lblNombreEspecie.setBounds(165, 76, 96, 14);
		vene.add(lblNombreEspecie);
		
		lblVenenosa = new JLabel("Venenosa?");
		lblVenenosa.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblVenenosa.setBounds(44, 106, 111, 13);
		vene.add(lblVenenosa);
		
		lblTamanio = new JLabel("Tama\u00F1o");
		lblTamanio.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblTamanio.setBounds(44, 132, 111, 13);
		vene.add(lblTamanio);
		
		lblEdad = new JLabel("Edad");
		lblEdad.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblEdad.setBounds(44, 161, 111, 13);
		vene.add(lblEdad);
		
		lblHabitat = new JLabel("Habitat");
		lblHabitat.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblHabitat.setBounds(44, 190, 111, 13);
		vene.add(lblHabitat);
		
		cbTamanio = new JComboBox(Tamanios.values());
		cbTamanio.setBounds(165, 130, 96, 22);
		vene.add(cbTamanio);
		
		JButton btnRegistrar = new JButton("Registrar");
		btnRegistrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// tomar los datos ingresados
				String venenosa = txtVenenosa.getText();
				int edad = Integer.valueOf(txtEdad.getText());
				Habitat habitat = (Habitat) cbHabitat.getSelectedItem();
				Tamanios tamanio  = (Tamanios) cbTamanio.getSelectedItem();
				// registrar los datos
				miLogicaSerpiente.registrarSerpiente(edad,venenosa,tamanio, habitat);
			}
		});
		btnRegistrar.setBounds(299, 186, 89, 23);
		vene.add(btnRegistrar);
	}
}