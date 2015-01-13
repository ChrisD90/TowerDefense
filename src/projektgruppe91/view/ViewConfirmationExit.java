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
 * ViewConfirmationExit
 */
public class ViewConfirmationExit extends JFrame{
	
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
	private JButton buttonYesExit;
	private JButton buttonNoExit;
	// LABELS
	private JLabel labelConfirmationExitText;
	private JLabel labelConfirmationExitImage;
	// PANELS
	private JPanel panelMainConfirmationExit;
	private JPanel panelConfirmationExitImage;
	private JPanel panelConfirmationExit;
		
	/**
	 * Initialisierung des Exit Bestaetigungs Fensters
	 */
	public void initConfirmationExit() {
		
		this.setResizable(false);
		this.setTitle("Confirmation");
		this.setLayout(new GridLayout(1, 1));
		this.setBounds(windowXposition, windowYposition, windowWidth, windowHeight);
	
		panelMainConfirmationExit = new JPanel();
		panelMainConfirmationExit.setBackground(Color.black);
		panelMainConfirmationExit.setLayout(new BoxLayout(panelMainConfirmationExit, BoxLayout.Y_AXIS));
		panelConfirmationExitImage = new JPanel();
		panelConfirmationExitImage.setBackground(Color.black);
		labelConfirmationExitImage = new JLabel();
		labelConfirmationExitImage.setIcon(new ImageIcon("src/projektgruppe91/resources/images/WindowExit.png"));
		panelConfirmationExitImage.add(labelConfirmationExitImage);
		panelConfirmationExit = new JPanel();
		panelConfirmationExit.setBackground(Color.black);
		labelConfirmationExitText = new JLabel();
		labelConfirmationExitText.setFont(Arial12);
		labelConfirmationExitText.setText("End the Game?");
		labelConfirmationExitText.setBackground(Color.black);
		labelConfirmationExitText.setForeground(Color.white);
		labelConfirmationExitText.setHorizontalAlignment(SwingConstants.CENTER);
		buttonYesExit = new JButton();
		buttonYesExit.setText("Yes");
		buttonYesExit.setFont(Arial15);
		buttonYesExit.setForeground(Color.black);
		buttonYesExit.setBackground(Color.white);
		buttonNoExit = new JButton();
		buttonNoExit.setText("No");
		buttonNoExit.setFont(Arial15);
		buttonNoExit.setForeground(Color.black);
		buttonNoExit.setBackground(Color.white);
		panelConfirmationExit.add(labelConfirmationExitText);
		panelConfirmationExit.add(buttonYesExit);
		panelConfirmationExit.add(buttonNoExit);
		panelMainConfirmationExit.add(panelConfirmationExitImage);
		panelMainConfirmationExit.add(panelConfirmationExit);
       
		this.add(panelMainConfirmationExit);
		this.pack();
   	}

	/**
	 * Action Listener Setter
	 */
	public void setActionListener(ActionListener l) {
		
		buttonYesExit.addActionListener(l);
		buttonNoExit.addActionListener(l);
	}
	
	// GETTER
	// ---------------------------------------------------------------------------------------------------------------------------

	/**
	 * @return JButton
	 */
	public JButton getYesExitButton() {return buttonYesExit;}
	
	/**
	 * @return JButton
	 */
	public JButton getNoExitButton() {return buttonNoExit;}
}
