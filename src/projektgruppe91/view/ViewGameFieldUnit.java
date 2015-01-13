package projektgruppe91.view;

/**
* @author: Heiko Reinemuth, Christoph Weber, Christoph Döringer, Tobias Storck
* @version "Episode I"
**/

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.image.ImageObserver;

import javax.swing.ImageIcon;
import javax.swing.JPanel;

@SuppressWarnings("serial")
/**
* ViewGameFieldUnit
*/
public class ViewGameFieldUnit extends JPanel{
	
	// UNIT VARIABLEN
	private int yPosition;
	private int xPosition;
	private Image img;
	
	/**
	  * @param:
	 * 		ImageIcon image: Oberfläche der Spielkachel
	 * 		int yRows: y-Position
	 * 		int xClos: x-Position
	 */
	public ViewGameFieldUnit(ImageIcon image, int yRows, int xCols) {
		
		this.yPosition = yRows;
		this.xPosition = xCols;
		this.img = image.getImage();
	}
	
	@Override
	/**
	 * zeichnet ein Feld auf dem Spielfeld
	 */
	public void paintComponent(Graphics g) {

		super.paintComponent(g);
		g.setColor(Color.blue);
		ImageObserver paintingChild = null;
		g.drawImage(img, 0, 0, 75, 75, paintingChild);
	}
	
	// GETTER
	// ---------------------------------------------------------------------------------------------------------------------------
	
	/**
	 * @return int
	 */
	public int getYPosition() {return yPosition;}
	
	/**
	 * @return int
	 */
	public int getXPosition() {return xPosition;}
}
