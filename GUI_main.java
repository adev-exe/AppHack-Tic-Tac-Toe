package App_Hack;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;

public class GUI_main {

	private WidgetViewer wv;
	private static JLabel Player1;
	private static JLabel Player2;
	private static JLabel turn;

	private static JButton tile1;
	private static JButton tile2;
	private static JButton tile3;
	private static JButton tile4;
	private static JButton tile5;
	private static JButton tile6;
	private static JButton tile7;
	private static JButton tile8;
	private static JButton tile9;

	private JButton newGame;

	private static int xScore = 0;
	private static int yScore = 0;

	static char turnLetter = 'X';

	static int cnt = 0;

	public GUI_main() {
		wv = new WidgetViewer();
		Player1 = new JLabel("Player X: " + xScore);

		Player1.setFont(new Font("Arial", Font.BOLD, 17));
		Player1.setForeground(Color.BLACK);

		wv.add(Player1, 10, 10, 100, 50);
		Player2 = new JLabel("Player O: " + yScore);
		Player2.setFont(new Font("Arial", Font.BOLD, 17));
		Player2.setForeground(Color.BLACK);

		wv.add(Player2);

		turn = new JLabel("Player turn is " + turnLetter);
		turn.setFont(new Font("Arial", Font.BOLD, 17));
		turn.setForeground(Color.BLACK);

		wv.add(turn, 150, 20, 150, 50);

		tile1 = new JButton();
		tile1.setText(" ");
		tile1.setVisible(true);

		wv.add(tile1, 100, 100, 100, 100);

		tile2 = new JButton();
		tile2.setText(" ");
		wv.add(tile2, 200, 100, 100, 100);

		tile3 = new JButton();
		tile3.setText(" ");
		wv.add(tile3, 300, 100, 100, 100);

		tile4 = new JButton();
		tile4.setText(" ");
		wv.add(tile4, 100, 200, 100, 100);

		tile5 = new JButton();
		tile5.setText(" ");
		wv.add(tile5, 200, 200, 100, 100);

		tile6 = new JButton();
		tile6.setText(" ");
		wv.add(tile6, 300, 200, 100, 100);

		tile7 = new JButton();
		tile7.setText(" ");
		wv.add(tile7, 100, 300, 100, 100);

		tile8 = new JButton();
		tile8.setText(" ");
		wv.add(tile8, 200, 300, 100, 100);

		tile9 = new JButton();
		tile9.setText(" ");
		wv.add(tile9, 300, 300, 100, 100);

		newGame = new JButton();
		newGame.setText("New Game");
		newGame.setFont(new Font("Arial", Font.BOLD, 17));
		newGame.setForeground(Color.BLACK);

		wv.add(newGame, 500, 100, 150, 60);
		newGame.addActionListener(new startNew());

		tile1.addActionListener(new option1());
		tile2.addActionListener(new option2());
		tile3.addActionListener(new option3());
		tile4.addActionListener(new option4());
		tile5.addActionListener(new option5());
		tile6.addActionListener(new option6());
		tile7.addActionListener(new option7());
		tile8.addActionListener(new option8());
		tile9.addActionListener(new option9());

	}

