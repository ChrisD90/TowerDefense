package projektgruppe91.view.enemy;

/**
* @author: Heiko Reinemuth, Christoph Weber, Christoph Döringer, Tobias Storck
* @version "Episode I"
**/

import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.Timer;

import projektgruppe91.controller.ControlWindowMenu;
import projektgruppe91.view.ViewSoundPlayer;
import projektgruppe91.view.ViewWindowGame;

@SuppressWarnings("serial")
/**
* ViewEnemyMovement
*/
public class ViewEnemyMovement extends JLabel implements ActionListener {
	
	// INSTANZEN VON VIEW
	private ViewWindowGame windowGame;
	private ViewSoundPlayer soundPlayer = new ViewSoundPlayer();
	// TIMER
	private Timer timer = new Timer(5, this);
	private int xStart;
	private int yStart;
	// CHARS
	private Character wayDown = new Character('v');
	private Character wayUp = new Character('^');
	private Character wayLeft = new Character('<');
	private Character wayRight = new Character('>');
	private Character spawn = new Character('S');
	private Character finish = new Character('X');
	// ENEMY VARIBALEN
	private Image enemy;
	private int enemyLife;
	int enemyDamage; 
	int enemySpeed;
	int enemyReward;
		
	/**
	 * @param:
	 * 		ViewWindowGame windowGame: Instant von ViewWindowGame
	 *		ImageIcon image: Gegnerbild
	 * 		int life: Energie des Gegners
	 * 		int damage: Schaden, den der Gegner abzieht, wenn er ins Ziel kommt
	 * 		int speed: Fortbewegungsgeschwindigkeit; wird mit Timer verrechnet
	 * 		int reward: Belohnung für Zerstörung (= +Geld) 
	 * 		int xStart: Startpunkt X
	 * 		int yStart: Startpunkt Y
	 */	
	public ViewEnemyMovement(ViewWindowGame windowGame, ImageIcon enemy, int life, int damage, int speed, int reward, int xStart, int yStart) {
			
		this.windowGame = windowGame;
		this.enemy = enemy.getImage(); 
		this.enemyLife = life; 
		this.enemyDamage = damage; 
		this.enemySpeed = (int)(speed*0.1); 
		this.enemyReward = reward; 
		this.yStart = yStart;
		this.xStart = xStart;
		timer = new Timer(speed, this);
		timer.start();
	}

	/**
	 * zeichnet den Gegner an der jeweiligen Position
	 */
	public void paintComponent(Graphics g) {
		super.paintComponents(g);
		g.drawImage(enemy, xStart - 25, yStart - 25, null);
	}

	@Override
	/**
	 * Action Performer
	 */
	public void actionPerformed(ActionEvent arg0) {
		
		if (!windowGame.getGameStopped()) {
		
		int xArray = (xStart - 37) / 74 + 1;
		int yArray = (yStart - 37) / 74 + 1;
						
		int towerArea = windowGame.getTowerArea()[yArray][xArray];
		char eCenter = windowGame.getMapArray()[yArray][xArray];
		char eRight =  windowGame.getMapArray()[yArray][xArray + 1];
		char eLeft =   windowGame.getMapArray()[yArray][xArray - 1];
		char eUp = windowGame.getMapArray()[yArray - 1][xArray];
		char eDown = windowGame.getMapArray()[yArray + 1][xArray];
			
		// BEDINGUNGEN FUER RICHTIGE LAUFRICHTUNG
		if (eCenter == wayUp) {moveUp();}
		if (eCenter == wayLeft) {moveLeft();}
		if (eCenter == wayDown) {moveDown();}
		if (eCenter == wayRight) {moveRight();}
		if (eCenter == spawn && eUp == wayUp) {moveUp();}
		if (eCenter == finish && eDown == wayUp) {moveUp();}
		if (eCenter == spawn && eLeft == wayLeft) {moveLeft();}
		if (eCenter == spawn && eDown == wayDown) {moveDown();}
		if (eCenter == finish && eRight == wayLeft) {moveLeft();}
		if (eCenter == spawn && eRight == wayRight) {moveRight();}
				
		// wenn der Gegner im Wirkungsberreich eines Towers ist... 
		if (towerArea > 0) 
		// ...verliert er je nach Schaden im aktuellen Feld Energie
		{ enemyLife -= towerArea; }
		
		// wenn der Gegner keine Energie mehr hat...
		if (enemyLife < 0) {
			// ...verschwindet er vom Feld
			xStart = -60;
			yStart = -60;
			timer.stop();
			// ... und man erhält je nach getoetetem Gegner Geld...
			windowGame.setMoneyPlus(enemyReward);
			windowGame.setMoneyValue(windowGame.getMoney()); 
			// ...und die Vernichtung wird in der Konsole angezeigt
			System.out.println("ENEMY DOWN! YOU WON " + enemyReward + " GALACTIC CREDITS");
		}
				
		// wenn der Gegner ins Ziel kommt...
		if (eCenter == finish && eDown != wayUp && eRight != wayLeft || eDown == finish || eRight == finish) { 
			// ...verschwindet er vom Feld
			xStart = -60;
			yStart = -60; 
			timer.stop(); 
			// ...und Leben wird abgezogen
			windowGame.setLifeMinus(enemyDamage);
			windowGame.setLifeValue(windowGame.getLife()); 
			// ...Konsolenausgabe:
			System.out.println("YOU LOST " + enemyDamage + "% LIFE ENERGY");
		}
			
		// wenn der Spieler kein Leben mehr hat, ist das Spiel verloren...
		if (windowGame.getLife() <= 0) {
			soundPlayer.playGameLost();
			// ...Konsolenausgabe:
			System.out.println("GAME IS LOST!!");
			// ...Hauptfenster schließt sich
			windowGame.dispose();
			// ...Menue Fenster öffnet sich
			new ControlWindowMenu();
			windowGame.setGameStopped(true);
		}
		
		// wenn der Spieler 2000 Credits hat, ist das Spiel gewonnen (vorlaeufig)...
		if (windowGame.getMoney() > 2000) {
			soundPlayer.playGameIsWon();
			// ...Konsolenausgabe:
			System.out.println("GAME IS WON!!");
			// ...Hauptfenster schließt sich
			windowGame.dispose();
			// ...Menue Fenster öffnet sich
			new ControlWindowMenu();
			windowGame.setGameStopped(true);
		}
				
		repaint();
		
		}
	}

	/**
	 * move Right
	 */
	public void moveRight() {xStart += 1;}

	/**
	 * move Down
	 */
	public void moveDown() {yStart += 1;}

	/**
	 * move Left
	 */
	public void moveLeft() {xStart -= 1;}

	/**
	 * move Up
	 */
	public void moveUp() {yStart -= 1;}

}
