import javax.swing.JFrame;
import net.miginfocom.swing.MigLayout;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.JPanel;

import java.awt.Dimension;
import java.awt.Panel;
import java.awt.ScrollPane;
import javax.swing.JTable;
import javax.swing.JScrollBar;
import javax.swing.table.DefaultTableModel;
import javax.swing.JButton;
import javax.swing.ScrollPaneConstants;
public class Main extends JFrame {
	public JTable table;
	private DefaultTableModel tm;
	public Main() {
		setTitle("���b�Z�[�W");
		getContentPane().setLayout(new MigLayout("", "[grow,grow][grow,grow]", "[27.00][27.00][30.00][grow,grow]"));
		
		JLabel label = new JLabel("���O�F");
		getContentPane().add(label, "cell 0 0,alignx trailing");
		
		textField = new JTextField();
		getContentPane().add(textField, "cell 1 0,grow");
		textField.setColumns(10);
		
		JLabel label_1 = new JLabel("���b�Z�[�W�F");
		getContentPane().add(label_1, "cell 0 1,alignx trailing");
		
		textField_1 = new JTextField();
		getContentPane().add(textField_1, "cell 1 1,grow");
		textField_1.setColumns(10);
		
		//JTable�̍���
				//�e�[�u���ɐݒ肷��񖼂̍쐬
				String[] header = {"���O","���b�Z�[�W"};
				 tm = new DefaultTableModel(header,0);
				  
				  btnNewButton = new JButton("�`���M�`");
				  btnNewButton.setToolTipText("");
				  getContentPane().add(btnNewButton, "cell 0 2 2 1,grow");
				 //JTable�̍쐬
				  table = new JTable(tm);
				  table.setPreferredSize(new Dimension (512,512));
				  //�쐬����JTable�ɃX�N���[���@�\��ݒ�
				  JScrollPane scroll = new JScrollPane(table, 
				          JScrollPane.VERTICAL_SCROLLBAR_ALWAYS, 
				          ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS);
				  scroll.setToolTipText("");
				  getContentPane().add(scroll, "cell 0 3 2 1,grow");
	}
	private static final long serialVersionUID = 1L;
	private JTextField textField;
	private JTextField textField_1;
	private JButton btnNewButton;
	// ���C�����\�b�h
	public static void main(String[] args) {
		// �^�����̃E�B���h�E��\�����邾��
		Main mainFrame = new Main();
		mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		mainFrame.setSize(360, 240);
		mainFrame.setLocationRelativeTo(null);
		mainFrame.setVisible(true);
	}
}