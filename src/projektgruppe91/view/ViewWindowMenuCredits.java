package projektgruppe91.view;

/**
* @author: Heiko Reinemuth, Christoph Weber, Christoph Döringer, Tobias Storck
* @version "Episode I"
**/

import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;

import javax.swing.ImageIcon;
import javax.swing.JDialog;

@SuppressWarnings("serial")
/**
* ViewWindowMenuCredits
*/
public class ViewWindowMenuCredits extends JDialog{
	
	// INSTANZEN VON VIEW
	private ViewSoundPlayer soundPlayer = new ViewSoundPlayer();
	// WINDOW 
	private static final int windowWidth = 400;
	private static final int windowHeight = 400;
	private static final Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
	private static final int windowXposition = (screenSize.width / 2) - (windowWidth / 2);
	private static final int windowYposition = (screenSize.height / 2) - (windowHeight / 2);
	// IMAGES	
	private ImageIcon img = new ImageIcon("src/projektgruppe91/resources/images/Credits.png");
	private Image image = img.getImage();
	
	/**
	 * Konstruktor
	 */
	public ViewWindowMenuCredits() {
				
		this.setResizable(false);
		this.setTitle("Credits");
		this.setVisible(true);
		this.setBounds(windowXposition, windowYposition, windowWidth, windowHeight);
	}
	
	@Override
	/**
	 * zeichnet ein Bild
	 */
	public void paint(Graphics g) {

		super.paint(g);
		g.drawImage(image, 0, 0, this);
		soundPlayer.playCredits();
	}
}
