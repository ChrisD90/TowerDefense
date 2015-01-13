package projektgruppe91.model.tower;

/**
* @author: Heiko Reinemuth, Christoph Weber, Christoph Döringer, Tobias Storck
* @version "Episode I"
**/

import java.util.HashMap;

/**
* DataTower
*/
public class DataTower {
		
	// HASHMAP
	private HashMap<String, Tower> allTowers = new HashMap<String, Tower>();
		
	/**
	 * Konstruktor
	 */
	public DataTower() {
		
		allTowers.put("0", new Tower("0", "_", 0, 0, 0, 0, 0));
		allTowers.put("tower1", new Tower("tower1", "s", 1, 30, 1, 1, 1));
		allTowers.put("tower2", new Tower("tower2", "s", 2, 30, 1, 1, 1));
		allTowers.put("tower3", new Tower("tower3", "s", 3, 30, 1, 1, 1));
		allTowers.put("tower4", new Tower("tower4", "s", 4, 200, 2, 1, 1));
		allTowers.put("tower5", new Tower("tower5", "s", 5, 270, 3, 1, 1));		
		allTowers.put("tower6", new Tower("tower6", "s", 6, 300, 4, 1, 1));
		allTowers.put("tower1upgrade", new Tower("tower1upgrade", "u", 1, 60, 2, 1, 1));
		allTowers.put("tower2upgrade", new Tower("tower2upgrade", "u", 2, 60, 2, 1, 1));
		allTowers.put("tower3upgrade", new Tower("tower3upgrade", "u", 3, 60, 2, 1, 1));
		allTowers.put("tower4upgrade", new Tower("tower4upgrade", "u", 4, 230, 3, 1, 1));
		allTowers.put("tower5upgrade", new Tower("tower5upgrade", "u", 5, 300, 4, 1, 1));
		allTowers.put("tower6upgrade", new Tower("tower6upgrade", "u", 6, 330, 5, 1, 1));
	}
		
	// GETTER
	// ---------------------------------------------------------------------------------------------------------------------------
			
	/**
	 * @param String
	 * @return Tower
	 */
	public Tower getTower(String towerID) {return allTowers.get(towerID);}
}



