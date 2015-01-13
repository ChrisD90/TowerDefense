package projektgruppe91.controller;

/**
* @author: Heiko Reinemuth, Christoph Weber, Christoph Döringer, Tobias Storck
* @version "Episode I"
**/

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import projektgruppe91.view.ViewConfirmationMenu;
import projektgruppe91.view.ViewSoundPlayer;
import projektgruppe91.view.ViewWindowGame;

/**
* ControlConfirmationMenu
*/
public class ControlConfirmationMenu implements ActionListener {

	private ViewWindowGame windowGame;
	private ViewConfirmationMenu windowConfirmationMenu = new ViewConfirmationMenu();
	private ViewSoundPlayer soundPlayer = new ViewSoundPlayer();
		
	/**
	 * Konstruktor
	 * @param ViewWindowGame
	 */
	public ControlConfirmationMenu(ViewWindowGame viewWindowGame) {
		this.windowGame = viewWindowGame;
		windowConfirmationMenu.initWindowMenu();
		windowConfirmationMenu.setVisible(true);
		windowConfirmationMenu.setActionListener(this);
	}
	
	@Override
	/**
	 * ActionPerformer 
	 */
	public void actionPerformed(ActionEvent e) {
		
		if (e.getSource() == windowConfirmationMenu.getYesMenuButton()) {
			
			soundPlayer.playGameMenuYes();
			windowConfirmationMenu.dispose();
			windowGame.dispose();
			new ControlWindowMenu();
		}
		
		if (e.getSource() == windowConfirmationMenu.getNoMenuButton()) {
			
			windowConfirmationMenu.dispose();
			windowGame.getMenuButton().setEnabled(true);
			windowGame.setGameStopped(false);
		}
	}
}
