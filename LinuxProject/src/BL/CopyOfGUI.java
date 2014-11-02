package BL;
import java.awt.SystemColor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JRadioButton;
import javax.swing.JSeparator;
import javax.swing.JTextField;
import javax.swing.JTextPane;
import javax.swing.JTree;
import javax.swing.SpringLayout;
import javax.swing.JPanel;
import java.awt.GridLayout;


public class CopyOfGUI extends JFrame {
	private JTextField txtEnterString;
	private JTextField txtEnterString_1;
	public CopyOfGUI() {
		SpringLayout springLayout = new SpringLayout();
		getContentPane().setLayout(springLayout);
		
		JPanel panel = new JPanel();
		springLayout.putConstraint(SpringLayout.NORTH, panel, 10, SpringLayout.NORTH, getContentPane());
		springLayout.putConstraint(SpringLayout.WEST, panel, 10, SpringLayout.WEST, getContentPane());
		springLayout.putConstraint(SpringLayout.SOUTH, panel, 52, SpringLayout.NORTH, getContentPane());
		springLayout.putConstraint(SpringLayout.EAST, panel, 341, SpringLayout.WEST, getContentPane());
		getContentPane().add(panel);
		panel.setLayout(new GridLayout(0, 3, 0, 0));
		
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
		panel_1.setLayout(new GridLayout(0, 3, 0, 0));
		
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
		panel_2.setLayout(new GridLayout(2, 3, 0, 0));
		
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
	}
}