	public static void winner() {
		if (tile1.getText().equals("X") && tile2.getText().equals("X") && tile3.getText().equals("X")) {
			xScore++;
			JOptionPane.showMessageDialog(null, "Winner is Player X", "Results ", JOptionPane.CLOSED_OPTION);
			resetButtons();
		} else if (tile4.getText().equals("X") && tile5.getText().equals("X") && tile6.getText().equals("X")) {
			xScore++;
			JOptionPane.showMessageDialog(null, "Winner is Player X", "Results ", JOptionPane.CLOSED_OPTION);
			resetButtons();
		} else if (tile7.getText().equals("X") && tile8.getText().equals("X") && tile9.getText().equals("X")) {
			xScore++;
			JOptionPane.showMessageDialog(null, "Winner is Player X", "Results ", JOptionPane.CLOSED_OPTION);
			resetButtons();
		}

		else if (tile1.getText().equals("X") && tile4.getText().equals("X") && tile7.getText().equals("X")) {
			xScore++;
			JOptionPane.showMessageDialog(null, "Winner is Player X", "Results ", JOptionPane.CLOSED_OPTION);
			resetButtons();
		} else if (tile2.getText().equals("X") && tile5.getText().equals("X") && tile8.getText().equals("X")) {
			xScore++;
			JOptionPane.showMessageDialog(null, "Winner is Player X", "Results ", JOptionPane.CLOSED_OPTION);
			resetButtons();
		} else if (tile3.getText().equals("X") && tile6.getText().equals("X") && tile9.getText().equals("X")) {
			xScore++;
			JOptionPane.showMessageDialog(null, "Winner is Player X", "Results ", JOptionPane.CLOSED_OPTION);
			resetButtons();
		}

		else if (tile1.getText().equals("X") && tile5.getText().equals("X") && tile9.getText().equals("X")) {
			xScore++;
			JOptionPane.showMessageDialog(null, "Winner is Player X", "Results ", JOptionPane.CLOSED_OPTION);
			resetButtons();
		} else if (tile3.getText().equals("X") && tile5.getText().equals("X") && tile7.getText().equals("X")) {
			xScore++;
			JOptionPane.showMessageDialog(null, "Winner is Player X", "Results ", JOptionPane.CLOSED_OPTION);
			resetButtons();
		}

		if (tile1.getText().equals("O") && tile2.getText().equals("O") && tile3.getText().equals("O")) {
			yScore++;
			JOptionPane.showMessageDialog(null, "Winner is Player O ", "Results ", JOptionPane.CLOSED_OPTION);
			resetButtons();
		} else if (tile4.getText().equals("O") && tile5.getText().equals("O") && tile6.getText().equals("O")) {
			yScore++;
			JOptionPane.showMessageDialog(null, "Winner is Player O ", "Results ", JOptionPane.CLOSED_OPTION);
			resetButtons();
		} else if (tile7.getText().equals("O") && tile8.getText().equals("O") && tile9.getText().equals("O")) {
			yScore++;
			JOptionPane.showMessageDialog(null, "Winner is Player O ", "Results ", JOptionPane.CLOSED_OPTION);
			resetButtons();
		}

		else if (tile1.getText().equals("O") && tile4.getText().equals("O") && tile7.getText().equals("O")) {
			yScore++;
			JOptionPane.showMessageDialog(null, "Winner is Player O ", "Results ", JOptionPane.CLOSED_OPTION);
			resetButtons();
		} else if (tile2.getText().equals("O") && tile5.getText().equals("O") && tile8.getText().equals("O")) {
			yScore++;
			JOptionPane.showMessageDialog(null, "Winner is Player O ", "Results ", JOptionPane.CLOSED_OPTION);
			resetButtons();
		} else if (tile3.getText().equals("O") && tile6.getText().equals("O") && tile9.getText().equals("O")) {
			yScore++;
			JOptionPane.showMessageDialog(null, "Winner is Player O ", "Results ", JOptionPane.CLOSED_OPTION);
			resetButtons();
		}

		else if (tile1.getText().equals("O") && tile5.getText().equals("O") && tile9.getText().equals("O")) {
			yScore++;
			JOptionPane.showMessageDialog(null, "Winner is Player O ", "Results ", JOptionPane.CLOSED_OPTION);
			resetButtons();
		} else if (tile3.getText().equals("O") && tile5.getText().equals("O") && tile7.getText().equals("O")) {
			yScore++;
			JOptionPane.showMessageDialog(null, "Winner is Player O ", "Results ", JOptionPane.CLOSED_OPTION);
			resetButtons();
		}

		if (cnt >= 9) {
			JOptionPane.showMessageDialog(null, "Tie", "Results ", JOptionPane.CLOSED_OPTION);
			resetButtons();

		turnLetter = 'X';
		turn.setText("Player turn is " + turnLetter);
		}
		Player1.setText("Player X: " + xScore);
		Player2.setText("Player O: " + yScore);
	}
	

	public static void resetButtons() {
		tile1.setText(" ");
		tile2.setText(" ");
		tile3.setText(" ");
		tile4.setText(" ");
		tile5.setText(" ");
		tile6.setText(" ");
		tile7.setText(" ");
		tile8.setText(" ");
		tile9.setText(" ");
		cnt = 0;

		tile1.setOpaque(false);
		tile2.setOpaque(false);
		tile3.setOpaque(false);
		tile4.setOpaque(false);
		tile5.setOpaque(false);
		tile6.setOpaque(false);
		tile7.setOpaque(false);
		tile8.setOpaque(false);
		tile9.setOpaque(false);
		turnLetter = 'X';
		turn.setText("Player turn is " + turnLetter);

	}

	class startNew extends WidgetViewAction {
		public void actionPerformed(ActionEvent e) {

			resetButtons();
		}
	}

