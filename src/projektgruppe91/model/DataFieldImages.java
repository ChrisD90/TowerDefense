package projektgruppe91.model;

/**
* @author: Heiko Reinemuth, Christoph Weber, Christoph Döringer, Tobias Storck
* @version "Episode I"
**/

import java.util.HashMap;

import javax.swing.ImageIcon;

import projektgruppe91.model.tower.DataTower;

/**
* DataFieldImages
*/
public class DataFieldImages {
	
	// INSTANZEN VON MODEL
	private DataTower dataTower = new DataTower();
	// HASHMAPS
	private HashMap<String, ImageIcon> fieldImages = new HashMap<String, ImageIcon>();
	private HashMap<String,String> fieldImagesParts = new HashMap<String, String>();
	
	/**
	 * Konstruktor
	 * Bilder werden in die HashMap gespeichert
	 */
	public DataFieldImages() {
		
		// MapDesign Empty Field
		fieldImages.put("TDmapEmpty (1)", new ImageIcon("src/projektgruppe91/resources/images/TDmapEmpty (1).png"));
		fieldImages.put("TDmapEmpty (2)", new ImageIcon("src/projektgruppe91/resources/images/TDmapEmpty (2).png"));
		fieldImages.put("TDmapEmpty (3)", new ImageIcon("src/projektgruppe91/resources/images/TDmapEmpty (3).png"));
		fieldImages.put("TDmapEmpty (4)", new ImageIcon("src/projektgruppe91/resources/images/TDmapEmpty (4).png"));
		// MapDesign Way Field
		fieldImages.put("TDmapway(1)", new ImageIcon("src/projektgruppe91/resources/images/TDmapway(1).png"));
		fieldImages.put("TDmapway(2)", new ImageIcon("src/projektgruppe91/resources/images/TDmapway(2).png"));
		fieldImages.put("TDmapway(3)", new ImageIcon("src/projektgruppe91/resources/images/TDmapway(3).png"));
		fieldImages.put("TDmapway(4)", new ImageIcon("src/projektgruppe91/resources/images/TDmapway(4).png"));
		// MapDesign Spawn & Finish
		fieldImages.put("TDmapEmpty(1)startEnd", new ImageIcon("src/projektgruppe91/resources/images/TDmapEmpty(1)startEnd.png"));
		fieldImages.put("TDmapEmpty(2)startEnd", new ImageIcon("src/projektgruppe91/resources/images/TDmapEmpty(2)startEnd.png"));
		fieldImages.put("TDmapEmpty(3)startEnd", new ImageIcon("src/projektgruppe91/resources/images/TDmapEmpty(3)startEnd.png"));
		fieldImages.put("TDmapEmpty(4)startEnd", new ImageIcon("src/projektgruppe91/resources/images/TDmapEmpty(4)startEnd.png"));
		// Bright Side Tower und Tower Upgrade fuer Skin Hoth
		fieldImages.put("TDmapEmpty(1)towerBS1(1)", new ImageIcon("src/projektgruppe91/resources/images/TDmapEmpty(1)towerBS1(1).png"));
		fieldImages.put("TDmapEmpty(1)towerBS1(2)", new ImageIcon("src/projektgruppe91/resources/images/TDmapEmpty(1)towerBS1(2).png"));
		fieldImages.put("TDmapEmpty(1)towerBS2(1)", new ImageIcon("src/projektgruppe91/resources/images/TDmapEmpty(1)towerBS2(1).png"));
		fieldImages.put("TDmapEmpty(1)towerBS2(2)", new ImageIcon("src/projektgruppe91/resources/images/TDmapEmpty(1)towerBS2(2).png"));
		fieldImages.put("TDmapEmpty(1)towerBS3(1)", new ImageIcon("src/projektgruppe91/resources/images/TDmapEmpty(1)towerBS3(1).png"));
		fieldImages.put("TDmapEmpty(1)towerBS3(2)", new ImageIcon("src/projektgruppe91/resources/images/TDmapEmpty(1)towerBS3(2).png"));
		fieldImages.put("TDmapEmpty(1)towerBS4(1)", new ImageIcon("src/projektgruppe91/resources/images/TDmapEmpty(1)towerBS4(1).png"));
		fieldImages.put("TDmapEmpty(1)towerBS4(2)", new ImageIcon("src/projektgruppe91/resources/images/TDmapEmpty(1)towerBS4(2).png"));
		fieldImages.put("TDmapEmpty(1)towerBS5(1)", new ImageIcon("src/projektgruppe91/resources/images/TDmapEmpty(1)towerBS5(1).png"));
		fieldImages.put("TDmapEmpty(1)towerBS5(2)", new ImageIcon("src/projektgruppe91/resources/images/TDmapEmpty(1)towerBS5(2).png"));
		fieldImages.put("TDmapEmpty(1)towerBS6(1)", new ImageIcon("src/projektgruppe91/resources/images/TDmapEmpty(1)towerBS6(1).png"));
		fieldImages.put("TDmapEmpty(1)towerBS6(2)", new ImageIcon("src/projektgruppe91/resources/images/TDmapEmpty(1)towerBS6(2).png"));
		// Dark Side Tower und Tower Upgrade fuer Skin Hoth
		fieldImages.put("TDmapEmpty(1)towerDS1(1)", new ImageIcon("src/projektgruppe91/resources/images/TDmapEmpty(1)towerDS1(1).png"));
		fieldImages.put("TDmapEmpty(1)towerDS1(2)", new ImageIcon("src/projektgruppe91/resources/images/TDmapEmpty(1)towerDS1(2).png"));
		fieldImages.put("TDmapEmpty(1)towerDS2(1)", new ImageIcon("src/projektgruppe91/resources/images/TDmapEmpty(1)towerDS2(1).png"));
		fieldImages.put("TDmapEmpty(1)towerDS2(2)", new ImageIcon("src/projektgruppe91/resources/images/TDmapEmpty(1)towerDS2(2).png"));
		fieldImages.put("TDmapEmpty(1)towerDS3(1)", new ImageIcon("src/projektgruppe91/resources/images/TDmapEmpty(1)towerDS3(1).png"));
		fieldImages.put("TDmapEmpty(1)towerDS3(2)", new ImageIcon("src/projektgruppe91/resources/images/TDmapEmpty(1)towerDS3(2).png"));
		fieldImages.put("TDmapEmpty(1)towerDS4(1)", new ImageIcon("src/projektgruppe91/resources/images/TDmapEmpty(1)towerDS4(1).png"));
		fieldImages.put("TDmapEmpty(1)towerDS4(2)", new ImageIcon("src/projektgruppe91/resources/images/TDmapEmpty(1)towerDS4(2).png"));
		fieldImages.put("TDmapEmpty(1)towerDS5(1)", new ImageIcon("src/projektgruppe91/resources/images/TDmapEmpty(1)towerDS5(1).png"));
		fieldImages.put("TDmapEmpty(1)towerDS5(2)", new ImageIcon("src/projektgruppe91/resources/images/TDmapEmpty(1)towerDS5(2).png"));
		fieldImages.put("TDmapEmpty(1)towerDS6(1)", new ImageIcon("src/projektgruppe91/resources/images/TDmapEmpty(1)towerDS6(1).png"));
		fieldImages.put("TDmapEmpty(1)towerDS6(2)", new ImageIcon("src/projektgruppe91/resources/images/TDmapEmpty(1)towerDS6(2).png"));
		// Star Wars Tower und Tower Upgrade fuer Skin Hoth
		fieldImages.put("TDmapEmpty(1)towerSW1(1)", new ImageIcon("src/projektgruppe91/resources/images/TDmapEmpty(1)towerSW1(1).png"));
		fieldImages.put("TDmapEmpty(1)towerSW1(2)", new ImageIcon("src/projektgruppe91/resources/images/TDmapEmpty(1)towerSW1(2).png"));
		fieldImages.put("TDmapEmpty(1)towerSW2(1)", new ImageIcon("src/projektgruppe91/resources/images/TDmapEmpty(1)towerSW2(1).png"));
		fieldImages.put("TDmapEmpty(1)towerSW2(2)", new ImageIcon("src/projektgruppe91/resources/images/TDmapEmpty(1)towerSW2(2).png"));
		fieldImages.put("TDmapEmpty(1)towerSW3(1)", new ImageIcon("src/projektgruppe91/resources/images/TDmapEmpty(1)towerSW3(1).png"));
		fieldImages.put("TDmapEmpty(1)towerSW3(2)", new ImageIcon("src/projektgruppe91/resources/images/TDmapEmpty(1)towerSW3(2).png"));
		fieldImages.put("TDmapEmpty(1)towerSW4(1)", new ImageIcon("src/projektgruppe91/resources/images/TDmapEmpty(1)towerSW4(1).png"));
		fieldImages.put("TDmapEmpty(1)towerSW4(2)", new ImageIcon("src/projektgruppe91/resources/images/TDmapEmpty(1)towerSW4(2).png"));
		fieldImages.put("TDmapEmpty(1)towerSW5(1)", new ImageIcon("src/projektgruppe91/resources/images/TDmapEmpty(1)towerSW5(1).png"));
		fieldImages.put("TDmapEmpty(1)towerSW5(2)", new ImageIcon("src/projektgruppe91/resources/images/TDmapEmpty(1)towerSW5(2).png"));
		fieldImages.put("TDmapEmpty(1)towerSW6(1)", new ImageIcon("src/projektgruppe91/resources/images/TDmapEmpty(1)towerSW6(1).png"));
		fieldImages.put("TDmapEmpty(1)towerSW6(2)", new ImageIcon("src/projektgruppe91/resources/images/TDmapEmpty(1)towerSW6(2).png"));
		// Bright Side Tower und Tower Upgrade fuer Skin Mustafar
		fieldImages.put("TDmapEmpty(2)towerBS1(1)", new ImageIcon("src/projektgruppe91/resources/images/TDmapEmpty(2)towerBS1(1).png"));
		fieldImages.put("TDmapEmpty(2)towerBS1(2)", new ImageIcon("src/projektgruppe91/resources/images/TDmapEmpty(2)towerBS1(2).png"));
		fieldImages.put("TDmapEmpty(2)towerBS2(1)", new ImageIcon("src/projektgruppe91/resources/images/TDmapEmpty(2)towerBS2(1).png"));
		fieldImages.put("TDmapEmpty(2)towerBS2(2)", new ImageIcon("src/projektgruppe91/resources/images/TDmapEmpty(2)towerBS2(2).png"));
		fieldImages.put("TDmapEmpty(2)towerBS3(1)", new ImageIcon("src/projektgruppe91/resources/images/TDmapEmpty(2)towerBS3(1).png"));
		fieldImages.put("TDmapEmpty(2)towerBS3(2)", new ImageIcon("src/projektgruppe91/resources/images/TDmapEmpty(2)towerBS3(2).png"));
		fieldImages.put("TDmapEmpty(2)towerBS4(1)", new ImageIcon("src/projektgruppe91/resources/images/TDmapEmpty(2)towerBS4(1).png"));
		fieldImages.put("TDmapEmpty(2)towerBS4(2)", new ImageIcon("src/projektgruppe91/resources/images/TDmapEmpty(2)towerBS4(2).png"));
		fieldImages.put("TDmapEmpty(2)towerBS5(1)", new ImageIcon("src/projektgruppe91/resources/images/TDmapEmpty(2)towerBS5(1).png"));
		fieldImages.put("TDmapEmpty(2)towerBS5(2)", new ImageIcon("src/projektgruppe91/resources/images/TDmapEmpty(2)towerBS5(2).png"));
		fieldImages.put("TDmapEmpty(2)towerBS6(1)", new ImageIcon("src/projektgruppe91/resources/images/TDmapEmpty(2)towerBS6(1).png"));
		fieldImages.put("TDmapEmpty(2)towerBS6(2)", new ImageIcon("src/projektgruppe91/resources/images/TDmapEmpty(2)towerBS6(2).png"));
		// Dark Side Tower und Tower Upgrade fuer Skin Mustafar
		fieldImages.put("TDmapEmpty(2)towerDS1(1)", new ImageIcon("src/projektgruppe91/resources/images/TDmapEmpty(2)towerDS1(1).png"));
		fieldImages.put("TDmapEmpty(2)towerDS1(2)", new ImageIcon("src/projektgruppe91/resources/images/TDmapEmpty(2)towerDS1(2).png"));
		fieldImages.put("TDmapEmpty(2)towerDS2(1)", new ImageIcon("src/projektgruppe91/resources/images/TDmapEmpty(2)towerDS2(1).png"));
		fieldImages.put("TDmapEmpty(2)towerDS2(2)", new ImageIcon("src/projektgruppe91/resources/images/TDmapEmpty(2)towerDS2(2).png"));
		fieldImages.put("TDmapEmpty(2)towerDS3(1)", new ImageIcon("src/projektgruppe91/resources/images/TDmapEmpty(2)towerDS3(1).png"));
		fieldImages.put("TDmapEmpty(2)towerDS3(2)", new ImageIcon("src/projektgruppe91/resources/images/TDmapEmpty(2)towerDS3(2).png"));
		fieldImages.put("TDmapEmpty(2)towerDS4(1)", new ImageIcon("src/projektgruppe91/resources/images/TDmapEmpty(2)towerDS4(1).png"));
		fieldImages.put("TDmapEmpty(2)towerDS4(2)", new ImageIcon("src/projektgruppe91/resources/images/TDmapEmpty(2)towerDS4(2).png"));
		fieldImages.put("TDmapEmpty(2)towerDS5(1)", new ImageIcon("src/projektgruppe91/resources/images/TDmapEmpty(2)towerDS5(1).png"));
		fieldImages.put("TDmapEmpty(2)towerDS5(2)", new ImageIcon("src/projektgruppe91/resources/images/TDmapEmpty(2)towerDS5(2).png"));
		fieldImages.put("TDmapEmpty(2)towerDS6(1)", new ImageIcon("src/projektgruppe91/resources/images/TDmapEmpty(2)towerDS6(1).png"));
		fieldImages.put("TDmapEmpty(2)towerDS6(2)", new ImageIcon("src/projektgruppe91/resources/images/TDmapEmpty(2)towerDS6(2).png"));
		// Star Wars Tower und Tower Upgrade fuer Skin Mustafar
		fieldImages.put("TDmapEmpty(2)towerSW1(1)", new ImageIcon("src/projektgruppe91/resources/images/TDmapEmpty(2)towerSW1(1).png"));
		fieldImages.put("TDmapEmpty(2)towerSW1(2)", new ImageIcon("src/projektgruppe91/resources/images/TDmapEmpty(2)towerSW1(2).png"));
		fieldImages.put("TDmapEmpty(2)towerSW2(1)", new ImageIcon("src/projektgruppe91/resources/images/TDmapEmpty(2)towerSW2(1).png"));
		fieldImages.put("TDmapEmpty(2)towerSW2(2)", new ImageIcon("src/projektgruppe91/resources/images/TDmapEmpty(2)towerSW2(2).png"));
		fieldImages.put("TDmapEmpty(2)towerSW3(1)", new ImageIcon("src/projektgruppe91/resources/images/TDmapEmpty(2)towerSW3(1).png"));
		fieldImages.put("TDmapEmpty(2)towerSW3(2)", new ImageIcon("src/projektgruppe91/resources/images/TDmapEmpty(2)towerSW3(2).png"));
		fieldImages.put("TDmapEmpty(2)towerSW4(1)", new ImageIcon("src/projektgruppe91/resources/images/TDmapEmpty(2)towerSW4(1).png"));
		fieldImages.put("TDmapEmpty(2)towerSW4(2)", new ImageIcon("src/projektgruppe91/resources/images/TDmapEmpty(2)towerSW4(2).png"));
		fieldImages.put("TDmapEmpty(2)towerSW5(1)", new ImageIcon("src/projektgruppe91/resources/images/TDmapEmpty(2)towerSW5(1).png"));
		fieldImages.put("TDmapEmpty(2)towerSW5(2)", new ImageIcon("src/projektgruppe91/resources/images/TDmapEmpty(2)towerSW5(2).png"));
		fieldImages.put("TDmapEmpty(2)towerSW6(1)", new ImageIcon("src/projektgruppe91/resources/images/TDmapEmpty(2)towerSW6(1).png"));
		fieldImages.put("TDmapEmpty(2)towerSW6(2)", new ImageIcon("src/projektgruppe91/resources/images/TDmapEmpty(2)towerSW6(2).png"));
		// Bright Side Tower und Tower Upgrade fuer Skin Tatooine
		fieldImages.put("TDmapEmpty(3)towerBS1(1)", new ImageIcon("src/projektgruppe91/resources/images/TDmapEmpty(3)towerBS1(1).png"));
		fieldImages.put("TDmapEmpty(3)towerBS1(2)", new ImageIcon("src/projektgruppe91/resources/images/TDmapEmpty(3)towerBS1(2).png"));
		fieldImages.put("TDmapEmpty(3)towerBS2(1)", new ImageIcon("src/projektgruppe91/resources/images/TDmapEmpty(3)towerBS2(1).png"));
		fieldImages.put("TDmapEmpty(3)towerBS2(2)", new ImageIcon("src/projektgruppe91/resources/images/TDmapEmpty(3)towerBS2(2).png"));
		fieldImages.put("TDmapEmpty(3)towerBS3(1)", new ImageIcon("src/projektgruppe91/resources/images/TDmapEmpty(3)towerBS3(1).png"));
		fieldImages.put("TDmapEmpty(3)towerBS3(2)", new ImageIcon("src/projektgruppe91/resources/images/TDmapEmpty(3)towerBS3(2).png"));
		fieldImages.put("TDmapEmpty(3)towerBS4(1)", new ImageIcon("src/projektgruppe91/resources/images/TDmapEmpty(3)towerBS4(1).png"));
		fieldImages.put("TDmapEmpty(3)towerBS4(2)", new ImageIcon("src/projektgruppe91/resources/images/TDmapEmpty(3)towerBS4(2).png"));
		fieldImages.put("TDmapEmpty(3)towerBS5(1)", new ImageIcon("src/projektgruppe91/resources/images/TDmapEmpty(3)towerBS5(1).png"));
		fieldImages.put("TDmapEmpty(3)towerBS5(2)", new ImageIcon("src/projektgruppe91/resources/images/TDmapEmpty(3)towerBS5(2).png"));
		fieldImages.put("TDmapEmpty(3)towerBS6(1)", new ImageIcon("src/projektgruppe91/resources/images/TDmapEmpty(3)towerBS6(1).png"));
		fieldImages.put("TDmapEmpty(3)towerBS6(2)", new ImageIcon("src/projektgruppe91/resources/images/TDmapEmpty(3)towerBS6(2).png"));
		// Dark Side Tower und Tower Upgrade fuer Skin Tatooine
		fieldImages.put("TDmapEmpty(3)towerDS1(1)", new ImageIcon("src/projektgruppe91/resources/images/TDmapEmpty(3)towerDS1(1).png"));
		fieldImages.put("TDmapEmpty(3)towerDS1(2)", new ImageIcon("src/projektgruppe91/resources/images/TDmapEmpty(3)towerDS1(2).png"));
		fieldImages.put("TDmapEmpty(3)towerDS2(1)", new ImageIcon("src/projektgruppe91/resources/images/TDmapEmpty(3)towerDS2(1).png"));
		fieldImages.put("TDmapEmpty(3)towerDS2(2)", new ImageIcon("src/projektgruppe91/resources/images/TDmapEmpty(3)towerDS2(2).png"));
		fieldImages.put("TDmapEmpty(3)towerDS3(1)", new ImageIcon("src/projektgruppe91/resources/images/TDmapEmpty(3)towerDS3(1).png"));
		fieldImages.put("TDmapEmpty(3)towerDS3(2)", new ImageIcon("src/projektgruppe91/resources/images/TDmapEmpty(3)towerDS3(2).png"));
		fieldImages.put("TDmapEmpty(3)towerDS4(1)", new ImageIcon("src/projektgruppe91/resources/images/TDmapEmpty(3)towerDS4(1).png"));
		fieldImages.put("TDmapEmpty(3)towerDS4(2)", new ImageIcon("src/projektgruppe91/resources/images/TDmapEmpty(3)towerDS4(2).png"));
		fieldImages.put("TDmapEmpty(3)towerDS5(1)", new ImageIcon("src/projektgruppe91/resources/images/TDmapEmpty(3)towerDS5(1).png"));
		fieldImages.put("TDmapEmpty(3)towerDS5(2)", new ImageIcon("src/projektgruppe91/resources/images/TDmapEmpty(3)towerDS5(2).png"));
		fieldImages.put("TDmapEmpty(3)towerDS6(1)", new ImageIcon("src/projektgruppe91/resources/images/TDmapEmpty(3)towerDS6(1).png"));
		fieldImages.put("TDmapEmpty(3)towerDS6(2)", new ImageIcon("src/projektgruppe91/resources/images/TDmapEmpty(3)towerDS6(2).png"));
		// Star Wars Tower und Tower Upgrade fuer Skin Tatooine
		fieldImages.put("TDmapEmpty(3)towerSW1(1)", new ImageIcon("src/projektgruppe91/resources/images/TDmapEmpty(3)towerSW1(1).png"));
		fieldImages.put("TDmapEmpty(3)towerSW1(2)", new ImageIcon("src/projektgruppe91/resources/images/TDmapEmpty(3)towerSW1(2).png"));
		fieldImages.put("TDmapEmpty(3)towerSW2(1)", new ImageIcon("src/projektgruppe91/resources/images/TDmapEmpty(3)towerSW2(1).png"));
		fieldImages.put("TDmapEmpty(3)towerSW2(2)", new ImageIcon("src/projektgruppe91/resources/images/TDmapEmpty(3)towerSW2(2).png"));
		fieldImages.put("TDmapEmpty(3)towerSW3(1)", new ImageIcon("src/projektgruppe91/resources/images/TDmapEmpty(3)towerSW3(1).png"));
		fieldImages.put("TDmapEmpty(3)towerSW3(2)", new ImageIcon("src/projektgruppe91/resources/images/TDmapEmpty(3)towerSW3(2).png"));
		fieldImages.put("TDmapEmpty(3)towerSW4(1)", new ImageIcon("src/projektgruppe91/resources/images/TDmapEmpty(3)towerSW4(1).png"));
		fieldImages.put("TDmapEmpty(3)towerSW4(2)", new ImageIcon("src/projektgruppe91/resources/images/TDmapEmpty(3)towerSW4(2).png"));
		fieldImages.put("TDmapEmpty(3)towerSW5(1)", new ImageIcon("src/projektgruppe91/resources/images/TDmapEmpty(3)towerSW5(1).png"));
		fieldImages.put("TDmapEmpty(3)towerSW5(2)", new ImageIcon("src/projektgruppe91/resources/images/TDmapEmpty(3)towerSW5(2).png"));
		fieldImages.put("TDmapEmpty(3)towerSW6(1)", new ImageIcon("src/projektgruppe91/resources/images/TDmapEmpty(3)towerSW6(1).png"));
		fieldImages.put("TDmapEmpty(3)towerSW6(2)", new ImageIcon("src/projektgruppe91/resources/images/TDmapEmpty(3)towerSW6(2).png"));
		// Bright Side Tower und Tower Upgrade fuer Skin Asteroiden
		fieldImages.put("TDmapEmpty(4)towerBS1(1)", new ImageIcon("src/projektgruppe91/resources/images/TDmapEmpty(4)towerBS1(1).png"));
		fieldImages.put("TDmapEmpty(4)towerBS1(2)", new ImageIcon("src/projektgruppe91/resources/images/TDmapEmpty(4)towerBS1(2).png"));
		fieldImages.put("TDmapEmpty(4)towerBS2(1)", new ImageIcon("src/projektgruppe91/resources/images/TDmapEmpty(4)towerBS2(1).png"));
		fieldImages.put("TDmapEmpty(4)towerBS2(2)", new ImageIcon("src/projektgruppe91/resources/images/TDmapEmpty(4)towerBS2(2).png"));
		fieldImages.put("TDmapEmpty(4)towerBS3(1)", new ImageIcon("src/projektgruppe91/resources/images/TDmapEmpty(4)towerBS3(1).png"));
		fieldImages.put("TDmapEmpty(4)towerBS3(2)", new ImageIcon("src/projektgruppe91/resources/images/TDmapEmpty(4)towerBS3(2).png"));
		fieldImages.put("TDmapEmpty(4)towerBS4(1)", new ImageIcon("src/projektgruppe91/resources/images/TDmapEmpty(4)towerBS4(1).png"));
		fieldImages.put("TDmapEmpty(4)towerBS4(2)", new ImageIcon("src/projektgruppe91/resources/images/TDmapEmpty(4)towerBS4(2).png"));
		fieldImages.put("TDmapEmpty(4)towerBS5(1)", new ImageIcon("src/projektgruppe91/resources/images/TDmapEmpty(4)towerBS5(1).png"));
		fieldImages.put("TDmapEmpty(4)towerBS5(2)", new ImageIcon("src/projektgruppe91/resources/images/TDmapEmpty(4)towerBS5(2).png"));
		fieldImages.put("TDmapEmpty(4)towerBS6(1)", new ImageIcon("src/projektgruppe91/resources/images/TDmapEmpty(4)towerBS6(1).png"));
		fieldImages.put("TDmapEmpty(4)towerBS6(2)", new ImageIcon("src/projektgruppe91/resources/images/TDmapEmpty(4)towerBS6(2).png"));
		// Dark Side Tower und Tower Upgrade fuer Skin Asteroiden
		fieldImages.put("TDmapEmpty(4)towerDS1(1)", new ImageIcon("src/projektgruppe91/resources/images/TDmapEmpty(4)towerDS1(1).png"));
		fieldImages.put("TDmapEmpty(4)towerDS1(2)", new ImageIcon("src/projektgruppe91/resources/images/TDmapEmpty(4)towerDS1(2).png"));
		fieldImages.put("TDmapEmpty(4)towerDS2(1)", new ImageIcon("src/projektgruppe91/resources/images/TDmapEmpty(4)towerDS2(1).png"));
		fieldImages.put("TDmapEmpty(4)towerDS2(2)", new ImageIcon("src/projektgruppe91/resources/images/TDmapEmpty(4)towerDS2(2).png"));
		fieldImages.put("TDmapEmpty(4)towerDS3(1)", new ImageIcon("src/projektgruppe91/resources/images/TDmapEmpty(4)towerDS3(1).png"));
		fieldImages.put("TDmapEmpty(4)towerDS3(2)", new ImageIcon("src/projektgruppe91/resources/images/TDmapEmpty(4)towerDS3(2).png"));
		fieldImages.put("TDmapEmpty(4)towerDS4(1)", new ImageIcon("src/projektgruppe91/resources/images/TDmapEmpty(4)towerDS4(1).png"));
		fieldImages.put("TDmapEmpty(4)towerDS4(2)", new ImageIcon("src/projektgruppe91/resources/images/TDmapEmpty(4)towerDS4(2).png"));
		fieldImages.put("TDmapEmpty(4)towerDS5(1)", new ImageIcon("src/projektgruppe91/resources/images/TDmapEmpty(4)towerDS5(1).png"));
		fieldImages.put("TDmapEmpty(4)towerDS5(2)", new ImageIcon("src/projektgruppe91/resources/images/TDmapEmpty(4)towerDS5(2).png"));
		fieldImages.put("TDmapEmpty(4)towerDS6(1)", new ImageIcon("src/projektgruppe91/resources/images/TDmapEmpty(4)towerDS6(1).png"));
		fieldImages.put("TDmapEmpty(4)towerDS6(2)", new ImageIcon("src/projektgruppe91/resources/images/TDmapEmpty(4)towerDS6(2).png"));
		// Star Wars Tower und Tower Upgrade fuer Skin Asteroiden
		fieldImages.put("TDmapEmpty(4)towerSW1(1)", new ImageIcon("src/projektgruppe91/resources/images/TDmapEmpty(4)towerSW1(1).png"));
		fieldImages.put("TDmapEmpty(4)towerSW1(2)", new ImageIcon("src/projektgruppe91/resources/images/TDmapEmpty(4)towerSW1(2).png"));
		fieldImages.put("TDmapEmpty(4)towerSW2(1)", new ImageIcon("src/projektgruppe91/resources/images/TDmapEmpty(4)towerSW2(1).png"));
		fieldImages.put("TDmapEmpty(4)towerSW2(2)", new ImageIcon("src/projektgruppe91/resources/images/TDmapEmpty(4)towerSW2(2).png"));
		fieldImages.put("TDmapEmpty(4)towerSW3(1)", new ImageIcon("src/projektgruppe91/resources/images/TDmapEmpty(4)towerSW3(1).png"));
		fieldImages.put("TDmapEmpty(4)towerSW3(2)", new ImageIcon("src/projektgruppe91/resources/images/TDmapEmpty(4)towerSW3(2).png"));
		fieldImages.put("TDmapEmpty(4)towerSW4(1)", new ImageIcon("src/projektgruppe91/resources/images/TDmapEmpty(4)towerSW4(1).png"));
		fieldImages.put("TDmapEmpty(4)towerSW4(2)", new ImageIcon("src/projektgruppe91/resources/images/TDmapEmpty(4)towerSW4(2).png"));
		fieldImages.put("TDmapEmpty(4)towerSW5(1)", new ImageIcon("src/projektgruppe91/resources/images/TDmapEmpty(4)towerSW5(1).png"));
		fieldImages.put("TDmapEmpty(4)towerSW5(2)", new ImageIcon("src/projektgruppe91/resources/images/TDmapEmpty(4)towerSW5(2).png"));
		fieldImages.put("TDmapEmpty(4)towerSW6(1)", new ImageIcon("src/projektgruppe91/resources/images/TDmapEmpty(4)towerSW6(1).png"));
		fieldImages.put("TDmapEmpty(4)towerSW6(2)", new ImageIcon("src/projektgruppe91/resources/images/TDmapEmpty(4)towerSW6(2).png"));
		// Map Hoth Kurven gegen den Uhrzeigersinn
		fieldImages.put("TDmapway(1)linkskurve.nach.unten", new ImageIcon("src/projektgruppe91/resources/images/TDmapway(1)linkskurve.nach.unten.png"));
		fieldImages.put("TDmapway(1)rechtskurve.nach.unten", new ImageIcon("src/projektgruppe91/resources/images/TDmapway(1)rechtskurve.nach.unten.png"));
		fieldImages.put("TDmapway(1)linkskurve.nach.oben", new ImageIcon("src/projektgruppe91/resources/images/TDmapway(1)linkskurve.nach.oben.png")); 
		fieldImages.put("TDmapway(1)rechtskurve.nach.oben", new ImageIcon("src/projektgruppe91/resources/images/TDmapway(1)rechtskurve.nach.oben.png"));
		// Map Hoth Kurven im Uhrzeigersinn
		fieldImages.put("TDmapway(1)linkskurve.nach.unten(Uhrzeigersinn)", new ImageIcon("src/projektgruppe91/resources/images/TDmapway(1)linkskurve.nach.unten(Uhrzeigersinn).png"));
		fieldImages.put("TDmapway(1)rechtskurve.nach.unten(Uhrzeigersinn)", new ImageIcon("src/projektgruppe91/resources/images/TDmapway(1)rechtskurve.nach.unten(Uhrzeigersinn).png"));
		fieldImages.put("TDmapway(1)linkskurve.nach.oben(Uhrzeigersinn)", new ImageIcon("src/projektgruppe91/resources/images/TDmapway(1)linkskurve.nach.oben(Uhrzeigersinn).png"));
		fieldImages.put("TDmapway(1)rechtskurve.nach.oben(Uhrzeigersinn)", new ImageIcon("src/projektgruppe91/resources/images/TDmapway(1)rechtskurve.nach.oben(Uhrzeigersinn).png"));
		// Map Mustafar Kurven gegen den Uhrzeigersinn
		fieldImages.put("TDmapway(2)linkskurve.nach.unten", new ImageIcon("src/projektgruppe91/resources/images/TDmapway(2)linkskurve.nach.unten.png"));
		fieldImages.put("TDmapway(2)rechtskurve.nach.unten", new ImageIcon("src/projektgruppe91/resources/images/TDmapway(2)rechtskurve.nach.unten.png"));
		fieldImages.put("TDmapway(2)linkskurve.nach.oben", new ImageIcon("src/projektgruppe91/resources/images/TDmapway(2)linkskurve.nach.oben.png"));
		fieldImages.put("TDmapway(2)rechtskurve.nach.oben", new ImageIcon("src/projektgruppe91/resources/images/TDmapway(2)rechtskurve.nach.oben.png"));
		// Map Mustafar im Uhrzeigersinn
		fieldImages.put("TDmapway(2)linkskurve.nach.unten(Uhrzeigersinn)", new ImageIcon("src/projektgruppe91/resources/images/TDmapway(2)linkskurve.nach.unten(Uhrzeigersinn).png"));
		fieldImages.put("TDmapway(2)rechtskurve.nach.unten(Uhrzeigersinn)", new ImageIcon("src/projektgruppe91/resources/images/TDmapway(2)rechtskurve.nach.unten(Uhrzeigersinn).png"));
		fieldImages.put("TDmapway(2)linkskurve.nach.oben(Uhrzeigersinn)", new ImageIcon("src/projektgruppe91/resources/images/TDmapway(2)linkskurve.nach.oben(Uhrzeigersinn).png"));
		fieldImages.put("TDmapway(2)rechtskurve.nach.oben(Uhrzeigersinn)", new ImageIcon("src/projektgruppe91/resources/images/TDmapway(2)rechtskurve.nach.oben(Uhrzeigersinn).png"));
		// Map Tatooine Kurven gegen den Uhrzeigersinn
		fieldImages.put("TDmapway(3)linkskurve.nach.unten", new ImageIcon("src/projektgruppe91/resources/images/TDmapway(3)linkskurve.nach.unten.png"));
		fieldImages.put("TDmapway(3)rechtskurve.nach.unten", new ImageIcon("src/projektgruppe91/resources/images/TDmapway(3)rechtskurve.nach.unten.png"));
		fieldImages.put("TDmapway(3)linkskurve.nach.oben", new ImageIcon("src/projektgruppe91/resources/images/TDmapway(3)linkskurve.nach.oben.png"));
		fieldImages.put("TDmapway(3)rechtskurve.nach.oben", new ImageIcon("src/projektgruppe91/resources/images/TDmapway(3)rechtskurve.nach.oben.png"));
		// Map Tatooine Kurven im Uhrzeigersinn
		fieldImages.put("TDmapway(3)linkskurve.nach.unten(Uhrzeigersinn)", new ImageIcon("src/projektgruppe91/resources/images/TDmapway(3)linkskurve.nach.unten(Uhrzeigersinn).png"));
		fieldImages.put("TDmapway(3)rechtskurve.nach.unten(Uhrzeigersinn)", new ImageIcon("src/projektgruppe91/resources/images/TDmapway(3)rechtskurve.nach.unten(Uhrzeigersinn).png"));
		fieldImages.put("TDmapway(3)linkskurve.nach.oben(Uhrzeigersinn)", new ImageIcon("src/projektgruppe91/resources/images/TDmapway(3)linkskurve.nach.oben(Uhrzeigersinn).png"));
		fieldImages.put("TDmapway(3)rechtskurve.nach.oben(Uhrzeigersinn)", new ImageIcon("src/projektgruppe91/resources/images/TDmapway(3)rechtskurve.nach.oben(Uhrzeigersinn).png"));
		// Map Sterne Kurven gegen den Uhrzeigersinn
		fieldImages.put("TDmapway(4)linkskurve.nach.unten", new ImageIcon("src/projektgruppe91/resources/images/TDmapway(4)linkskurve.nach.unten.png"));
		fieldImages.put("TDmapway(4)rechtskurve.nach.unten", new ImageIcon("src/projektgruppe91/resources/images/TDmapway(4)rechtskurve.nach.unten.png"));
		fieldImages.put("TDmapway(4)linkskurve.nach.oben", new ImageIcon("src/projektgruppe91/resources/images/TDmapway(4)linkskurve.nach.oben.png"));
		fieldImages.put("TDmapway(4)rechtskurve.nach.oben", new ImageIcon("src/projektgruppe91/resources/images/TDmapway(4)rechtskurve.nach.oben.png"));
		// Map Sterne Kurven im Uhrzeigersinn
		fieldImages.put("TDmapway(4)linkskurve.nach.unten(Uhrzeigersinn)", new ImageIcon("src/projektgruppe91/resources/images/TDmapway(4)linkskurve.nach.unten(Uhrzeigersinn).png"));
		fieldImages.put("TDmapway(4)rechtskurve.nach.unten(Uhrzeigersinn)", new ImageIcon("src/projektgruppe91/resources/images/TDmapway(4)rechtskurve.nach.unten(Uhrzeigersinn).png"));
		fieldImages.put("TDmapway(4)linkskurve.nach.oben(Uhrzeigersinn)", new ImageIcon("src/projektgruppe91/resources/images/TDmapway(4)linkskurve.nach.oben(Uhrzeigersinn).png"));
		fieldImages.put("TDmapway(4)rechtskurve.nach.oben(Uhrzeigersinn)", new ImageIcon("src/projektgruppe91/resources/images/TDmapway(4)rechtskurve.nach.oben(Uhrzeigersinn).png"));
		// Tower Image Parts
		fieldImagesParts.put(dataTower.getTower("tower1").getTowerID(), "1(1)");
		fieldImagesParts.put(dataTower.getTower("tower2").getTowerID(), "2(1)");
		fieldImagesParts.put(dataTower.getTower("tower3").getTowerID(), "3(1)");
		fieldImagesParts.put(dataTower.getTower("tower4").getTowerID(), "4(1)");
		fieldImagesParts.put(dataTower.getTower("tower5").getTowerID(), "5(1)");
		fieldImagesParts.put(dataTower.getTower("tower6").getTowerID(), "6(1)");
		fieldImagesParts.put(dataTower.getTower("tower1upgrade").getTowerID(), "1(2)");
		fieldImagesParts.put(dataTower.getTower("tower2upgrade").getTowerID(), "2(2)");
		fieldImagesParts.put(dataTower.getTower("tower3upgrade").getTowerID(), "3(2)");
		fieldImagesParts.put(dataTower.getTower("tower4upgrade").getTowerID(), "4(2)");
		fieldImagesParts.put(dataTower.getTower("tower5upgrade").getTowerID(), "5(2)");
		fieldImagesParts.put(dataTower.getTower("tower6upgrade").getTowerID(), "6(2)");
		
		fieldImages.put("enemiesBS (1)",new ImageIcon("src/projektgruppe91/resources/images/enemiesBS (1).png"));

	}
	
	// GETTER
	// ---------------------------------------------------------------------------------------------------------------------------
	
	/**
	 *@param String key
	 *@return ImageIcon
	 */
	public ImageIcon getFieldImage(String key) {
		
		return fieldImages.get(key);
	}
	
	/**
	 *@param String key
	 *@return String
	 */
	public String getFieldImagePart(String key) {
		
		return fieldImagesParts.get(key);
	}
}
