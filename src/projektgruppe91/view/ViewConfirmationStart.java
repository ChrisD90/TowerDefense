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
 * ViewConfirmationStart
 */
public class ViewConfirmationStart extends JFrame{
			
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
	private JButton buttonYesStart;
	private JButton buttonNoStart;
	// LABELS
	private JLabel labelConfirmationStartText;
	private JLabel labelConfirmationStartImage;
	// PANELS
	private JPanel panelMainConfirmationStart;
	private JPanel panelConfirmationStartImage;
	private JPanel panelConfirmationStart;
		
	/**
	 * Initialisierung des Exit Bestaetigungs Fensters
	 */
	public void initConfirmationStart() {
				
		this.setResizable(false);
		this.setTitle("Confirmation");
		this.setLayout(new GridLayout(1, 1));
		this.setBounds(windowXposition, windowYposition, windowWidth, windowHeight);
		
		panelMainConfirmationStart = new JPanel();
		panelMainConfirmationStart.setLayout(new BoxLayout(panelMainConfirmationStart, BoxLayout.Y_AXIS));
		panelMainConfirmationStart.setBackground(Color.black);
		panelConfirmationStartImage = new JPanel();
		panelConfirmationStartImage.setBackground(Color.black);
		labelConfirmationStartImage = new JLabel();
		labelConfirmationStartImage.setIcon(new ImageIcon("src/projektgruppe91/resources/images/WindowStart.png"));
		panelConfirmationStartImage.add(labelConfirmationStartImage);
		panelConfirmationStart = new JPanel();
		panelConfirmationStart.setBackground(Color.black);
		labelConfirmationStartText = new JLabel();
		labelConfirmationStartText.setFont(Arial12);
		labelConfirmationStartText.setText("Start Next Wave?");
		labelConfirmationStartText.setBackground(Color.black);
		labelConfirmationStartText.setForeground(Color.white);
		labelConfirmationStartText.setHorizontalAlignment(SwingConstants.CENTER);
		buttonYesStart = new JButton();
		buttonYesStart.setText("Yes");
		buttonYesStart.setFont(Arial15);
		buttonYesStart.setForeground(Color.black);
		buttonYesStart.setBackground(Color.white);
		buttonNoStart = new JButton();
		buttonNoStart.setText("No");
		buttonNoStart.setFont(Arial15);
		buttonNoStart.setForeground(Color.black);
		buttonNoStart.setBackground(Color.white);
		panelConfirmationStart.add(labelConfirmationStartText);
		panelConfirmationStart.add(buttonYesStart);
		panelConfirmationStart.add(buttonNoStart);
		panelMainConfirmationStart.add(panelConfirmationStartImage);
		panelMainConfirmationStart.add(panelConfirmationStart);
      								
		this.add(panelMainConfirmationStart);
		this.pack();
	}

	/**
	 * Action Listener Setter
	 */
	public void setActionListener(ActionListener l) {

		buttonYesStart.addActionListener(l);
		buttonNoStart.addActionListener(l);
	}
	
	// GETTER
	// ---------------------------------------------------------------------------------------------------------------------------
	
	/**
	 * @return JButton
	 */
	public JButton getYesStartButton() {return buttonYesStart;}
	
	/**
	 * @return JButton
	 */
	public JButton getNoStartButton() {return buttonNoStart;}
}
