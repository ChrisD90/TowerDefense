package projektgruppe91.controller;

/**
* @author: Heiko Reinemuth, Christoph Weber, Christoph Döringer, Tobias Storck
* @version "Episode I"
**/

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import projektgruppe91.model.DataLanguage;
import projektgruppe91.model.DataSkinColors;
import projektgruppe91.model.DataSkinImages;
import projektgruppe91.model.tower.DataTower;
import projektgruppe91.model.tower.Tower;
import projektgruppe91.view.ViewSoundPlayer;
import projektgruppe91.view.ViewWindowGame;

/**
* ControlWindowGame
*/
public class ControlWindowGame implements ActionListener, MouseListener{

	// INSTANZEN VON MODEL
	private DataTower dataTower = new DataTower();
	private DataLanguage dataLanguage = new DataLanguage();
	private DataSkinColors dataSkinColors = new DataSkinColors();
	private DataSkinImages dataSkinImages = new DataSkinImages();
	// INSTANZEN VON VIEW
	private ViewWindowGame windowGame; 
	private ViewSoundPlayer soundPlayer = new ViewSoundPlayer();
	// AKTUELLER SKIN
	public String currentSkin = "BS";
	// AKTUELLE SPRACHE
	private String currentLanguage = "DE";
	// AKTUELL AUSGEWAEHLTER TURM
	private Tower currentClickedTower = dataTower.getTower("0");
	// AKTUELL BERUEHRTER TURM
	private Tower currentTouchedTower = dataTower.getTower("0");
		
	/**
	 * Konstruktor
	 */
	public ControlWindowGame() {
		windowGame = new ViewWindowGame(); 
		windowGame.init();
		windowGame.initGameField();
		windowGame.setVisible(true);
		windowGame.setResizable(false);
		windowGame.setActionListener(this);
		windowGame.setMouseListener(this);
	}
	
	// ACTION EVENTS VON WINDOW GAME
	// <<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<
	// <<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<
		
