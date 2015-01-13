package projektgruppe91.controller;

/**
* @author: Heiko Reinemuth, Christoph Weber, Christoph Döringer, Tobias Storck
* @version "Episode I"
**/

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import projektgruppe91.view.ViewConfirmationStart;
import projektgruppe91.view.ViewSoundPlayer;
import projektgruppe91.view.ViewWindowGame;

/**
* ControlConfirmationStart
*/
public class ControlConfirmationStart implements ActionListener {

	private ViewWindowGame windowGame;
	private ViewConfirmationStart windowConfirmationStart = new ViewConfirmationStart();
	private ViewSoundPlayer soundPlayer = new ViewSoundPlayer();

	/**
	 * Konstruktor
	 * @param ViewWindowGame
	 */
	public ControlConfirmationStart(ViewWindowGame viewWindowGame) {
		this.windowGame = viewWindowGame;
		windowConfirmationStart.initConfirmationStart();
		windowConfirmationStart.setVisible(true);
		windowConfirmationStart.setActionListener(this);
	}

	@Override
	/**
	 * ActionPerformer 
	 */
	public void actionPerformed(ActionEvent e) {

		if (e.getSource() == windowConfirmationStart.getYesStartButton()) {

			soundPlayer.playGameStartYes();
			windowConfirmationStart.dispose();
			windowConfirmationStart.dispose();
			windowGame.startEnemyWave();
		}

		if (e.getSource() == windowConfirmationStart.getNoStartButton()) {

			windowConfirmationStart.dispose();
			windowGame.setGameStopped(false);
		}
	}
}
