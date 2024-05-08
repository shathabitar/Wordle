package wordleevent;

import java.awt.EventQueue;

import javax.swing.*;
import javax.swing.border.EmptyBorder;

import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.awt.event.ActionEvent;
import java.awt.Color;
import java.awt.Font;
import java.awt.*;

public class Main extends JFrame {

	private JPanel contentPane;
	private String choice;
	private int count = 0;
	private int[] original = { 39, 96, 154, 212, 271 };
	private int num = 120;
	private int[] scores = new int[5];
	private boolean Won;
	private JLabel labell = new JLabel("Wordle");
	private JTextField text0;
	private JTextField text1;
	private JTextField text2;
	private JTextField text3;
	private JTextField text4;
	private JTextField text[];
	private JLabel label;
	private JLabel label_1;
	private JLabel label_2;
	private JLabel label_3;
	private JLabel label_4;
	private JLabel label_5;
	private JLabel label_6;
	private JLabel label_7;
	private JLabel label_8;
	private JLabel label_9;
	private JLabel label_10;
	private JLabel label_11;
	private JLabel label_12;
	private JLabel label_13;
	private JLabel label_14;
	private JLabel label_15;
	private JLabel label_16;
	private JLabel label_17;
	private JLabel label_18;
	private JLabel label_19;
	private JLabel label_20;
	private JLabel label_21;
	private JLabel label_22;
	private JLabel label_23;
	private JLabel label_24;
	private ArrayList<JLabel> labels = new ArrayList<JLabel>();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Main frame = new Main();
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
	public Main() {
		Font font = new Font("Tahoma", Font.PLAIN, 30);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 355, 404);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);

		labell.setFont(font);
		labell.setBounds(135, 10, 281, 50);
		contentPane.add(labell);

		text0 = new JTextField(1);
		text0.setBounds(38, 65, 48, 45);
		text0.setFont(font);
		contentPane.add(text0);
		text0.setColumns(10);

		text1 = new JTextField(1);
		text1.setColumns(10);
		text1.setFont(font);
		text1.setBounds(96, 65, 48, 45);
		contentPane.add(text1);

		text2 = new JTextField(1);
		text2.setColumns(10);
		text2.setFont(font);
		text2.setBounds(154, 65, 48, 45);
		contentPane.add(text2);

		text3 = new JTextField(1);
		text3.setColumns(10);
		text3.setFont(font);
		text3.setBounds(212, 65, 48, 45);
		contentPane.add(text3);

		text4 = new JTextField(1);
		text4.setColumns(10);
		text4.setBounds(271, 65, 48, 45);
		text4.setFont(font);
		contentPane.add(text4);
		text = new JTextField[] { text0, text1, text2, text3, text4 };

		label = new JLabel("");
		label.setBackground(new Color(255, 255, 255));
		label.setBounds(38, 65, 48, 45);
		label.setFont(font);
		label.setOpaque(true);
		contentPane.add(label);

		label_1 = new JLabel("");
		label_1.setOpaque(true);
		label_1.setBackground(Color.WHITE);
		label_1.setBounds(96, 65, 48, 45);
		label_1.setFont(font);
		contentPane.add(label_1);

		label_2 = new JLabel("");
		label_2.setOpaque(true);
		label_2.setBackground(Color.WHITE);
		label_2.setBounds(154, 65, 48, 45);
		label_2.setFont(font);
		contentPane.add(label_2);

		label_3 = new JLabel("");
		label_3.setOpaque(true);
		label_3.setBackground(Color.WHITE);
		label_3.setBounds(212, 65, 48, 45);
		label_3.setFont(font);
		contentPane.add(label_3);

		label_4 = new JLabel("");
		label_4.setOpaque(true);
		label_4.setBackground(Color.WHITE);
		label_4.setBounds(271, 65, 48, 45);
		label_4.setFont(font);
		contentPane.add(label_4);

		label_5 = new JLabel("");
		label_5.setOpaque(true);
		label_5.setBackground(Color.WHITE);
		label_5.setBounds(38, 120, 48, 45);
		label_5.setFont(font);
		contentPane.add(label_5);

		label_6 = new JLabel("");
		label_6.setOpaque(true);
		label_6.setBackground(Color.WHITE);
		label_6.setBounds(96, 120, 48, 45);
		label_6.setFont(font);
		contentPane.add(label_6);

		label_7 = new JLabel("");
		label_7.setOpaque(true);
		label_7.setBackground(Color.WHITE);
		label_7.setBounds(154, 120, 48, 45);
		label_7.setFont(font);
		contentPane.add(label_7);

		label_8 = new JLabel("");
		label_8.setOpaque(true);
		label_8.setBackground(Color.WHITE);
		label_8.setBounds(212, 120, 48, 45);
		label_8.setFont(font);
		contentPane.add(label_8);

		label_9 = new JLabel("");
		label_9.setOpaque(true);
		label_9.setBackground(Color.WHITE);
		label_9.setBounds(271, 120, 48, 45);
		label_9.setFont(font);
		contentPane.add(label_9);

		label_10 = new JLabel("");
		label_10.setOpaque(true);
		label_10.setBackground(Color.WHITE);
		label_10.setBounds(38, 175, 48, 45);
		label_10.setFont(font);
		contentPane.add(label_10);

		label_11 = new JLabel("");
		label_11.setOpaque(true);
		label_11.setBackground(Color.WHITE);
		label_11.setBounds(96, 175, 48, 45);
		label_11.setFont(font);
		contentPane.add(label_11);

		label_12 = new JLabel("");
		label_12.setOpaque(true);
		label_12.setBackground(Color.WHITE);
		label_12.setBounds(154, 175, 48, 45);
		label_12.setFont(font);
		contentPane.add(label_12);

		label_13 = new JLabel("");
		label_13.setOpaque(true);
		label_13.setBackground(Color.WHITE);
		label_13.setBounds(212, 175, 48, 45);
		label_13.setFont(font);
		contentPane.add(label_13);

		label_14 = new JLabel("");
		label_14.setOpaque(true);
		label_14.setBackground(Color.WHITE);
		label_14.setBounds(271, 175, 48, 45);
		label_14.setFont(font);
		contentPane.add(label_14);

		label_15 = new JLabel("");
		label_15.setOpaque(true);
		label_15.setBackground(Color.WHITE);
		label_15.setBounds(38, 230, 48, 45);
		label_15.setFont(font);
		contentPane.add(label_15);

		label_16 = new JLabel("");
		label_16.setOpaque(true);
		label_16.setBackground(Color.WHITE);
		label_16.setBounds(96, 230, 48, 45);
		label_16.setFont(font);
		contentPane.add(label_16);

		label_17 = new JLabel("");
		label_17.setOpaque(true);
		label_17.setBackground(Color.WHITE);
		label_17.setBounds(154, 230, 48, 45);
		label_17.setFont(font);
		contentPane.add(label_17);

		label_18 = new JLabel("");
		label_18.setOpaque(true);
		label_18.setBackground(Color.WHITE);
		label_18.setBounds(212, 230, 48, 45);
		label_18.setFont(font);
		contentPane.add(label_18);

		label_19 = new JLabel("");
		label_19.setOpaque(true);
		label_19.setBackground(Color.WHITE);
		label_19.setBounds(271, 230, 48, 45);
		label_19.setFont(font);
		contentPane.add(label_19);

		label_20 = new JLabel("");
		label_20.setOpaque(true);
		label_20.setBackground(Color.WHITE);
		label_20.setBounds(38, 285, 48, 45);
		label_20.setFont(font);
		contentPane.add(label_20);

		label_21 = new JLabel("");
		label_21.setOpaque(true);
		label_21.setBackground(Color.WHITE);
		label_21.setBounds(96, 285, 48, 45);
		label_21.setFont(font);
		contentPane.add(label_21);

		label_22 = new JLabel("");
		label_22.setOpaque(true);
		label_22.setBackground(Color.WHITE);
		label_22.setBounds(154, 285, 48, 45);
		label_22.setFont(font);
		contentPane.add(label_22);

		label_23 = new JLabel("");
		label_23.setOpaque(true);
		label_23.setBackground(Color.WHITE);
		label_23.setBounds(212, 285, 48, 45);
		label_23.setFont(font);
		contentPane.add(label_23);

		label_24 = new JLabel("");
		label_24.setOpaque(true);
		label_24.setBackground(Color.WHITE);
		label_24.setBounds(271, 285, 48, 45);
		label_24.setFont(font);
		contentPane.add(label_24);

		labels.add(label);
		labels.add(label_1);
		labels.add(label_2);
		labels.add(label_3);
		labels.add(label_4);
		labels.add(label_5);
		labels.add(label_6);
		labels.add(label_7);
		labels.add(label_8);
		labels.add(label_9);
		labels.add(label_10);
		labels.add(label_11);
		labels.add(label_12);
		labels.add(label_13);
		labels.add(label_14);
		labels.add(label_15);
		labels.add(label_16);
		labels.add(label_17);
		labels.add(label_18);
		labels.add(label_19);
		labels.add(label_20);
		labels.add(label_21);
		labels.add(label_22);
		labels.add(label_23);
		labels.add(label_24);
		openFile();
		JButton button = new JButton("Enter");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				count++;

				shifting();

				play();

			}
		});
		button.setBounds(136, 336, 85, 21);
		contentPane.add(button);

	}

	public void shifting() {
		for (int i = 0; i < 5; i++) {
			text[i].setBounds(original[i], num, 48, 45);
		}
		num += 55;
		for (int i = 0; i < 5; i++) {
			if (count == 5) {
				contentPane.remove(text[i]);
			}
		}
	}

	public void openFile() {
		File file = new File("/Users/shath/eclipse-workspace/wordle1/src/wordle.txt");
		ArrayList<String> names = new ArrayList<String>();
		try {

			FileReader reader = new FileReader(file);
			BufferedReader reader1 = new BufferedReader(reader);
			while (reader1.readLine() != null) {
				names.add(reader1.readLine());
			}

		} catch (FileNotFoundException e1) {
			e1.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		choice = names.get((int) (Math.random() * names.size()));

	}

	public void play() {

		String guess = getGuessUser();
		for (int i = 0; i < 5; i++) {
			scores[i] = 0;
		}
		int score = checkWord(guess);
		printWord(guess);
		if (score == 10) {
			Won = true;
		}

		if (Won) {
			labell.setText("YOU WON");
			labell.setBounds(115, 10, 281, 50);
			for (int i = 0; i < 5; i++) {
				contentPane.remove(text[i]);
			}
		} else if (count == 5) {
			labell.setFont(new Font("Tahoma", Font.PLAIN, 14));
			labell.setText("Better luck next time, the word was " + choice);
			labell.setBounds(90, 10, 281, 50);
			for (int i = 0; i < 5; i++) {
				contentPane.remove(text[i]);
			}
		}
	}

	public String getGuessUser() {
		String guess = "";
		for (int i = 0; i < 5; i++) {
			guess += text[i].getText();
		}
		return guess;
	}

	public int checkWord(String guess) {
		int score = 0;
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				if (guess.charAt(i) == choice.charAt(i)) {
					scores[i] = 2;
					score += scores[i];
					break;
				} else if (guess.charAt(i) == choice.charAt(j)) {
					scores[i] = 1;
				}
				score += scores[i];
			}
		}
		return score;
	}

	public void printWord(String guess) {
		for (int i = 0; i < 5; i++) {
			labels.get(i).setText(String.valueOf(guess.charAt(i)));
			if (scores[i] == 2) {
				labels.get(i).setBackground(Color.GREEN);
			} else if (scores[i] == 1) {
				labels.get(i).setBackground(Color.YELLOW);
			} else if (scores[i] == 0) {
				labels.get(i).setBackground(Color.red);
			}
		}
		for (int i = 0; i < 5; i++) {
			labels.remove(0);
		}

	}
}
