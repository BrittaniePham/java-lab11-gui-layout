package lab11_gui_layout;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import java.awt.GridLayout;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.awt.event.ActionEvent;
import java.awt.Color;

public class GuiLayout extends JFrame {

	private JPanel contentPane;
	private ArrayList<JLabel> labels;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GuiLayout frame = new GuiLayout();
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
	public GuiLayout() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(0, 0));
		
		JLabel lblNewLabel = new JLabel("Demo Layout");
		lblNewLabel.setBorder(new EmptyBorder(10, 0, 10, 0));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Lucida Grande", Font.PLAIN, 19));
		contentPane.add(lblNewLabel, BorderLayout.NORTH);
		
		JPanel panel = new JPanel();
		contentPane.add(panel, BorderLayout.WEST);
		panel.setLayout(new GridLayout(2, 0, 0, 0));
		
		JPanel panel_1 = new JPanel();
		contentPane.add(panel_1, BorderLayout.CENTER);
		panel_1.setLayout(new GridLayout(1, 0, 0, 0));
		
		JLabel label_1 = new JLabel("1");
		label_1.setOpaque(true);
		label_1.setBackground(Color.YELLOW);
		label_1.setHorizontalAlignment(SwingConstants.CENTER);
		label_1.setFont(new Font("Lucida Grande", Font.PLAIN, 31));
		panel_1.add(label_1);
		
		JLabel label_2 = new JLabel("2");
		label_2.setBackground(Color.BLUE);
		label_2.setOpaque(true);
		label_2.setHorizontalAlignment(SwingConstants.CENTER);
		label_2.setFont(new Font("Lucida Grande", Font.PLAIN, 31));
		panel_1.add(label_2);
		
		JLabel label_3 = new JLabel("3");
		label_3.setOpaque(true);
		label_3.setBackground(Color.YELLOW);
		label_3.setHorizontalAlignment(SwingConstants.CENTER);
		label_3.setFont(new Font("Lucida Grande", Font.PLAIN, 31));
		panel_1.add(label_3);
		
		JLabel label_4 = new JLabel("4");
		label_4.setBackground(Color.YELLOW);
		label_4.setOpaque(true);
		label_4.setHorizontalAlignment(SwingConstants.CENTER);
		label_4.setFont(new Font("Lucida Grande", Font.PLAIN, 31));
		panel_1.add(label_4);
		
		labels = new ArrayList<>();
		labels.add(label_1);
		labels.add(label_2);
		labels.add(label_3);
		labels.add(label_4);
		
		JButton btnNewButton = new JButton("==>");
		JButton btnNewButton_1 = new JButton("<==");
		panel.add(btnNewButton_1);
		panel.add(btnNewButton);
		
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int currentBlue = 0;
				for(int i = 0; i < labels.size(); ++i) {					
					if(labels.get(i).getBackground() == Color.BLUE) {
						currentBlue = i;
					}	
				}
				if(currentBlue == 0) {
					labels.get(labels.size() - 1).setBackground(Color.BLUE);
					labels.get(0).setBackground(Color.YELLOW);
				} else {
					labels.get(currentBlue - 1).setBackground(Color.BLUE);
					labels.get(currentBlue).setBackground(Color.YELLOW);
				}
			}
		});
		
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int currentBlue = 0;
				for(int i = 0; i < labels.size(); ++i) {					
					if(labels.get(i).getBackground() == Color.BLUE) {
						currentBlue = i;
					}	
				}
				if(currentBlue == labels.size() - 1) {
					labels.get(0).setBackground(Color.BLUE);
					labels.get(labels.size() - 1).setBackground(Color.YELLOW);
				} else {
					labels.get(currentBlue + 1).setBackground(Color.BLUE);
					labels.get(currentBlue).setBackground(Color.YELLOW);
				}
			}
		});
	}

}