	class option1 extends WidgetViewAction {
		public void actionPerformed(ActionEvent e) {
			if (tile1.getText().equals(" ")) {

				if (cnt % 2 == 0) {
					makeX(tile1, true);
					turnLetter = 'O';
					turn.setText("Player turn is " + turnLetter);

					tile1.setOpaque(true);
					tile1.setBackground(Color.red);
					tile1.setVisible(true);
					tile1.setForeground(Color.BLACK);
					tile1.setFont(new Font("Arial", Font.PLAIN, 40));

				} else {
					makeO(tile1, true);
					turnLetter = 'X';
					turn.setText("Player turn is " + turnLetter);

					tile1.setOpaque(true);
					tile1.setBackground(new Color(0, 0, 182, 155));
					tile1.setVisible(true);
					tile1.setForeground(Color.WHITE);
					tile1.setFont(new Font("Arial", Font.PLAIN, 40));

				}
				cnt++;
				winner();

			}

		}
	}

	class option2 extends WidgetViewAction {
		public void actionPerformed(ActionEvent e) {

			if (tile2.getText().equals(" ")) {

				if (cnt % 2 == 0) {
					makeX(tile2, true);
					turnLetter = 'O';
					turn.setText("Player turn is " + turnLetter);
					tile2.setOpaque(true);
					tile2.setBackground(Color.red);
					tile2.setVisible(true);
					tile2.setForeground(Color.BLACK);
					tile2.setFont(new Font("Arial", Font.PLAIN, 40));
				} else {
					makeO(tile2, true);
					turnLetter = 'X';
					turn.setText("Player turn is " + turnLetter);

					tile2.setOpaque(true);
					tile2.setBackground(new Color(0, 0, 182, 155));
					tile2.setVisible(true);
					tile2.setForeground(Color.WHITE);
					tile2.setFont(new Font("Arial", Font.PLAIN, 40));

				}
				cnt++;
				winner();
			}

		}
	}

	class option3 extends WidgetViewAction {
		public void actionPerformed(ActionEvent e) {

			if (tile3.getText().equals(" ")) {

				if (cnt % 2 == 0) {
					makeX(tile3, true);
					turnLetter = 'O';
					turn.setText("Player turn is " + turnLetter);
					tile3.setOpaque(true);
					tile3.setBackground(Color.red);
					tile3.setVisible(true);
					tile3.setForeground(Color.BLACK);
					tile3.setFont(new Font("Arial", Font.PLAIN, 40));
				} else {
					makeO(tile3, true);
					turnLetter = 'X';
					turn.setText("Player turn is " + turnLetter);

					tile3.setOpaque(true);
					tile3.setBackground(new Color(0, 0, 182, 155));
					tile3.setVisible(true);
					tile3.setForeground(Color.WHITE);
					tile3.setFont(new Font("Arial", Font.PLAIN, 40));

				}
				cnt++;
				winner();
			}

		}
	}

	class option4 extends WidgetViewAction {
		public void actionPerformed(ActionEvent e) {

			if (tile4.getText().equals(" ")) {

				if (cnt % 2 == 0) {
					makeX(tile4, true);
					turnLetter = 'O';
					turn.setText("Player turn is " + turnLetter);
					tile4.setOpaque(true);
					tile4.setBackground(Color.red);
					tile4.setVisible(true);
					tile4.setForeground(Color.BLACK);
					tile4.setFont(new Font("Arial", Font.PLAIN, 40));
				} else {
					makeO(tile4, true);
					turnLetter = 'X';
					turn.setText("Player turn is " + turnLetter);

					tile4.setOpaque(true);
					tile4.setBackground(new Color(0, 0, 182, 155));
					tile4.setVisible(true);
					tile4.setForeground(Color.WHITE);
					tile4.setFont(new Font("Arial", Font.PLAIN, 40));

				}
				cnt++;
				winner();
			}

		}
	}

	class option5 extends WidgetViewAction {
		public void actionPerformed(ActionEvent e) {

			if (tile5.getText().equals(" ")) {

				if (cnt % 2 == 0) {
					makeX(tile5, true);
					turnLetter = 'O';
					turn.setText("Player turn is " + turnLetter);
					tile5.setOpaque(true);
					tile5.setBackground(Color.red);
					tile5.setVisible(true);
					tile5.setForeground(Color.BLACK);
					tile5.setFont(new Font("Arial", Font.PLAIN, 40));
				} else {
					makeO(tile5, true);
					turnLetter = 'X';
					turn.setText("Player turn is " + turnLetter);

					tile5.setOpaque(true);
					tile5.setBackground(new Color(0, 0, 182, 155));
					tile5.setVisible(true);
					tile5.setForeground(Color.WHITE);
					tile5.setFont(new Font("Arial", Font.PLAIN, 40));

				}
				cnt++;
				winner();
			}

		}
	}

