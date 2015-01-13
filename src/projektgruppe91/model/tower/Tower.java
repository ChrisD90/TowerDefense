package projektgruppe91.model.tower;

/**
* @author: Heiko Reinemuth, Christoph Weber, Christoph Döringer, Tobias Storck
* @version "Episode I"
**/

/**
* Tower
*/
public class Tower {

	// TOWER VARIABLEN
	private String id;
	private String edition;
	private int number;
	private int price;
	private int damage;
	private int range;
	private int rate;
	
	/**
	* @param: 
	* 	String ID des Towers;
	* 	String edition: Standard/Upgrade oder leerer Turm
	* 	int number: Turmnummer
	*  	int price: Kosten für den Turm
	*  	int damage: Leben, die der Turm dem Gegner abzieht
	*  	int range: Reichweite des Turms
	*  	int rate: Schussrate des Turms	
	*/
	public Tower(String id, String edition, int number, int price, int damage, int range, int rate) {
		
		this.id = id;
		this.edition = edition;
		this.number = number;
		this.price = price;
		this.damage = damage;
		this.range = range;
		this.rate = rate;
	}
	
	// GETTER
	// ---------------------------------------------------------------------------------------------------------------------------
	
	/**
	* @return String
	*/
	public String getTowerID() {return id;}
	
	/**
	* @return String
	*/
	public String getTowerEdition() {return edition;}
	
	/**
	* @return int
	*/
	public int getTowerNumber() {return number;}
	
	/**
	* @return int
	*/
	public int getTowerPrice() {return price;}
	
	/**
	* @return int
	*/
	public int getTowerDamage() {return damage;}
	
	/**
	* @return int
	*/
	public int getTowerRange() {return range;}
	
	/**
	* @return int
	*/
	public int getTowerRate() {return rate;}
}
	
