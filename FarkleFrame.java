package farkle;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.border.LineBorder;
import java.awt.Color;

import java.awt.Rectangle;
import javax.swing.ImageIcon;
import java.awt.FlowLayout;
import java.awt.Dimension;

public class FarkleFrame extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FarkleFrame frame = new FarkleFrame();
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
	public FarkleFrame() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 800, 400);

		// colors used
		Color bgGreen = new Color(0, 99, 43);
		Color bgWhite = new Color(249, 242, 236);

		contentPane = new JPanel();
		contentPane.setBackground(bgGreen);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JLabel lblFarkle = new JLabel("Farkle");
		lblFarkle.setBorder(null);
		lblFarkle.setFont(new Font("Avenir Next", Font.PLAIN, 26));
		lblFarkle.setHorizontalAlignment(SwingConstants.CENTER);
		contentPane.add(lblFarkle, BorderLayout.NORTH);
		
		JPanel scoringPanel = new JPanel();
		scoringPanel.setBackground(bgGreen);
		contentPane.add(scoringPanel, BorderLayout.WEST);
		
		JLabel lblPlayers = new JLabel("scoring facts");
		lblPlayers.setHorizontalAlignment(SwingConstants.CENTER);
		lblPlayers.setFont(new Font("Avenir Next", Font.PLAIN, 13));
		scoringPanel.add(lblPlayers);
		
		JPanel currentPlayerPanel = new JPanel();
		contentPane.add(currentPlayerPanel, BorderLayout.EAST);
		currentPlayerPanel.setLayout(new BorderLayout(0, 0));
		
		JLabel lblNewLabel = new JLabel("Name of current player");
		lblNewLabel.setOpaque(true);
		lblNewLabel.setBackground(bgGreen);
		lblNewLabel.setFont(new Font("Avenir Next", Font.PLAIN, 13));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		currentPlayerPanel.add(lblNewLabel, BorderLayout.NORTH);
		
		JLabel label_3 = new JLabel("2500+500");
		label_3.setOpaque(true);
		label_3.setBackground(bgGreen);
		label_3.setFont(new Font("Bradley Hand", Font.PLAIN, 24));
		label_3.setHorizontalAlignment(SwingConstants.CENTER);
		currentPlayerPanel.add(label_3, BorderLayout.CENTER);
		
		JButton btnRoll = new JButton("Roll");
		btnRoll.setFont(new Font("Avenir Next", Font.PLAIN, 24));
		btnRoll.setBackground(new Color(0, 99, 43));
		btnRoll.setOpaque(true);
		// setBorderPainted is needed on OSX 
		btnRoll.setBorderPainted(false);
		currentPlayerPanel.add(btnRoll, BorderLayout.SOUTH);
		
		JPanel playersPanel = new JPanel();
		playersPanel.setBorder(new EmptyBorder(0, 0, 0, 0));
		contentPane.add(playersPanel, BorderLayout.SOUTH);
		playersPanel.setLayout(new BorderLayout(0, 0));
		
		JLabel lblPlayer = new JLabel("Players");
		lblPlayer.setHorizontalAlignment(SwingConstants.CENTER);
		lblPlayer.setBackground(bgGreen);
		lblPlayer.setOpaque(true);
		lblPlayer.setFont(new Font("Avenir Next", Font.PLAIN, 13));
		lblPlayer.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
		playersPanel.add(lblPlayer, BorderLayout.CENTER);
		
		JPanel gamePanel = new JPanel();
		gamePanel.setBackground(bgGreen);
		contentPane.add(gamePanel, BorderLayout.CENTER);
		gamePanel.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		// create 6 dice and add them to the gamePanel
		final JButton die1 = new JButton();
		die1.setMinimumSize(new Dimension(70, 70));
		die1.setMaximumSize(new Dimension(70, 70));
		die1.setPreferredSize(new Dimension(70, 70));
		die1.setIcon(new ImageIcon(FarkleFrame.class.getResource("/farkle/dice-1-70px.png")));
		die1.setBackground(bgWhite);
		die1.setBorderPainted(false);
		die1.setBounds(new Rectangle(0, 0, 70, 70));
		gamePanel.add(die1);

		final JButton die2 = new JButton();
		die2.setMinimumSize(new Dimension(70, 70));
		die2.setMaximumSize(new Dimension(70, 70));
		die2.setPreferredSize(new Dimension(70, 70));
		die2.setIcon(new ImageIcon(FarkleFrame.class.getResource("/farkle/dice-2-70px.png")));
		die2.setBackground(bgWhite);
		die2.setBorderPainted(false);
		die2.setBounds(new Rectangle(0, 0, 70, 70));
		gamePanel.add(die2);

		final JButton die3 = new JButton();
		die3.setMinimumSize(new Dimension(70, 70));
		die3.setMaximumSize(new Dimension(70, 70));
		die3.setPreferredSize(new Dimension(70, 70));
		die3.setIcon(new ImageIcon(FarkleFrame.class.getResource("/farkle/dice-3-79px.png")));
		die3.setBackground(bgWhite);
		die3.setBorderPainted(false);
		die3.setBounds(new Rectangle(0, 0, 70, 70));
		gamePanel.add(die3);

		final JButton die4 = new JButton();
		die4.setMinimumSize(new Dimension(70, 70));
		die4.setMaximumSize(new Dimension(70, 70));
		die4.setPreferredSize(new Dimension(70, 70));
		die4.setIcon(new ImageIcon(FarkleFrame.class.getResource("/farkle/dice-4-70px.png")));
		die4.setBackground(bgWhite);
		die4.setBorderPainted(false);
		die4.setBounds(new Rectangle(0, 0, 70, 70));
		gamePanel.add(die4);

		final JButton die5 = new JButton();
		die5.setMinimumSize(new Dimension(70, 70));
		die5.setMaximumSize(new Dimension(70, 70));
		die5.setPreferredSize(new Dimension(70, 70));
		die5.setIcon(new ImageIcon(FarkleFrame.class.getResource("/farkle/dice-5-70px.png")));
		die5.setBackground(bgWhite);
		die5.setBorderPainted(false);
		die5.setBounds(new Rectangle(0, 0, 70, 70));
		gamePanel.add(die5);

		final JButton die6 = new JButton();
		die6.setMinimumSize(new Dimension(70, 70));
		die6.setMaximumSize(new Dimension(70, 70));
		die6.setPreferredSize(new Dimension(70, 70));
		die6.setIcon(new ImageIcon(FarkleFrame.class.getResource("/farkle/dice-6-70px.png")));
		die6.setBackground(bgWhite);
		die6.setBorderPainted(false);
		die6.setBounds(new Rectangle(0, 0, 70, 70));
		gamePanel.add(die6);
	}
}
