package com.personmanage.impression;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import com.personmanage.model.UserType;
import com.personmanage.model.admin;
import com.personmanage.model.adminLogin;
import com.personmanage.model.confirm;
import com.personmanage.model.employee;
import com.personmanage.model.employeeLogin;

import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.ImageIcon;
import javax.swing.JComboBox;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.UIManager;

import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JPasswordField;

public class SignIn extends JFrame {

	private JPanel contentPane;
	private JTextField userNametextField;
	private JComboBox UserTypecomboBox;
	private JPasswordField passwordField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SignIn frame = new SignIn();
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
	public SignIn() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 506, 414);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);

		JLabel TextLabel = new JLabel("人事管理系统");
		TextLabel.setIcon(new ImageIcon(SignIn.class.getResource("/picture/人事 (2).png")));
		TextLabel.setFont(new Font("微软雅黑", Font.BOLD, 22));

		UserTypecomboBox = new JComboBox();
		UserTypecomboBox.setModel(new DefaultComboBoxModel(new UserType[] { UserType.ADMIN, UserType.EMPLOYEE }));
		UserTypecomboBox.setFont(new Font("微软雅黑", Font.PLAIN, 12));
		UserTypecomboBox.setBackground(Color.GRAY);

		userNametextField = new JTextField();
		userNametextField.setColumns(10);

		JLabel lblNewLabel = new JLabel("用户名：\r\n");
		lblNewLabel.setIcon(new ImageIcon(SignIn.class.getResource("/picture/用户名 (1).png")));
		lblNewLabel.setFont(new Font("微软雅黑", Font.PLAIN, 14));

		JLabel lblNewLabel_1 = new JLabel("密   码：\r\n");
		lblNewLabel_1.setIcon(new ImageIcon(SignIn.class.getResource("/picture/密码 (1).png")));
		lblNewLabel_1.setFont(new Font("微软雅黑", Font.PLAIN, 14));

		JLabel lblNewLabel_2 = new JLabel("用户类型：\r\n");
		lblNewLabel_2.setIcon(new ImageIcon(SignIn.class.getResource("/picture/用户类型.png")));
		lblNewLabel_2.setFont(new Font("微软雅黑", Font.PLAIN, 14));

		JButton SignInButton = new JButton("登录\r\n");
		SignInButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent ae) {
				SigninConfirm(ae);
			}
		});
		SignInButton.setFont(new Font("微软雅黑", Font.BOLD, 14));
		SignInButton.setIcon(new ImageIcon(SignIn.class.getResource("/picture/登录 (1).png")));

		passwordField = new JPasswordField();
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(gl_contentPane.createParallelGroup(Alignment.LEADING).addGroup(gl_contentPane
				.createSequentialGroup()
				.addGroup(gl_contentPane.createParallelGroup(Alignment.TRAILING)
						.addGroup(gl_contentPane.createSequentialGroup().addGap(119)
								.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
										.addGroup(gl_contentPane.createSequentialGroup()
												.addComponent(lblNewLabel, GroupLayout.DEFAULT_SIZE, 112,
														Short.MAX_VALUE)
												.addPreferredGap(ComponentPlacement.RELATED))
										.addGroup(gl_contentPane.createSequentialGroup().addComponent(lblNewLabel_1)
												.addGap(13))))
						.addGroup(gl_contentPane.createSequentialGroup().addContainerGap().addComponent(lblNewLabel_2)
								.addPreferredGap(ComponentPlacement.UNRELATED)))
				.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addComponent(UserTypecomboBox, GroupLayout.PREFERRED_SIZE, 143, GroupLayout.PREFERRED_SIZE)
						.addComponent(userNametextField, GroupLayout.PREFERRED_SIZE, 141, GroupLayout.PREFERRED_SIZE)
						.addGroup(gl_contentPane.createSequentialGroup().addPreferredGap(ComponentPlacement.RELATED)
								.addComponent(passwordField, GroupLayout.PREFERRED_SIZE, 140,
										GroupLayout.PREFERRED_SIZE)))
				.addGap(102))
				.addGroup(gl_contentPane.createSequentialGroup().addContainerGap(143, Short.MAX_VALUE)
						.addComponent(TextLabel, GroupLayout.PREFERRED_SIZE, 216, GroupLayout.PREFERRED_SIZE)
						.addGap(123))
				.addGroup(gl_contentPane.createSequentialGroup().addGap(178)
						.addComponent(SignInButton, GroupLayout.PREFERRED_SIZE, 107, GroupLayout.PREFERRED_SIZE)
						.addContainerGap(197, Short.MAX_VALUE)));
		gl_contentPane.setVerticalGroup(gl_contentPane.createParallelGroup(Alignment.LEADING).addGroup(gl_contentPane
				.createSequentialGroup().addGap(38)
				.addComponent(TextLabel, GroupLayout.PREFERRED_SIZE, 54, GroupLayout.PREFERRED_SIZE).addGap(18)
				.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE).addComponent(lblNewLabel).addComponent(
						userNametextField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE,
						GroupLayout.PREFERRED_SIZE))
				.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPane.createSequentialGroup().addPreferredGap(ComponentPlacement.UNRELATED)
								.addComponent(lblNewLabel_1))
						.addGroup(gl_contentPane.createSequentialGroup().addGap(18).addComponent(passwordField,
								GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))
				.addGap(18)
				.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(UserTypecomboBox, GroupLayout.PREFERRED_SIZE, 33, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblNewLabel_2, GroupLayout.PREFERRED_SIZE, 49, GroupLayout.PREFERRED_SIZE))
				.addGap(32).addComponent(SignInButton).addContainerGap(57, Short.MAX_VALUE)));
		contentPane.setLayout(gl_contentPane);
	}

	protected void SigninConfirm(ActionEvent ae) {
		String username = userNametextField.getText().toString();
		String password = passwordField.getText().toString();
		UserType selectedType = (UserType) UserTypecomboBox.getSelectedItem();
		if (confirm.IsEmpty(username) && !confirm.IsEmpty(password)) {
			JOptionPane.showMessageDialog(this, "请输入用户名！");
			return;
		} else if (!confirm.IsEmpty(username) && confirm.IsEmpty(password)) {
			JOptionPane.showMessageDialog(this, "请输入密码！");
			return;
		} else if (confirm.IsEmpty(username) && confirm.IsEmpty(password)) {
			JOptionPane.showMessageDialog(this, "用户名和密码不能为空！");
			return;
		}
		admin ad = null;
		employee em = null;
		if ("管理员".equals(UserTypecomboBox.getSelectedItem().toString())) {
			adminLogin adlogin = new adminLogin();
			admin admintemp = new admin();
			admintemp.setName(username);
			admintemp.setPassword(password);
			ad = adlogin.Login(admintemp);
			if (ad == null) {
				JOptionPane.showMessageDialog(this, "用户名或密码错误！");
				return;
			}
			JOptionPane.showMessageDialog(this, "欢迎【管理员】" + username + "登入系统！");
			this.dispose();
			new Main(selectedType, ad).setVisible(true);
		} else if ("员工".equals(UserTypecomboBox.getSelectedItem().toString())) {
			employeeLogin emlogin = new employeeLogin();
			employee employeetemp = new employee();
			employeetemp.setName(username);
			employeetemp.setPassword(password);
			em = emlogin.Login(employeetemp);
			if (em == null) {
				JOptionPane.showMessageDialog(this, "用户名或密码错误！");
				return;
			}
			JOptionPane.showMessageDialog(this, "欢迎【员工】" + username + "登入系统！");
			this.dispose();
			new Main(selectedType, em).setVisible(true);
		}
	}
}
