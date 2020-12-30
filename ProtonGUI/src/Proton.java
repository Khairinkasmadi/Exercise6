import java.awt.EventQueue;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Color;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JComboBox;
import javax.swing.JTextField;

public class Proton {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Proton window = new Proton();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Proton() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(Color.WHITE);
		frame.setBounds(900, 900, 2000, 2000);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setResizable(true);
		
		JLabel Label1 = new JLabel("New label");
		Label1.setBounds(16, 27, 500, 96);
		Image img = new ImageIcon(this.getClass().getResource("/ProtonInspiring.jpg")).getImage();
		Image imgScale = img.getScaledInstance(Label1.getWidth(),Label1.getHeight(), Image.SCALE_SMOOTH);
		ImageIcon scaledIcon = new ImageIcon(imgScale);
		frame.getContentPane().setLayout(null);
		Label1.setIcon(scaledIcon);
		Label1.setIcon(new ImageIcon(img));
		frame.getContentPane().add(Label1);
		
		JLabel Label2 = new JLabel("New label");
		Label2.setBounds(80, 230, 438, 170);
		Label2.setIcon(new ImageIcon("/Users/khairinkasmadi/Desktop/Java/ProtonGUI/img/X50..png"));
	
		
       // Image imgScale = img.getScaledInstance(Label2.getWidth(),Label2.getHeight(), Image.SCALE_SMOOTH);
		
		//ImageIcon scaledIcon = new ImageIcon(imgScale);
		//Label2.setIcon(scaledIcon);
		frame.getContentPane().add(Label2);
		
		JButton Button1 = new JButton("X50");
		Button1.setBounds(535, 302, 117, 29);
		Button1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				JOptionPane.showMessageDialog(null, "Price & Specification" + "\n1.5T STANDARD\n"+"\nPrice: RM79,200*" 
				+"\nColours: Snow White, Armour Silver, Jet Grey, Ocean Blue, Passion Red"+"\nAccessories: Carpet Mats, Safety Triangle"+"\nInterest Rate(%): 3.5 /5years"+"\nMonthly Installment: RM 1,395.9");
				
			
				
				
				
			}
		});
		frame.getContentPane().add(Button1);
		
		JButton Button2 = new JButton("X70");
		Button2.setBounds(535, 562, 117, 29);
		Button2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				JOptionPane.showMessageDialog(null, "Price & Specification" + "\nStandard 2WD\n"+"\nPrice: RM94,800*" 
						+"\nColours: Snow White, Armour Silver, Jet Grey, Ocean Blue, Passion Red"+"\nAccessories: Carpet Mats, Safety Triangle"+"\nInterest Rate(%): 3.5 /5years"+"\nMonthly Installment: RM 1,670.85");
						
			}
		});
		frame.getContentPane().add(Button2);
		
		JButton btnNewButton_2 = new JButton("SAGA");
		btnNewButton_2.setBounds(1252, 317, 117, 29);
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				JOptionPane.showMessageDialog(null, "Price & Specification" + "\n1.3L STANDARD MT\n"+"\nPrice: RM32,800*" 
						+"\nColours: Snow White, Armour Silver, Jet Grey, Ocean Blue, Passion Red"+"\nAccessories: Carpet Mats, Safety Triangle"+"\nInterest Rate(%): 3.5 /5years"+"\nMonthly Installment: RM 578.1");
						
			}
		});
		frame.getContentPane().add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("PERSONA");
		btnNewButton_3.setBounds(1252, 562, 117, 29);
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				JOptionPane.showMessageDialog(null, "Price & Specification" + "\n1.6L STANDARD\n"+"\nPrice: RM42,600*" 
						+"\nColours: Snow White, Armour Silver, Jet Grey, Ocean Blue, Passion Red"+"\nAccessories: Carpet Mats, Safety Triangle"+"\nInterest Rate(%): 3.5 /5years"+"\nMonthly Installment: RM 750.83");
						
			}
		});
		frame.getContentPane().add(btnNewButton_3);
		
		JLabel Label2_1 = new JLabel("New label");
		Label2_1.setBounds(78, 490, 438, 170);
		Label2_1.setIcon(new ImageIcon("/Users/khairinkasmadi/Desktop/Java/ProtonGUI/img/x70..png"));
		frame.getContentPane().add(Label2_1);
		
		JLabel Label2_2 = new JLabel("New label");
		Label2_2.setBounds(786, 490, 445, 170);
		Label2_2.setIcon(new ImageIcon("/Users/khairinkasmadi/Desktop/Java/ProtonGUI/img/persona...png"));
		frame.getContentPane().add(Label2_2);
		
		JLabel Label2_2_1 = new JLabel("New label");
		Label2_2_1.setBounds(786, 245, 438, 170);
		Label2_2_1.setIcon(new ImageIcon("/Users/khairinkasmadi/Desktop/Java/ProtonGUI/img/saga..png"));
		frame.getContentPane().add(Label2_2_1);
		
		JLabel lblNewLabel = new JLabel("Starting at RM 79,200.00*");
		lblNewLabel.setBounds(545, 337, 167, 41);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblStartingAtRm = new JLabel("Starting at RM 94,800.00*");
		lblStartingAtRm.setBounds(545, 595, 167, 41);
		frame.getContentPane().add(lblStartingAtRm);
		
		JLabel lblStartingAtRm_1 = new JLabel("Starting at RM 32,800.00*");
		lblStartingAtRm_1.setBounds(1262, 348, 167, 41);
		frame.getContentPane().add(lblStartingAtRm_1);
		
		//String[] cars = {"X50", "X70", "SAGA", "PERSONA"};
		JComboBox comboBox = new JComboBox();
		comboBox.setBounds(546, 36, 231, 80);
		comboBox.addItem("X50");
		comboBox.addItem("X70");
		comboBox.addItem("SAGA");
		comboBox.addItem("PERSONA");
		comboBox.setSelectedItem(null);
		//comboBox.setEditable(true);
		comboBox.addActionListener(comboBox);
		frame.getContentPane().add(comboBox);
		
		JLabel lblStartingAtRm_1_1 = new JLabel("Starting at RM 42,600.00*");
		lblStartingAtRm_1_1.setBounds(1262, 595, 167, 41);
		frame.getContentPane().add(lblStartingAtRm_1_1);
		
		JLabel lblFindACar = new JLabel("Book Now");
		lblFindACar.setBounds(776, 54, 167, 41);
		frame.getContentPane().add(lblFindACar);
	}
	

	private void add(JLabel label2) {
		// TODO Auto-generated method stub
		
	}
}
