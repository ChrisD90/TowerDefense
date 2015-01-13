package projektgruppe91.model;

/**
* @author: Heiko Reinemuth, Christoph Weber, Christoph Döringer, Tobias Storck
* @version "Episode I"
**/

import java.util.HashMap;

import javax.swing.ImageIcon;

/**
* DataSkinImages
*/
public class DataSkinImages {
	
	// HASHMAP
	private HashMap<String, ImageIcon> imageMap = new HashMap<String, ImageIcon>();
	
	/**
	 * Konstruktor
	 * Bilder werden in die HashMap gespeichert
	 */
	public DataSkinImages() {
		
		// GAME DESIGN 1
		imageMap.put("BSGameDesign1", new ImageIcon("src/projektgruppe91/resources/images/BSGameDesign1.png"));
		imageMap.put("DSGameDesign1", new ImageIcon("src/projektgruppe91/resources/images/DSGameDesign1.png"));
		imageMap.put("SWGameDesign1", new ImageIcon("src/projektgruppe91/resources/images/SWGameDesign1.png"));
		// GAME DESIGN 2
		imageMap.put("BSGameDesign2", new ImageIcon("src/projektgruppe91/resources/images/BSGameDesign2.png"));
		imageMap.put("DSGameDesign2", new ImageIcon("src/projektgruppe91/resources/images/DSGameDesign2.png"));
		imageMap.put("SWGameDesign2", new ImageIcon("src/projektgruppe91/resources/images/SWGameDesign2.png"));
		// TOWER BUTTONS
		imageMap.put("BStower (0)", new ImageIcon("src/projektgruppe91/resources/images/BStower (0).png"));
		imageMap.put("DStower (0)", new ImageIcon("src/projektgruppe91/resources/images/DStower (0).png"));
		imageMap.put("SWtower (0)", new ImageIcon("src/projektgruppe91/resources/images/SWtower (0).png"));
		imageMap.put("BStower (1)", new ImageIcon("src/projektgruppe91/resources/images/BStower (1).png"));
		imageMap.put("DStower (1)", new ImageIcon("src/projektgruppe91/resources/images/DStower (1).png"));
		imageMap.put("SWtower (1)", new ImageIcon("src/projektgruppe91/resources/images/SWtower (1).png"));
		imageMap.put("BStower (2)", new ImageIcon("src/projektgruppe91/resources/images/BStower (2).png"));
		imageMap.put("DStower (2)", new ImageIcon("src/projektgruppe91/resources/images/DStower (2).png"));
		imageMap.put("SWtower (2)", new ImageIcon("src/projektgruppe91/resources/images/SWtower (2).png"));
		imageMap.put("BStower (3)", new ImageIcon("src/projektgruppe91/resources/images/BStower (3).png"));
		imageMap.put("DStower (3)", new ImageIcon("src/projektgruppe91/resources/images/DStower (3).png"));
		imageMap.put("SWtower (3)", new ImageIcon("src/projektgruppe91/resources/images/SWtower (3).png"));
		imageMap.put("BStower (4)", new ImageIcon("src/projektgruppe91/resources/images/BStower (4).png"));
		imageMap.put("DStower (4)", new ImageIcon("src/projektgruppe91/resources/images/DStower (4).png"));
		imageMap.put("SWtower (4)", new ImageIcon("src/projektgruppe91/resources/images/SWtower (4).png"));
		imageMap.put("BStower (5)", new ImageIcon("src/projektgruppe91/resources/images/BStower (5).png"));
		imageMap.put("DStower (5)", new ImageIcon("src/projektgruppe91/resources/images/DStower (5).png"));
		imageMap.put("SWtower (5)", new ImageIcon("src/projektgruppe91/resources/images/SWtower (5).png"));
		imageMap.put("BStower (6)", new ImageIcon("src/projektgruppe91/resources/images/BStower (6).png"));
		imageMap.put("DStower (6)", new ImageIcon("src/projektgruppe91/resources/images/DStower (6).png"));
		imageMap.put("SWtower (6)", new ImageIcon("src/projektgruppe91/resources/images/SWtower (6).png"));
		// TOWER UPGRADE IMAGES
		imageMap.put("towerBS (1)upgrade", new ImageIcon("src/projektgruppe91/resources/images/towerBS (1)upgrade.png"));
		imageMap.put("towerDS (1)upgrade", new ImageIcon("src/projektgruppe91/resources/images/towerDS (1)upgrade.png"));
		imageMap.put("towerSW (1)upgrade", new ImageIcon("src/projektgruppe91/resources/images/towerSW (1)upgrade.png"));
		imageMap.put("towerBS (2)upgrade", new ImageIcon("src/projektgruppe91/resources/images/towerBS (2)upgrade.png"));
		imageMap.put("towerDS (2)upgrade", new ImageIcon("src/projektgruppe91/resources/images/towerDS (2)upgrade.png"));
		imageMap.put("towerSW (2)upgrade", new ImageIcon("src/projektgruppe91/resources/images/towerSW (2)upgrade.png"));
		imageMap.put("towerBS (3)upgrade", new ImageIcon("src/projektgruppe91/resources/images/towerBS (3)upgrade.png"));
		imageMap.put("towerDS (3)upgrade", new ImageIcon("src/projektgruppe91/resources/images/towerDS (3)upgrade.png"));
		imageMap.put("towerSW (3)upgrade", new ImageIcon("src/projektgruppe91/resources/images/towerSW (3)upgrade.png"));
		imageMap.put("towerBS (4)upgrade", new ImageIcon("src/projektgruppe91/resources/images/towerBS (4)upgrade.png"));
		imageMap.put("towerDS (4)upgrade", new ImageIcon("src/projektgruppe91/resources/images/towerDS (4)upgrade.png"));
		imageMap.put("towerSW (4)upgrade", new ImageIcon("src/projektgruppe91/resources/images/towerSW (4)upgrade.png"));
		imageMap.put("towerBS (5)upgrade", new ImageIcon("src/projektgruppe91/resources/images/towerBS (5)upgrade.png"));
		imageMap.put("towerDS (5)upgrade", new ImageIcon("src/projektgruppe91/resources/images/towerDS (5)upgrade.png"));
		imageMap.put("towerSW (5)upgrade", new ImageIcon("src/projektgruppe91/resources/images/towerSW (5)upgrade.png"));
		imageMap.put("towerBS (6)upgrade", new ImageIcon("src/projektgruppe91/resources/images/towerBS (6)upgrade.png"));
		imageMap.put("towerDS (6)upgrade", new ImageIcon("src/projektgruppe91/resources/images/towerDS (6)upgrade.png"));
		imageMap.put("towerSW (6)upgrade", new ImageIcon("src/projektgruppe91/resources/images/towerSW (6)upgrade.png"));
		// TOWER NAMES
		imageMap.put("BSTowerName (0)", new ImageIcon("src/projektgruppe91/resources/images/BSTowerName (0).png"));
		imageMap.put("DSTowerName (0)", new ImageIcon("src/projektgruppe91/resources/images/DSTowerName (0).png"));
		imageMap.put("SWTowerName (0)", new ImageIcon("src/projektgruppe91/resources/images/SWTowerName (0).png"));
		imageMap.put("BSTowerName (1)", new ImageIcon("src/projektgruppe91/resources/images/BSTowerName (1).png"));
		imageMap.put("DSTowerName (1)", new ImageIcon("src/projektgruppe91/resources/images/DSTowerName (1).png"));
		imageMap.put("SWTowerName (1)", new ImageIcon("src/projektgruppe91/resources/images/SWTowerName (1).png"));
		imageMap.put("BSTowerName (2)", new ImageIcon("src/projektgruppe91/resources/images/BSTowerName (2).png"));
		imageMap.put("DSTowerName (2)", new ImageIcon("src/projektgruppe91/resources/images/DSTowerName (2).png"));
		imageMap.put("SWTowerName (2)", new ImageIcon("src/projektgruppe91/resources/images/SWTowerName (2).png"));
		imageMap.put("BSTowerName (3)", new ImageIcon("src/projektgruppe91/resources/images/BSTowerName (3).png"));
		imageMap.put("DSTowerName (3)", new ImageIcon("src/projektgruppe91/resources/images/DSTowerName (3).png"));
		imageMap.put("SWTowerName (3)", new ImageIcon("src/projektgruppe91/resources/images/SWTowerName (3).png"));
		imageMap.put("BSTowerName (4)", new ImageIcon("src/projektgruppe91/resources/images/BSTowerName (4).png"));
		imageMap.put("DSTowerName (4)", new ImageIcon("src/projektgruppe91/resources/images/DSTowerName (4).png"));
		imageMap.put("SWTowerName (4)", new ImageIcon("src/projektgruppe91/resources/images/SWTowerName (4).png"));
		imageMap.put("BSTowerName (5)", new ImageIcon("src/projektgruppe91/resources/images/BSTowerName (5).png"));
		imageMap.put("DSTowerName (5)", new ImageIcon("src/projektgruppe91/resources/images/DSTowerName (5).png"));
		imageMap.put("SWTowerName (5)", new ImageIcon("src/projektgruppe91/resources/images/SWTowerName (5).png"));
		imageMap.put("BSTowerName (6)", new ImageIcon("src/projektgruppe91/resources/images/BSTowerName (6).png"));
		imageMap.put("DSTowerName (6)", new ImageIcon("src/projektgruppe91/resources/images/DSTowerName (6).png"));
		imageMap.put("SWTowerName (6)", new ImageIcon("src/projektgruppe91/resources/images/SWTowerName (6).png"));
		// TOWER RATINGS
		imageMap.put("BSTowerRating (0)", new ImageIcon("src/projektgruppe91/resources/images/BSTowerRating (0).png"));
		imageMap.put("BSTowerRating (1)", new ImageIcon("src/projektgruppe91/resources/images/BSTowerRating (1).png"));
		imageMap.put("BSTowerRating (2)", new ImageIcon("src/projektgruppe91/resources/images/BSTowerRating (2).png"));
		imageMap.put("BSTowerRating (3)", new ImageIcon("src/projektgruppe91/resources/images/BSTowerRating (3).png"));
		imageMap.put("BSTowerRating (4)", new ImageIcon("src/projektgruppe91/resources/images/BSTowerRating (4).png"));
		imageMap.put("BSTowerRating (5)", new ImageIcon("src/projektgruppe91/resources/images/BSTowerRating (5).png"));
		imageMap.put("DSTowerRating (0)", new ImageIcon("src/projektgruppe91/resources/images/DSTowerRating (0).png"));
		imageMap.put("DSTowerRating (1)", new ImageIcon("src/projektgruppe91/resources/images/DSTowerRating (1).png"));
		imageMap.put("DSTowerRating (2)", new ImageIcon("src/projektgruppe91/resources/images/DSTowerRating (2).png"));
		imageMap.put("DSTowerRating (3)", new ImageIcon("src/projektgruppe91/resources/images/DSTowerRating (3).png"));
		imageMap.put("DSTowerRating (4)", new ImageIcon("src/projektgruppe91/resources/images/DSTowerRating (4).png"));
		imageMap.put("DSTowerRating (5)", new ImageIcon("src/projektgruppe91/resources/images/DSTowerRating (5).png"));
		imageMap.put("SWTowerRating (0)", new ImageIcon("src/projektgruppe91/resources/images/SWTowerRating (0).png"));
		imageMap.put("SWTowerRating (1)", new ImageIcon("src/projektgruppe91/resources/images/SWTowerRating (1).png"));
		imageMap.put("SWTowerRating (2)", new ImageIcon("src/projektgruppe91/resources/images/SWTowerRating (2).png"));
		imageMap.put("SWTowerRating (3)", new ImageIcon("src/projektgruppe91/resources/images/SWTowerRating (3).png"));
		imageMap.put("SWTowerRating (4)", new ImageIcon("src/projektgruppe91/resources/images/SWTowerRating (4).png"));
		imageMap.put("SWTowerRating (5)", new ImageIcon("src/projektgruppe91/resources/images/SWTowerRating (5).png"));
	}
	
	// GETTER
	// ---------------------------------------------------------------------------------------------------------------------------
	
	/**
	 * @param String
	 * @return ImageIcon
	 */
	public ImageIcon getImage(String imagename) {return imageMap.get(imagename);}
}

	