	class option6 extends WidgetViewAction {
		public void actionPerformed(ActionEvent e) {

			if (tile6.getText().equals(" ")) {

				if (cnt % 2 == 0) {
					makeX(tile6, true);
					turnLetter = 'O';
					turn.setText("Player turn is " + turnLetter);
					tile6.setOpaque(true);
					tile6.setBackground(Color.red);
					tile6.setVisible(true);
					tile6.setForeground(Color.BLACK);
					tile6.setFont(new Font("Arial", Font.PLAIN, 40));
				} else {
					makeO(tile6, true);
					turnLetter = 'X';
					turn.setText("Player turn is " + turnLetter);

					tile6.setOpaque(true);
					tile6.setBackground(new Color(0, 0, 182, 155));
					tile6.setVisible(true);
					tile6.setForeground(Color.WHITE);
					tile6.setFont(new Font("Arial", Font.PLAIN, 40));

				}
				cnt++;
				winner();
			}

		}
	}

	class option7 extends WidgetViewAction {
		public void actionPerformed(ActionEvent e) {

			if (tile7.getText().equals(" ")) {

				if (cnt % 2 == 0) {
					makeX(tile7, true);
					turnLetter = 'O';
					turn.setText("Player turn is " + turnLetter);
					tile7.setOpaque(true);
					tile7.setBackground(Color.red);
					tile7.setVisible(true);
					tile7.setForeground(Color.BLACK);
					tile7.setFont(new Font("Arial", Font.PLAIN, 40));
				} else {
					makeO(tile7, true);
					turnLetter = 'X';
					turn.setText("Player turn is " + turnLetter);

					tile7.setOpaque(true);
					tile7.setBackground(new Color(0, 0, 182, 155));
					tile7.setVisible(true);
					tile7.setForeground(Color.WHITE);
					tile7.setFont(new Font("Arial", Font.PLAIN, 40));

				}
				cnt++;
				winner();
			}

		}
	}

	class option8 extends WidgetViewAction {
		public void actionPerformed(ActionEvent e) {

			if (tile8.getText().equals(" ")) {

				if (cnt % 2 == 0) {
					makeX(tile8, true);
					turnLetter = 'O';
					turn.setText("Player turn is " + turnLetter);
					tile8.setOpaque(true);
					tile8.setBackground(Color.red);
					tile8.setVisible(true);
					tile8.setForeground(Color.BLACK);
					tile8.setFont(new Font("Arial", Font.PLAIN, 40));
				} else {
					makeO(tile8, true);
					turnLetter = 'X';
					turn.setText("Player turn is " + turnLetter);

					tile8.setOpaque(true);
					tile8.setBackground(new Color(0, 0, 182, 155));
					tile8.setVisible(true);
					tile8.setForeground(Color.WHITE);
					tile8.setFont(new Font("Arial", Font.PLAIN, 40));

				}
				cnt++;
				winner();
			}
		}
	}

	class option9 extends WidgetViewAction {
		public void actionPerformed(ActionEvent e) {

			if (tile9.getText().equals(" ")) {

				if (cnt % 2 == 0) {
					makeX(tile9, true);
					turnLetter = 'O';
					turn.setText("Player turn is " + turnLetter);
					tile9.setOpaque(true);
					tile9.setBackground(Color.red);
					tile9.setVisible(true);
					tile9.setForeground(Color.BLACK);
					tile9.setFont(new Font("Arial", Font.PLAIN, 40));
				} else {
					makeO(tile9, true);
					turnLetter = 'X';
					turn.setText("Player turn is " + turnLetter);

					tile9.setOpaque(true);
					tile9.setBackground(new Color(0, 0, 182, 155));
					tile9.setVisible(true);
					tile9.setForeground(Color.WHITE);
					tile9.setFont(new Font("Arial", Font.PLAIN, 40));

				}
				cnt++;
				winner();
			}

		}
	}

	public boolean makeX(JButton temp, boolean t) {

		if (temp.getText().equals(" ") || t == true) {
			temp.setText("X");
			return true;
		}
		return false;

	}

	public boolean makeO(JButton temp, boolean t) {
		if (temp.getText().equals(" ") || t == true) {
			temp.setText("O");
			return true;
		}
		return false;
	}

	public static void main(String[] args) {
		new GUI_main();

	}

}