	@Override
	/**
	 * ActionPerformer
	 */
	public void actionPerformed(ActionEvent e) {

		// IF START BUTTON IS CLICKED...
		if (e.getSource() == windowGame.getStartButton()) {
			// ...DO THIS:
			new ControlConfirmationStart(windowGame);
		}

		// IF EXIT BUTTON IS CLICKED...
		if (e.getSource() == windowGame.getExitButton()) {
			// ...DO THIS:
			soundPlayer.playGameExit();
			new ControlConfirmationExit(windowGame);
			windowGame.getExitButton().setEnabled(false);
			windowGame.setGameStopped(true);
		}

		// IF MENU BUTTON IS CLICKED...
		if (e.getSource() == windowGame.getMenuButton()) {
			// ...DO THIS:
			new ControlConfirmationMenu(windowGame);
			windowGame.getMenuButton().setEnabled(false);
			windowGame.setGameStopped(true);
		}
		
		// ------------------------------------------------------------------------------------
		
		// IF UPGRADE BUTTON IS CLICKED...
		if (e.getSource() == windowGame.getUpgradeButton()) {
			// ...DO THIS:
			windowGame.upgradeTower();
		}
		
		// IF UPGRADE BUTTON IS CLICKED...
		if (e.getSource() == windowGame.getSellButton()) {
			// ...DO THIS:
			windowGame.sellTower();
		}

		// ------------------------------------------------------------------------------------
		
		// IF TOWER 1 BUTTON IS CLICKED...
		if (e.getSource() == windowGame.getTowerButton(1)) {
			// ...DO THIS:
			towerClicked(dataTower.getTower("tower1").getTowerID());
		}

		// IF TOWER 2 BUTTON IS CLICKED... 
		if (e.getSource() == windowGame.getTowerButton(2)) {
			// ...DO THIS:
			towerClicked(dataTower.getTower("tower2").getTowerID());
		}

		// IF TOWER 3 BUTTON IS CLICKED... 
		if (e.getSource() == windowGame.getTowerButton(3)) {
			// ...DO THIS:
			towerClicked(dataTower.getTower("tower3").getTowerID());
		}

		// IF TOWER 4 BUTTON IS CLICKED... 
		if (e.getSource() == windowGame.getTowerButton(4)) {
			// ...DO THIS:
			towerClicked(dataTower.getTower("tower4").getTowerID());
		}

		// IF TOWER 5 BUTTON IS CLICKED... 
		if (e.getSource() == windowGame.getTowerButton(5)) {
			// ...DO THIS:
			towerClicked(dataTower.getTower("tower5").getTowerID());
		}

		// IF TOWER 6 BUTTON IS CLICKED... 
		if (e.getSource() == windowGame.getTowerButton(6)) {
			// ...DO THIS:
			towerClicked(dataTower.getTower("tower6").getTowerID());
		 }

		// LANGUAGE BOX
		// ------------------------------------------------------------------------------------
		// IF FIRST ITEM IS CLICKED...
		if (e.getSource() == windowGame.getBoxLanguage()
				&& windowGame.getBoxLanguage().getSelectedItem() == windowGame
						.getBoxLanguage().getItemAt(0)) {
			// ...DO THIS:
			changedLanguage("DE");
		}
		// IF SECOND ITEM IS CLICKED...
		if (e.getSource() == windowGame.getBoxLanguage()
				&& windowGame.getBoxLanguage().getSelectedItem() == windowGame
						.getBoxLanguage().getItemAt(1)) {
			// ...DO THIS:
			changedLanguage("EN");
		}

		// SKIN BOX
		// ------------------------------------------------------------------------------------
		// IF FIRST ITEM IS CLICKED...
		if (e.getSource() == windowGame.getBoxSkin()
				&& windowGame.getBoxSkin().getSelectedItem() == windowGame.getBoxSkin()
						.getItemAt(0)) {
			// ...DO THIS:
			changedSkin("BS");
			currentClickedTower = dataTower.getTower("0");
			towerClicked(currentClickedTower.getTowerID());
			towerTouched(currentTouchedTower.getTowerID());
		}
		// IF SECOND ITEM IS CLICKED...
		if (e.getSource() == windowGame.getBoxSkin()
				&& windowGame.getBoxSkin().getSelectedItem() == windowGame.getBoxSkin()
						.getItemAt(1)) {
			// ...DO THIS:
			changedSkin("DS");
			currentClickedTower = dataTower.getTower("0");
			towerClicked(currentClickedTower.getTowerID());
			towerTouched(currentTouchedTower.getTowerID());
		}
		// IF THIRD ITEM IS CLICKED...
		if (e.getSource() == windowGame.getBoxSkin()
				&& windowGame.getBoxSkin().getSelectedItem() == windowGame.getBoxSkin()
						.getItemAt(2)) {
			// ...DO THIS:
			changedSkin("SW");
			currentClickedTower = dataTower.getTower("0");
			towerClicked(currentClickedTower.getTowerID());
			towerTouched(currentTouchedTower.getTowerID());
		}
		
	}

	// MOUSE EVENTS VON WINDOW GAME
	// <<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<
	// <<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<
	
	@Override
	public void mouseClicked(MouseEvent e) {}

	@Override
	public void mouseEntered(MouseEvent m) {

		// IF TOWER 1 IS TOUCHED...
		if (m.getSource() == windowGame.getTowerButton(1)) {
			// ...DO THIS:
			towerTouched("tower1");
			
		}

		// IF TOWER 2 IS TOUCHED...
		if (m.getSource() == windowGame.getTowerButton(2)) {
			// ...DO THIS:
			towerTouched("tower2");
		}

		// IF TOWER 3 IS TOUCHED...
		if (m.getSource() == windowGame.getTowerButton(3)) {
			// ...DO THIS:
			towerTouched("tower3");
		}

		// IF TOWER 4 IS TOUCHED...
		if (m.getSource() == windowGame.getTowerButton(4)) {
			// ...DO THIS:
			towerTouched("tower4");
		}

		// IF TOWER 5 IS TOUCHED...
		if (m.getSource() == windowGame.getTowerButton(5)) {
			// ...DO THIS:
			towerTouched("tower5");
		}

		// IF TOWER 6 IS TOUCHED...
		if (m.getSource() == windowGame.getTowerButton(6)) {
			// ...DO THIS:
			towerTouched("tower6");
		}
	}

