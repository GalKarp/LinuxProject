package BL;
import java.awt.SystemColor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JSeparator;
import javax.swing.JTextField;
import javax.swing.JTextPane;
import javax.swing.SpringLayout;
import javax.swing.JPanel;

import java.awt.GridLayout;

import javax.swing.JTextArea;
import javax.swing.DefaultComboBoxModel;

import java.awt.Font;

import javax.swing.JCheckBox;


@SuppressWarnings("serial")
public class GUI extends JFrame {
	private JTextField findTextField;
	private JTextField grepTextField;
	private JTextField txtEnterName;
	private LinuxCommand commands;
	private JPasswordField passwordField;
	private JTextField cdField;
	private JTextField cpTextField_1;
	private JTextField cpTextField_2;
	private JTextField lnTextField_1;
	private JTextField lnTextField_2;
	private JTextField lnsTextField_1;
	private JTextField lnsTextField_2;
	private JTextField moreTextField_1;
	private JTextField moreTextField_2;
	private JTextField sedTextField_1;
	private JTextField sedTextField_2;
	private JTextField sedTextField_3;
	private JTextField chmodTextField;
	private boolean addUserFlag = false;
	private JTextField recoveBackupTextField_1;
	private JTextField recoveBackupTextField_2;
	
	@SuppressWarnings({ "rawtypes", "unchecked" })
	public GUI() throws IOException, InterruptedException {
	    commands = new LinuxCommand();
		SpringLayout springLayout = new SpringLayout();
		getContentPane().setLayout(springLayout);
		
		JButton lsBtn = new JButton("Show\nFiles");
		lsBtn.setToolTipText("Show Files and Folsers of my current directory (ls)");
		springLayout.putConstraint(SpringLayout.NORTH, lsBtn, 10, SpringLayout.NORTH, getContentPane());
		springLayout.putConstraint(SpringLayout.WEST, lsBtn, 10, SpringLayout.WEST, getContentPane());
		getContentPane().add(lsBtn);

		
		JButton btnLsl = new JButton("Show\nFiles");
		btnLsl.setToolTipText("Show Files and Folders of my current directory sorted by alphabetical order. Show size of each file (ls -ls)");
		springLayout.putConstraint(SpringLayout.NORTH, btnLsl, 10, SpringLayout.NORTH, getContentPane());
		springLayout.putConstraint(SpringLayout.WEST, btnLsl, 6, SpringLayout.EAST, lsBtn);
//		springLayout.putConstraint(SpringLayout.EAST, btnLsl, 0, SpringLayout.EAST, btnShowSystemInfo);
		getContentPane().add(btnLsl);
		
		JButton btnLslst = new JButton("Show\nFiles");
		btnLslst.setToolTipText("Show Files and Folders of my current directory sorted by last modified order. Show size of each file (ls -lst)");
		springLayout.putConstraint(SpringLayout.NORTH, btnLslst, 10, SpringLayout.NORTH, getContentPane());
		springLayout.putConstraint(SpringLayout.WEST, btnLslst, 181, SpringLayout.WEST, getContentPane());
//		springLayout.putConstraint(SpringLayout.WEST, btnLslst, 6, SpringLayout.EAST, btnLsl);
		getContentPane().add(btnLslst);
		
		JButton findBtn = new JButton("Find");
		springLayout.putConstraint(SpringLayout.EAST, lsBtn, 0, SpringLayout.EAST, findBtn);
		springLayout.putConstraint(SpringLayout.NORTH, findBtn, 578, SpringLayout.NORTH, getContentPane());
		springLayout.putConstraint(SpringLayout.WEST, findBtn, 10, SpringLayout.WEST, getContentPane());
		getContentPane().add(findBtn);
		
		JButton grepBtn = new JButton("Grep");
		springLayout.putConstraint(SpringLayout.SOUTH, findBtn, -6, SpringLayout.NORTH, grepBtn);
		springLayout.putConstraint(SpringLayout.NORTH, grepBtn, 619, SpringLayout.NORTH, getContentPane());
		springLayout.putConstraint(SpringLayout.WEST, grepBtn, 10, SpringLayout.WEST, getContentPane());
		springLayout.putConstraint(SpringLayout.SOUTH, grepBtn, -10, SpringLayout.SOUTH, getContentPane());
		springLayout.putConstraint(SpringLayout.EAST, grepBtn, -1089, SpringLayout.EAST, getContentPane());

		getContentPane().add(grepBtn);
		
		findTextField = new JTextField();
		springLayout.putConstraint(SpringLayout.EAST, btnLslst, -16, SpringLayout.EAST, findTextField);
		springLayout.putConstraint(SpringLayout.WEST, findTextField, 91, SpringLayout.WEST, getContentPane());
		springLayout.putConstraint(SpringLayout.EAST, findBtn, -6, SpringLayout.WEST, findTextField);
		findTextField.setText("  Enter String");
		getContentPane().add(findTextField);
		findTextField.setColumns(10);
		
		grepTextField = new JTextField();
		springLayout.putConstraint(SpringLayout.SOUTH, findTextField, -6, SpringLayout.NORTH, grepTextField);
		grepTextField.setText("  Enter String");
		springLayout.putConstraint(SpringLayout.EAST, findTextField, 0, SpringLayout.EAST, grepTextField);
		springLayout.putConstraint(SpringLayout.NORTH, grepTextField, 0, SpringLayout.NORTH, grepBtn);
		springLayout.putConstraint(SpringLayout.WEST, grepTextField, 6, SpringLayout.EAST, grepBtn);
		springLayout.putConstraint(SpringLayout.SOUTH, grepTextField, 0, SpringLayout.SOUTH, grepBtn);
		springLayout.putConstraint(SpringLayout.EAST, grepTextField, -890, SpringLayout.EAST, getContentPane());
		getContentPane().add(grepTextField);
		grepTextField.setColumns(10);
		
		JButton btnAddUser = new JButton("Add user");
		springLayout.putConstraint(SpringLayout.WEST, btnAddUser, 0, SpringLayout.WEST, lsBtn);
		getContentPane().add(btnAddUser);
		
		txtEnterName = new JTextField();
		springLayout.putConstraint(SpringLayout.NORTH, txtEnterName, 0, SpringLayout.NORTH, btnAddUser);
		springLayout.putConstraint(SpringLayout.WEST, txtEnterName, 4, SpringLayout.EAST, btnAddUser);
		springLayout.putConstraint(SpringLayout.SOUTH, txtEnterName, 0, SpringLayout.SOUTH, btnAddUser);
		txtEnterName.setText("   Enter Name");
		getContentPane().add(txtEnterName);
		txtEnterName.setColumns(10);
		
		JButton btnRemoveUser = new JButton("Remove User");
		springLayout.putConstraint(SpringLayout.SOUTH, btnAddUser, -6, SpringLayout.NORTH, btnRemoveUser);
		springLayout.putConstraint(SpringLayout.NORTH, btnRemoveUser, 530, SpringLayout.NORTH, getContentPane());
		springLayout.putConstraint(SpringLayout.WEST, btnRemoveUser, 0, SpringLayout.WEST, lsBtn);
		getContentPane().add(btnRemoveUser);
		
		JComboBox comboBox = new JComboBox();
		springLayout.putConstraint(SpringLayout.NORTH, comboBox, 6, SpringLayout.SOUTH, txtEnterName);
		springLayout.putConstraint(SpringLayout.WEST, comboBox, 6, SpringLayout.EAST, btnRemoveUser);
		springLayout.putConstraint(SpringLayout.EAST, comboBox, -890, SpringLayout.EAST, getContentPane());
		getContentPane().add(comboBox);
		

		

		
		
		
		
		JSeparator separator = new JSeparator();
		springLayout.putConstraint(SpringLayout.SOUTH, comboBox, -6, SpringLayout.NORTH, separator);
		springLayout.putConstraint(SpringLayout.SOUTH, btnRemoveUser, -6, SpringLayout.NORTH, separator);
		springLayout.putConstraint(SpringLayout.NORTH, findTextField, 4, SpringLayout.SOUTH, separator);
		springLayout.putConstraint(SpringLayout.SOUTH, separator, -4, SpringLayout.NORTH, findBtn);
		springLayout.putConstraint(SpringLayout.NORTH, separator, 570, SpringLayout.NORTH, getContentPane());
		springLayout.putConstraint(SpringLayout.WEST, separator, 0, SpringLayout.WEST, getContentPane());
		getContentPane().add(separator);
		
		passwordField = new JPasswordField();
		springLayout.putConstraint(SpringLayout.EAST, txtEnterName, -5, SpringLayout.WEST, passwordField);
		springLayout.putConstraint(SpringLayout.NORTH, passwordField, 0, SpringLayout.NORTH, btnAddUser);
		springLayout.putConstraint(SpringLayout.SOUTH, passwordField, 0, SpringLayout.SOUTH, btnAddUser);
		springLayout.putConstraint(SpringLayout.WEST, passwordField, 281, SpringLayout.WEST, getContentPane());
		springLayout.putConstraint(SpringLayout.EAST, passwordField, -736, SpringLayout.EAST, getContentPane());
		passwordField.setToolTipText("Password");
		getContentPane().add(passwordField);
		
		JSeparator separator_1 = new JSeparator();
		springLayout.putConstraint(SpringLayout.NORTH, btnAddUser, 4, SpringLayout.SOUTH, separator_1);
		springLayout.putConstraint(SpringLayout.SOUTH, separator_1, -183, SpringLayout.SOUTH, getContentPane());
		springLayout.putConstraint(SpringLayout.WEST, separator_1, 0, SpringLayout.WEST, getContentPane());
		springLayout.putConstraint(SpringLayout.EAST, separator_1, 0, SpringLayout.EAST, separator);
		getContentPane().add(separator_1);
		
		JButton btnShowSystemInfo = new JButton("Show System Info");
		springLayout.putConstraint(SpringLayout.SOUTH, btnShowSystemInfo, -193, SpringLayout.SOUTH, getContentPane());
		springLayout.putConstraint(SpringLayout.NORTH, separator_1, 6, SpringLayout.SOUTH, btnShowSystemInfo);
		springLayout.putConstraint(SpringLayout.NORTH, btnShowSystemInfo, 434, SpringLayout.NORTH, getContentPane());
		springLayout.putConstraint(SpringLayout.WEST, btnShowSystemInfo, 10, SpringLayout.WEST, getContentPane());
		springLayout.putConstraint(SpringLayout.EAST, btnShowSystemInfo, -1003, SpringLayout.EAST, getContentPane());
		springLayout.putConstraint(SpringLayout.EAST, btnLsl, 0, SpringLayout.EAST, btnShowSystemInfo);
		getContentPane().add(btnShowSystemInfo);
		
		JButton btnShowProcess = new JButton("Show Process");
		springLayout.putConstraint(SpringLayout.WEST, btnShowProcess, 181, SpringLayout.WEST, getContentPane());
		springLayout.putConstraint(SpringLayout.EAST, btnShowProcess, -832, SpringLayout.EAST, getContentPane());
		springLayout.putConstraint(SpringLayout.NORTH, btnShowProcess, 0, SpringLayout.NORTH, btnShowSystemInfo);
		springLayout.putConstraint(SpringLayout.SOUTH, btnShowProcess, 39, SpringLayout.NORTH, btnShowSystemInfo);
		getContentPane().add(btnShowProcess);
		

		
		JButton btnMv = new JButton("Move\nFile");
		btnMv.setToolTipText("Move File (mv)");
		springLayout.putConstraint(SpringLayout.NORTH, btnMv, 52, SpringLayout.NORTH, getContentPane());
		springLayout.putConstraint(SpringLayout.WEST, btnMv, 10, SpringLayout.WEST, getContentPane());
		springLayout.putConstraint(SpringLayout.SOUTH, lsBtn, -6, SpringLayout.NORTH, btnMv);
		getContentPane().add(btnMv);
		
		JTextField mvTextField_1 = new JTextField();
		springLayout.putConstraint(SpringLayout.NORTH, mvTextField_1, 52, SpringLayout.NORTH, getContentPane());
		mvTextField_1.setText("File Original Location");
		springLayout.putConstraint(SpringLayout.WEST, mvTextField_1, 91, SpringLayout.WEST, getContentPane());
		springLayout.putConstraint(SpringLayout.EAST, btnMv, -6, SpringLayout.WEST, mvTextField_1);
		springLayout.putConstraint(SpringLayout.SOUTH, btnLslst, -6, SpringLayout.NORTH, mvTextField_1);
		springLayout.putConstraint(SpringLayout.SOUTH, btnLsl, -6, SpringLayout.NORTH, mvTextField_1);
		getContentPane().add(mvTextField_1);
		
		JTextField mvTextField_2 = new JTextField();
		mvTextField_2.setText("File Target Location");
		springLayout.putConstraint(SpringLayout.EAST, mvTextField_1, -11, SpringLayout.WEST, mvTextField_2);
		springLayout.putConstraint(SpringLayout.WEST, mvTextField_2, 346, SpringLayout.WEST, getContentPane());
		springLayout.putConstraint(SpringLayout.NORTH, mvTextField_2, 6, SpringLayout.SOUTH, btnLslst);
		springLayout.putConstraint(SpringLayout.SOUTH, mvTextField_2, 0, SpringLayout.SOUTH, btnMv);
		getContentPane().add(mvTextField_2);
		
		JButton btnPwd = new JButton("Current Location");
		btnPwd.setToolTipText("Show my current location (pwd)");
		springLayout.putConstraint(SpringLayout.NORTH, btnPwd, 0, SpringLayout.NORTH, lsBtn);
		springLayout.putConstraint(SpringLayout.SOUTH, btnPwd, 0, SpringLayout.SOUTH, lsBtn);
		btnPwd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		getContentPane().add(btnPwd);
		
		JTextPane txtpnCurrentLocation = new JTextPane();
		springLayout.putConstraint(SpringLayout.EAST, btnPwd, -19, SpringLayout.WEST, txtpnCurrentLocation);
		springLayout.putConstraint(SpringLayout.EAST, separator, 0, SpringLayout.EAST, txtpnCurrentLocation);
		txtpnCurrentLocation.setText("Current Location");
		springLayout.putConstraint(SpringLayout.WEST, txtpnCurrentLocation, 607, SpringLayout.WEST, getContentPane());
		springLayout.putConstraint(SpringLayout.EAST, txtpnCurrentLocation, -10, SpringLayout.EAST, getContentPane());
		springLayout.putConstraint(SpringLayout.NORTH, txtpnCurrentLocation, 10, SpringLayout.NORTH, getContentPane());
		getContentPane().add(txtpnCurrentLocation);
		
		JLabel lblNewLabel = new JLabel("              Console");
		springLayout.putConstraint(SpringLayout.EAST, mvTextField_2, -258, SpringLayout.WEST, lblNewLabel);
		springLayout.putConstraint(SpringLayout.NORTH, lblNewLabel, 52, SpringLayout.NORTH, getContentPane());
		springLayout.putConstraint(SpringLayout.SOUTH, lblNewLabel, -577, SpringLayout.SOUTH, getContentPane());
		springLayout.putConstraint(SpringLayout.SOUTH, txtpnCurrentLocation, -6, SpringLayout.NORTH, lblNewLabel);
		lblNewLabel.setBackground(SystemColor.activeCaption);
		springLayout.putConstraint(SpringLayout.WEST, lblNewLabel, -330, SpringLayout.EAST, getContentPane());
		springLayout.putConstraint(SpringLayout.EAST, lblNewLabel, -209, SpringLayout.EAST, getContentPane());
		getContentPane().add(lblNewLabel);
		setSize(1180, 693);
		setResizable(false);
		setVisible(true);
		
		commands.RemoveUser(comboBox);
		
		JPanel panel = new JPanel();
		springLayout.putConstraint(SpringLayout.NORTH, panel, 0, SpringLayout.SOUTH, lblNewLabel);
		springLayout.putConstraint(SpringLayout.WEST, panel, -571, SpringLayout.EAST, getContentPane());
		springLayout.putConstraint(SpringLayout.EAST, panel, -10, SpringLayout.EAST, getContentPane());
		getContentPane().add(panel);
		panel.setLayout(new GridLayout(0, 1, 0, 0));
		
		JScrollPane scrollPane = new JScrollPane();
		panel.add(scrollPane);
		
		JTextArea textArea = new JTextArea();
		commands.setArea(textArea);
		scrollPane.setViewportView(textArea);
		
		JButton cdBtn = new JButton("Go To");
		cdBtn.setToolTipText("Insert a file name or a path (cd)");
		springLayout.putConstraint(SpringLayout.WEST, cdBtn, 0, SpringLayout.WEST, lsBtn);
		springLayout.putConstraint(SpringLayout.SOUTH, cdBtn, -368, SpringLayout.SOUTH, getContentPane());
		springLayout.putConstraint(SpringLayout.EAST, cdBtn, 0, SpringLayout.EAST, lsBtn);
		getContentPane().add(cdBtn);
		
		cdField = new JTextField();
		cdField.setText("Where You Want To Go");
		springLayout.putConstraint(SpringLayout.NORTH, cdField, 262, SpringLayout.NORTH, getContentPane());
		springLayout.putConstraint(SpringLayout.WEST, cdField, 0, SpringLayout.WEST, btnLsl);
		springLayout.putConstraint(SpringLayout.SOUTH, cdField, 0, SpringLayout.SOUTH, cdBtn);
		springLayout.putConstraint(SpringLayout.EAST, cdField, 0, SpringLayout.EAST, mvTextField_2);
		getContentPane().add(cdField);
		cdField.setColumns(10);
		
		JButton btnCp = new JButton("Copy\nFile");
		btnCp.setToolTipText("Copy File (cp)");
		springLayout.putConstraint(SpringLayout.NORTH, btnCp, 94, SpringLayout.NORTH, getContentPane());
		springLayout.putConstraint(SpringLayout.SOUTH, btnMv, -6, SpringLayout.NORTH, btnCp);
		springLayout.putConstraint(SpringLayout.SOUTH, btnCp, -536, SpringLayout.SOUTH, getContentPane());
		springLayout.putConstraint(SpringLayout.WEST, btnCp, 10, SpringLayout.WEST, getContentPane());
		springLayout.putConstraint(SpringLayout.EAST, btnCp, 75, SpringLayout.WEST, lsBtn);
		getContentPane().add(btnCp);
		
		cpTextField_1 = new JTextField();
		springLayout.putConstraint(SpringLayout.NORTH, cpTextField_1, 94, SpringLayout.NORTH, getContentPane());
		springLayout.putConstraint(SpringLayout.SOUTH, mvTextField_1, -6, SpringLayout.NORTH, cpTextField_1);
		springLayout.putConstraint(SpringLayout.SOUTH, cpTextField_1, -536, SpringLayout.SOUTH, getContentPane());
		springLayout.putConstraint(SpringLayout.WEST, cpTextField_1, 0, SpringLayout.WEST, btnLsl);
		springLayout.putConstraint(SpringLayout.EAST, cpTextField_1, 0, SpringLayout.EAST, mvTextField_1);
		cpTextField_1.setText("File Original Location");
		getContentPane().add(cpTextField_1);
		
		cpTextField_2 = new JTextField();
		springLayout.putConstraint(SpringLayout.NORTH, cpTextField_2, 6, SpringLayout.SOUTH, mvTextField_2);
		springLayout.putConstraint(SpringLayout.WEST, cpTextField_2, 0, SpringLayout.WEST, mvTextField_2);
		springLayout.putConstraint(SpringLayout.EAST, cpTextField_2, 0, SpringLayout.EAST, mvTextField_2);
		cpTextField_2.setText("File Target Location");
		getContentPane().add(cpTextField_2);
		
		JButton btnLn = new JButton("Link\nFile");
		btnLn.setToolTipText("Make Hard Link (ln)");
		springLayout.putConstraint(SpringLayout.NORTH, btnLn, 6, SpringLayout.SOUTH, btnCp);
		springLayout.putConstraint(SpringLayout.SOUTH, btnLn, -494, SpringLayout.SOUTH, getContentPane());
		springLayout.putConstraint(SpringLayout.WEST, btnLn, 0, SpringLayout.WEST, lsBtn);
		springLayout.putConstraint(SpringLayout.EAST, btnLn, 0, SpringLayout.EAST, lsBtn);
		getContentPane().add(btnLn);
		
		lnTextField_1 = new JTextField();
		lnTextField_1.setText("Original File");
		springLayout.putConstraint(SpringLayout.NORTH, lnTextField_1, 6, SpringLayout.SOUTH, cpTextField_1);
		springLayout.putConstraint(SpringLayout.WEST, lnTextField_1, 0, SpringLayout.WEST, btnLsl);
		springLayout.putConstraint(SpringLayout.SOUTH, lnTextField_1, 0, SpringLayout.SOUTH, btnLn);
		springLayout.putConstraint(SpringLayout.EAST, lnTextField_1, 0, SpringLayout.EAST, mvTextField_1);
		getContentPane().add(lnTextField_1);
		
		lnTextField_2 = new JTextField();
		springLayout.putConstraint(SpringLayout.NORTH, lnTextField_2, 136, SpringLayout.NORTH, getContentPane());
		springLayout.putConstraint(SpringLayout.SOUTH, cpTextField_2, -6, SpringLayout.NORTH, lnTextField_2);
		springLayout.putConstraint(SpringLayout.WEST, lnTextField_2, 0, SpringLayout.WEST, mvTextField_2);
		springLayout.putConstraint(SpringLayout.SOUTH, lnTextField_2, 0, SpringLayout.SOUTH, btnLn);
		springLayout.putConstraint(SpringLayout.EAST, lnTextField_2, 0, SpringLayout.EAST, mvTextField_2);
		lnTextField_2.setText("New Link Location");
		getContentPane().add(lnTextField_2);
		
		JButton btnLns = new JButton("SymLink\nFile");
		btnLns.setToolTipText("Make Symbolic Link (ln -s)");
		springLayout.putConstraint(SpringLayout.NORTH, btnLns, 6, SpringLayout.SOUTH, btnLn);
		springLayout.putConstraint(SpringLayout.WEST, btnLns, 0, SpringLayout.WEST, lsBtn);
		springLayout.putConstraint(SpringLayout.SOUTH, btnLns, -453, SpringLayout.SOUTH, getContentPane());
		springLayout.putConstraint(SpringLayout.EAST, btnLns, 0, SpringLayout.EAST, lsBtn);
		getContentPane().add(btnLns);
		
		lnsTextField_1 = new JTextField();
		springLayout.putConstraint(SpringLayout.SOUTH, lnsTextField_1, -453, SpringLayout.SOUTH, getContentPane());
		springLayout.putConstraint(SpringLayout.NORTH, lnsTextField_1, 6, SpringLayout.SOUTH, lnTextField_1);
		springLayout.putConstraint(SpringLayout.WEST, lnsTextField_1, 0, SpringLayout.WEST, btnLsl);
		springLayout.putConstraint(SpringLayout.EAST, lnsTextField_1, 0, SpringLayout.EAST, mvTextField_1);
		lnsTextField_1.setText("Original File");
		getContentPane().add(lnsTextField_1);
		
		lnsTextField_2 = new JTextField();
		springLayout.putConstraint(SpringLayout.NORTH, lnsTextField_2, 6, SpringLayout.SOUTH, lnTextField_2);
		springLayout.putConstraint(SpringLayout.WEST, lnsTextField_2, 0, SpringLayout.WEST, mvTextField_2);
		springLayout.putConstraint(SpringLayout.SOUTH, lnsTextField_2, 0, SpringLayout.SOUTH, btnLns);
		springLayout.putConstraint(SpringLayout.EAST, lnsTextField_2, 0, SpringLayout.EAST, mvTextField_2);
		lnsTextField_2.setText("New Link Location");
		getContentPane().add(lnsTextField_2);
		
		JButton moreBtn = new JButton("Read text");
		moreBtn.setToolTipText("Show text from file (more)");
		springLayout.putConstraint(SpringLayout.NORTH, cdBtn, 6, SpringLayout.SOUTH, moreBtn);
		springLayout.putConstraint(SpringLayout.SOUTH, moreBtn, -410, SpringLayout.SOUTH, getContentPane());
		springLayout.putConstraint(SpringLayout.NORTH, moreBtn, 6, SpringLayout.SOUTH, btnLns);
		springLayout.putConstraint(SpringLayout.WEST, moreBtn, 0, SpringLayout.WEST, lsBtn);
		springLayout.putConstraint(SpringLayout.EAST, moreBtn, 0, SpringLayout.EAST, lsBtn);
		getContentPane().add(moreBtn);
		
		moreTextField_1 = new JTextField();
		springLayout.putConstraint(SpringLayout.NORTH, moreTextField_1, 6, SpringLayout.SOUTH, lnsTextField_1);
		springLayout.putConstraint(SpringLayout.WEST, moreTextField_1, 0, SpringLayout.WEST, btnLsl);
		springLayout.putConstraint(SpringLayout.SOUTH, moreTextField_1, -6, SpringLayout.NORTH, cdField);
		springLayout.putConstraint(SpringLayout.EAST, moreTextField_1, 0, SpringLayout.EAST, mvTextField_1);
		moreTextField_1.setText("File Location");
		getContentPane().add(moreTextField_1);
		
		moreTextField_2 = new JTextField();
		springLayout.putConstraint(SpringLayout.NORTH, moreTextField_2, 6, SpringLayout.SOUTH, lnsTextField_2);
		springLayout.putConstraint(SpringLayout.WEST, moreTextField_2, 0, SpringLayout.WEST, mvTextField_2);
		springLayout.putConstraint(SpringLayout.SOUTH, moreTextField_2, -6, SpringLayout.NORTH, cdField);
		springLayout.putConstraint(SpringLayout.EAST, moreTextField_2, 0, SpringLayout.EAST, mvTextField_2);
		moreTextField_2.setText("Wanted Number Of Lines");
		getContentPane().add(moreTextField_2);
		
		JButton setDateBtn = new JButton("Set Date");
		springLayout.putConstraint(SpringLayout.NORTH, setDateBtn, 345, SpringLayout.NORTH, getContentPane());
		springLayout.putConstraint(SpringLayout.WEST, setDateBtn, 0, SpringLayout.WEST, lsBtn);
		springLayout.putConstraint(SpringLayout.EAST, setDateBtn, 0, SpringLayout.EAST, btnAddUser);
		getContentPane().add(setDateBtn);
		
		JButton dateBtn = new JButton("date");
		springLayout.putConstraint(SpringLayout.NORTH, dateBtn, 0, SpringLayout.NORTH, lsBtn);
		springLayout.putConstraint(SpringLayout.WEST, dateBtn, 4, SpringLayout.EAST, btnLslst);
		springLayout.putConstraint(SpringLayout.SOUTH, dateBtn, 0, SpringLayout.SOUTH, lsBtn);
		springLayout.putConstraint(SpringLayout.EAST, dateBtn, 88, SpringLayout.EAST, btnLslst);
		getContentPane().add(dateBtn);
		
		JButton sedBtn = new JButton("Edit\nFile");
		sedBtn.setToolTipText("Edit file without openning it");
		springLayout.putConstraint(SpringLayout.SOUTH, setDateBtn, -6, SpringLayout.NORTH, sedBtn);
		springLayout.putConstraint(SpringLayout.SOUTH, panel, -5, SpringLayout.SOUTH, sedBtn);
		springLayout.putConstraint(SpringLayout.NORTH, sedBtn, 389, SpringLayout.NORTH, getContentPane());
		springLayout.putConstraint(SpringLayout.SOUTH, sedBtn, -238, SpringLayout.SOUTH, getContentPane());
		springLayout.putConstraint(SpringLayout.WEST, sedBtn, 0, SpringLayout.WEST, lsBtn);
		springLayout.putConstraint(SpringLayout.EAST, sedBtn, 75, SpringLayout.WEST, lsBtn);
		getContentPane().add(sedBtn);
		
		sedTextField_1 = new JTextField();
		springLayout.putConstraint(SpringLayout.NORTH, sedTextField_1, 6, SpringLayout.SOUTH, setDateBtn);
		springLayout.putConstraint(SpringLayout.WEST, sedTextField_1, 0, SpringLayout.WEST, btnLsl);
		springLayout.putConstraint(SpringLayout.SOUTH, sedTextField_1, -9, SpringLayout.NORTH, btnShowSystemInfo);
		springLayout.putConstraint(SpringLayout.EAST, sedTextField_1, -118, SpringLayout.EAST, mvTextField_1);
		sedTextField_1.setText("String To Replace");
		getContentPane().add(sedTextField_1);
		
		sedTextField_2 = new JTextField();
		springLayout.putConstraint(SpringLayout.WEST, sedTextField_2, 6, SpringLayout.EAST, sedTextField_1);
		springLayout.putConstraint(SpringLayout.SOUTH, sedTextField_2, -9, SpringLayout.NORTH, btnShowProcess);
		springLayout.putConstraint(SpringLayout.EAST, sedTextField_2, 118, SpringLayout.EAST, sedTextField_1);
		sedTextField_2.setText("New String");
		getContentPane().add(sedTextField_2);
		
		sedTextField_3 = new JTextField();
		springLayout.putConstraint(SpringLayout.WEST, sedTextField_3, 6, SpringLayout.EAST, sedTextField_2);
		springLayout.putConstraint(SpringLayout.SOUTH, sedTextField_3, -12, SpringLayout.NORTH, btnShowProcess);
		springLayout.putConstraint(SpringLayout.EAST, sedTextField_3, 0, SpringLayout.EAST, mvTextField_2);
		sedTextField_3.setText("File Path");
		getContentPane().add(sedTextField_3);
		
		JButton chmodBtn = new JButton("Change Permission");
		chmodBtn.setToolTipText("Change Permission Mode (chmod)");
		springLayout.putConstraint(SpringLayout.NORTH, chmodBtn, 6, SpringLayout.SOUTH, cdBtn);
		springLayout.putConstraint(SpringLayout.WEST, chmodBtn, 10, SpringLayout.WEST, getContentPane());
		springLayout.putConstraint(SpringLayout.SOUTH, chmodBtn, -139, SpringLayout.NORTH, separator_1);
		springLayout.putConstraint(SpringLayout.EAST, chmodBtn, -457, SpringLayout.WEST, panel);
		getContentPane().add(chmodBtn);
		
		chmodTextField = new JTextField();
		springLayout.putConstraint(SpringLayout.NORTH, chmodTextField, 1, SpringLayout.NORTH, chmodBtn);
		springLayout.putConstraint(SpringLayout.WEST, chmodTextField, -186, SpringLayout.EAST, btnShowProcess);
		springLayout.putConstraint(SpringLayout.SOUTH, chmodTextField, -138, SpringLayout.NORTH, separator_1);
		chmodTextField.setText("File Location");
		chmodTextField.setColumns(10);
		getContentPane().add(chmodTextField);
		
		JComboBox dateComboBox_1 = new JComboBox();
		springLayout.putConstraint(SpringLayout.NORTH, dateComboBox_1, 57, SpringLayout.SOUTH, cdField);
		springLayout.putConstraint(SpringLayout.SOUTH, dateComboBox_1, -6, SpringLayout.NORTH, sedTextField_1);
		springLayout.putConstraint(SpringLayout.NORTH, sedTextField_2, 6, SpringLayout.SOUTH, dateComboBox_1);
		dateComboBox_1.setModel(new DefaultComboBoxModel(new String[] {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31"}));
		getContentPane().add(dateComboBox_1);
		
		JLabel setDateLbl_2 = new JLabel("(dd/mm/yy):");
		springLayout.putConstraint(SpringLayout.WEST, dateComboBox_1, 0, SpringLayout.EAST, setDateLbl_2);
		springLayout.putConstraint(SpringLayout.EAST, setDateLbl_2, -1008, SpringLayout.EAST, getContentPane());
		setDateLbl_2.setFont(new Font("Dialog", Font.BOLD, 9));
		springLayout.putConstraint(SpringLayout.NORTH, setDateLbl_2, 23, SpringLayout.NORTH, setDateBtn);
		springLayout.putConstraint(SpringLayout.WEST, setDateLbl_2, 3, SpringLayout.EAST, setDateBtn);
		springLayout.putConstraint(SpringLayout.SOUTH, setDateLbl_2, 0, SpringLayout.SOUTH, setDateBtn);
		getContentPane().add(setDateLbl_2);
		
		JComboBox dateComboBox_2 = new JComboBox();
		springLayout.putConstraint(SpringLayout.EAST, dateComboBox_1, -8, SpringLayout.WEST, dateComboBox_2);
		springLayout.putConstraint(SpringLayout.NORTH, dateComboBox_2, 0, SpringLayout.NORTH, dateComboBox_1);
		springLayout.putConstraint(SpringLayout.WEST, dateComboBox_2, 233, SpringLayout.WEST, getContentPane());
		springLayout.putConstraint(SpringLayout.SOUTH, dateComboBox_2, 0, SpringLayout.SOUTH, setDateBtn);
		springLayout.putConstraint(SpringLayout.EAST, dateComboBox_2, 0, SpringLayout.EAST, findTextField);
		dateComboBox_2.setModel(new DefaultComboBoxModel(new String[] {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12"}));
		getContentPane().add(dateComboBox_2);
		
		JComboBox dateComboBox_3 = new JComboBox();
		springLayout.putConstraint(SpringLayout.NORTH, dateComboBox_3, 57, SpringLayout.SOUTH, cdField);
		springLayout.putConstraint(SpringLayout.SOUTH, dateComboBox_3, -6, SpringLayout.NORTH, sedTextField_2);
		springLayout.putConstraint(SpringLayout.NORTH, sedTextField_3, 6, SpringLayout.SOUTH, dateComboBox_3);
		springLayout.putConstraint(SpringLayout.WEST, dateComboBox_3, 291, SpringLayout.WEST, getContentPane());
		springLayout.putConstraint(SpringLayout.EAST, dateComboBox_3, 0, SpringLayout.EAST, btnShowProcess);
		dateComboBox_3.setModel(new DefaultComboBoxModel(new String[] {"88", "89", "90", "91", "92", "93", "94", "95", "96", "97", "98", "99", "00", "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20"}));
		getContentPane().add(dateComboBox_3);
		
		JLabel setDateLbl_1 = new JLabel("Date");
		springLayout.putConstraint(SpringLayout.WEST, setDateLbl_1, 0, SpringLayout.WEST, txtEnterName);
		springLayout.putConstraint(SpringLayout.SOUTH, setDateLbl_1, -6, SpringLayout.NORTH, setDateLbl_2);
		getContentPane().add(setDateLbl_1);
		
		JLabel setTimeLbl_1 = new JLabel("Time");
		springLayout.putConstraint(SpringLayout.WEST, setTimeLbl_1, 359, SpringLayout.WEST, getContentPane());
		springLayout.putConstraint(SpringLayout.SOUTH, setTimeLbl_1, 0, SpringLayout.SOUTH, setDateLbl_1);
		getContentPane().add(setTimeLbl_1);
		
		JLabel setTimeLbl_2 = new JLabel("(hh/mm/ss):");
		springLayout.putConstraint(SpringLayout.EAST, chmodTextField, 0, SpringLayout.EAST, setTimeLbl_2);
		setTimeLbl_2.setFont(new Font("Dialog", Font.BOLD, 9));
		springLayout.putConstraint(SpringLayout.WEST, setTimeLbl_2, 0, SpringLayout.WEST, mvTextField_2);
		springLayout.putConstraint(SpringLayout.SOUTH, setTimeLbl_2, 0, SpringLayout.SOUTH, setDateBtn);
		getContentPane().add(setTimeLbl_2);
		
		JComboBox timeComboBox_1 = new JComboBox();
		springLayout.putConstraint(SpringLayout.NORTH, timeComboBox_1, 57, SpringLayout.SOUTH, cdField);
		springLayout.putConstraint(SpringLayout.WEST, timeComboBox_1, 6, SpringLayout.EAST, setTimeLbl_2);
		springLayout.putConstraint(SpringLayout.SOUTH, timeComboBox_1, -6, SpringLayout.NORTH, sedTextField_3);
		springLayout.putConstraint(SpringLayout.EAST, timeComboBox_1, -713, SpringLayout.EAST, getContentPane());
		timeComboBox_1.setModel(new DefaultComboBoxModel(new String[] {"00", "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23"}));
		getContentPane().add(timeComboBox_1);
		
		JComboBox timeComboBox_2 = new JComboBox();
		springLayout.putConstraint(SpringLayout.NORTH, timeComboBox_2, 57, SpringLayout.SOUTH, cdField);
		springLayout.putConstraint(SpringLayout.WEST, timeComboBox_2, 6, SpringLayout.EAST, timeComboBox_1);
		springLayout.putConstraint(SpringLayout.SOUTH, timeComboBox_2, 0, SpringLayout.SOUTH, setDateBtn);
		springLayout.putConstraint(SpringLayout.EAST, timeComboBox_2, -652, SpringLayout.EAST, getContentPane());
		timeComboBox_2.setModel(new DefaultComboBoxModel(new String[] {"00", "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31", "32", "33", "34", "35", "36", "37", "38", "39", "40", "41", "42", "43", "44", "45", "46", "47", "48", "49", "50", "51", "52", "53", "54", "55", "56", "57", "58", "59"}));
		getContentPane().add(timeComboBox_2);
		
		JComboBox timeComboBox_3 = new JComboBox();
		springLayout.putConstraint(SpringLayout.NORTH, timeComboBox_3, 57, SpringLayout.SOUTH, cdField);
		springLayout.putConstraint(SpringLayout.WEST, timeComboBox_3, 6, SpringLayout.EAST, timeComboBox_2);
		springLayout.putConstraint(SpringLayout.SOUTH, timeComboBox_3, 0, SpringLayout.SOUTH, setDateBtn);
		springLayout.putConstraint(SpringLayout.EAST, timeComboBox_3, -20, SpringLayout.WEST, panel);
		timeComboBox_3.setModel(new DefaultComboBoxModel(new String[] {"00", "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31", "32", "33", "34", "35", "36", "37", "38", "39", "40", "41", "42", "43", "44", "45", "46", "47", "48", "49", "50", "51", "52", "53", "54", "55", "56", "57", "58", "59"}));
		getContentPane().add(timeComboBox_3);
		
		JRadioButton rdbtnUser = new JRadioButton("User");
		springLayout.putConstraint(SpringLayout.SOUTH, rdbtnUser, -6, SpringLayout.NORTH, timeComboBox_1);
		springLayout.putConstraint(SpringLayout.EAST, rdbtnUser, -700, SpringLayout.EAST, getContentPane());
		getContentPane().add(rdbtnUser);
		
		JRadioButton rdbtnAdmin = new JRadioButton("Admin");
		springLayout.putConstraint(SpringLayout.NORTH, rdbtnAdmin, 0, SpringLayout.NORTH, rdbtnUser);
		springLayout.putConstraint(SpringLayout.WEST, rdbtnAdmin, 5, SpringLayout.EAST, rdbtnUser);
		getContentPane().add(rdbtnAdmin);
		
		JLabel lblPermission = new JLabel("Permission");
		springLayout.putConstraint(SpringLayout.WEST, btnPwd, 0, SpringLayout.WEST, lblPermission);
		springLayout.putConstraint(SpringLayout.NORTH, lblPermission, 6, SpringLayout.SOUTH, cdField);
		springLayout.putConstraint(SpringLayout.EAST, lblPermission, 0, SpringLayout.EAST, timeComboBox_2);
		getContentPane().add(lblPermission);
		
		JButton backupBtn = new JButton("Backup");
		springLayout.putConstraint(SpringLayout.NORTH, backupBtn, 0, SpringLayout.NORTH, btnShowSystemInfo);
		springLayout.putConstraint(SpringLayout.WEST, backupBtn, 0, SpringLayout.WEST, txtpnCurrentLocation);
		springLayout.putConstraint(SpringLayout.SOUTH, backupBtn, -6, SpringLayout.NORTH, separator_1);
		springLayout.putConstraint(SpringLayout.EAST, backupBtn, 91, SpringLayout.WEST, txtpnCurrentLocation);
		getContentPane().add(backupBtn);
		
		JButton recoveryBtn = new JButton("Recover");
		springLayout.putConstraint(SpringLayout.NORTH, recoveryBtn, 0, SpringLayout.NORTH, btnShowSystemInfo);
		springLayout.putConstraint(SpringLayout.WEST, recoveryBtn, -91, SpringLayout.EAST, separator);
		springLayout.putConstraint(SpringLayout.SOUTH, recoveryBtn, -6, SpringLayout.NORTH, separator_1);
		springLayout.putConstraint(SpringLayout.EAST, recoveryBtn, 0, SpringLayout.EAST, separator);
		getContentPane().add(recoveryBtn);
		
		recoveBackupTextField_1 = new JTextField();
		springLayout.putConstraint(SpringLayout.NORTH, recoveBackupTextField_1, 0, SpringLayout.NORTH, btnShowSystemInfo);
		springLayout.putConstraint(SpringLayout.WEST, recoveBackupTextField_1, 6, SpringLayout.EAST, backupBtn);
		springLayout.putConstraint(SpringLayout.SOUTH, recoveBackupTextField_1, -6, SpringLayout.NORTH, separator_1);
		springLayout.putConstraint(SpringLayout.EAST, recoveBackupTextField_1, -193, SpringLayout.WEST, recoveryBtn);
		recoveBackupTextField_1.setText("File Original Location");
		getContentPane().add(recoveBackupTextField_1);
		
		ButtonGroup group = new ButtonGroup();
		group.add(rdbtnUser);
		group.add(rdbtnAdmin);
		rdbtnUser.setSelected(true);
		rdbtnUser.setActionCommand("User");
		rdbtnAdmin.setActionCommand("Admin");
		
		recoveBackupTextField_2 = new JTextField();
		springLayout.putConstraint(SpringLayout.NORTH, recoveBackupTextField_2, 0, SpringLayout.NORTH, btnShowSystemInfo);
		springLayout.putConstraint(SpringLayout.WEST, recoveBackupTextField_2, 6, SpringLayout.EAST, recoveBackupTextField_1);
		springLayout.putConstraint(SpringLayout.SOUTH, recoveBackupTextField_2, -6, SpringLayout.NORTH, separator_1);
		springLayout.putConstraint(SpringLayout.EAST, recoveBackupTextField_2, -5, SpringLayout.WEST, recoveryBtn);
		recoveBackupTextField_2.setText("File Target Location");
		getContentPane().add(recoveBackupTextField_2);
		
		JCheckBox chckbxDirectoryOnly = new JCheckBox("Directory only");
		springLayout.putConstraint(SpringLayout.NORTH, chckbxDirectoryOnly, 6, SpringLayout.NORTH, findBtn);
		springLayout.putConstraint(SpringLayout.WEST, chckbxDirectoryOnly, 6, SpringLayout.EAST, findTextField);
		getContentPane().add(chckbxDirectoryOnly);

		btnShowProcess.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				commands.seeProcess();

			}
		});
		btnShowSystemInfo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				commands.sysInfo();

			}
		});
		grepBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try {
					commands.grepString(grepTextField);
				} catch (IOException e) {
					e.printStackTrace();
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		});
		btnPwd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				commands.pwdCommand(txtpnCurrentLocation);
			}
		});
		lsBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				commands.lsCommand();
			}
		});
		btnLsl.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				commands.lslCommand();
			}
		});
		btnLslst.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				commands.lslstCommand();
			}
		});
		chmodBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				commands.chmodCommand(chmodTextField,group);
			}
		});
		sedBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				commands.sedCommand(sedTextField_1,sedTextField_2,sedTextField_3);
			}
		});
		btnMv.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				commands.mvCommand(mvTextField_1, mvTextField_2);
			}
		});
		btnCp.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				commands.cpCommand(cpTextField_1, cpTextField_2);
			}
		});
		btnLn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				commands.lnCommand(lnTextField_1, lnTextField_2);
			}
		});
		btnLns.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				commands.lnsCommand(lnsTextField_1, lnsTextField_2);
			}
		});
		moreBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				commands.moreCommand(moreTextField_1, moreTextField_2);
			}
		});
		backupBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				commands.backupCommand(recoveBackupTextField_1,recoveBackupTextField_2);
			}
		});
		recoveryBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				commands.recoverCommand(recoveBackupTextField_1,recoveBackupTextField_2);
			}
		});
		findBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				commands.findCommand(findTextField,chckbxDirectoryOnly);
			}
		});
		setDateBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				commands.setDateCommand(dateComboBox_1,dateComboBox_2,dateComboBox_3,timeComboBox_1,timeComboBox_2,timeComboBox_3);
			}
		});
		dateBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				commands.dateCommand();
			}
		});
		cdBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				commands.cdCommand(cdField);
			}
		});
		btnRemoveUser.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				commands.remove(comboBox);

			}
		});
		comboBox.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				commands.RemoveUser(comboBox);

			}
		});
		btnAddUser.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try {
					commands.AddUser(txtEnterName,passwordField);
					if(addUserFlag == false){
					JOptionPane.showMessageDialog(getContentPane(),"Press Add User again ");
					}
					commands.RemoveUser(comboBox);
					addUserFlag = true;
				} catch (IOException e) {
					e.printStackTrace();
				} catch (InterruptedException e) {
					e.printStackTrace();
				}

			}
		});
		
	}
}
