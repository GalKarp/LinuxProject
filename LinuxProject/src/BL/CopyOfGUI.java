package BL;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.SpringLayout;
import javax.swing.JPasswordField;
import javax.swing.JTextPane;
import javax.swing.JLabel;
import javax.swing.JTree;


public class CopyOfGUI extends JFrame {
	private JTextField txtEnterString;
	private JTextField txtEnterString_1;
	private JTextField textField;
	private JPasswordField passwordField;
	private JPasswordField passwordField_1;
	public CopyOfGUI() {
		SpringLayout springLayout = new SpringLayout();
		getContentPane().setLayout(springLayout);
		
		JPanel panel = new JPanel();
		springLayout.putConstraint(SpringLayout.NORTH, panel, 10, SpringLayout.NORTH, getContentPane());
		springLayout.putConstraint(SpringLayout.WEST, panel, 10, SpringLayout.WEST, getContentPane());
		springLayout.putConstraint(SpringLayout.SOUTH, panel, 52, SpringLayout.NORTH, getContentPane());
		springLayout.putConstraint(SpringLayout.EAST, panel, 341, SpringLayout.WEST, getContentPane());
		getContentPane().add(panel);
		panel.setLayout(new GridLayout(0, 3, 5, 0));
		
		JButton ls = new JButton("ls");
		panel.add(ls);
		
		JButton lsl = new JButton("ls -ls");
		panel.add(lsl);
		
		JButton lslt = new JButton("ls -lst");
		panel.add(lslt);
		
		JPanel panel_1 = new JPanel();
		springLayout.putConstraint(SpringLayout.NORTH, panel_1, 6, SpringLayout.SOUTH, panel);
		springLayout.putConstraint(SpringLayout.WEST, panel_1, 10, SpringLayout.WEST, getContentPane());
		springLayout.putConstraint(SpringLayout.SOUTH, panel_1, 48, SpringLayout.SOUTH, panel);
		springLayout.putConstraint(SpringLayout.EAST, panel_1, 0, SpringLayout.EAST, panel);
		getContentPane().add(panel_1);
		panel_1.setLayout(new GridLayout(0, 3, 5, 0));
		
		JButton move = new JButton("mv");
		panel_1.add(move);
		
		JComboBox mvFrom = new JComboBox();
		panel_1.add(mvFrom);
		
		JComboBox mvTo = new JComboBox();
		panel_1.add(mvTo);
		
		JPanel panel_2 = new JPanel();
		springLayout.putConstraint(SpringLayout.NORTH, panel_2, -112, SpringLayout.SOUTH, getContentPane());
		springLayout.putConstraint(SpringLayout.WEST, panel_2, 10, SpringLayout.WEST, getContentPane());
		springLayout.putConstraint(SpringLayout.SOUTH, panel_2, -10, SpringLayout.SOUTH, getContentPane());
		springLayout.putConstraint(SpringLayout.EAST, panel_2, 420, SpringLayout.WEST, getContentPane());
		getContentPane().add(panel_2);
		panel_2.setLayout(new GridLayout(2, 3, 5, 5));
		
		JButton find = new JButton("find");
		panel_2.add(find);
		
		txtEnterString = new JTextField();
		txtEnterString.setText("Enter String");
		panel_2.add(txtEnterString);
		txtEnterString.setColumns(10);
		
		JRadioButton rdbtnNewRadioButton = new JRadioButton("Directory");
		panel_2.add(rdbtnNewRadioButton);
		
		JButton grep = new JButton("grep");
		panel_2.add(grep);
		
		txtEnterString_1 = new JTextField();
		txtEnterString_1.setText("Enter String");
		panel_2.add(txtEnterString_1);
		txtEnterString_1.setColumns(10);
		
		JRadioButton rdbtnNewRadioButton_1 = new JRadioButton("Directory");
		panel_2.add(rdbtnNewRadioButton_1);
		
		JPanel panel_3 = new JPanel();
		springLayout.putConstraint(SpringLayout.NORTH, panel_3, -108, SpringLayout.NORTH, panel_2);
		springLayout.putConstraint(SpringLayout.WEST, panel_3, 10, SpringLayout.WEST, getContentPane());
		springLayout.putConstraint(SpringLayout.SOUTH, panel_3, -6, SpringLayout.NORTH, panel_2);
		springLayout.putConstraint(SpringLayout.EAST, panel_3, 0, SpringLayout.EAST, panel_2);
		getContentPane().add(panel_3);
		panel_3.setLayout(new GridLayout(2, 3, 5, 5));
		
		JButton addUser = new JButton("Add User");
		panel_3.add(addUser);
		
		textField = new JTextField();
		panel_3.add(textField);
		textField.setColumns(10);
		
		passwordField_1 = new JPasswordField();
		panel_3.add(passwordField_1);
		
		JButton btnNewButton_2 = new JButton("New button");
		panel_3.add(btnNewButton_2);
		
		JComboBox deleteUserCombo = new JComboBox();
		panel_3.add(deleteUserCombo);
		
		passwordField = new JPasswordField();
		getContentPane().add(passwordField);
		
		JPanel panel_4 = new JPanel();
		springLayout.putConstraint(SpringLayout.NORTH, panel_4, 6, SpringLayout.SOUTH, panel_1);
		springLayout.putConstraint(SpringLayout.WEST, panel_4, 10, SpringLayout.WEST, getContentPane());
		springLayout.putConstraint(SpringLayout.SOUTH, panel_4, 48, SpringLayout.SOUTH, panel_1);
		springLayout.putConstraint(SpringLayout.EAST, panel_4, 0, SpringLayout.EAST, panel);
		getContentPane().add(panel_4);
		panel_4.setLayout(new GridLayout(0, 2, 5, 0));
		
		JButton btnNewButton = new JButton("Show Process");
		panel_4.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Show System Info");
		panel_4.add(btnNewButton_1);
		
		JButton pwd = new JButton("pwd");
		springLayout.putConstraint(SpringLayout.NORTH, pwd, 10, SpringLayout.NORTH, getContentPane());
		springLayout.putConstraint(SpringLayout.WEST, pwd, 6, SpringLayout.EAST, panel);
		springLayout.putConstraint(SpringLayout.SOUTH, pwd, 0, SpringLayout.SOUTH, panel);
		springLayout.putConstraint(SpringLayout.EAST, pwd, 115, SpringLayout.EAST, panel);
		getContentPane().add(pwd);
		
		JTextPane textPane = new JTextPane();
		springLayout.putConstraint(SpringLayout.NORTH, textPane, 0, SpringLayout.NORTH, panel);
		springLayout.putConstraint(SpringLayout.WEST, textPane, 6, SpringLayout.EAST, pwd);
		springLayout.putConstraint(SpringLayout.SOUTH, textPane, 0, SpringLayout.SOUTH, panel);
		springLayout.putConstraint(SpringLayout.EAST, textPane, 531, SpringLayout.EAST, pwd);
		getContentPane().add(textPane);
		
		JLabel lblConsole = new JLabel("Console");
		springLayout.putConstraint(SpringLayout.NORTH, lblConsole, 0, SpringLayout.NORTH, panel_1);
		springLayout.putConstraint(SpringLayout.EAST, lblConsole, -233, SpringLayout.EAST, getContentPane());
		getContentPane().add(lblConsole);
		
		JTextPane textPane_1 = new JTextPane();
		springLayout.putConstraint(SpringLayout.NORTH, textPane_1, 8, SpringLayout.SOUTH, lblConsole);
		springLayout.putConstraint(SpringLayout.WEST, textPane_1, 0, SpringLayout.WEST, textPane);
		springLayout.putConstraint(SpringLayout.SOUTH, textPane_1, 149, SpringLayout.SOUTH, lblConsole);
		springLayout.putConstraint(SpringLayout.EAST, textPane_1, -10, SpringLayout.EAST, getContentPane());
		getContentPane().add(textPane_1);
		
		JTree tree = new JTree();
		springLayout.putConstraint(SpringLayout.NORTH, tree, 38, SpringLayout.SOUTH, textPane_1);
		springLayout.putConstraint(SpringLayout.WEST, tree, 0, SpringLayout.WEST, lblConsole);
		springLayout.putConstraint(SpringLayout.SOUTH, tree, -10, SpringLayout.SOUTH, getContentPane());
		springLayout.putConstraint(SpringLayout.EAST, tree, -10, SpringLayout.EAST, getContentPane());
		getContentPane().add(tree);
		
		JLabel lblFileView = new JLabel("File View");
		springLayout.putConstraint(SpringLayout.SOUTH, lblFileView, -6, SpringLayout.NORTH, tree);
		springLayout.putConstraint(SpringLayout.EAST, lblFileView, -114, SpringLayout.EAST, getContentPane());
		getContentPane().add(lblFileView);
	}
}
