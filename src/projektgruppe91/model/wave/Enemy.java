package projektgruppe91.model.wave;

/**
* @author: Heiko Reinemuth, Christoph Weber, Christoph Döringer, Tobias Storck
* @version "Episode I"
**/

import javax.swing.ImageIcon;

/**
* Enemy
*/
public class Enemy {

	// ENEMY VARIABLEN
	private ImageIcon image;
	private int life; 
	private int damage; 
	private int speed;
	private int reward;
	
	/**
	  * @param:
	 * 		ImageIcon image: Gegnerbild
	 * 		int life: Energie des Gegners
	 * 		int damage: Schaden, den der Gegner abzieht, wenn er ins Ziel kommt
	 * 		int speed: Fortbewegungsgeschwindigkeit; wird mit Timer verrechnet
	 * 		int reward: Belohnung für Zerstörung (= +Geld) 
	 */
	public Enemy(ImageIcon image, int life, int damage, int speed, int reward) {
		
		this.image = image;
		this.life = life;
		this.damage = damage;
		this.speed = speed;
		this.reward = reward;
	}
	
	// GETTER
	// ---------------------------------------------------------------------------------------------------------------------------
	
	/**
	* @return ImageIcon
	*/
	public ImageIcon getImageIcon() {return image;}
	
	/**
	* @return int
	*/
	public int getLife() {return life;}
	
	/**
	* @return int
	*/
	public int getDamage() {return damage;}
	
	/**
	* @return int
	*/
	public int getSpeed() {return speed;}
	
	/**
	* @return int
	*/
	public int getReward() {return reward;}
}
