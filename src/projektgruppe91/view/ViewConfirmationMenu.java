package projektgruppe91.view;

/**
* @author: Heiko Reinemuth, Christoph Weber, Christoph Döringer, Tobias Storck
* @version "Episode I"
**/

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.Toolkit;
import java.awt.event.ActionListener;

import javax.swing.BoxLayout;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

@SuppressWarnings("serial")
/**
 * ViewConfirmationMenu
 */
public class ViewConfirmationMenu extends JFrame{
			
	// WINDOW
	private static final int windowWidth = 300;
	private static final int windowHeight = 300;
	private static final Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
	private static final int windowXposition = (screenSize.width / 2) - (windowWidth / 2);
	private static final int windowYposition = (screenSize.height / 2) - (windowHeight / 2);
	// FONTS
	private static final Font Arial15 = new Font("Arial", Font.BOLD, 15);
	private static final Font Arial12 = new Font("Arial", Font.BOLD, 12);
	// BUTTONS
	private JButton buttonYesMenu;
	private JButton buttonNoMenu;
	// LABELS
	private JLabel labelConfirmationMenuText;
	private JLabel labelConfirmationMenuImage;
	// PANELS
	private JPanel panelMainConfirmationMenu;
	private JPanel panelConfirmationMenuImage;
	private JPanel panelConfirmationMenu;
		
	/**
	 * Initialisierung des Menue Bestaetigungs Fensters
	 */
	public void initWindowMenu() {
				
		this.setResizable(false);
		this.setTitle("Confirmation");
		this.setLayout(new GridLayout(1, 1));
		this.setBounds(windowXposition, windowYposition, windowWidth, windowHeight);
		
		panelMainConfirmationMenu = new JPanel();
		panelMainConfirmationMenu.setLayout(new BoxLayout(panelMainConfirmationMenu, BoxLayout.Y_AXIS));
		panelMainConfirmationMenu.setBackground(Color.black);
		panelConfirmationMenuImage = new JPanel();
		panelConfirmationMenuImage.setBackground(Color.black);
		labelConfirmationMenuImage = new JLabel();
		labelConfirmationMenuImage.setIcon(new ImageIcon("src/projektgruppe91/resources/images/WindowMenu.png"));
		panelConfirmationMenuImage.add(labelConfirmationMenuImage);
		panelConfirmationMenu = new JPanel();
		panelConfirmationMenu.setBackground(Color.black);
		labelConfirmationMenuText = new JLabel();
		labelConfirmationMenuText.setFont(Arial12);
		labelConfirmationMenuText.setText("Return to Menu?");
		labelConfirmationMenuText.setBackground(Color.black);
		labelConfirmationMenuText.setForeground(Color.white);
		labelConfirmationMenuText.setHorizontalAlignment(SwingConstants.CENTER);
		buttonYesMenu = new JButton();
		buttonYesMenu.setText("Yes");
		buttonYesMenu.setFont(Arial15);
		buttonYesMenu.setForeground(Color.black);
		buttonYesMenu.setBackground(Color.white);
		buttonNoMenu = new JButton();
		buttonNoMenu.setText("No");
		buttonNoMenu.setFont(Arial15);
		buttonNoMenu.setForeground(Color.black);
		buttonNoMenu.setBackground(Color.white);
		panelConfirmationMenu.add(labelConfirmationMenuText);
		panelConfirmationMenu.add(buttonYesMenu);
		panelConfirmationMenu.add(buttonNoMenu);
		panelMainConfirmationMenu.add(panelConfirmationMenuImage);
		panelMainConfirmationMenu.add(panelConfirmationMenu);
		
		this.add(panelMainConfirmationMenu);
		this.pack();
	}

	/**
	 * Action Listener Setter
	 */
	public void setActionListener(ActionListener l) {

		buttonYesMenu.addActionListener(l);
		buttonNoMenu.addActionListener(l);
	}
	
	// GETTER
	// ---------------------------------------------------------------------------------------------------------------------------
	
	/**
	 * @return JButton
	 */
	public JButton getYesMenuButton() {return buttonYesMenu;}
	
	/**
	 * @return JButton
	 */
	public JButton getNoMenuButton() {return buttonNoMenu;}
}
