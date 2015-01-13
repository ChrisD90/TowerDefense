package projektgruppe91.model.wave;

/**
* @author: Heiko Reinemuth, Christoph Weber, Christoph Döringer, Tobias Storck
* @version "Episode I"
**/

import projektgruppe91.model.DataEnemyImages;

/**
 * DataEnemy
 */
public class DataEnemy {
	
	// INSTANZEN VON MODEL
	DataEnemyImages enemyImages = new DataEnemyImages();
	// ENEMY ARRAY
	private Enemy[] enemy = new Enemy[8];
	
	/**
	 * Konstruktor
	 */
	public DataEnemy() {
		
		Enemy enemy0 = new Enemy(enemyImages.getEnemyImage("enemies (1)"), 550, 1, 10, 5); 
		Enemy enemy4 = new Enemy(enemyImages.getEnemyImage("enemies (2)"), 600, 2, 15, 5); 
		Enemy enemy5 = new Enemy(enemyImages.getEnemyImage("enemies (3)"), 650, 3, 15, 5); 
		Enemy enemy6 = new Enemy(enemyImages.getEnemyImage("enemies (4)"), 750, 4, 20, 10); 
		Enemy enemy7 = new Enemy(enemyImages.getEnemyImage("enemies (5)"), 800, 5, 25, 10); 
		Enemy enemy1 = new Enemy(enemyImages.getEnemyImage("enemies (6)"), 1000, 6, 30, 15); 
		Enemy enemy2 = new Enemy(enemyImages.getEnemyImage("enemies (7)"), 1200, 7, 35, 15); 
		Enemy enemy3 = new Enemy(enemyImages.getEnemyImage("enemies (8)"), 1400, 8, 40, 20); 
		enemy[0] = enemy0;
		enemy[1] = enemy1;
		enemy[2] = enemy2;
		enemy[3] = enemy3;
		enemy[4] = enemy4;
		enemy[5] = enemy5;
		enemy[6] = enemy6;
		enemy[7] = enemy7;
	}
		
	/**
	 * @param int
	 * @return Enemy
	 */
	public Enemy getEnemy(int i) {return enemy[i];}
}
