import javax.swing.JFrame;
import net.miginfocom.swing.MigLayout;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import java.awt.Dimension;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.JButton;
import javax.swing.ScrollPaneConstants;

public class Main extends JFrame {
	// ���C�����\�b�h
	public static void main(String[] args) {
		// �^�����̃E�B���h�E��\�����邾��
		Main mainFrame = new Main();
		mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		mainFrame.setSize(360, 240);
		mainFrame.setLocationRelativeTo(null);
		mainFrame.setVisible(true);
	}
	private static final long serialVersionUID = 1L;
	private JTextField NameField;
	private JTextField MessageField;
	private JButton btnNewButton;
	public JTable table;
	private DefaultTableModel tm;
	
	public Main() {
		setTitle("���b�Z�[�W");
		getContentPane().setLayout(new MigLayout("", "[480,grow][480,grow]", "[27.00][27.00][30.00][480,grow]"));

		JLabel Namelabel = new JLabel("���O�F");
		getContentPane().add(Namelabel, "cell 0 0,alignx trailing");

		NameField = new JTextField();
		getContentPane().add(NameField, "cell 1 0,grow");
		NameField.setColumns(10);

		JLabel Messagelabel = new JLabel("���b�Z�[�W�F");
		getContentPane().add(Messagelabel, "cell 0 1,alignx trailing");

		MessageField = new JTextField();
		getContentPane().add(MessageField, "cell 1 1,grow");
		MessageField.setColumns(10);

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
}