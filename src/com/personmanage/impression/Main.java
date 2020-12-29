package com.personmanage.impression;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import com.personmanage.model.Counter;
import com.personmanage.model.Department;
import com.personmanage.model.EnDecode;
import com.personmanage.model.Job;
import com.personmanage.model.Personnel;
import com.personmanage.model.UserType;
import com.personmanage.model.admin;
import com.personmanage.model.adminLogin;
import com.personmanage.model.confirm;
import com.personmanage.model.edulevel;
import com.personmanage.model.employee;
import com.personmanage.model.employeeLogin;
import com.personmanage.model.inform;
import com.personmanage.model.informEnter;
import com.personmanage.model.personnel_change;
import com.personmanage.model.update_empleyee;

import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JTabbedPane;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLayeredPane;
import javax.swing.JOptionPane;

import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JDesktopPane;
import javax.swing.JPasswordField;
import java.awt.event.ActionListener;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Vector;
import java.awt.event.ActionEvent;
import javax.swing.JInternalFrame;
import java.awt.Toolkit;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.ScrollPaneConstants;
import javax.swing.UIManager;
import java.awt.SystemColor;
import javax.swing.JTextArea;

public class Main extends JFrame {

	private JPanel contentPane;
	private UserType userType;
	private Object userObject;
	private JTextField oldpasswordField;
	private JPasswordField newpasswordField;
	private JPasswordField confirmpasswordField;
	private admin ad = null;
	private employee em = null;
	private JTextField nametextField = new JTextField();;
	private final ButtonGroup buttonGroup = new ButtonGroup();
	private JTextField teltextField = new JTextField();
	private JTextField emailtextField = new JTextField();
	private final ButtonGroup buttonGroup_1 = new ButtonGroup();
	private JTextField skilltextField = new JTextField();
	private JTextField addresstextField = new JTextField();
	private JTextField IDtextField = new JTextField();
	private JPasswordField seTpasswordField = new JPasswordField();
	private JComboBox yearcomboBox = new JComboBox();
	private JComboBox monthcomboBox = new JComboBox();
	private JComboBox daycomboBox = new JComboBox();
	private JComboBox departmentcomboBox = new JComboBox();
	private JComboBox jobcomboBox = new JComboBox();
	private JRadioButton manRadioButton = new JRadioButton("男");
	private JRadioButton womanRadioButton = new JRadioButton("女\r\n");
	private JComboBox educomboBox = new JComboBox();
	private JRadioButton isemRadioButton = new JRadioButton("T-员工\r\n");
	private JRadioButton notemRadioButton = new JRadioButton("F-非员工\r\n");
	private JTextField authoritytextField = new JTextField();
	JButton enterinform = new JButton("确定");
	Counter id = new Counter();
	int ID = id.getCounter("P");
	Integer i=new Integer(ID);
	private JTable informtable = new JTable();
	private JTable SearchInformtable = new JTable();
	private JTextField searchNametextField = new JTextField();
	private final ButtonGroup buttonGroup_2 = new ButtonGroup();
	private JTextField impowerName = new JTextField();
	private JTextField impowerId = new JTextField();
	private final ButtonGroup buttonGroup_3 = new ButtonGroup();
	JButton impowerButton = new JButton("授权为管理员");
	JLabel authoritytype = new JLabel("");
	JRadioButton impowermanRadioButton = new JRadioButton("男");
	JRadioButton impowerwomanRadioButton = new JRadioButton("女\r\n");
	private JPasswordField Adminpasswd = new JPasswordField();
	private JTextField deleteIdfield = new JTextField();
	JButton deleteButton = new JButton("删除信息\r\n");
	private JPasswordField deletepasswordField = new JPasswordField();
	private JTextField change_name = new JTextField();
	private JTextField changetele = new JTextField();
	private JTextField changeemail = new JTextField();
	private JTextField changeskill = new JTextField();
	private JTextField changeaddress = new JTextField();
	private JTextField changenote = new JTextField();
	private final ButtonGroup buttonGroup_4 = new ButtonGroup();
	private final ButtonGroup buttonGroup_5 = new ButtonGroup();
	private JTextField changed_id = new JTextField();
	JButton confirmButton = new JButton("确认修改\r\n");
	JRadioButton change_man = new JRadioButton("男");
	JRadioButton change_woman = new JRadioButton("女\r\n");
	JComboBox changeedu = new JComboBox();
	JComboBox changejob = new JComboBox();
	JButton changetarget = new JButton("确定");
	JButton changebutton = new JButton("保存修改");
	JComboBox changedepartment = new JComboBox();
	JRadioButton change_not_em = new JRadioButton("F-非员工\r\n");
	JRadioButton change_is_em = new JRadioButton("T-员工\r\n");
	JComboBox changeyear = new JComboBox();
	JComboBox changemonth = new JComboBox();
	JComboBox changeday = new JComboBox();
	inform to_be_change = new inform();
	JTextArea somethingtextField = new JTextArea();
	private JTable personneltable;
	private JTextField searchpersonnelID;
	JButton refreshpersonnel = new JButton("重置");
	JButton searchpersonnel = new JButton("查询记录");
	/**
	 * Launch the application.
	 */
	// public static void main(String[] args) {
	// EventQueue.invokeLater(new Runnable() {
	// public void run() {
	// try {
	// Main frame = new Main();
	// frame.setVisible(true);
	// } catch (Exception e) {
	// e.printStackTrace();
	// }
	// }
	// });
	// }

	/**
	 * Create the frame.
	 */
	public Main(UserType userType, Object userObject) {
		setTitle("人事管理系统");
		setIconImage(Toolkit.getDefaultToolkit().getImage(Main.class.getResource("/picture/用户类型.png")));
		this.userType = userType;
		this.userObject = userObject;
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 813, 567);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		setLocationRelativeTo(null);

		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setFont(new Font("微软雅黑", Font.PLAIN, 14));
		tabbedPane.setBounds(-2, 5, 862, 528);
		contentPane.add(tabbedPane);

