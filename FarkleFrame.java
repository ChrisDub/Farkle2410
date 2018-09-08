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
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import javax.swing.JTextField;
import java.awt.GridLayout;
import java.awt.Component;
import javax.swing.border.SoftBevelBorder;
import javax.swing.border.BevelBorder;
import java.awt.SystemColor;
import javax.swing.BoxLayout;
import javax.swing.border.EtchedBorder;
import java.awt.Insets;

public class FarkleFrame extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField human;


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

	public FarkleFrame() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 800, 500);

		// colors used
		Color bgGreen = new Color(0, 99, 43);
		Color bgWhite = new Color(249, 242, 236);

		contentPane = new JPanel();
		contentPane.setFont(new Font("Avenir Next", Font.PLAIN, 20));
		contentPane.setBackground(bgGreen);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JLabel lblFarkle = new JLabel("F a r k l e");
		lblFarkle.setBorder(null);
		lblFarkle.setFont(new Font("Avenir Next", Font.PLAIN, 30));
		lblFarkle.setHorizontalAlignment(SwingConstants.CENTER);
		contentPane.add(lblFarkle, BorderLayout.NORTH);
		
		JPanel scoringPanel = new JPanel();
		scoringPanel.setFont(new Font("Avenir Next", Font.PLAIN, 20));
		scoringPanel.setBackground(bgGreen);
		contentPane.add(scoringPanel, BorderLayout.WEST);
		
		JLabel lblPlayers = new JLabel("  scoring facts  ");
		lblPlayers.setHorizontalAlignment(SwingConstants.CENTER);
		lblPlayers.setFont(new Font("Avenir Next", Font.PLAIN, 20));
		scoringPanel.add(lblPlayers);
		
		JPanel currentPlayerPanel = new JPanel();
		currentPlayerPanel.setBorder(new LineBorder(new Color(0, 99, 43), 10));
		contentPane.add(currentPlayerPanel, BorderLayout.EAST);
		currentPlayerPanel.setLayout(new BorderLayout(0, 0));
		
		JLabel lbCurrentPlayer = new JLabel("  current player   ");
		lbCurrentPlayer.setOpaque(true);
		lbCurrentPlayer.setBackground(bgGreen);
		lbCurrentPlayer.setFont(new Font("Avenir Next", Font.PLAIN, 20));
		lbCurrentPlayer.setHorizontalAlignment(SwingConstants.CENTER);
		currentPlayerPanel.add(lbCurrentPlayer, BorderLayout.NORTH);
		
		JLabel label_3 = new JLabel("2500+500");
		label_3.setOpaque(true);
		label_3.setBackground(bgGreen);
		label_3.setFont(new Font("Bradley Hand", Font.PLAIN, 24));
		label_3.setHorizontalAlignment(SwingConstants.CENTER);
		currentPlayerPanel.add(label_3, BorderLayout.CENTER);
		
		JButton btnRoll = new JButton("Roll");
		btnRoll.setMaximumSize(new Dimension(100, 29));
		btnRoll.setMargin(new Insets(5, 2, 3, 2));
		btnRoll.setFont(new Font("Avenir Next", Font.PLAIN, 20));
		btnRoll.setOpaque(false);
		btnRoll.setBackground(new Color(238, 238, 238));
		btnRoll.setBorderPainted(false);
		currentPlayerPanel.add(btnRoll, BorderLayout.SOUTH);

		JPanel playersPanel = new JPanel();
		playersPanel.setFont(new Font("Avenir Next", Font.PLAIN, 14));
		playersPanel.setBackground(bgGreen);
		playersPanel.setBorder(new EmptyBorder(0, 0, 0, 0));
		contentPane.add(playersPanel, BorderLayout.SOUTH);
		playersPanel.setLayout(new GridLayout(2, 2, 20, 5));
		
		JTextField lblhuman = new JTextField();
		lblhuman.setFont(new Font("Avenir Next", Font.PLAIN, 20));
		lblhuman.setBorder(null);
		lblhuman.setHorizontalAlignment(SwingConstants.TRAILING);
		lblhuman.setText("human");
		lblhuman.setPreferredSize(new Dimension(100, 40));
		lblhuman.setBackground(bgGreen);
		lblhuman.setSize(new Dimension(100, 50));
		playersPanel.add(lblhuman);
		lblhuman.setColumns(10);
		
		JLabel lblHumanScore = new JLabel("0");
		lblHumanScore.setFont(new Font("Avenir Next", Font.PLAIN, 20));
		playersPanel.add(lblHumanScore);
		
		// list of possible names for the computerPlayer 
        List<String> computerNames = new ArrayList<>();
        computerNames.add("Multivac");
        computerNames.add("Mycroft Holmes");
        computerNames.add("Little Brother");
        computerNames.add("Hal");
        computerNames.add("Hitchhiker’s Guide");
        computerNames.add("Deep Thought");
        computerNames.add("DOCTOR");
        computerNames.add("Friday");
        computerNames.add("Ava");
        computerNames.add("The Machine");
        
        // pick a random name for the computerPlayer
        Random r = new Random ();
        int min = 1;
        int max = computerNames.size();
		int index = r.nextInt((max - min)+1) + min;
		String computersName = computerNames.get(index-1);
        
		JLabel lblComputer = new JLabel(computersName);
		lblComputer.setFont(new Font("Avenir Next", Font.PLAIN, 20));
		lblComputer.setHorizontalAlignment(SwingConstants.TRAILING);
		playersPanel.add(lblComputer);
		
		JLabel lblComputerScore = new JLabel("0");
		lblComputerScore.setFont(new Font("Avenir Next", Font.PLAIN, 20));
		playersPanel.add(lblComputerScore);
		
		// create panel where dice will be shown
		JPanel gamePanel = new JPanel();
		gamePanel.setBorder(new LineBorder(new Color(0, 0, 0), 3, true));
		gamePanel.setBackground(bgGreen);
		contentPane.add(gamePanel, BorderLayout.CENTER);
		gamePanel.setLayout(new GridLayout(3, 1, 0, 0));
		
		// create panel for dice that are currently in play and not set aside
		JPanel diceInPlay = new JPanel();
		diceInPlay.setFont(new Font("Avenir Next", Font.PLAIN, 14));
		diceInPlay.setBackground(bgGreen);
		gamePanel.add(diceInPlay);
		
		JPanel diceCollect= new JPanel();
		diceCollect.setFont(new Font("Avenir Next", Font.PLAIN, 13));
		diceCollect.setBackground(bgGreen);
		gamePanel.add(diceCollect);
		
		JPanel msg = new JPanel();
		msg.setFont(new Font("Avenir Next", Font.PLAIN, 14));
		msg.setBackground(bgGreen);
		gamePanel.add(msg);
		msg.setLayout(new GridLayout(2, 0, 0, 0));
		
		JLabel lblMsg = new JLabel("msg");
		lblMsg.setFont(new Font("Avenir Next", Font.PLAIN, 20));
		lblMsg.setHorizontalAlignment(SwingConstants.CENTER);
		msg.add(lblMsg);
		
		JPanel panel = new JPanel();
		panel.setBackground(bgGreen);
		msg.add(panel);
		
		JButton btnCollect = new JButton("Collect");
		btnCollect.setMargin(new Insets(4, 6, 0, 5));
		btnCollect.setHorizontalTextPosition(SwingConstants.CENTER);
		btnCollect.setFont(new Font("Avenir Next", Font.PLAIN, 20));
		panel.add(btnCollect);
		
		JButton btnEndTurn = new JButton("End Turn");
		btnEndTurn.setMargin(new Insets(4, 2, 0, 2));
		btnEndTurn.setAlignmentY(0.9f);
		btnEndTurn.setFont(new Font("Avenir Next", Font.PLAIN, 20));
		panel.add(btnEndTurn);
		
		Player player = new Player(0, "Kemry", true);
		player.setDiceArray(player.roll(6));
		

		final JButton dieA = new JButton();
		final JButton dieB = new JButton();
		final JButton dieC = new JButton();
		final JButton dieD = new JButton();
		final JButton dieE = new JButton();
		final JButton dieF = new JButton();

		final JButton dieAA = new JButton();
		final JButton dieBB = new JButton();
		final JButton dieCC = new JButton();
		final JButton dieDD = new JButton();
		final JButton dieEE = new JButton();
		final JButton dieFF = new JButton();

		dieA.setPreferredSize(new Dimension(70, 70));
		dieB.setPreferredSize(new Dimension(70, 70));
		dieC.setPreferredSize(new Dimension(70, 70));
		dieD.setPreferredSize(new Dimension(70, 70));
		dieE.setPreferredSize(new Dimension(70, 70));
		dieF.setPreferredSize(new Dimension(70, 70));

		dieAA.setPreferredSize(new Dimension(70, 70));
		dieBB.setPreferredSize(new Dimension(70, 70));
		dieCC.setPreferredSize(new Dimension(70, 70));
		dieDD.setPreferredSize(new Dimension(70, 70));
		dieEE.setPreferredSize(new Dimension(70, 70));
		dieFF.setPreferredSize(new Dimension(70, 70));


		Integer dieAnumber = player.getDiceArray().get(0);
		Integer dieBnumber = player.getDiceArray().get(1);
		Integer dieCnumber = player.getDiceArray().get(2);
		Integer dieDnumber = player.getDiceArray().get(3);
		Integer dieEnumber = player.getDiceArray().get(4);
		Integer dieFnumber = player.getDiceArray().get(5);

		String resourceA = getDieResource(dieAnumber);
		String resourceB = getDieResource(dieBnumber);
		String resourceC = getDieResource(dieCnumber);
		String resourceD = getDieResource(dieDnumber);
		String resourceE = getDieResource(dieEnumber);
		String resourceF = getDieResource(dieFnumber);

		dieA.setIcon(new ImageIcon(FarkleFrame.class.getResource(resourceA)));
		dieB.setIcon(new ImageIcon(FarkleFrame.class.getResource(resourceB)));
		dieC.setIcon(new ImageIcon(FarkleFrame.class.getResource(resourceC)));
		dieD.setIcon(new ImageIcon(FarkleFrame.class.getResource(resourceD)));
		dieE.setIcon(new ImageIcon(FarkleFrame.class.getResource(resourceE)));
		dieF.setIcon(new ImageIcon(FarkleFrame.class.getResource(resourceF)));

		dieAA.setIcon(new ImageIcon(FarkleFrame.class.getResource(resourceA)));
		dieBB.setIcon(new ImageIcon(FarkleFrame.class.getResource(resourceB)));
		dieCC.setIcon(new ImageIcon(FarkleFrame.class.getResource(resourceC)));
		dieDD.setIcon(new ImageIcon(FarkleFrame.class.getResource(resourceD)));
		dieEE.setIcon(new ImageIcon(FarkleFrame.class.getResource(resourceE)));
		dieFF.setIcon(new ImageIcon(FarkleFrame.class.getResource(resourceF)));

		dieAA.setVisible(false);
		dieBB.setVisible(false);
		dieCC.setVisible(false);
		dieDD.setVisible(false);
		dieEE.setVisible(false);
		dieFF.setVisible(false);

		diceInPlay.add(dieA);
		diceInPlay.add(dieB);
		diceInPlay.add(dieC);
		diceInPlay.add(dieD);
		diceInPlay.add(dieE);
		diceInPlay.add(dieF);

		diceCollect.add(dieAA);
		diceCollect.add(dieBB);
		diceCollect.add(dieCC);
		diceCollect.add(dieDD);
		diceCollect.add(dieEE);
		diceCollect.add(dieFF);

		dieAA.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				dieAA.setVisible(false);
				dieA.setVisible(true);
			}
		});

		dieA.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				dieAA.setVisible(true);
				dieA.setVisible(false);
			}
		});

		dieBB.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				dieBB.setVisible(false);
				dieB.setVisible(true);
			}
		});

		dieB.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				dieBB.setVisible(true);
				dieB.setVisible(false);
			}
		});

		dieCC.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				dieCC.setVisible(false);
				dieC.setVisible(true);
			}
		});

		dieC.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				dieCC.setVisible(true);
				dieC.setVisible(false);
			}
		});

		dieDD.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				dieDD.setVisible(false);
				dieD.setVisible(true);
			}
		});

		dieD.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				dieDD.setVisible(true);
				dieD.setVisible(false);
			}
		});

		dieEE.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				dieEE.setVisible(false);
				dieE.setVisible(true);
			}
		});

		dieE.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				dieEE.setVisible(true);
				dieE.setVisible(false);
			}
		});

		dieFF.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				dieFF.setVisible(false);
				dieF.setVisible(true);
			}
		});

		dieF.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				dieFF.setVisible(true);
				dieF.setVisible(false);
			}
		});

		FlowLayout fl_diceInPlay = new FlowLayout(FlowLayout.CENTER, 5, 30);
		diceInPlay.setLayout(fl_diceInPlay);
		diceInPlay.add(dieA);

	}

	/**
	 * METHOD - getDieResource
	 * @return
	 */
	protected String getDieResource(Integer face) {
		switch (face) {
		case 1:
			return "/farkle/die1.png";
		case 2:
			return "/farkle/die2.png";
		case 3:
			return "/farkle/die3.png";
		case 4:
			return "/farkle/die4.png";
		case 5:
			return "/farkle/die5.png";
		case 6:
			return "/farkle/die6.png";
		default:
			return "Invalid resource path";
		}
	}
	
}