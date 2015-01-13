package projektgruppe91.controller;

/**
* @author: Heiko Reinemuth, Christoph Weber, Christoph Döringer, Tobias Storck
* @version "Episode I"
**/

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import projektgruppe91.view.ViewWindowGame;
import projektgruppe91.view.ViewWindowMenu;
import projektgruppe91.view.ViewWindowMenuCredits;
import projektgruppe91.view.ViewWindowMenuGenerator;

/**
* ControlWindowMenu
*/
public class ControlWindowMenu implements ActionListener {

	// INSTANZEN VON VIEW
	private ViewWindowGame windowGame = new ViewWindowGame();
	private ViewWindowMenu windowMenu = new ViewWindowMenu();
			
	public static String currentMap;
	public static int currentMapDesign;
	
	/**
	 *
	 */
	public ControlWindowMenu() {
				
		currentMap = "src/projektgruppe91/resources/maps/01_Hoth.txt";
		currentMapDesign = 1;
		
   		windowMenu.initWindowMenu();
		windowMenu.setVisible(true);
		windowMenu.setActionListener(this);
	}

	@Override
	/**
	 *
	 */
	public void actionPerformed(ActionEvent e) {

		// PLAY BUTTON
		// <<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<
		// <<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<
		if (e.getSource() == windowMenu.getPlayButton()) {

			windowMenu.dispose();
			new ControlWindowGame();
		}
		
		// CREDITS BUTTON
		// <<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<
		// <<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<
		if (e.getSource() == windowMenu.getCreditsButton()) {

			new ViewWindowMenuCredits();
		}
		
		// GENERATOR BUTTON
		// <<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<
		// <<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<
		if (e.getSource() == windowMenu.getGeneratorButton()) {
			
			new ViewWindowMenuGenerator();
		}
		
		// LEVEL BOX
		// <<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<
		// <<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<
				
		if (e.getSource() == windowMenu.getBoxLevel()
				&& windowMenu.getBoxLevel().getSelectedItem() == windowMenu.getBoxLevel()
						.getItemAt(0)) {
			
			currentMap = "src/projektgruppe91/resources/maps/01_Hoth.txt";
			currentMapDesign = 1;
			windowMenu.setmapImage("src/projektgruppe91/resources/images/TDmapEmpty(1)BoxChoice.png");
			windowGame.resetMapSytax();
			windowMenu.setmapTextArea(windowGame.getMapString(currentMap));
		}
		
		if (e.getSource() == windowMenu.getBoxLevel()
				&& windowMenu.getBoxLevel().getSelectedItem() == windowMenu.getBoxLevel()
						.getItemAt(1)) {
			
			currentMap = "src/projektgruppe91/resources/maps/02_Mustafar.txt";
			currentMapDesign = 2;
			windowMenu.setmapImage("src/projektgruppe91/resources/images/TDmapEmpty(2)BoxChoice.png");
			windowGame.resetMapSytax();
			windowMenu.setmapTextArea(windowGame.getMapString(currentMap));
		}
		
		if (e.getSource() == windowMenu.getBoxLevel()
				&& windowMenu.getBoxLevel().getSelectedItem() == windowMenu.getBoxLevel()
						.getItemAt(2)) {
			
			currentMap = "src/projektgruppe91/resources/maps/03_Tatooine.txt";
			currentMapDesign = 3;
			windowMenu.setmapImage("src/projektgruppe91/resources/images/TDmapEmpty(3)BoxChoice.png");
			windowGame.resetMapSytax();
			windowMenu.setmapTextArea(windowGame.getMapString(currentMap));
		}
		
		if (e.getSource() == windowMenu.getBoxLevel()
				&& windowMenu.getBoxLevel().getSelectedItem() == windowMenu.getBoxLevel()
						.getItemAt(3)) {
			
			currentMap = "src/projektgruppe91/resources/maps/04_Asteroids.txt";
			currentMapDesign = 4;
			windowMenu.setmapImage("src/projektgruppe91/resources/images/TDmapEmpty(4)BoxChoice.png");
			windowGame.resetMapSytax();
			windowMenu.setmapTextArea(windowGame.getMapString(currentMap));
		}
		
		if (e.getSource() == windowMenu.getBoxLevel()
				&& windowMenu.getBoxLevel().getSelectedItem() == windowMenu.getBoxLevel()
						.getItemAt(4)) {
			
			currentMap = "src/projektgruppe91/resources/maps/05_Asteroids_Errors.txt";
			currentMapDesign = 4;
			windowMenu.setmapImage("src/projektgruppe91/resources/images/TDmapEmpty(5)BoxChoice.png");
			windowGame.resetMapSytax();
			windowMenu.setmapTextArea(windowGame.getMapString(currentMap));
		}
		
		if (e.getSource() == windowMenu.getBoxLevel()
				&& windowMenu.getBoxLevel().getSelectedItem() == windowMenu.getBoxLevel()
						.getItemAt(5)) {
			
			currentMap = "src/projektgruppe91/resources/maps/06_Asteroids_Big.txt";
			currentMapDesign = 4;
			windowMenu.setmapImage("src/projektgruppe91/resources/images/TDmapEmpty(6)BoxChoice.png");
			windowGame.resetMapSytax();
			windowMenu.setmapTextArea(windowGame.getMapString(currentMap));
		}
	}
}
