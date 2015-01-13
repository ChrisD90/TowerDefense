package projektgruppe91.view;

/**
* @author: Heiko Reinemuth, Christoph Weber, Christoph Döringer, Tobias Storck
* @version "Episode I"
**/

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.Toolkit;
import java.awt.event.ActionListener;

import javax.swing.BoxLayout;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.SwingConstants;

@SuppressWarnings("serial")
/**
 * ViewWindowMenu
 */
public class ViewWindowMenu extends JFrame{
		
	// INSTANZEN VON VIEW
	private ViewWindowGame windowGame = new ViewWindowGame();	
	// WINDOW MENU EINSTELLUNGEN
	private static final int windowWidth = 800;
	private static final int windowHeight = 400;
	private static final Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
	private static final int windowXposition = (screenSize.width / 2) - (windowWidth / 2);
	private static final int windowYposition = (screenSize.height / 2) - (windowHeight / 2);
	// WINDOW MENU FONTS
	private static final Font Consolas10 = new Font("Consolas", Font.BOLD, 10);
	private static final Font Arial15 = new Font("Arial", Font.BOLD, 15);
	private static final Font Arial12 = new Font("Arial", Font.BOLD, 12);
	// LEVEL BOX
	private JComboBox<String> boxLevel;
	private String[] levels = { "Hoth (Standard)", "Mustafar", "Tatooine", "Asteroids", "Asteroids Errors", "Asteroids Big" };
	// WINDOW MENU BUTTONS
	private JButton buttonLevelGenerator;
	private JButton buttonCredits;
	private JButton buttonPlay;
	// WINDOW MENU LABELS
	private JLabel labelMenuImage;
	private JLabel labelMapImage;
	private JTextArea textAreaMapText;
	private JLabel labelLevelGeneratorText;
	private JLabel labelLevelText;
	// WINDOW MENU PANELS
	private JPanel panelMenuImage;
	private JPanel panelMap;
	private JPanel panelMapImage;
	private JPanel panelMapText;
	private JPanel panelMenuSetting;
	private JPanel panelLevel;
	private JPanel panelLevelGenerator;
	private JPanel panelCredits;
	private JPanel panelPlay;
		