	@Override
	public void mouseExited(MouseEvent m) {
		
		// IF TOWER 1 ISN'T TOUCHED ANY MORE...
		if (m.getSource() == windowGame.getTowerButton(1)) {
			towerTouched("0");
		}
		// IF TOWER 2 ISN'T TOUCHED ANY MORE...
		if (m.getSource() == windowGame.getTowerButton(2)) {
			towerTouched("0");
		}
		// IF TOWER 3 ISN'T TOUCHED ANY MORE...
		if (m.getSource() == windowGame.getTowerButton(3)) {
			towerTouched("0");
		}
		// IF TOWER 4 ISN'T TOUCHED ANY MORE...
		if (m.getSource() == windowGame.getTowerButton(4)) {
			towerTouched("0");
		}
		// IF TOWER 5 ISN'T TOUCHED ANY MORE...
		if (m.getSource() == windowGame.getTowerButton(5)) {
			towerTouched("0");
		}
		// IF TOWER 6 ISN'T TOUCHED ANY MORE...
		if (m.getSource() == windowGame.getTowerButton(6)) {
			towerTouched("0");
					
		}
		
	}

	@Override
	public void mousePressed(MouseEvent arg0) {}

	@Override
	public void mouseReleased(MouseEvent arg0) {}
	
	
	// HILFSMETHODEN:
	// <<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<
	// <<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<
		
	/**
	 * Testet, ob genug Geld für einen Turmkauf da ist
	 */
	private boolean enoughMoney(Tower currentTower) {

		boolean bool = false;
		
		if (windowGame.getMoney() < currentTower.getTowerPrice()) {
			windowGame.setMoneyColor(Color.red);
			bool = false;
		}
		if (windowGame.getMoney() >= currentTower.getTowerPrice()) {
			windowGame.setMoneyColor(Color.white);
			bool = true;
		}

		return bool;
	}
		
	
	// BEFEHL METHODEN:
	// <<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<
	// <<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<

	// WENN DIE SPRACHE GEAENDERT WURDE
	/**
	 * @param String language
	 */
	private void changedLanguage(String language) {

		// Die Sprache wird global neu gesetzt
		currentLanguage = language;
        // die enstprechenden Setter in der View werden aufgerufen
		windowGame.setText(currentLanguage);
		windowGame.setCurrentLanguage(currentLanguage);
	}

	// WENN DER SKIN GEAENDERT WURDE
	/**
	 * @param String skin
	 */
	private void changedSkin(String skin) {
		
		// Der Skin wird global neu gesetzt
		currentSkin = skin;
		// die enstprechenden Setter in der View werden aufgerufen
		windowGame.setSkinColor(dataSkinColors.getColor(currentSkin));
		windowGame.setImages(currentSkin, currentTouchedTower.getTowerNumber(), currentTouchedTower.getTowerDamage(), currentTouchedTower.getTowerRange(), currentTouchedTower.getTowerRate());
		windowGame.setCurrentSkin(currentSkin);
		// das Spielfeld wird neu gezeichnet
		windowGame.redrawField();
	}

	// WENN EIN TOWER AUSGEWÄHLT WURDE:
	/**
	 * @param String towerID
	 */
	private void towerClicked(String towerID) {

		// Der aktuell ausgewaehlte Turm wird neu gesetzt
		currentClickedTower = dataTower.getTower(towerID);
		
		// die enstprechenden Setter in der View werden aufgerufen
		windowGame.setCurrentClickedTower(currentClickedTower);
		windowGame.setClickedTowerImage(dataSkinImages.getImage(currentSkin + "tower (" + currentClickedTower.getTowerNumber() + ")"));
			
		// die Geldanzeige wird aktualisert
		enoughMoney(currentClickedTower);
	}

	// WENN EIN TOWER BERUEHRT / VERLASSEN WURDE:
	/**
	 * @param String towerID
	 */
	private void towerTouched(String towerID) {

		// Der aktuell beruehrte Turm wird neu gesetzt
		currentTouchedTower = dataTower.getTower(towerID);
		// die enstprechenden Setter in der View werden aufgerufen
		windowGame.setTowerPriceValue(" " + currentTouchedTower.getTowerPrice() + " ");
		windowGame.setTowerDescriptionValue(dataLanguage.getText(currentLanguage + "tower" + currentTouchedTower.getTowerNumber() + "Description"));
		windowGame.setImages(currentSkin, currentTouchedTower.getTowerNumber(), currentTouchedTower.getTowerDamage(), currentTouchedTower.getTowerRange(), currentTouchedTower.getTowerRate());
	}
}
