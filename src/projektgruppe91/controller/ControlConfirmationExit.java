package projektgruppe91.controller;

/**
* @author: Heiko Reinemuth, Christoph Weber, Christoph Döringer, Tobias Storck
* @version "Episode I"
**/

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import projektgruppe91.view.ViewConfirmationExit;
import projektgruppe91.view.ViewSoundPlayer;
import projektgruppe91.view.ViewWindowGame;

/**
* ControlConfirmationExit
*/
public class ControlConfirmationExit implements ActionListener {

	// INSTANZEN VON VIEW
	private ViewWindowGame windowGame;
	private ViewConfirmationExit windowConfirmationExit = new ViewConfirmationExit();
	private ViewSoundPlayer soundPlayer = new ViewSoundPlayer();
			
	/**
	 * Konstruktor
	 * @param ViewWindowGame
	 */
	public ControlConfirmationExit(ViewWindowGame viewWindowGame) {
		this.windowGame = viewWindowGame;
		windowConfirmationExit.initConfirmationExit();
		windowConfirmationExit.setVisible(true);
		windowConfirmationExit.setActionListener(this);
	}
	
	@Override
	/**
	 * ActionPerformer 
	 */
	public void actionPerformed(ActionEvent e) {
		
		if (e.getSource() == windowConfirmationExit.getYesExitButton()) {
			
			soundPlayer.playGameExitYes();
			System.exit(0);
		}
		
		if (e.getSource() == windowConfirmationExit.getNoExitButton()) {
			
			windowConfirmationExit.dispose();
			windowGame.getExitButton().setEnabled(true);
			windowGame.setGameStopped(false);
		}
	}
}
