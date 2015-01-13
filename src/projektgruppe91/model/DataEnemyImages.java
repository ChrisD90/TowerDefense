package projektgruppe91.model;

/**
* @author: Heiko Reinemuth, Christoph Weber, Christoph Döringer, Tobias Storck
* @version "Episode I"
**/

import java.util.HashMap;

import javax.swing.ImageIcon;

/**
* DataEnemyImages
*/
public class DataEnemyImages {
	
	// HASHMAPS
	HashMap<String, ImageIcon> enemyImages = new HashMap<String, ImageIcon>();
	
	/**
	 * Konstruktor
	 */
	public DataEnemyImages() {
		
		enemyImages.put("enemies (1)", new ImageIcon("src/projektgruppe91/resources/images/enemies (1).png"));
		enemyImages.put("enemies (2)", new ImageIcon("src/projektgruppe91/resources/images/enemies (2).png"));
		enemyImages.put("enemies (3)", new ImageIcon("src/projektgruppe91/resources/images/enemies (3).png"));
		enemyImages.put("enemies (4)", new ImageIcon("src/projektgruppe91/resources/images/enemies (4).png"));
		enemyImages.put("enemies (5)", new ImageIcon("src/projektgruppe91/resources/images/enemies (5).png"));
		enemyImages.put("enemies (6)", new ImageIcon("src/projektgruppe91/resources/images/enemies (6).png"));
		enemyImages.put("enemies (7)", new ImageIcon("src/projektgruppe91/resources/images/enemies (7).png"));
		enemyImages.put("enemies (8)", new ImageIcon("src/projektgruppe91/resources/images/enemies (8).png"));
	}
	
	// GETTER
	// ---------------------------------------------------------------------------------------------------------------------------
	
	/**
	 * @param String name
	 * @return ImageIcon
	 */
	public ImageIcon getEnemyImage(String name) {
		return enemyImages.get(name);
	}
}
