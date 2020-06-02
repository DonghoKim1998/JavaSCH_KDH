
import java.awt.FlowLayout;

import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JSlider;
import javax.swing.JSpinner;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.SpinnerListModel;

public class Practice6 extends JFrame {
	JPanel panel;
	JButton btn;
	JCheckBox appleBox;
	JCheckBox pearBox;
	JCheckBox cherryBox;
	ButtonGroup bGroup;
	JRadioButton appleRadio;
	JRadioButton pearRadio;
	JRadioButton cherryRadio;
	JSlider slider;
	JLabel name;
	JLabel major;
	JLabel address;
	JTextField nameF;
	JTextField majorF;
	JTextField addressF;
	JLabel pw;
	JPasswordField pwF;
	JSpinner spinner;
	JTextArea tArea;
	JComboBox<String> combo;
	JList list1, list2, list3;

	String[] months = { "January", "Feburary", "March" };
	String fruits[] = { "apple", "banana", "kiwi", "mango", "pear", "peach", "berry", "strawberry", "blackberry" };
	ImageIcon[] images = { new ImageIcon("src/home.jpg"), new ImageIcon("src/renze.jpg"), new ImageIcon("src/key.jpg"),
			new ImageIcon("src/wipi.jpg") };
	ImageIcon chery = new ImageIcon("src/cherry.jpg");

	public static void main(String[] args) {
		Practice6 p6 = new Practice6();
	}

	Practice6() {
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setSize(700, 500);
		setLocationRelativeTo(null);
		setResizable(false);

		panel = new JPanel();
		panel.setLayout(new FlowLayout()); //
		btn = new JButton("버튼");
		appleBox = new JCheckBox("사과");
		pearBox = new JCheckBox("배", true);
		cherryBox = new JCheckBox();
		cherryBox.setIcon(chery);

		cherryBox.setText("체리");
		bGroup = new ButtonGroup();
		appleRadio = new JRadioButton("사과");
		pearRadio = new JRadioButton("배", true);
		cherryRadio = new JRadioButton();
		cherryRadio.setIcon(chery);
		cherryRadio.setText("체리");
		slider = new JSlider(0, 200, 100);
		slider.setMajorTickSpacing(50); // 큰 눈금 간격 5로 설정
		slider.setMinorTickSpacing(10); // 작은 눈금 간격 1로 설정
		slider.setPaintTicks(true); // 눈금을 표시한다.
		slider.setPaintLabels(true); // 값을 레이블로 표시한다.
		name = new JLabel("이름");
		major = new JLabel("학과");
		address = new JLabel("주소");
		nameF = new JTextField(20);
		majorF = new JTextField("컴퓨터공학과(수정)", 20);
		addressF = new JTextField("서울시 ...", 20);
		pw = new JLabel("Enter the password: ");
		pwF = new JPasswordField(20);
		SpinnerListModel listModel = new SpinnerListModel(months);
		spinner = new JSpinner(listModel);
		tArea = new JTextArea("hello", 10, 30);
		combo = new JComboBox<String>(fruits);
		list1 = new JList(fruits);
		list2 = new JList(images);
		list3 = new JList(fruits);

		bGroup.add(appleRadio);
		bGroup.add(pearRadio);
		bGroup.add(cherryRadio);

		panel.add(btn);
		panel.add(appleBox);
		panel.add(pearBox);
		panel.add(cherryBox);
		panel.add(appleRadio);
		panel.add(pearRadio);
		panel.add(cherryRadio);
		panel.add(slider);
		panel.add(name);
		panel.add(nameF);
		panel.add(major);
		panel.add(majorF);
		panel.add(address);
		panel.add(addressF);
		panel.add(pw);
		panel.add(pwF);
		panel.add(spinner);
		panel.add(tArea);
		panel.add(combo);
		panel.add(list1);
		panel.add(list2);
		panel.add(new JScrollPane(list3));
		add(panel);
		requestFocus();
		setFocusable(true);
		setVisible(true);
	}

}