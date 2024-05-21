package views;

import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

import controllers.Auth;
import models.AuthModel;

public class AuthView 
{
	private JFrame frame;
	JPanel panel;
	JTextField textField_2, textField_3, textField, textField_1;
	JPasswordField passwordField_1, passwordField;
	private Auth controller;
	private AuthModel auth;
	
	public AuthView()
	{
		panel = new JPanel();
		panel.setLayout(null);
		frame = new JFrame();
		frame.setVisible(false);
		frame.setBounds(400, 100, 350, 535);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(new GridLayout(0, 1, 0, 0));
		
		auth = new AuthModel();
	}
	
	public void login()
	{
		JLabel lblNewLabel_3 = new JLabel("B i e n v e n i d o");
		lblNewLabel_3.setFont(new Font("Lucida Sans Unicode", Font.BOLD, 17));
		lblNewLabel_3.setBounds(20, -200, 340, 615);
		panel.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("Accede a tu cuenta ingresando lo siguiente");
		lblNewLabel_4.setForeground(new Color(128, 128, 128));
		lblNewLabel_4.setFont(new Font("Lucida Sans", Font.PLAIN, 13));
		lblNewLabel_4.setBounds(20, 120, 280, 20);
		panel.add(lblNewLabel_4);
		
		JLabel lblNewLabel_1_1_1 = new JLabel("Nombre de usuario");
		lblNewLabel_1_1_1.setFont(new Font("Tahoma", Font.PLAIN, 11));
		lblNewLabel_1_1_1.setBounds(25, 150, 100, 14);
		panel.add(lblNewLabel_1_1_1);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBorder(null);
		textField_2.setBounds(25, 165, 200, 25);
		panel.add(textField_2);
		
		JLabel lblNewLabel_1_1_1_1 = new JLabel("Contraseña");
		lblNewLabel_1_1_1_1.setFont(new Font("Tahoma", Font.PLAIN, 11));
		lblNewLabel_1_1_1_1.setBounds(25, 210, 100, 14);
		panel.add(lblNewLabel_1_1_1_1);
		
		textField_3 = new JTextField();
		textField_3.setBorder(null);
		textField_3.setBounds(25, 227, 200, 20);
		panel.add(textField_3);

		JButton btnNewButton = new JButton("Iniciar sesión");
		btnNewButton.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				boolean encontrado = auth.login(textField_2.getText(), textField_3.getText());
				
				if(encontrado)
				{
					System.out.println("Usuario encontrado");
				}
				else
				{
					System.out.println("Usuario no encontrado, registrese");
				}
			}});
		btnNewButton.setForeground(new Color(255, 255, 255));
		btnNewButton.setFont(new Font("Lucida Sans", Font.BOLD, 14));
		btnNewButton.setBounds(40, 265, 200, 35);
		btnNewButton.setBackground(Color.decode("#8E8BE1"));
		panel.add(btnNewButton);
		
		JButton lblNewLabel_1_1_1_1_1_1_1 = new JButton("¿No tienes cuenta? Registrate");
		lblNewLabel_1_1_1_1_1_1_1.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				controller = new Auth();
				frame.removeAll();
				frame.setVisible(false);
				controller.registro();	
			}
			
		});
		lblNewLabel_1_1_1_1_1_1_1.setBounds(30, 320, 250, 15);
		panel.add(lblNewLabel_1_1_1_1_1_1_1);
		
		frame.add(panel);
		frame.setVisible(true);
		frame.repaint();
		frame.revalidate();
	}
	
	public void registro()
	{
		JLabel lblNewLabel = new JLabel("R e g i s t r o", 0);
		lblNewLabel.setBounds(107, 20, 106, 20);
		lblNewLabel.setForeground(Color.black);
		lblNewLabel.setFont(new Font("Lucida Sans", Font.BOLD, 14));
		panel.add(lblNewLabel);

		JLabel lblRegistrateGratisLlenando = new JLabel("Llena los siguientes datos");
		lblRegistrateGratisLlenando.setBounds(33, 50, 252, 31);
		lblRegistrateGratisLlenando.setForeground(Color.black);
		lblRegistrateGratisLlenando.setFont(new Font("Lucida Sans", Font.PLAIN, 11));
		panel.add(lblRegistrateGratisLlenando);

		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(255, 255, 255));
		panel_1.setBounds(8, 95, 315, 460);
		panel.add(panel_1);
		panel_1.setLayout(null);

		textField = new JTextField();
		textField.setBounds(25, 40, 200, 22);
		textField.setBorder(null);
		panel_1.add(textField);
		textField.setColumns(10);

		JLabel lblNewLabel_1 = new JLabel("Nombre");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 11));
		lblNewLabel_1.setBounds(25, 25, 150, 14);
		panel_1.add(lblNewLabel_1);

		JLabel lblNewLabel_2 = new JLabel("------------------------------------------------------------------");
		lblNewLabel_2.setForeground(new Color(128, 128, 128));
		lblNewLabel_2.setBounds(25, 55, 270, 14);
		panel_1.add(lblNewLabel_2);

		JLabel lblNewLabel_1_1_1 = new JLabel("Correo electrónico");
		lblNewLabel_1_1_1.setFont(new Font("Tahoma", Font.PLAIN, 11));
		lblNewLabel_1_1_1.setBounds(25, 122, 100, 14);
		panel_1.add(lblNewLabel_1_1_1);

		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBorder(null);
		textField_2.setBounds(25, 138, 200, 22);
		panel_1.add(textField_2);

		JLabel lblNewLabel_2_1_1 = new JLabel("------------------------------------------------------------------");
		lblNewLabel_2_1_1.setForeground(Color.GRAY);
		lblNewLabel_2_1_1.setBounds(25, 155, 270, 14);
		panel_1.add(lblNewLabel_2_1_1);

		JLabel lblNewLabel_1_1_1_1 = new JLabel("Contraseña");
		lblNewLabel_1_1_1_1.setFont(new Font("Tahoma", Font.PLAIN, 11));
		lblNewLabel_1_1_1_1.setBounds(25, 175, 100, 14);
		panel_1.add(lblNewLabel_1_1_1_1);

		passwordField = new JPasswordField();
		passwordField.setBounds(25, 190, 200, 22);
		passwordField.setBorder(null);
		panel_1.add(passwordField);

		JLabel lblNewLabel_2_1_1_1 = new JLabel("------------------------------------------------------------------");
		lblNewLabel_2_1_1_1.setForeground(Color.GRAY);
		lblNewLabel_2_1_1_1.setBounds(25, 205, 270, 14);
		panel_1.add(lblNewLabel_2_1_1_1);

		JLabel lblNewLabel_1_1_1_1_1 = new JLabel("Confirmar contraseña");
		lblNewLabel_1_1_1_1_1.setFont(new Font("Tahoma", Font.PLAIN, 11));
		lblNewLabel_1_1_1_1_1.setBounds(25, 225, 150, 14);
		panel_1.add(lblNewLabel_1_1_1_1_1);

		passwordField_1 = new JPasswordField();
		passwordField_1.setBorder(null);
		passwordField_1.setBounds(25, 240, 200, 22);
		panel_1.add(passwordField_1);

		JLabel lblNewLabel_2_1_1_1_1 = new JLabel("------------------------------------------------------------------");
		lblNewLabel_2_1_1_1_1.setForeground(Color.GRAY);
		lblNewLabel_2_1_1_1_1.setBounds(25, 255, 270, 14);
		panel_1.add(lblNewLabel_2_1_1_1_1);

		JCheckBox chckbxNewCheckBox = new JCheckBox("Acepto los términos y condiciones");
		chckbxNewCheckBox.setFont(new Font("Tahoma", Font.PLAIN, 11));
		chckbxNewCheckBox.setBounds(25, 275, 200, 23);
		chckbxNewCheckBox.setOpaque(false);
		panel_1.add(chckbxNewCheckBox);

		JButton btnNewButton = new JButton("Registrarse");
		btnNewButton.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{		 
				 String nombre = textField.getText();
				 String apellido = textField_1.getText();
				 String correo = textField_2.getText();
				 String psw = new String(passwordField.getPassword());
				 String psw1 = new String(passwordField_1.getPassword());

				 if(nombre.length() <= 0 || apellido.length() <= 0)
				 {
					 JOptionPane.showMessageDialog(null, "Campos incompletos: (nombre o apellido)");

				 }				 

				 else if(correo.length() <= 0)
				 {
					 textField_2.setBorder(BorderFactory.createLineBorder(Color.red, 2));
					 JOptionPane.showMessageDialog(null, "Campos incompletos: correo", "Error", JOptionPane.WARNING_MESSAGE);

				 }

				 else if(!chckbxNewCheckBox.isSelected())
				{
					JOptionPane.showMessageDialog(null, "Acepte los términos para continuar", "Error", JOptionPane.WARNING_MESSAGE);
				}

				 else if(psw.equals(psw1))
				 {
					 JOptionPane.showMessageDialog(null, "Registro completo", "Sucess", JOptionPane.INFORMATION_MESSAGE);

				 }
				 else
				 {
					 JOptionPane.showMessageDialog(null, "Las contraseñas no coinciden", "Error", JOptionPane.WARNING_MESSAGE);

				 }

			}});



		btnNewButton.setForeground(new Color(255, 255, 255));
		btnNewButton.setFont(new Font("Lucida Sans", Font.BOLD, 14));
		btnNewButton.setBounds(60, 320, 200, 35);
		btnNewButton.setBackground(Color.decode("#8E8BE1"));
		panel_1.add(btnNewButton);

		JButton lblNewLabel_1_1_1_1_1_1_1 = new JButton("¿Ya tienes cuenta? Inicia sesión");
		lblNewLabel_1_1_1_1_1_1_1.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				controller = new Auth();
				frame.removeAll();
				frame.setVisible(false);
				controller.login();	
			}
			
		});
		lblNewLabel_1_1_1_1_1_1_1.setBounds(30, 460, 250, 15);
		panel.add(lblNewLabel_1_1_1_1_1_1_1);
		

		JLabel lblNewLabel_1_1 = new JLabel("Apellido");
		lblNewLabel_1_1.setFont(new Font("Tahoma", Font.PLAIN, 11));
		lblNewLabel_1_1.setBounds(25, 76, 150, 14);
		panel_1.add(lblNewLabel_1_1);

		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBorder(null);
		textField_1.setBounds(25, 90, 200, 22);
		panel_1.add(textField_1);
		
		JLabel lblNewLabel_2_1_1_1_1_2 = new JLabel("------------------------------------------------------------------");
		lblNewLabel_2_1_1_1_1_2.setForeground(Color.GRAY);
		lblNewLabel_2_1_1_1_1_2.setBounds(25, 105, 270, 14);
		panel_1.add(lblNewLabel_2_1_1_1_1_2);
		
		frame.add(panel);
		frame.setVisible(true);
		frame.repaint();
		frame.revalidate();

	}

}
