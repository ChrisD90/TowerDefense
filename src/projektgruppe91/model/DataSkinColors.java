package projektgruppe91.model;

/**
* @author: Heiko Reinemuth, Christoph Weber, Christoph Döringer, Tobias Storck
* @version "Episode I"
**/

import java.awt.Color;

/**
* DataSkinColors
*/
public class DataSkinColors {
		
	// COLOR VARIABLEN
	private Color brightSideColor = new Color(50, 208, 24);
	private Color darkSideColor = new Color(227, 45, 45);
	private Color starWarsColor = new Color(255, 247, 37);
	
	// GETTER
	// ---------------------------------------------------------------------------------------------------------------------------
	
	/**
	 * @param String
	 * @return Color
	 */
	public Color getColor(String skin) {

		Color output = brightSideColor;
		if (skin.equals("BS")) {output = brightSideColor;}
		if (skin.equals("DS")) {output = darkSideColor;}
		if (skin.equals("SW")) {output = starWarsColor;}
		
		return output;
	}
}