		JDesktopPane desktopPane = new JDesktopPane();
		desktopPane.setBackground(UIManager.getColor("Button.background"));
		tabbedPane.addTab("人事信息\r\n", new ImageIcon(Main.class.getResource("/picture/用户.png")), desktopPane, null);

		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
		scrollPane.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS);
		scrollPane.setBounds(0, 0, 800, 495);
		desktopPane.add(scrollPane);

		informtable.setModel(new DefaultTableModel(
				new Object[][] { { null, null, null, null, null, null, null, null, null, null, null, null, null, null },
						{ null, null, null, null, null, null, null, null, null, null, null, null, null, null }, },
				new String[] { "\u5458\u5DE5\u53F7", "\u7528\u6237\u6743\u9650", "\u59D3\u540D", "\u6027\u522B",
						"\u751F\u65E5", "\u6240\u5728\u90E8\u95E8", "\u804C\u52A1", "\u53D7\u6559\u80B2\u7A0B\u5EA6",
						"\u4E13\u4E1A\u6280\u80FD", "\u5BB6\u5EAD\u5730\u5740", "\u8054\u7CFB\u7535\u8BDD",
						"\u7535\u5B50\u90AE\u4EF6", "\u5F53\u524D\u72B6\u6001", "\u5907\u6CE8" }));
		informtable.setFont(new Font("微软雅黑", Font.PLAIN, 12));
		informtable.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		scrollPane.setViewportView(informtable);
		
		JDesktopPane desktopPane_6 = new JDesktopPane();
		desktopPane_6.setBackground(UIManager.getColor("Button.background"));
		tabbedPane.addTab("人事记录", new ImageIcon(Main.class.getResource("/picture/眼睛.png")), desktopPane_6, null);
		
		JScrollPane scrollPane_2 = new JScrollPane();
		scrollPane_2.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
		scrollPane_2.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS);
		scrollPane_2.setBounds(0, 0, 800, 380);
		desktopPane_6.add(scrollPane_2);
		
		personneltable = new JTable();
		personneltable.setModel(new DefaultTableModel(
			new Object[][] {
				{null, null, null},
			},
			new String[] {
				"\u8BB0\u5F55\u7F16\u53F7", "\u5458\u5DE5\u53F7", "\u53D8\u66F4\u8BB0\u5F55"
			}
		));
		personneltable.getColumnModel().getColumn(2).setPreferredWidth(630);
		personneltable.setFont(new Font("微软雅黑", Font.PLAIN, 12));
		personneltable.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		scrollPane_2.setViewportView(personneltable);
		
		searchpersonnelID = new JTextField();
		searchpersonnelID.setFont(new Font("微软雅黑", Font.PLAIN, 18));
		searchpersonnelID.setColumns(10);
		searchpersonnelID.setBounds(156, 419, 194, 34);
		desktopPane_6.add(searchpersonnelID);
		
		JLabel lblNewLabel_16_1_1 = new JLabel("员工号:");
		lblNewLabel_16_1_1.setIcon(new ImageIcon(Main.class.getResource("/picture/员工号.png")));
		lblNewLabel_16_1_1.setFont(new Font("微软雅黑", Font.PLAIN, 18));
		lblNewLabel_16_1_1.setBounds(43, 414, 108, 44);
		desktopPane_6.add(lblNewLabel_16_1_1);
		
		
		searchpersonnel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				searchpersonnel(e);
			}
		});
		searchpersonnel.setIcon(new ImageIcon(Main.class.getResource("/picture/查询.png")));
		searchpersonnel.setFont(new Font("微软雅黑", Font.PLAIN, 18));
		searchpersonnel.setBounds(400, 419, 136, 34);
		desktopPane_6.add(searchpersonnel);
		refreshpersonnel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				resetpersonnel(e);
			}
		});
		
		
		refreshpersonnel.setIcon(new ImageIcon(Main.class.getResource("/picture/重置.png")));
		refreshpersonnel.setFont(new Font("微软雅黑", Font.PLAIN, 18));
		refreshpersonnel.setBounds(571, 419, 136, 34);
		desktopPane_6.add(refreshpersonnel);

		JDesktopPane desktopPane_2 = new JDesktopPane();
		desktopPane_2.setBackground(UIManager.getColor("Button.background"));
		tabbedPane.addTab("信息查询", new ImageIcon(Main.class.getResource("/picture/查询.png")), desktopPane_2, null);

		JScrollPane scrollPane_1 = new JScrollPane();
		scrollPane_1.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS);
		scrollPane_1.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
		scrollPane_1.setBounds(0, 0, 803, 289);
		desktopPane_2.add(scrollPane_1);

		SearchInformtable.setModel(new DefaultTableModel(new Object[][] {},
				new String[] { "\u5458\u5DE5\u53F7", "\u5458\u5DE5\u6743\u9650", "\u59D3\u540D", "\u6027\u522B",
						"\u751F\u65E5", "\u6240\u5728\u90E8\u95E8", "\u804C\u52A1", "\u53D7\u6559\u80B2\u7A0B\u5EA6",
						"\u4E13\u4E1A\u6280\u80FD", "\u5BB6\u5EAD\u4F4F\u5740", "\u8054\u7CFB\u7535\u8BDD",
						"\u7535\u5B50\u90AE\u4EF6", "\u5F53\u524D\u72B6\u6001", "\u5907\u6CE8" }));
		SearchInformtable.setFont(new Font("微软雅黑", Font.PLAIN, 12));
		SearchInformtable.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		scrollPane_1.setViewportView(SearchInformtable);

		JLabel lblNewLabel_16 = new JLabel("员工姓名:");
		lblNewLabel_16.setIcon(new ImageIcon(Main.class.getResource("/picture/用户名 (1).png")));
		lblNewLabel_16.setFont(new Font("微软雅黑", Font.PLAIN, 18));
		lblNewLabel_16.setBounds(10, 306, 114, 49);
		desktopPane_2.add(lblNewLabel_16);
		searchNametextField.setFont(new Font("微软雅黑", Font.PLAIN, 18));

		searchNametextField.setBounds(166, 313, 194, 34);
		desktopPane_2.add(searchNametextField);
		searchNametextField.setColumns(10);

		JButton searchInformButton = new JButton("查询信息\r\n");
		searchInformButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent ae) {
				searchInformtable(ae);
			}
		});
		searchInformButton.setIcon(new ImageIcon(Main.class.getResource("/picture/查询.png")));
		searchInformButton.setFont(new Font("微软雅黑", Font.PLAIN, 18));
		searchInformButton.setBounds(395, 313, 136, 34);
		desktopPane_2.add(searchInformButton);

		JLabel lblNewLabel_16_1 = new JLabel("员工号:");
		lblNewLabel_16_1.setIcon(new ImageIcon(Main.class.getResource("/picture/员工号.png")));
		lblNewLabel_16_1.setFont(new Font("微软雅黑", Font.PLAIN, 18));
		lblNewLabel_16_1.setBounds(16, 373, 108, 44);
		desktopPane_2.add(lblNewLabel_16_1);
		deleteIdfield.setFont(new Font("微软雅黑", Font.PLAIN, 18));

		deleteIdfield.setColumns(10);
		deleteIdfield.setBounds(166, 378, 194, 34);
		desktopPane_2.add(deleteIdfield);

		deleteButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				deleteInform(e);
			}
		});
		deleteButton.setIcon(new ImageIcon(Main.class.getResource("/picture/垃圾桶 (1).png")));
		deleteButton.setFont(new Font("微软雅黑", Font.PLAIN, 18));
		deleteButton.setBounds(395, 410, 136, 34);
		desktopPane_2.add(deleteButton);

		JLabel lblNewLabel_16_2 = new JLabel("当前用户密码:");
		lblNewLabel_16_2.setIcon(new ImageIcon(Main.class.getResource("/picture/钥匙 (1).png")));
		lblNewLabel_16_2.setFont(new Font("微软雅黑", Font.PLAIN, 18));
		lblNewLabel_16_2.setBounds(10, 427, 151, 49);
		desktopPane_2.add(lblNewLabel_16_2);

		deletepasswordField.setBounds(166, 438, 194, 34);
		desktopPane_2.add(deletepasswordField);

		JDesktopPane desktopPane_7 = new JDesktopPane();
		desktopPane_7.setBackground(UIManager.getColor("Button.background"));
		tabbedPane.addTab("信息录入", new ImageIcon(Main.class.getResource("/picture/录入 (1).png")), desktopPane_7, null);

		JLabel lblNewLabel_4 = new JLabel("姓名:");
		lblNewLabel_4.setFont(new Font("微软雅黑", Font.PLAIN, 18));
		lblNewLabel_4.setBounds(84, 32, 58, 24);
		desktopPane_7.add(lblNewLabel_4);

		nametextField.setBounds(152, 35, 90, 26);
		desktopPane_7.add(nametextField);
		nametextField.setColumns(10);

		JLabel lblNewLabel_5 = new JLabel("出生日期:");
		lblNewLabel_5.setFont(new Font("微软雅黑", Font.PLAIN, 18));
		lblNewLabel_5.setBounds(267, 31, 102, 26);
		desktopPane_7.add(lblNewLabel_5);

		yearcomboBox.setModel(new DefaultComboBoxModel(
				new String[] { "1970", "1971", "1972", "1973", "1974", "1975", "1976", "1977", "1978", "1979", "1980",
						"1981", "1982", "1983", "1984", "1985", "1986", "1987", "1988", "1989", "1990", "1991", "1992",
						"1993", "1994", "1995", "1996", "1997", "1998", "1999", "2000", "2001", "2002" }));
		yearcomboBox.setFont(new Font("微软雅黑", Font.PLAIN, 15));
		yearcomboBox.setBounds(353, 33, 70, 24);
		desktopPane_7.add(yearcomboBox);

		JLabel lblNewLabel_6 = new JLabel("年\r\n");
		lblNewLabel_6.setFont(new Font("微软雅黑", Font.PLAIN, 18));
		lblNewLabel_6.setBounds(431, 36, 29, 20);
		desktopPane_7.add(lblNewLabel_6);

		monthcomboBox.setFont(new Font("微软雅黑", Font.PLAIN, 15));
		monthcomboBox.setModel(new DefaultComboBoxModel(
				new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12" }));
		monthcomboBox.setBounds(459, 33, 70, 25);
		desktopPane_7.add(monthcomboBox);

		JLabel lblNewLabel_7 = new JLabel("月");
		lblNewLabel_7.setFont(new Font("微软雅黑", Font.PLAIN, 18));
		lblNewLabel_7.setBounds(539, 36, 46, 23);
		desktopPane_7.add(lblNewLabel_7);

		daycomboBox.setModel(new DefaultComboBoxModel(
				new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16",
						"17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31" }));
		daycomboBox.setFont(new Font("微软雅黑", Font.PLAIN, 15));
		daycomboBox.setBounds(567, 32, 70, 26);
		desktopPane_7.add(daycomboBox);

		JLabel lblNewLabel_8 = new JLabel("日");
		lblNewLabel_8.setFont(new Font("微软雅黑", Font.PLAIN, 18));
		lblNewLabel_8.setBounds(647, 34, 58, 26);
		desktopPane_7.add(lblNewLabel_8);

		JLabel lblNewLabel_9 = new JLabel("所在部门:");
		lblNewLabel_9.setFont(new Font("微软雅黑", Font.PLAIN, 18));
		lblNewLabel_9.setBounds(84, 211, 102, 24);
		desktopPane_7.add(lblNewLabel_9);
		departmentcomboBox.setModel(new DefaultComboBoxModel(
				new String[] { "--部门选择--", "总经办", "行政部", "人事部", "财务部", "技术部", "销售部", "客户服务部" }));

		departmentcomboBox.setBounds(185, 211, 102, 24);
		desktopPane_7.add(departmentcomboBox);

		JLabel lblNewLabel_10 = new JLabel("职务:");
		lblNewLabel_10.setFont(new Font("微软雅黑", Font.PLAIN, 18));
		lblNewLabel_10.setBounds(319, 212, 78, 23);
		desktopPane_7.add(lblNewLabel_10);
		jobcomboBox.setModel(new DefaultComboBoxModel(new String[] { "--职务选择--", "总经理", "总经理助理", "办公室主任", "行政总监",
				"行政经理", "行政助理", "行政专员", "人事部总监", "人事部经理", "人事专员", "首席财务官", "总会计师", "财务总监", "资金总监", "财务部经理", "审计主管",
				"会计", "出纳员", "技术部经理", "项目经理", "工程师", "销售总监", "销售部经理", "文员", "销售员", "客户服务部经理", "客户服务员" }));

		jobcomboBox.setBounds(366, 211, 107, 26);
		desktopPane_7.add(jobcomboBox);

		JLabel lblNewLabel_11 = new JLabel("性别:");
		lblNewLabel_11.setFont(new Font("微软雅黑", Font.PLAIN, 18));
		lblNewLabel_11.setBounds(84, 152, 58, 24);
		desktopPane_7.add(lblNewLabel_11);

		buttonGroup.add(manRadioButton);
		manRadioButton.setBackground(UIManager.getColor("Button.background"));
		manRadioButton.setFont(new Font("微软雅黑", Font.PLAIN, 18));
		manRadioButton.setBounds(140, 151, 46, 27);
		desktopPane_7.add(manRadioButton);

		buttonGroup.add(womanRadioButton);
		womanRadioButton.setFont(new Font("微软雅黑", Font.PLAIN, 18));
		womanRadioButton.setBackground(UIManager.getColor("Button.background"));
		womanRadioButton.setBounds(200, 148, 58, 33);
		desktopPane_7.add(womanRadioButton);

		JLabel lblNewLabel_12 = new JLabel("受教育程度:");
		lblNewLabel_12.setFont(new Font("微软雅黑", Font.PLAIN, 18));
		lblNewLabel_12.setBounds(483, 210, 102, 27);
		desktopPane_7.add(lblNewLabel_12);
		educomboBox.setModel(new DefaultComboBoxModel(
				new String[] { "--教育程度--", "小学", "初中", "高中", "职高", "大本", "本科", "硕士", "博士", "博士后" }));

		educomboBox.setBounds(595, 210, 102, 27);
		desktopPane_7.add(educomboBox);

		JLabel lblNewLabel_13 = new JLabel("联系电话:");
		lblNewLabel_13.setFont(new Font("微软雅黑", Font.PLAIN, 18));
		lblNewLabel_13.setBounds(392, 272, 89, 24);
		desktopPane_7.add(lblNewLabel_13);

		teltextField.setBounds(475, 274, 210, 26);
		desktopPane_7.add(teltextField);
		teltextField.setColumns(10);

		JLabel lblNewLabel_14 = new JLabel("电子邮件:");
		lblNewLabel_14.setFont(new Font("微软雅黑", Font.PLAIN, 18));
		lblNewLabel_14.setBounds(85, 274, 83, 20);
		desktopPane_7.add(lblNewLabel_14);

		emailtextField.setBounds(171, 272, 210, 26);
		desktopPane_7.add(emailtextField);
		emailtextField.setColumns(10);

		JLabel lblNewLabel_15 = new JLabel("当前状态:");
		lblNewLabel_15.setFont(new Font("微软雅黑", Font.PLAIN, 18));
		lblNewLabel_15.setBounds(267, 153, 78, 23);
		desktopPane_7.add(lblNewLabel_15);

		buttonGroup_1.add(isemRadioButton);
		isemRadioButton.setFont(new Font("微软雅黑", Font.PLAIN, 18));
		isemRadioButton.setBackground(UIManager.getColor("Button.background"));
		isemRadioButton.setBounds(359, 153, 90, 23);
		desktopPane_7.add(isemRadioButton);

		buttonGroup_1.add(notemRadioButton);
		notemRadioButton.setFont(new Font("微软雅黑", Font.PLAIN, 18));
		notemRadioButton.setBackground(UIManager.getColor("Button.background"));
		notemRadioButton.setBounds(451, 153, 113, 23);
		desktopPane_7.add(notemRadioButton);

		JLabel lblNewLabel_9_1 = new JLabel("专业技能:");
		lblNewLabel_9_1.setFont(new Font("微软雅黑", Font.PLAIN, 18));
		lblNewLabel_9_1.setBounds(84, 328, 102, 24);
		desktopPane_7.add(lblNewLabel_9_1);

		skilltextField.setBounds(171, 328, 210, 26);
		desktopPane_7.add(skilltextField);
		skilltextField.setColumns(10);

		JLabel lblNewLabel_9_1_1 = new JLabel("家庭住址:\r\n");
		lblNewLabel_9_1_1.setFont(new Font("微软雅黑", Font.PLAIN, 18));
		lblNewLabel_9_1_1.setBounds(392, 328, 102, 24);
		desktopPane_7.add(lblNewLabel_9_1_1);

		addresstextField.setColumns(10);
		addresstextField.setBounds(475, 328, 210, 26);
		desktopPane_7.add(addresstextField);

		JLabel lblNewLabel_9_1_2 = new JLabel("备注:");
		lblNewLabel_9_1_2.setFont(new Font("微软雅黑", Font.PLAIN, 18));
		lblNewLabel_9_1_2.setBounds(84, 381, 102, 24);
		desktopPane_7.add(lblNewLabel_9_1_2);

		enterinform.setEnabled(false);
		enterinform.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent ae) {
				enterinform(ae);
			}
		});
		enterinform.setFont(new Font("微软雅黑", Font.PLAIN, 18));
		enterinform.setBounds(335, 441, 113, 33);
		desktopPane_7.add(enterinform);

		JLabel lblNewLabel_4_1 = new JLabel("员工号:");
		lblNewLabel_4_1.setFont(new Font("微软雅黑", Font.PLAIN, 18));
		lblNewLabel_4_1.setBounds(84, 92, 70, 24);
		desktopPane_7.add(lblNewLabel_4_1);

		IDtextField.setEditable(false);
		IDtextField.setColumns(10);
		IDtextField.setBounds(152, 92, 90, 26);
		desktopPane_7.add(IDtextField);

		JLabel lblNewLabel_4_1_1 = new JLabel("设置密码:");
		lblNewLabel_4_1_1.setFont(new Font("微软雅黑", Font.PLAIN, 18));
		lblNewLabel_4_1_1.setBounds(267, 92, 84, 24);
		desktopPane_7.add(lblNewLabel_4_1_1);

		seTpasswordField.setBounds(354, 90, 95, 26);
		desktopPane_7.add(seTpasswordField);

		JLabel lblNewLabel_4_1_2 = new JLabel("权限级别:");
		lblNewLabel_4_1_2.setFont(new Font("微软雅黑", Font.PLAIN, 18));
		lblNewLabel_4_1_2.setBounds(475, 92, 91, 24);
		desktopPane_7.add(lblNewLabel_4_1_2);

		authoritytextField.setText("员工");
		authoritytextField.setEditable(false);
		authoritytextField.setColumns(10);
		authoritytextField.setBounds(567, 92, 95, 26);
		desktopPane_7.add(authoritytextField);
		IDtextField.setText(i.toString());

		somethingtextField.setBounds(137, 381, 548, 50);
		desktopPane_7.add(somethingtextField);

		JDesktopPane desktopPane_1 = new JDesktopPane();
		desktopPane_1.setBackground(UIManager.getColor("Button.background"));
		tabbedPane.addTab("信息修改", new ImageIcon(Main.class.getResource("/picture/修 改.png")), desktopPane_1, null);

		JLabel lblNewLabel_4_3 = new JLabel("姓名:");
		lblNewLabel_4_3.setFont(new Font("微软雅黑", Font.PLAIN, 18));
		lblNewLabel_4_3.setBounds(78, 99, 58, 24);
		desktopPane_1.add(lblNewLabel_4_3);

		change_name.setColumns(10);
		change_name.setBounds(126, 99, 90, 26);
		desktopPane_1.add(change_name);

		JLabel lblNewLabel_5_1 = new JLabel("出生日期:");
		lblNewLabel_5_1.setFont(new Font("微软雅黑", Font.PLAIN, 18));
		lblNewLabel_5_1.setBounds(261, 98, 102, 26);
		desktopPane_1.add(lblNewLabel_5_1);

		changeyear.setModel(new DefaultComboBoxModel(
				new String[] { "1970", "1971", "1972", "1973", "1974", "1975", "1976", "1977", "1978", "1979", "1980",
						"1981", "1982", "1983", "1984", "1985", "1986", "1987", "1988", "1989", "1990", "1991", "1992",
						"1993", "1994", "1995", "1996", "1997", "1998", "1999", "2000", "2001", "2002" }));
		changeyear.setFont(new Font("微软雅黑", Font.PLAIN, 15));
		changeyear.setBounds(347, 100, 70, 24);
		desktopPane_1.add(changeyear);

		JLabel lblNewLabel_6_1 = new JLabel("年\r\n");
		lblNewLabel_6_1.setFont(new Font("微软雅黑", Font.PLAIN, 18));
		lblNewLabel_6_1.setBounds(425, 103, 29, 20);
		desktopPane_1.add(lblNewLabel_6_1);

		changemonth.setModel(new DefaultComboBoxModel(
				new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12" }));
		changemonth.setFont(new Font("微软雅黑", Font.PLAIN, 15));
		changemonth.setBounds(453, 100, 70, 25);
		desktopPane_1.add(changemonth);

		JLabel lblNewLabel_7_1 = new JLabel("月");
		lblNewLabel_7_1.setFont(new Font("微软雅黑", Font.PLAIN, 18));
		lblNewLabel_7_1.setBounds(533, 103, 46, 23);
		desktopPane_1.add(lblNewLabel_7_1);

		changeday.setModel(new DefaultComboBoxModel(
				new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16",
						"17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31" }));
		changeday.setFont(new Font("微软雅黑", Font.PLAIN, 15));
		changeday.setBounds(561, 99, 70, 26);
		desktopPane_1.add(changeday);

		JLabel lblNewLabel_8_1 = new JLabel("日");
		lblNewLabel_8_1.setFont(new Font("微软雅黑", Font.PLAIN, 18));
		lblNewLabel_8_1.setBounds(641, 101, 58, 26);
		desktopPane_1.add(lblNewLabel_8_1);

		JLabel lblNewLabel_9_2 = new JLabel("所在部门:");
		lblNewLabel_9_2.setFont(new Font("微软雅黑", Font.PLAIN, 18));
		lblNewLabel_9_2.setBounds(78, 214, 102, 24);
		desktopPane_1.add(lblNewLabel_9_2);

		changedepartment.setModel(new DefaultComboBoxModel(
				new String[] { "--部门选择--", "总经办", "行政部", "人事部", "财务部", "技术部", "销售部", "客户服务部" }));
		changedepartment.setBounds(179, 214, 102, 24);
		desktopPane_1.add(changedepartment);

		JLabel lblNewLabel_10_1 = new JLabel("职务:");
		lblNewLabel_10_1.setFont(new Font("微软雅黑", Font.PLAIN, 18));
		lblNewLabel_10_1.setBounds(313, 215, 78, 23);
		desktopPane_1.add(lblNewLabel_10_1);

		changejob.setModel(new DefaultComboBoxModel(new String[] {"--职务选择--", "总经理", "总经理助理", "办公室主任", "行政总监", "行政经理", "行政助理", "行政专员", "人事部总监", "人事部经理", "人事专员", "首席财务官", "总会计师", "财务总监", "资金总监", "财务部经理", "审计主管", "会计", "出纳员", "技术部经理", "项目经理", "工程师", "销售总监", "销售部经理", "文员", "销售员", "客户服务部经理", "客户服务员"}));
		changejob.setBounds(360, 214, 107, 26);
		desktopPane_1.add(changejob);

		JLabel lblNewLabel_11_1 = new JLabel("性别:");
		lblNewLabel_11_1.setFont(new Font("微软雅黑", Font.PLAIN, 18));
		lblNewLabel_11_1.setBounds(78, 165, 58, 24);
		desktopPane_1.add(lblNewLabel_11_1);

		buttonGroup_5.add(change_man);
		change_man.setFont(new Font("微软雅黑", Font.PLAIN, 18));
		change_man.setBackground(SystemColor.menu);
		change_man.setBounds(126, 164, 46, 27);
		desktopPane_1.add(change_man);

		buttonGroup_5.add(change_woman);
		change_woman.setFont(new Font("微软雅黑", Font.PLAIN, 18));
		change_woman.setBackground(SystemColor.menu);
		change_woman.setBounds(193, 161, 58, 33);
		desktopPane_1.add(change_woman);

		JLabel lblNewLabel_12_1 = new JLabel("受教育程度:");
		lblNewLabel_12_1.setFont(new Font("微软雅黑", Font.PLAIN, 18));
		lblNewLabel_12_1.setBounds(485, 214, 102, 27);
		desktopPane_1.add(lblNewLabel_12_1);

		changeedu.setModel(new DefaultComboBoxModel(
				new String[] { "--教育程度--", "小学", "初中", "高中", "职高", "大专", "本科", "硕士", "博士", "博士后" }));
		changeedu.setBounds(594, 214, 102, 27);
		desktopPane_1.add(changeedu);

		JLabel lblNewLabel_13_1 = new JLabel("联系电话:");
		lblNewLabel_13_1.setFont(new Font("微软雅黑", Font.PLAIN, 18));
		lblNewLabel_13_1.setBounds(387, 268, 89, 24);
		desktopPane_1.add(lblNewLabel_13_1);

		changetele.setColumns(10);
		changetele.setBounds(486, 270, 210, 27);
		desktopPane_1.add(changetele);

		JLabel lblNewLabel_14_1 = new JLabel("电子邮件:");
		lblNewLabel_14_1.setFont(new Font("微软雅黑", Font.PLAIN, 18));
		lblNewLabel_14_1.setBounds(78, 270, 83, 20);
		desktopPane_1.add(lblNewLabel_14_1);

		changeemail.setColumns(10);
		changeemail.setBounds(162, 268, 210, 27);
		desktopPane_1.add(changeemail);

		JLabel lblNewLabel_15_1 = new JLabel("当前状态:");
		lblNewLabel_15_1.setFont(new Font("微软雅黑", Font.PLAIN, 18));
		lblNewLabel_15_1.setBounds(261, 166, 78, 23);
		desktopPane_1.add(lblNewLabel_15_1);

		buttonGroup_4.add(change_is_em);
		change_is_em.setFont(new Font("微软雅黑", Font.PLAIN, 18));
		change_is_em.setBackground(SystemColor.menu);
		change_is_em.setBounds(347, 166, 90, 23);
		desktopPane_1.add(change_is_em);

		buttonGroup_4.add(change_not_em);
		change_not_em.setFont(new Font("微软雅黑", Font.PLAIN, 18));
		change_not_em.setBackground(SystemColor.menu);
		change_not_em.setBounds(439, 166, 113, 23);
		desktopPane_1.add(change_not_em);

		JLabel lblNewLabel_9_1_3 = new JLabel("专业技能:");
		lblNewLabel_9_1_3.setFont(new Font("微软雅黑", Font.PLAIN, 18));
		lblNewLabel_9_1_3.setBounds(78, 319, 102, 24);
		desktopPane_1.add(lblNewLabel_9_1_3);

		changeskill.setColumns(10);
		changeskill.setBounds(163, 317, 210, 26);
		desktopPane_1.add(changeskill);

		JLabel lblNewLabel_9_1_1_1 = new JLabel("家庭住址:\r\n");
		lblNewLabel_9_1_1_1.setFont(new Font("微软雅黑", Font.PLAIN, 18));
		lblNewLabel_9_1_1_1.setBounds(387, 319, 102, 24);
		desktopPane_1.add(lblNewLabel_9_1_1_1);

		changeaddress.setColumns(10);
		changeaddress.setBounds(485, 317, 210, 26);
		desktopPane_1.add(changeaddress);

		JLabel lblNewLabel_9_1_2_1 = new JLabel("备注:");
		lblNewLabel_9_1_2_1.setFont(new Font("微软雅黑", Font.PLAIN, 18));
		lblNewLabel_9_1_2_1.setBounds(78, 371, 102, 24);
		desktopPane_1.add(lblNewLabel_9_1_2_1);

		changenote.setColumns(10);
		changenote.setBounds(125, 374, 571, 46);
		desktopPane_1.add(changenote);

		JLabel lblNewLabel_4_1_3 = new JLabel("目标员工号:");
		lblNewLabel_4_1_3.setFont(new Font("微软雅黑", Font.PLAIN, 18));
		lblNewLabel_4_1_3.setBounds(78, 25, 107, 24);
		desktopPane_1.add(lblNewLabel_4_1_3);
		changebutton.setEnabled(false);
		changebutton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				changeInform(e);
			}
		});

		changebutton.setFont(new Font("微软雅黑", Font.PLAIN, 18));
		changebutton.setBounds(341, 435, 113, 33);
		desktopPane_1.add(changebutton);

		changed_id.setColumns(10);
		changed_id.setBounds(179, 25, 90, 26);
		desktopPane_1.add(changed_id);
		changetarget.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				set_change_inform(e);
			}
		});

		changetarget.setFont(new Font("微软雅黑", Font.PLAIN, 18));
		changetarget.setBounds(313, 25, 113, 26);
		desktopPane_1.add(changetarget);

		JDesktopPane desktopPane_3 = new JDesktopPane();
		desktopPane_3.setBackground(UIManager.getColor("Button.background"));
		tabbedPane.addTab("权限管理", new ImageIcon(Main.class.getResource("/picture/权限.png")), desktopPane_3, null);

		JLabel lblNewLabel_4_2 = new JLabel("当前权限:");
		lblNewLabel_4_2.setFont(new Font("微软雅黑", Font.BOLD, 20));
		lblNewLabel_4_2.setBounds(61, 18, 91, 24);
		desktopPane_3.add(lblNewLabel_4_2);

		authoritytype.setFont(new Font("微软雅黑", Font.BOLD, 18));
		authoritytype.setBounds(155, 10, 477, 40);
		desktopPane_3.add(authoritytype);

		JLabel lblNewLabel_4_2_1 = new JLabel("目标员工姓名:");
		lblNewLabel_4_2_1.setFont(new Font("微软雅黑", Font.BOLD, 20));
		lblNewLabel_4_2_1.setBounds(61, 151, 134, 24);
		desktopPane_3.add(lblNewLabel_4_2_1);

		impowerName.setFont(new Font("微软雅黑", Font.PLAIN, 18));
		impowerName.setBounds(218, 147, 162, 33);
		desktopPane_3.add(impowerName);
		impowerName.setColumns(10);

		buttonGroup_3.add(impowerwomanRadioButton);
		impowerwomanRadioButton.setFont(new Font("微软雅黑", Font.PLAIN, 18));
		impowerwomanRadioButton.setBackground(SystemColor.menu);
		impowerwomanRadioButton.setBounds(487, 148, 58, 33);
		desktopPane_3.add(impowerwomanRadioButton);

		buttonGroup_3.add(impowermanRadioButton);
		impowermanRadioButton.setFont(new Font("微软雅黑", Font.PLAIN, 18));
		impowermanRadioButton.setBackground(SystemColor.menu);
		impowermanRadioButton.setBounds(415, 151, 46, 27);
		desktopPane_3.add(impowermanRadioButton);

		JLabel lblNewLabel_4_2_1_1 = new JLabel("目标员工号:");
		lblNewLabel_4_2_1_1.setFont(new Font("微软雅黑", Font.BOLD, 20));
		lblNewLabel_4_2_1_1.setBounds(61, 78, 119, 24);
		desktopPane_3.add(lblNewLabel_4_2_1_1);

		impowerId.setFont(new Font("微软雅黑", Font.PLAIN, 18));
		impowerId.setColumns(10);
		impowerId.setBounds(218, 75, 162, 33);
		desktopPane_3.add(impowerId);
		impowerButton.setEnabled(false);

		impowerButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				impower(e);
			}
		});
		impowerButton.setFont(new Font("微软雅黑", Font.PLAIN, 18));
		impowerButton.setBounds(186, 399, 169, 33);
		desktopPane_3.add(impowerButton);

		JLabel lblNewLabel_4_2_1_2 = new JLabel("当前用户密码:");
		lblNewLabel_4_2_1_2.setFont(new Font("微软雅黑", Font.BOLD, 20));
		lblNewLabel_4_2_1_2.setBounds(64, 233, 131, 33);
		desktopPane_3.add(lblNewLabel_4_2_1_2);

		JButton deprivepower = new JButton("取消管理员权限");
		deprivepower.setEnabled(false);
		deprivepower.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				deprivePower(e);
			}
		});
		deprivepower.setFont(new Font("微软雅黑", Font.PLAIN, 18));
		deprivepower.setBounds(403, 399, 169, 33);
		desktopPane_3.add(deprivepower);

		JDesktopPane desktopPane_4 = new JDesktopPane();
		tabbedPane.addTab("账号设置\r\n", new ImageIcon(Main.class.getResource("/picture/账号设置.png")), desktopPane_4, null);
		desktopPane_4.setBackground(UIManager.getColor("Button.background"));

		JLabel lblNewLabel = new JLabel("原密码");
		lblNewLabel.setIcon(new ImageIcon(Main.class.getResource("/picture/密码 (1).png")));
		lblNewLabel.setFont(new Font("微软雅黑", Font.BOLD, 18));
		lblNewLabel.setBounds(215, 104, 108, 34);
		desktopPane_4.add(lblNewLabel);

		oldpasswordField = new JTextField();
		oldpasswordField.setBounds(341, 109, 156, 29);
		desktopPane_4.add(oldpasswordField);
		oldpasswordField.setColumns(10);

		JLabel lblNewLabel_1 = new JLabel("新密码");
		lblNewLabel_1.setIcon(new ImageIcon(Main.class.getResource("/picture/钥匙.png")));
		lblNewLabel_1.setFont(new Font("微软雅黑", Font.BOLD, 18));
		lblNewLabel_1.setBounds(218, 160, 91, 31);
		desktopPane_4.add(lblNewLabel_1);

		JLabel lblNewLabel_2 = new JLabel("确认密码");
		lblNewLabel_2.setFont(new Font("微软雅黑", Font.BOLD, 18));
		lblNewLabel_2.setBounds(236, 217, 79, 34);
		desktopPane_4.add(lblNewLabel_2);

		confirmButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent ae) {
				Changepassword(ae);
			}
		});
		confirmButton.setFont(new Font("微软雅黑", Font.PLAIN, 18));
		confirmButton.setBounds(310, 299, 114, 34);
		desktopPane_4.add(confirmButton);

		JLabel NowUserlabel = new JLabel("当前用户");
		NowUserlabel.setFont(new Font("微软雅黑", Font.BOLD, 18));
		NowUserlabel.setBounds(56, 0, 99, 42);
		desktopPane_4.add(NowUserlabel);

		newpasswordField = new JPasswordField();
		newpasswordField.setBounds(341, 164, 156, 29);
		desktopPane_4.add(newpasswordField);

		confirmpasswordField = new JPasswordField();
		confirmpasswordField.setBounds(341, 218, 156, 29);
		desktopPane_4.add(confirmpasswordField);

		JLabel nowUsertype = new JLabel("");
		nowUsertype.setFont(new Font("微软雅黑", Font.BOLD, 18));
		nowUsertype.setBounds(147, 5, 477, 32);
		desktopPane_4.add(nowUsertype);

		JDesktopPane desktopPane_5 = new JDesktopPane();
		desktopPane_5.setBackground(UIManager.getColor("Button.background"));
		tabbedPane.addTab("退出系统\r\n", new ImageIcon(Main.class.getResource("/picture/推出.png")), desktopPane_5, null);

		JInternalFrame internalFrame = new JInternalFrame("退出系统");
		internalFrame.setFrameIcon(new ImageIcon(Main.class.getResource("/picture/推出.png")));
		internalFrame.setBounds(183, 91, 330, 279);
		desktopPane_5.add(internalFrame);

		JLabel lblNewLabel_3 = new JLabel("确定退出系统吗？");
		lblNewLabel_3.setFont(new Font("微软雅黑", Font.BOLD, 18));

		JButton btnNewButton = new JButton("确定");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		btnNewButton.setFont(new Font("微软雅黑", Font.PLAIN, 15));
		GroupLayout groupLayout = new GroupLayout(internalFrame.getContentPane());
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(104)
					.addComponent(btnNewButton, GroupLayout.PREFERRED_SIZE, 97, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(81, Short.MAX_VALUE))
				.addGroup(Alignment.TRAILING, groupLayout.createSequentialGroup()
					.addContainerGap(85, Short.MAX_VALUE)
					.addComponent(lblNewLabel_3, GroupLayout.PREFERRED_SIZE, 158, GroupLayout.PREFERRED_SIZE)
					.addGap(75))
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(66)
					.addComponent(lblNewLabel_3, GroupLayout.PREFERRED_SIZE, 40, GroupLayout.PREFERRED_SIZE)
					.addGap(52)
					.addComponent(btnNewButton)
					.addContainerGap(63, Short.MAX_VALUE))
		);
		internalFrame.getContentPane().setLayout(groupLayout);
		internalFrame.setVisible(true);
		if ("管理员".equals(this.userType.getName())) {
			ad = (admin) this.userObject;
			nowUsertype.setText("[" + this.userType.getName().toString() + "]:" + ad.getName());
		} else if ("员工".equals(this.userType.getName())) {
			em = (employee) this.userObject;
			nowUsertype.setText("[" + this.userType.getName().toString() + "]:" + em.getName());
		}
		if (this.userType.toString().equals("管理员")) {
			setTable(informtable);
			setTable(SearchInformtable);
			setpersonneltable();
		}

		Integer i = new Integer(ID);
		authoritytype.setText("[" + this.userType.getName() + "]");

		Adminpasswd.setBounds(218, 233, 162, 33);
		desktopPane_3.add(Adminpasswd);

		if (this.userType.toString().equals("管理员")) {
			enterinform.setEnabled(true);
		}
		if (this.userType.toString().equals("管理员")) {
			impowerButton.setEnabled(true);
		}
		if (this.userType.toString().equals("管理员")) {
			deprivepower.setEnabled(true);
		}
	}


	//修改人事信息
	 protected void changeInform(ActionEvent e) {
		// TODO Auto-generated method stub
		if ((changejob.getSelectedIndex() - 1) != to_be_change.getJob()) {
			personnel_change change = new personnel_change();
			Personnel personnel = new Personnel();
			Counter count = new Counter();
			change.update(count.getCounter("C"), to_be_change.getId(), personnel.getPersonnel("职务变动"), "职务变动："+changejob.getItemAt(to_be_change.getJob()+1).toString()+"->"+changejob.getSelectedItem().toString());
			count.updateCounter("C");
			setpersonneltable();
		}
		if (change_name.getText().toString().equals("") || changeaddress.getText().toString().equals("")
				|| changeemail.getText().toString().equals("") || changenote.getText().toString().equals("")
				|| changeskill.getText().toString().equals("") || changetele.getText().toString().equals("")) {
			JOptionPane.showMessageDialog(this, "请填写完整信息！");
		}
			to_be_change.setName(change_name.getText().toString());
		to_be_change.setBirth(changeyear.getSelectedItem().toString() + "-" + changemonth.getSelectedItem().toString()
				+ "-" + changeday.getSelectedItem().toString());
		to_be_change
				.setSex(change_man.isSelected() ? change_man.getText().toString() : change_woman.getText().toString());
		to_be_change.setDepartment(changedepartment.getSelectedIndex() - 1);
		to_be_change.setJob(changejob.getSelectedIndex() - 1);
		to_be_change.setEdu(changeedu.getSelectedIndex() - 1);
		to_be_change.setEmail(changeemail.getText().toString());
		to_be_change.setTele(changetele.getText().toString());
		to_be_change.setAddress(changeaddress.getText().toString());
		to_be_change.setSkill(changeskill.getText().toString());
		to_be_change.setNote(changenote.getText().toString());
		informEnter temp = new informEnter();
		String res = temp.changeinform(to_be_change);
		JOptionPane.showMessageDialog(this, res);
		to_be_change = new inform();
		change_name.setText("");
		buttonGroup_4.clearSelection();
		buttonGroup_5.clearSelection();
		changeaddress.setText("");
		changed_id.setText("");
		changeemail.setText("");
		changenote.setText("");
		changeskill.setText("");
		changetele.setText("");
		changeyear.setSelectedIndex(0);
		changemonth.setSelectedIndex(0);
		changeday.setSelectedIndex(0);
		changedepartment.setSelectedIndex(0);
		changejob.setSelectedIndex(0);
		changeedu.setSelectedIndex(0);
		changebutton.setEnabled(false);
		setTable(informtable);
		setTable(SearchInformtable);
	}
   
	 //设置修改信息窗口
	protected void set_change_inform(ActionEvent e) {
		// TODO Auto-generated method stub
		int id = Integer.parseInt(changed_id.getText().toString());
		if (this.userType.toString().equals("员工") && em.getId() != id) {
			JOptionPane.showMessageDialog(this, "你没有权限进行此操作！");
			return;
		}
		Counter count=new Counter();
		if(id>=count.getCounter("P")) {
			JOptionPane.showMessageDialog(this,"目标员工不存在！");
			return;
		}
		informEnter temp = new informEnter();
		to_be_change = temp.searchInform(id);
		String[] s = to_be_change.getBirth().split("-");
		change_name.setText(to_be_change.getName());
		changeyear.setSelectedItem(s[0]);
		changemonth.setSelectedItem(s[1]);
		changeday.setSelectedItem(s[2]);
		change_man.setSelected(to_be_change.getSex().equals("男"));
		change_woman.setSelected(to_be_change.getSex().equals("女"));
		change_is_em.setSelected(to_be_change.getIsemployee().equals("T-员工"));
		change_not_em.setSelected(to_be_change.getIsemployee().equals("F-非员工"));
		changedepartment.setSelectedIndex(to_be_change.getDepartment() + 1);
		changejob.setSelectedIndex(to_be_change.getJob() + 1);
		changeedu.setSelectedIndex(to_be_change.getEdu() + 1);
		changeemail.setText(to_be_change.getEmail());
		changetele.setText(to_be_change.getTele());
		changeaddress.setText(to_be_change.getAddress());
		changeskill.setText(to_be_change.getSkill());
		changenote.setText(to_be_change.getNote());
		changebutton.setEnabled(true);
	}
 
	
	//删除人事信息
	protected void deleteInform(ActionEvent e) {
		// TODO Auto-generated method stub
		if ("管理员".equals(this.userType.toString())) {
			if (!deletepasswordField.getText().toString().equals(ad.getPassword())) {
				JOptionPane.showMessageDialog(this, "密码错误！");
				return;
			} else {
				informEnter temp = new informEnter();
				int id = Integer.parseInt(deleteIdfield.getText().toString());
				temp.deleteInform(id);
				JOptionPane.showMessageDialog(this,"删除成功！");
				Personnel person = new Personnel();
				personnel_change change = new personnel_change();
				Counter count = new Counter();
				change.update(count.getCounter("C"), id, person.getPersonnel("辞退"), "辞退");
				count.updateCounter("C");
				deleteIdfield.setText("");
				deletepasswordField.setText("");
				setTable(informtable);
				setTable(SearchInformtable);
				setpersonneltable();
			}
		} else {
			JOptionPane.showMessageDialog(this, "你无权进行此操作！");
			return;
		}
	}
       
	//取消管理员权限
	protected void deprivePower(ActionEvent e) {
		// TODO Auto-generated method stub
		if ("".equals(impowerId.getText().toString()) || "".equals(impowerName.getText().toString())
				|| (!impowermanRadioButton.isSelected() && !impowerwomanRadioButton.isSelected())) {
			JOptionPane.showMessageDialog(this, "请填写完整信息！");
		}
		if ("员工".equals(this.userType.getName())) {
			JOptionPane.showMessageDialog(this, "你无权进行此操作！");
			return;
		} else if ("管理员".equals(this.userType.getName()) && ad.getId() != 1) {
			JOptionPane.showMessageDialog(this, "你无权进行此操作！");
			return;
		} else {
			if (!Adminpasswd.getText().toString().equals(ad.getPassword())) {
				JOptionPane.showMessageDialog(this, "当前用户密码错误！");
			}
			informEnter temp = new informEnter();
			int id = Integer.parseInt(impowerId.getText().toString());
			String str = temp.deprivePower(id, impowerName.getText().toString(),
					impowermanRadioButton.isSelected() ? impowermanRadioButton.getText().toString()
							: impowerwomanRadioButton.getText().toString());
			JOptionPane.showMessageDialog(this, str);
			setTable(informtable);
		}
		impowerId.setText("");
		impowerName.setText("");
		Adminpasswd.setText("");
		buttonGroup_3.clearSelection();
	}

	//授予管理员权限
	protected void impower(ActionEvent e) {
		// TODO Auto-generated method stub
		if ("".equals(impowerId.getText().toString()) || "".equals(impowerName.getText().toString())
				|| (!impowermanRadioButton.isSelected() && !impowerwomanRadioButton.isSelected())) {
			JOptionPane.showMessageDialog(this, "请填写完整信息！");
		}
		if ("员工".equals(this.userType.getName())) {
			JOptionPane.showMessageDialog(this, "你无权进行此操作！");
			return;
		} else {
			if (!Adminpasswd.getText().toString().equals(ad.getPassword())) {
				JOptionPane.showMessageDialog(this, "密码错误！");
			}
			int id = Integer.parseInt(impowerId.getText().toString());
			informEnter im = new informEnter();
			String str = im.impower(id, impowerName.getText().toString(),
					impowermanRadioButton.isSelected() ? impowermanRadioButton.getText().toString()
							: impowerwomanRadioButton.getText().toString());
			JOptionPane.showMessageDialog(this, str);
			setTable(informtable);
		}
		impowerId.setText("");
		impowerName.setText("");
		Adminpasswd.setText("");
		buttonGroup_3.clearSelection();
	}
    
	//查询人事信息
	protected void searchInformtable(ActionEvent ae) {
		// TODO Auto-generated method stub
		DefaultTableModel dft = (DefaultTableModel) SearchInformtable.getModel();
		if (this.userType.toString().equals("员工") && !em.getName().equals(searchNametextField.getText().toString())) {
			JOptionPane.showMessageDialog(this, "你没有权限查看他人信息！");
			searchNametextField.setText("");
			dft.setRowCount(0);
			return;
		}
		dft.setRowCount(0);
		informEnter informtemp = new informEnter();
		List<inform> list = informtemp.searchInform(searchNametextField.getText().toString());
		for (inform temp : list) {
			Vector v = new Vector<>();
			v.add(temp.getId());
			v.add(temp.getAuthority());
			v.add(temp.getName());
			v.add(temp.getSex());
			v.add(temp.getBirth());
			v.add(temp.getDepartment());
			v.add(temp.getJob());
			v.add(temp.getEdu());
			v.add(temp.getSkill());
			v.add(temp.getAddress());
			v.add(temp.getTele());
			v.add(temp.getEmail());
			v.add(temp.getIsemployee());
			v.add(temp.getNote());
			dft.addRow(v);
		}
		searchNametextField.setText("");
		buttonGroup_2.clearSelection();
	}
	
	//查询人事变动记录并设置表格
	protected void searchpersonnel(ActionEvent e) {
		// TODO Auto-generated method stub
		Personnel personnel=new Personnel();
		List<Personnel> list=personnel.searchpersonnelList(Integer.parseInt(searchpersonnelID.getText()));
		DefaultTableModel dft = (DefaultTableModel) personneltable.getModel();
    	dft.setRowCount(0);
    	for(Personnel temp:list) {
    		Vector v=new Vector<>();
    		v.add(temp.getId());
    		v.add(temp.getPerson());
    		v.add(temp.getDescription());
    		dft.addRow(v);
    	}
	}
	
	protected void resetpersonnel(ActionEvent e) {
		// TODO Auto-generated method stub
		setpersonneltable();
		searchpersonnelID.setText("");
	}
	
	//设置人事变动记录表
    private void setpersonneltable() {
    	DefaultTableModel dft = (DefaultTableModel) personneltable.getModel();
    	dft.setRowCount(0);
    	Personnel  persontemp=new Personnel();
    	List<Personnel> list=persontemp.getpersonnelList();
    	for(Personnel temp:list) {
    		Vector v=new Vector<>();
    		v.add(temp.getId());
    		v.add(temp.getPerson());
    		v.add(temp.getDescription());
    		dft.addRow(v);
    	}
    }
    
    //设置人事信息表
	private void setTable(JTable table) {
		DefaultTableModel dft = (DefaultTableModel) table.getModel();
		dft.setRowCount(0);
		informEnter informtemp = new informEnter();
		List<inform> list = informtemp.getinformList();
		for (inform temp : list) {
			Vector v = new Vector<>();
			v.add(temp.getId());
			v.add(temp.getAuthority());
			v.add(temp.getName());
			v.add(temp.getSex());
			v.add(temp.getBirth());
			v.add(temp.getDepartment());
			v.add(temp.getJob());
			v.add(temp.getEdu());
			v.add(temp.getSkill());
			v.add(temp.getAddress());
			v.add(temp.getTele());
			v.add(temp.getEmail());
			v.add(temp.getIsemployee());
			v.add(temp.getNote());
			dft.addRow(v);
		}
	}
   
	//保存人事信息
	protected void enterinform(ActionEvent ae) {
		// TODO Auto-generated method stub
		String name = nametextField.getText();
		String authority = authoritytextField.getText().toString();
		String birth = yearcomboBox.getSelectedItem().toString() + '-' + monthcomboBox.getSelectedItem().toString()
				+ '-' + daycomboBox.getSelectedItem().toString();
		String sex = manRadioButton.isSelected() ? manRadioButton.getText().toString()
				: womanRadioButton.getText().toString();
		String setpasswd = seTpasswordField.getText().toString().equals("") ? "123"
				: seTpasswordField.getText().toString();
		String isEmployee = isemRadioButton.isSelected() ? isemRadioButton.getText().toString()
				: notemRadioButton.getText().toString();
		String department = departmentcomboBox.getSelectedItem().toString();
		String job = jobcomboBox.getSelectedItem().toString();
		String email = emailtextField.getText().toString();
		String tele = teltextField.getText().toString();
		String skill = skilltextField.getText().toString();
		String edu = educomboBox.getSelectedItem().toString();
		String address = addresstextField.getText().toString();
		String note = somethingtextField.getText().toString();
		if (confirm.IsEmpty(name) || confirm.IsEmpty(authority) || confirm.IsEmpty(birth) || confirm.IsEmpty(sex)
				|| confirm.IsEmpty(setpasswd) || confirm.IsEmpty(isEmployee) || confirm.IsEmpty(department)
				|| confirm.IsEmpty(job) || confirm.IsEmpty(email) || confirm.IsEmpty(tele) || confirm.IsEmpty(skill)
				|| confirm.IsEmpty(edu) || confirm.IsEmpty(address) || confirm.IsEmpty(note)) {
			JOptionPane.showMessageDialog(this, "请填写完整信息！");
			return;
		}
		id.updateCounter("P");
		Integer tmp = new Integer(id.getCounter("P"));
		IDtextField.setText(tmp.toString());
		Department depart = new Department();
		Job JOB = new Job();
		edulevel Edu = new edulevel();
		Personnel person = new Personnel();
		inform informtemp = new inform(ID, name, birth, setpasswd, authority, sex, isEmployee,
				depart.getDepartment(department), JOB.getJob(job), email, tele, skill, Edu.getedulevel(edu), address,
				note);
		informEnter in = new informEnter();
		String message = in.enterinform(informtemp);
		JOptionPane.showMessageDialog(this, message);
		update_empleyee up = new update_empleyee();
		up.update(ID, name, setpasswd);
		nametextField.setText("");
		yearcomboBox.setSelectedIndex(0);
		monthcomboBox.setSelectedIndex(0);
		daycomboBox.setSelectedIndex(0);
		buttonGroup.clearSelection();
		buttonGroup_1.clearSelection();
		seTpasswordField.setText("");
		departmentcomboBox.setSelectedIndex(0);
		jobcomboBox.setSelectedIndex(0);
		emailtextField.setText("");
		teltextField.setText("");
		skilltextField.setText("");
		educomboBox.setSelectedIndex(0);
		addresstextField.setText("");
		somethingtextField.setText("");

		personnel_change change = new personnel_change();
		change.update(id.getCounter("C"), ID, person.getPersonnel("新员工加入"), "新员工加入");
		id.updateCounter("C");
		setTable(informtable);
		setTable(SearchInformtable);
		setpersonneltable();
	}

	//修改密码
	protected void Changepassword(ActionEvent ae) {
		String oldpasswd = oldpasswordField.getText().toString();
		String newpasswd = newpasswordField.getText().toString();
		String confirmpasswd = confirmpasswordField.getText().toString();
		if ("管理员".equals(this.userType.getName())) {
			if (!oldpasswd.equals(ad.getPassword())) {
				JOptionPane.showMessageDialog(this, "原密码不正确！");
				return;
			}
		} else if ("员工".equals(this.userType.getName())) {
			if (!oldpasswd.equals(em.getPassword())) {
				JOptionPane.showMessageDialog(this, "原密码不正确！");
				return;
			}
		}

		if (confirm.IsEmpty(oldpasswd)) {
			JOptionPane.showMessageDialog(this, "请填写原密码！");
			return;
		}
		if (confirm.IsEmpty(newpasswd)) {
			JOptionPane.showMessageDialog(this, "请填写新密码！");
			return;
		}

		if (confirm.IsEmpty(confirmpasswd)) {
			JOptionPane.showMessageDialog(this, "请确认新密码！");
			return;
		}
		if (confirmpasswd.equals(newpasswd)) {
			if ("管理员".equals(this.userType.getName())) {
				adminLogin adlogin = new adminLogin();
				admin admintemp = new admin();
				admintemp.setName(ad.getName());
				admintemp.setPassword(oldpasswd);
				JOptionPane.showMessageDialog(this, adlogin.editpassword1(admintemp, newpasswd));
			} else if ("员工".equals(this.userType.getName())) {
				employeeLogin emlogin = new employeeLogin();
				employee employeetemp = new employee();
				employeetemp.setName(em.getName());
				employeetemp.setPassword(oldpasswd);
				JOptionPane.showMessageDialog(this, emlogin.editpassword2(employeetemp, newpasswd));
			}
			oldpasswordField.setText("");
			newpasswordField.setText("");
			confirmpasswordField.setText("");
			return;
		} else {
			JOptionPane.showMessageDialog(this, "两次输入的新密码不同！");
			return;
		}
	}
}
