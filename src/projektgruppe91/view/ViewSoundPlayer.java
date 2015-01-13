package projektgruppe91.view;

/**
* @author: Heiko Reinemuth, Christoph Weber, Christoph D�ringer, Tobias Storck
* @version "Episode I"
**/

import java.io.FileInputStream;

import javazoom.jl.player.Player;

/**
* ViewSoundPlayer
*/
public class ViewSoundPlayer {
	
	// ---------------------------------------------------------------------------------------------
		// BEIM DR�CKEN DES CREDIT-BUTTONS
		public void playCredits() {
			try {
				FileInputStream file = new FileInputStream("src/projektgruppe91/resources/sounds/Credits.mp3");
				Player playmp3 = new Player(file);
				playmp3.play();
			} catch (Exception e2) {
				System.out.println(e2);
			}
		}
		
		// ---------------------------------------------------------------------------------------------
		// BEIM DR�CKEN DES GENERATOR-BUTTONS
		public void playGenerator() {
			try {
				FileInputStream file = new FileInputStream("src/projektgruppe91/resources/sounds/Fail.mp3");
				Player playmp3 = new Player(file);
				playmp3.play();
			} catch (Exception e2) {
				System.out.println(e2);
			}
		}
				
		// ---------------------------------------------------------------------------------------------
		// BEIM DR�CKEN DES "STARTE WAVE"-BUTTONS
		public void playGameStartYes() {
			try {
				FileInputStream file = new FileInputStream("src/projektgruppe91/resources/sounds/GameStartYes.mp3");
				Player playmp3 = new Player(file);
				playmp3.play();
			} catch (Exception e2) {
				System.out.println(e2);
			}
		}

		// ---------------------------------------------------------------------------------------------
		// BEIM DR�CKEN DES EXIT-BUTTONS
		public void playGameExit() {
			try {
				FileInputStream file = new FileInputStream("src/projektgruppe91/resources/sounds/GameExit.mp3");
				Player playmp3 = new Player(file);
				playmp3.play();
			} catch (Exception e2) {
				System.out.println(e2);
			}
		}
		
		// ---------------------------------------------------------------------------------------------
		// BEIM DR�CKEN DES EXIT-JA-BUTTONS
		public void playGameExitYes() {
			try {
				FileInputStream file = new FileInputStream("src/projektgruppe91/resources/sounds/GameExitYes.mp3");
				Player playmp3 = new Player(file);
				playmp3.play();
			} catch (Exception e2) {
				System.out.println(e2);
			}
		}
		
		// ---------------------------------------------------------------------------------------------
		// BEIM DR�CKEN DES ZUR�CK ZUM MEN�-JA-BUTTONS
		public void playGameMenuYes() {
			try {
				FileInputStream file = new FileInputStream("src/projektgruppe91/resources/sounds/GameMenuYes.mp3");
				Player playmp3 = new Player(file);
				playmp3.play();
			} catch (Exception e2) {
				System.out.println(e2);
			}
		}
		
		// ---------------------------------------------------------------------------------------------
		// WENN DAS SPIEL VERLOREN IST
		public void playGameLost() {
			try {
				FileInputStream file = new FileInputStream("src/projektgruppe91/resources/sounds/GameLost.mp3");
				Player playmp3 = new Player(file);
				playmp3.play();
			} catch (Exception e2) {
				System.out.println(e2);
			}
		}
		
		// ---------------------------------------------------------------------------------------------
		// WENN DAS SPIEL GEWONNEN IST	
		public void playGameIsWon() {
			try {
				FileInputStream file = new FileInputStream("src/projektgruppe91/resources/sounds/GameWon.mp3");
				Player playmp3 = new Player(file);
				playmp3.play();
			} catch (Exception e2) {
				System.out.println(e2);
			}
		}
}