	/**
	 * Initialisierung des Menues
	 */
	public void initWindowMenu() {
		
		this.setResizable(false);
		this.setLayout(new BorderLayout());
		this.setTitle("Star Wars Tower Defense Menu");
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setBounds(windowXposition, windowYposition, windowWidth, windowHeight);
					
		// ------------------------------------------------------------------------------------
		panelMenuImage = new JPanel();
		panelMenuImage.setBackground(Color.black);
		labelMenuImage = new JLabel();
		labelMenuImage.setIcon(new ImageIcon("src/projektgruppe91/resources/images/TowerDefenseMenu.png"));
		panelMenuImage.add(labelMenuImage);
		// ------------------------------------------------------------------------------------
		panelMap = new JPanel();
		panelMap.setBackground(Color.black);
		panelMap.setLayout(new BoxLayout(panelMap, BoxLayout.X_AXIS));
		// ------------------------------------------------------------------------------------
		panelMapText = new JPanel();
		panelMapText.setBackground(Color.black);
		textAreaMapText = new JTextArea();
		textAreaMapText.setEditable(false);
		textAreaMapText.setFont(Consolas10);
		textAreaMapText.setForeground(Color.white);
		textAreaMapText.setBackground(Color.black);
		textAreaMapText.setText(windowGame.getMapString("src/projektgruppe91/resources/maps/01_Hoth.txt"));
		panelMapText.add(textAreaMapText);
		// ------------------------------------------------------------------------------------
		panelMapImage = new JPanel();
		panelMapImage.setBackground(Color.black);
		labelMapImage = new JLabel();
		labelMapImage.setIcon(new ImageIcon("src/projektgruppe91/resources/images/TDmapEmpty(1)BoxChoice.png"));
		panelMapImage.add(labelMapImage);
		// ------------------------------------------------------------------------------------
		panelMap.add(panelMapText);
		panelMap.add(panelMapImage);
		// ------------------------------------------------------------------------------------		
		panelMenuSetting = new JPanel();
		panelMenuSetting.setBackground(Color.black);
		panelMenuSetting.setLayout(new GridLayout(1, 4));
		// ------------------------------------------------------------------------------------
		panelLevel = new JPanel();
		panelLevel.setBackground(Color.black);
		panelLevel.setLayout(new GridLayout(2, 1));
		labelLevelText = new JLabel();
		labelLevelText.setText("Maps");
		labelLevelText.setFont(Arial12);
		labelLevelText.setForeground(Color.white);
		labelLevelText.setHorizontalAlignment(SwingConstants.CENTER);
		boxLevel = new JComboBox<String>();
		boxLevel.setFont(Arial12);
		boxLevel.setBackground(Color.white);
		boxLevel.setForeground(Color.black);
		for (int i = 0; i < levels.length; i++) {
			boxLevel.addItem(levels[i]);
		}
		panelLevel.add(labelLevelText);
		panelLevel.add(boxLevel);
		// ------------------------------------------------------------------------------------
		panelLevelGenerator = new JPanel();
		panelLevelGenerator.setBackground(Color.black);
		panelLevelGenerator.setLayout(new GridLayout(2, 1));
		labelLevelGeneratorText = new JLabel();
		labelLevelGeneratorText.setFont(Arial12);
		labelLevelGeneratorText.setText("Create Map");
		labelLevelGeneratorText.setForeground(Color.white);
		labelLevelGeneratorText.setHorizontalAlignment(SwingConstants.CENTER);
		buttonLevelGenerator = new JButton();
		buttonLevelGenerator.setFont(Arial12);
		buttonLevelGenerator.setText("Generator");
		buttonLevelGenerator.setBackground(Color.white);
		buttonLevelGenerator.setForeground(Color.black);
		panelLevelGenerator.add(labelLevelGeneratorText);
		panelLevelGenerator.add(buttonLevelGenerator);
		// ------------------------------------------------------------------------------------
		panelCredits = new JPanel();
		panelCredits.setBackground(Color.black);
		panelCredits.setLayout(new GridLayout(1, 1));
		buttonCredits = new JButton();
		buttonCredits.setFont(Arial15);
		buttonCredits.setText("Credits");
		buttonCredits.setBackground(Color.white);
		buttonCredits.setForeground(Color.black);
		panelCredits.add(buttonCredits);
		// ------------------------------------------------------------------------------------
		panelPlay = new JPanel();
		panelPlay.setBackground(Color.black);
		panelPlay.setLayout(new GridLayout(1, 1));
		buttonPlay = new JButton();
		buttonPlay.setText("Play");
		buttonPlay.setFont(Arial15);
		buttonPlay.setBackground(Color.white);
		buttonPlay.setForeground(Color.black);
		panelPlay.add(buttonPlay);
		// ------------------------------------------------------------------------------------
		panelMenuSetting.add(panelLevel);
		panelMenuSetting.add(panelLevelGenerator);
		panelMenuSetting.add(panelCredits);
		panelMenuSetting.add(panelPlay);
		// ------------------------------------------------------------------------------------
						
		this.add(panelMenuImage, BorderLayout.NORTH);
		this.add(panelMap, BorderLayout.CENTER);
		this.add(panelMenuSetting, BorderLayout.SOUTH);
   	}
	
	// ACTION LISTENER SETTER
	// ---------------------------------------------------------------------------------------------------------------------------
		
	/**
	 * Action Listener Setter
	 */
	public void setActionListener(ActionListener l) {
		
		boxLevel.addActionListener(l);
		buttonLevelGenerator.addActionListener(l);
		buttonCredits.addActionListener(l);
		buttonPlay.addActionListener(l);
	}
	
	// SETTER 
	// ---------------------------------------------------------------------------------------------------------------------------
	
	/**
	 * @param String
	 */
	public void setmapImage(String delivered) {labelMapImage.setIcon(new ImageIcon(delivered));}
	
	/**
	 * @param String
	 */
	public void setmapTextArea(String delivered) {textAreaMapText.setText(delivered);}
		
	// GETTER 
	// ---------------------------------------------------------------------------------------------------------------------------
	
	/**
	 * @return JButton
	 */
	public JButton getCreditsButton() {return buttonCredits;}
	
	/**
	 * @return JButton
	 */
	public JButton getPlayButton() {return buttonPlay;}
	
	/**
	 * @return JButton
	 */
	public JButton getGeneratorButton() {return buttonLevelGenerator;}
	
	/**
	 * @return JComboBox<String>
	 */
	public JComboBox<String> getBoxLevel() {return boxLevel;}
}
