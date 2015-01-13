package projektgruppe91.model;

/**
* @author: Heiko Reinemuth, Christoph Weber, Christoph Döringer, Tobias Storck
* @version "Episode I"
**/

import java.util.HashMap;

/**
* DataLanguage
*/
public class DataLanguage {
	
	// HASHMAP
	private HashMap<String, String> strings = new HashMap<String, String>();
    	
	/**
	 * Konstruktor
	 * Sprachelemente werden in die HashMap gespeichert
	 */
	public DataLanguage() {
		
		strings.put("DElanguageText", "Sprache");
		strings.put("ENlanguageText", "Language");
		strings.put("DEskinText", "Aussehen");
		strings.put("ENskinText", "Skin");
		strings.put("DElevelText", "Karte");
		strings.put("ENlevelText", "Map");
		strings.put("DElevelGeneratorText", "Karte erstellen");
		strings.put("ENlevelGeneratorText", "Create Map");
		strings.put("DEbuttonLevelGenerator", "Generator");
		strings.put("ENbuttonLevelGenerator", "Generator");
		strings.put("DEbuttonMenu", "Menue");
		strings.put("ENbuttonMenu", "Menu");
		strings.put("DEbuttonStart", "Welle Starten");
		strings.put("ENbuttonStart", "Start Wave");
		strings.put("DEbuttonExit", "Beenden");
		strings.put("ENbuttonExit", "Exit");
		strings.put("DEmoneyText", "    " + "Galactic Credits:" + "    ");
		strings.put("ENmoneyText", "    " + "Galactic Credits:" + "    ");
		strings.put("DEwaveText", "    " + "Wellenanzahl:" + "    ");
		strings.put("ENwaveText", "    " + "Wavenumber:" + "    ");
		strings.put("DEtimeText", "    " + "Naechste Welle:" + "    ");
		strings.put("ENtimeText", "    " + "Next Wave in:" + "    ");
		strings.put("DEelectedTowerText", "    " + "Aktueller Turm:" + "    ");
		strings.put("ENelectedTowerText", "    " + "Current Tower:" + "    ");
		strings.put("DElifeText", "Lebensenergie:");
		strings.put("ENlifeText", "Life");
		strings.put("DEtowerPriceText", "   " + "Kosten:");
		strings.put("ENtowerPriceText", "   " + "Price:");
		strings.put("DEtowerDamageText", "   " + "Schaden:");
		strings.put("ENtowerDamageText", "   " + "Damage:");
		strings.put("DEtowerRangeText", "   " + "Reichweite:");
		strings.put("ENtowerRangeText", "   " + "Range:");
		strings.put("DEtowerRateText", "   " + "Feuerrate:");
		strings.put("ENtowerRateText", "   " + "Firerate:");
		strings.put("DEbuttonUpgrade", "Turm aufruesten");
		strings.put("ENbuttonUpgrade", "Upgrade Tower");
		strings.put("DEbuttonSell", "Turm verkaufen");
		strings.put("ENbuttonSell", "Sell Tower");
		strings.put("DEtowerDescriptionText", "Turmbeschreibung:");
		strings.put("ENtowerDescriptionText", "Tower Description");
		strings.put("DEtower0Description", "<html>&nbsp  <br>&nbsp  </html>");
		strings.put("ENtower0Description", "<html>&nbsp  <br>&nbsp  </html>");
		strings.put("DEtower1Description", "<html>&nbsp zerstoert Gegner <br>&nbsp &nbsp &nbsp &nbsp im Umfeld </html>");
		strings.put("ENtower1Description", "<html>&nbsp destroys near <br>&nbsp &nbsp &nbsp &nbsp Enemies </html>");
		strings.put("DEtower2Description", "<html>&nbsp zerstoert Gegner <br>&nbsp &nbsp  &nbsp &nbsp im Umfeld  </html>");
		strings.put("ENtower2Description", "<html>&nbsp destroys near <br>&nbsp &nbsp &nbsp &nbsp Enemies </html>");
		strings.put("DEtower3Description", "<html>&nbsp zerstoert Gegner <br>&nbsp &nbsp  &nbsp &nbsp im Umfeld  </html>");
		strings.put("ENtower3Description", "<html>&nbsp destroys near <br>&nbsp &nbsp &nbsp &nbsp Enemies </html>");
		strings.put("DEtower4Description", "<html>&nbsp zerstoert Gegner <br>&nbsp &nbsp  &nbsp &nbsp im Umfeld  </html>");
		strings.put("ENtower4Description", "<html>&nbsp destroys near <br>&nbsp &nbsp &nbsp &nbsp Enemies </html>");
		strings.put("DEtower5Description", "<html>&nbsp zerstoert Gegner <br>&nbsp &nbsp  &nbsp &nbsp im Umfeld  </html>");
		strings.put("ENtower5Description", "<html>&nbsp destroys near <br>&nbsp &nbsp &nbsp &nbsp Enemies </html>");
		strings.put("DEtower6Description", "<html>&nbsp zerstoert Gegner <br>&nbsp &nbsp  &nbsp &nbsp im Umfeld  </html>");
		strings.put("ENtower6Description", "<html>&nbsp destroys near <br>&nbsp &nbsp &nbsp &nbsp Enemies </html>");
	}
		
	// GETTER
	// ---------------------------------------------------------------------------------------------------------------------------
	
	/**
	 * @param String
	 * @return String
	 */
	public String getText(String text) {return strings.get(text);}
}
