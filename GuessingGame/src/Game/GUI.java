package Game;

import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class GUI {

	private JFrame frame;
	private JTextField textGuess;
	private JLabel lblOutput;
	private JButton btnCheck;
	private int Num;
	private JButton btnQuiteGame;
	private JButton btnNewGame;
	private JButton btnReset;
	private int iCnt = 0;
	private int NumOfGames = 0;
	private JLabel lblNumTry;
	private JLabel lblProgressCnt;


	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GUI window = new GUI();
					window.frame.setVisible(true);
					
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public GUI() {
		initialize();
	}
	
	public void checkGuess() {
		
		String textGuessResult;// this will go to lblOutput
		int guess = Integer.parseInt(textGuess.getText());
		textGuess.setText("");
		if (guess > Num ) {
			textGuessResult = "Your guess is Highhhh....";
			lblOutput.setForeground(Color.magenta);
			iCnt++;
		}
		else if (guess < Num ) {
			textGuessResult = "Your guess is Lowww....";
			lblOutput.setForeground(Color.gray);
			iCnt++;
		}
		
		else if (guess > 100 || guess <1  ) {
			textGuessResult = "Please enter a valid input!!!!";
			lblOutput.setForeground(Color.red);
			iCnt++;
		}
		
		else {
			textGuessResult = "!!!!! Congratulations !!!!!\nYou Won!";
			lblOutput.setForeground(Color.black);
			btnNewGame.setEnabled(true);
			btnQuiteGame.setEnabled(true);
			btnNewGame.setVisible(true);
			btnQuiteGame.setVisible(true);
		}
		
		lblOutput.setText(guess + " "+textGuessResult);
		lblNumTry.setText("" + iCnt);
		lblProgressCnt.setText(""+NumOfGames);
		
		
	}
	
	public void randomNum() {
		Num = (int) (Math.random()*100+ 1);
	}

	public void newgame() {
		randomNum();
		btnNewGame.setEnabled(false);
		btnQuiteGame.setEnabled(false);
		btnNewGame.setVisible(false);
		btnQuiteGame.setVisible(false);
		textGuess.setText("");
		lblOutput.setText("Let's play again.");
		iCnt = 0;
		NumOfGames++;
		lblProgressCnt.setText(""+NumOfGames);
	}
	
	public void quiteGame() {
		lblOutput.setText("Thank you for the playing my game.");
		lblOutput.setForeground(Color.black);
		btnQuiteGame.setEnabled(false);
		btnQuiteGame.setEnabled(false);
		btnNewGame.setVisible(false);
		btnQuiteGame.setVisible(false);
		textGuess.setText("");
		btnReset.setEnabled(true);
		btnReset.setVisible(true);
		NumOfGames = 0;
		iCnt = 0;
		textGuess.setEditable(false);
		
	}
	
	public void reset() {
		randomNum();
		btnReset.setEnabled(false);
		btnReset.setVisible(false);
		lblOutput.setText("Progress reset Successfuly.");
		lblProgressCnt.setText(""+NumOfGames);
		lblNumTry.setText("" + iCnt);
		
	}
	
	private void initialize() {
		randomNum();
		frame = new JFrame();
		frame.getContentPane().setEnabled(false);
		frame.setBounds(100, 100, 553, 552);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblGameByOmkar = new JLabel("Game by Omkar Patil");
		lblGameByOmkar.setFont(new Font("Tahoma", Font.BOLD, 24));
		lblGameByOmkar.setHorizontalAlignment(SwingConstants.CENTER);
		lblGameByOmkar.setBounds(139, 10, 261, 39);
		frame.getContentPane().add(lblGameByOmkar);
		
		JLabel lblGuessANumber = new JLabel("Guess a number bet 1 - 100 : ");
		lblGuessANumber.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblGuessANumber.setHorizontalAlignment(SwingConstants.CENTER);
		lblGuessANumber.setBounds(88, 75, 283, 48);
		frame.getContentPane().add(lblGuessANumber);
		
		textGuess = new JTextField();
		textGuess.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			checkGuess();
			}
		});
		textGuess.setHorizontalAlignment(SwingConstants.CENTER);
		textGuess.setBounds(356, 88, 96, 30);
		frame.getContentPane().add(textGuess);
		textGuess.setColumns(10);
		
		btnCheck = new JButton("Click to check Guess");
		btnCheck.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				checkGuess();
			}
		});
		btnCheck.setFont(new Font("Times New Roman", Font.ITALIC, 20));
		btnCheck.setBounds(87, 138, 364, 39);
		frame.getContentPane().add(btnCheck);
		
		lblOutput = new JLabel("Enter a number and click button to check guess");
		lblOutput.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 18));
		lblOutput.setHorizontalAlignment(SwingConstants.CENTER);
		lblOutput.setBounds(-37, 365, 613, 48);
		frame.getContentPane().add(lblOutput);
		
		btnNewGame = new JButton("New Game");
		btnNewGame.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				newgame();
			}
		});
		btnNewGame.setEnabled(false);
		btnNewGame.setBackground(Color.GREEN);
		btnNewGame.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnNewGame.setBounds(87, 198, 195, 80);
		frame.getContentPane().add(btnNewGame);
		btnNewGame.setVisible(false);
		
		
		btnQuiteGame = new JButton("Quite Game");
		btnQuiteGame.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				quiteGame();
			}
		});
		btnQuiteGame.setEnabled(false);
		btnQuiteGame.setBackground(Color.RED);
		btnQuiteGame.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnQuiteGame.setBounds(292, 198, 159, 80);
		frame.getContentPane().add(btnQuiteGame);
		
		btnReset = new JButton("Reset");
		btnReset.setEnabled(false);
		btnReset.setVisible(false);
		btnReset.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				reset();
			}
		});
		btnReset.setFont(new Font("Tahoma", Font.BOLD, 26));
		btnReset.setBounds(87, 304, 364, 39);
		frame.getContentPane().add(btnReset);
		
		JLabel lblProgress = new JLabel("Progress :");
		lblProgress.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 18));
		lblProgress.setHorizontalAlignment(SwingConstants.TRAILING);
		lblProgress.setBounds(47, 426, 96, 30);
		frame.getContentPane().add(lblProgress);
		
		lblProgressCnt = new JLabel("New label");
		lblProgressCnt.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 22));
		lblProgressCnt.setBounds(145, 423, 85, 30);
		frame.getContentPane().add(lblProgressCnt);
		
		JLabel lbNumOfTry = new JLabel("Number of tries :");
		lbNumOfTry.setHorizontalAlignment(SwingConstants.TRAILING);
		lbNumOfTry.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 18));
		lbNumOfTry.setBounds(240, 426, 179, 30);
		frame.getContentPane().add(lbNumOfTry);
		
		lblNumTry = new JLabel("New label");
		lblNumTry.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 22));
		lblNumTry.setBounds(420, 426, 85, 30);
		frame.getContentPane().add(lblNumTry);
		btnQuiteGame.setVisible(false);
	}
}
