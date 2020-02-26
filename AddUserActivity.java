import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JTextField;

public class AddUserActivity extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField_7;
	private JTextField textField_8;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AddUserActivity frame = new AddUserActivity();
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
	public AddUserActivity() {
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 350, 450);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblFirstName = new JLabel("First Name: ");
		lblFirstName.setBounds(31, 43, 58, 14);
		contentPane.add(lblFirstName);
		
		JLabel lblMiddleName = new JLabel("*Middle Name:");
		lblMiddleName.setBounds(31, 68, 77, 14);
		contentPane.add(lblMiddleName);
		
		JLabel lblLastName = new JLabel("Last Name: ");
		lblLastName.setBounds(31, 93, 58, 14);
		contentPane.add(lblLastName);
		
		JLabel lblAddress = new JLabel("Address");
		lblAddress.setBounds(31, 139, 58, 14);
		contentPane.add(lblAddress);
		
		JLabel lblCredentials = new JLabel("Credentials");
		lblCredentials.setBounds(31, 11, 58, 14);
		contentPane.add(lblCredentials);
		
		JLabel lblHouseNumber = new JLabel("House Number: ");
		lblHouseNumber.setBounds(31, 164, 77, 14);
		contentPane.add(lblHouseNumber);
		
		JLabel lblStreet = new JLabel("Street: ");
		lblStreet.setBounds(31, 189, 58, 14);
		contentPane.add(lblStreet);
		
		JLabel lblCity = new JLabel("City: ");
		lblCity.setBounds(31, 214, 58, 14);
		contentPane.add(lblCity);
		
		JLabel lblCounty = new JLabel("County: ");
		lblCounty.setBounds(31, 239, 58, 14);
		contentPane.add(lblCounty);
		
		JLabel lblLoginInformation = new JLabel("Login Information");
		lblLoginInformation.setBounds(31, 289, 92, 14);
		contentPane.add(lblLoginInformation);
		
		JLabel lblUserId = new JLabel("User ID");
		lblUserId.setBounds(31, 314, 58, 14);
		contentPane.add(lblUserId);
		
		JLabel lblPassword = new JLabel("Password");
		lblPassword.setBounds(31, 339, 58, 14);
		contentPane.add(lblPassword);
		
		textField = new JTextField();
		textField.setBounds(118, 40, 195, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(118, 65, 195, 20);
		contentPane.add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(118, 90, 195, 20);
		contentPane.add(textField_2);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(118, 161, 195, 20);
		contentPane.add(textField_3);
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBounds(118, 186, 195, 20);
		contentPane.add(textField_4);
		
		textField_5 = new JTextField();
		textField_5.setColumns(10);
		textField_5.setBounds(118, 211, 195, 20);
		contentPane.add(textField_5);
		
		textField_6 = new JTextField();
		textField_6.setColumns(10);
		textField_6.setBounds(118, 236, 195, 20);
		contentPane.add(textField_6);
		
		textField_7 = new JTextField();
		textField_7.setColumns(10);
		textField_7.setBounds(118, 314, 195, 20);
		contentPane.add(textField_7);
		
		textField_8 = new JTextField();
		textField_8.setColumns(10);
		textField_8.setBounds(118, 336, 195, 20);
		contentPane.add(textField_8);
		
		JButton btnRegisterPatron = new JButton("Register Patron");
		btnRegisterPatron.setBounds(31, 372, 117, 23);
		contentPane.add(btnRegisterPatron);
		
		JButton btnRegisterLibrarian = new JButton("Register Librarian");
		btnRegisterLibrarian.setBounds(196, 372, 117, 23);
		contentPane.add(btnRegisterLibrarian);
	}
}
