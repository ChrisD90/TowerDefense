package projektgruppe91.view;

/**
* @author: Heiko Reinemuth, Christoph Weber, Christoph Döringer, Tobias Storck
* @version "Episode I"
**/

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.Toolkit;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Vector;

import javax.swing.BorderFactory;
import javax.swing.BoxLayout;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

import projektgruppe91.controller.ControlWindowMenu;
import projektgruppe91.model.DataFieldImages;
import projektgruppe91.model.DataLanguage;
import projektgruppe91.model.DataSkinColors;
import projektgruppe91.model.DataSkinImages;
import projektgruppe91.model.tower.DataTower;
import projektgruppe91.model.tower.Tower;
import projektgruppe91.model.wave.DataEnemy;
import projektgruppe91.model.wave.Enemy;
import projektgruppe91.view.enemy.ViewEnemyMovement;

@SuppressWarnings("serial")
/**
 * ViewWindowGame
 */
public class ViewWindowGame extends JFrame implements MouseListener {

	// INSTANZEN VON MODEL
	private DataTower dataTower = new DataTower();
	private DataLanguage dataLanguage = new DataLanguage();
	private DataSkinColors dataSkinColors = new DataSkinColors();
	private DataSkinImages dataSkinImages = new DataSkinImages();
	private DataFieldImages dataFieldImages = new DataFieldImages();
	// PANEL GAME FIELD EINSTELLUNGEN
	private static int layoutYRows;
	private static int layoutXCols;
	// WINDOW GAME EINSTELLUNGEN
	private Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
	private int windowWidth = 412 + (layoutXCols * 74);
	private int windowHeight = 162 + (layoutYRows * 74);
	private int windowXposition = (screenSize.width / 2) - (windowWidth / 2);
	private int windowYposition = (screenSize.height / 2) - (windowHeight / 2);
	// WINDOW GAME FONTS
	private static final Font Arial20 = new Font("Arial", Font.BOLD, 20);
	private static final Font Arial15 = new Font("Arial", Font.BOLD, 15);
	private static final Font Arial12 = new Font("Arial", Font.BOLD, 12);
	// WINDOW GAME BUTTONS:
	private JButton buttonMenu;
	private JButton buttonExit;
	private JButton buttonStart;
	private JButton buttonUpgrade;
	private JButton buttonSell;
	private JButton buttonTower1;
	private JButton buttonTower2;
	private JButton buttonTower3;
	private JButton buttonTower4;
	private JButton buttonTower5;
	private JButton buttonTower6;
	// WINDOW GAME COMBO BOXES:
	private JComboBox<String> boxLanguage;
	private JComboBox<String> boxSkin;
	private String[] languages = { "German (Standard)", "English" };
	private String[] skins = { "Bright Side (Standard)", "Dark Side",
			"Star Wars" };
	// WINDOW GAME LABELS:
	private JLabel labelGameDesign1Image;
	private JLabel labelSkinText;
	private JLabel labelLanguageText;
	private JLabel labelMoneyText;
	private JLabel labelMoneyValue;
	private JLabel labelGameDesign2Image;
	private JLabel labelWaveText;
	private JLabel labelWaveValue;
	private JLabel labelTimeValue;
	private JLabel labelElectedTowerText;
	private JLabel labelElectedTowerImage;
	private JLabel labelLifeText;
	private JLabel labelLifeValue;
	private JLabel labelElectedTowerNameImage;
	private JLabel labelTowerPriceText;
	private JLabel labelElectedTowerPriceValue;
	private JLabel labelTowerDamageText;
	private JLabel labelElectedTowerDamageImage;
	private JLabel labelTowerRangeText;
	private JLabel labelElectedTowerRangeImage;
	private JLabel labelTowerRateText;
	private JLabel labelElectedTowerRateImage;
	private JLabel labelElectedTowerDescriptionText;
	private JLabel labelElectedTowerDescriptionValue;
	// WINDOW GAME PANELS:
	private JPanel panelGameDesign1;
	private JPanel southPanel;
	private JPanel panelLanguage;
	private JPanel panelSkin;
	private JPanel panelMenu;
	private JPanel panelStart;
	private JPanel panelExit;
	private JPanel westPanel;
	private JPanel panelMoney;
	private JPanel panelGameDesign2;
	private JPanel panelWave;
	private JPanel panelElectedTower;
	private JPanel panelLife;
	private JPanel eastPanel;
	private JPanel panelTowers;
	private JPanel panelTowerInfo;
	private JPanel panelTowerPrice;
	private JPanel panelTowerDamage;
	private JPanel panelTowerRange;
	private JPanel panelTowerRate;
	private JPanel panelShop;
	private JPanel panelTowerDescription;
	// WINDOW GAME VARIABLEN
	private Color currentSkinColor = dataSkinColors.getColor("BS");
	private static int money;
	private static int wave;
	private static int life;

	/**
	 * Konstruktor von ViewWindowGame
	 * setzt Leben, Wellenzaehler und Geldstand zu Beginn des Spiels
	 */
	public ViewWindowGame() {

		money = 70;
		wave = 0;
		life = 100;
	}

	/**
	 * Initialisiert das Spielfeld und laedt Buttons, Panels, Labels...
	 */
	public void init() {

		this.setLayout(new BorderLayout());
		this.setTitle("Star Wars Tower Defense");
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setBounds(windowXposition, windowYposition, windowWidth,
				windowHeight);
		// ------------------------------------------------------------------------------------
		panelGameDesign1 = new JPanel();
		panelGameDesign1.setBackground(Color.black);
		panelGameDesign1.setLayout(new GridLayout(1, 1));
		labelGameDesign1Image = new JLabel();
		labelGameDesign1Image.setHorizontalAlignment(SwingConstants.CENTER);
		panelGameDesign1.add(labelGameDesign1Image);
		// ------------------------------------------------------------------------------------
		this.add(panelGameDesign1, BorderLayout.NORTH);
		// ------------------------------------------------------------------------------------
		southPanel = new JPanel();
		southPanel.setBackground(Color.black);
		southPanel.setLayout(new GridLayout(1, 5));
		// ------------------------------------------------------------------------------------
		panelLanguage = new JPanel();
		panelLanguage.setBackground(Color.black);
		panelLanguage.setLayout(new GridLayout(2, 1));
		labelLanguageText = new JLabel();
		labelLanguageText.setFont(Arial12);
		labelLanguageText.setHorizontalAlignment(SwingConstants.CENTER);
		boxLanguage = new JComboBox<String>();
		boxLanguage.setFont(Arial12);
		boxLanguage.setForeground(Color.black);
		for (int i = 0; i < languages.length; i++) {
			boxLanguage.addItem(languages[i]);
		}
		panelLanguage.add(labelLanguageText);
		panelLanguage.add(boxLanguage);
		// ------------------------------------------------------------------------------------
		panelSkin = new JPanel();
		panelSkin.setBackground(Color.black);
		panelSkin.setLayout(new GridLayout(2, 1));
		labelSkinText = new JLabel();
		labelSkinText.setFont(Arial12);
		labelSkinText.setHorizontalAlignment(SwingConstants.CENTER);
		boxSkin = new JComboBox<String>();
		boxSkin.setFont(Arial12);
		boxSkin.setForeground(Color.black);
		for (int i = 0; i < skins.length; i++) {
			boxSkin.addItem(skins[i]);
		}
		panelSkin.add(labelSkinText);
		panelSkin.add(boxSkin);
		// ------------------------------------------------------------------------------------
		panelMenu = new JPanel();
		panelMenu.setBackground(Color.black);
		panelMenu.setLayout(new GridLayout(1, 1));
		buttonMenu = new JButton();
		buttonMenu.setFont(Arial15);
		buttonMenu.setForeground(Color.black);
		panelMenu.add(buttonMenu);
		// ------------------------------------------------------------------------------------
		panelStart = new JPanel();
		panelStart.setBackground(Color.black);
		panelStart.setLayout(new GridLayout(1, 1));
		buttonStart = new JButton();
		buttonStart.setFont(Arial15);
		buttonStart.setForeground(Color.black);
		panelStart.add(buttonStart);
		// ------------------------------------------------------------------------------------
		panelExit = new JPanel();
		panelExit.setBackground(Color.black);
		panelExit.setLayout(new GridLayout(1, 1));
		buttonExit = new JButton();
		buttonExit.setFont(Arial15);
		buttonExit.setForeground(Color.black);
		panelExit.add(buttonExit);
		// ------------------------------------------------------------------------------------
		southPanel.add(panelLanguage);
		southPanel.add(panelSkin);
		southPanel.add(panelMenu);
		southPanel.add(panelStart);
		southPanel.add(panelExit);
		// ------------------------------------------------------------------------------------
		this.add(southPanel, BorderLayout.SOUTH);
		// ------------------------------------------------------------------------------------
		westPanel = new JPanel();
		westPanel.setBackground(Color.black);
		westPanel.setLayout(new BoxLayout(westPanel, BoxLayout.Y_AXIS));
		// ------------------------------------------------------------------------------------
		panelMoney = new JPanel();
		panelMoney.setBackground(Color.black);
		panelMoney.setLayout(new GridLayout(2, 1));
		labelMoneyText = new JLabel();
		labelMoneyText.setFont(Arial15);
		labelMoneyText.setHorizontalAlignment(SwingConstants.CENTER);
		labelMoneyValue = new JLabel();
		labelMoneyValue.setFont(Arial20);
		labelMoneyValue.setForeground(Color.white);
		labelMoneyValue.setHorizontalAlignment(SwingConstants.CENTER);
		panelMoney.add(labelMoneyText);
		panelMoney.add(labelMoneyValue);
		// ------------------------------------------------------------------------------------
		panelGameDesign2 = new JPanel();
		panelGameDesign2.setBackground(Color.black);
		panelGameDesign2.setLayout(new GridLayout(1, 1));
		labelGameDesign2Image = new JLabel();
		panelGameDesign2.add(labelGameDesign2Image);
		// ------------------------------------------------------------------------------------
		panelWave = new JPanel();
		panelWave.setBackground(Color.black);
		panelWave.setLayout(new GridLayout(2, 1));
		labelWaveText = new JLabel();
		labelWaveText.setFont(Arial15);
		labelWaveText.setHorizontalAlignment(SwingConstants.CENTER);
		labelWaveValue = new JLabel();
		labelWaveValue.setFont(Arial20);
		labelWaveValue.setForeground(Color.white);
		labelWaveValue.setHorizontalAlignment(SwingConstants.CENTER);
		panelWave.add(labelWaveText);
		panelWave.add(labelWaveValue);
		// ------------------------------------------------------------------------------------
		panelElectedTower = new JPanel();
		panelElectedTower.setBackground(Color.black);
		panelElectedTower.setLayout(new GridLayout(2, 1));
		labelElectedTowerText = new JLabel();
		labelElectedTowerText.setFont(Arial15);
		labelElectedTowerText.setHorizontalAlignment(SwingConstants.CENTER);
		labelElectedTowerImage = new JLabel();
		labelElectedTowerImage.setHorizontalAlignment(SwingConstants.CENTER);
		panelElectedTower.add(labelElectedTowerText);
		panelElectedTower.add(labelElectedTowerImage);
		// ------------------------------------------------------------------------------------
		panelLife = new JPanel();
		panelLife.setBackground(Color.black);
		panelLife.setLayout(new GridLayout(3, 1));
		labelLifeText = new JLabel();
		labelLifeText.setFont(Arial15);
		labelLifeText.setHorizontalAlignment(SwingConstants.CENTER);
		labelLifeValue = new JLabel();
		labelLifeValue.setFont(Arial20);
		labelLifeValue.setForeground(Color.white);
		labelLifeValue.setHorizontalAlignment(SwingConstants.CENTER);
		panelLife.add(labelLifeText);
		panelLife.add(labelLifeValue);
		// ------------------------------------------------------------------------------------
		westPanel.add(panelMoney);
		westPanel.add(panelGameDesign2);
		westPanel.add(panelWave);
		westPanel.add(panelElectedTower);
		westPanel.add(panelLife);
		// ------------------------------------------------------------------------------------
		this.add(westPanel, BorderLayout.WEST);
		// ------------------------------------------------------------------------------------
		eastPanel = new JPanel();
		eastPanel.setBackground(Color.black);
		eastPanel.setLayout(new BoxLayout(eastPanel, BoxLayout.Y_AXIS));
		// ------------------------------------------------------------------------------------
		panelTowers = new JPanel();
		panelTowers.setBackground(Color.black);
		panelTowers.setLayout(new GridLayout(3, 2));
		buttonTower1 = new JButton();
		buttonTower2 = new JButton();
		buttonTower3 = new JButton();
		buttonTower4 = new JButton();
		buttonTower5 = new JButton();
		buttonTower6 = new JButton();
		buttonTower1.setOpaque(false);
		buttonTower2.setOpaque(false);
		buttonTower3.setOpaque(false);
		buttonTower4.setOpaque(false);
		buttonTower5.setOpaque(false);
		buttonTower6.setOpaque(false);
		buttonTower1.setBorderPainted(false);
		buttonTower2.setBorderPainted(false);
		buttonTower3.setBorderPainted(false);
		buttonTower4.setBorderPainted(false);
		buttonTower5.setBorderPainted(false);
		buttonTower6.setBorderPainted(false);
		buttonTower1.setBackground(Color.black);
		buttonTower2.setBackground(Color.black);
		buttonTower3.setBackground(Color.black);
		buttonTower4.setBackground(Color.black);
		buttonTower5.setBackground(Color.black);
		buttonTower6.setBackground(Color.black);
		panelTowers.add(buttonTower1);
		panelTowers.add(buttonTower2);
		panelTowers.add(buttonTower3);
		panelTowers.add(buttonTower4);
		panelTowers.add(buttonTower5);
		panelTowers.add(buttonTower6);
		// ------------------------------------------------------------------------------------
		panelTowerInfo = new JPanel();
		panelTowerInfo.setBackground(Color.black);
		panelTowerInfo.setLayout(new GridLayout(5, 1));
		// ------------------------------------------------------------------------------------
		labelElectedTowerNameImage = new JLabel();
		labelElectedTowerNameImage
				.setHorizontalAlignment(SwingConstants.CENTER);
		// ------------------------------------------------------------------------------------
		panelTowerPrice = new JPanel();
		panelTowerPrice.setBackground(Color.black);
		panelTowerPrice.setLayout(new GridLayout(1, 2));
		labelTowerPriceText = new JLabel();
		labelTowerPriceText.setFont(Arial15);
		labelTowerPriceText.setHorizontalAlignment(SwingConstants.LEFT);
		labelElectedTowerPriceValue = new JLabel();
		labelElectedTowerPriceValue.setFont(Arial15);
		labelElectedTowerPriceValue.setHorizontalAlignment(SwingConstants.LEFT);
		panelTowerPrice.add(labelTowerPriceText);
		panelTowerPrice.add(labelElectedTowerPriceValue);
		// ------------------------------------------------------------------------------------
		panelTowerDamage = new JPanel();
		panelTowerDamage.setBackground(Color.black);
		panelTowerDamage.setLayout(new GridLayout(1, 2));
		labelTowerDamageText = new JLabel();
		labelTowerDamageText.setFont(Arial15);
		labelTowerDamageText.setHorizontalAlignment(SwingConstants.LEFT);
		labelElectedTowerDamageImage = new JLabel();
		panelTowerDamage.add(labelTowerDamageText);
		panelTowerDamage.add(labelElectedTowerDamageImage);
		// ------------------------------------------------------------------------------------
		panelTowerRange = new JPanel();
		panelTowerRange.setBackground(Color.black);
		panelTowerRange.setLayout(new GridLayout(1, 2));
		labelTowerRangeText = new JLabel();
		labelTowerRangeText.setFont(Arial15);
		labelTowerRangeText.setHorizontalAlignment(SwingConstants.LEFT);
		labelElectedTowerRangeImage = new JLabel();
		panelTowerRange.add(labelTowerRangeText);
		panelTowerRange.add(labelElectedTowerRangeImage);
		// ------------------------------------------------------------------------------------
		panelTowerRate = new JPanel();
		panelTowerRate.setBackground(Color.black);
		panelTowerRate.setLayout(new GridLayout(1, 2));
		labelTowerRateText = new JLabel();
		labelTowerRateText.setFont(Arial15);
		labelTowerRateText.setHorizontalAlignment(SwingConstants.LEFT);
		labelElectedTowerRateImage = new JLabel();
		panelTowerRate.add(labelTowerRateText);
		panelTowerRate.add(labelElectedTowerRateImage);
		// ------------------------------------------------------------------------------------
		panelTowerInfo.add(labelElectedTowerNameImage);
		panelTowerInfo.add(panelTowerPrice);
		panelTowerInfo.add(panelTowerDamage);
		panelTowerInfo.add(panelTowerRange);
		panelTowerInfo.add(panelTowerRate);
		// ------------------------------------------------------------------------------------
		panelShop = new JPanel();
		panelShop.setBackground(Color.black);
		panelShop.setLayout(new GridLayout(2, 1));
		buttonUpgrade = new JButton();
		buttonUpgrade.setFont(Arial15);
		buttonUpgrade.setForeground(Color.black);
		buttonUpgrade.setEnabled(false);
		buttonSell = new JButton();
		buttonSell.setFont(Arial15);
		buttonSell.setForeground(Color.black);
		buttonSell.setEnabled(false);
		panelShop.add(buttonUpgrade);
		panelShop.add(buttonSell);
		// ------------------------------------------------------------------------------------
		panelTowerDescription = new JPanel();
		panelTowerDescription.setBackground(Color.black);
		panelTowerDescription.setLayout(new GridLayout(2, 1));
		labelElectedTowerDescriptionText = new JLabel();
		labelElectedTowerDescriptionText.setFont(Arial15);
		labelElectedTowerDescriptionText
				.setHorizontalAlignment(SwingConstants.CENTER);
		labelElectedTowerDescriptionValue = new JLabel();
		labelElectedTowerDescriptionValue.setFont(Arial12);
		labelElectedTowerDescriptionValue
				.setHorizontalAlignment(SwingConstants.CENTER);
		panelTowerDescription.add(labelElectedTowerDescriptionText);
		panelTowerDescription.add(labelElectedTowerDescriptionValue);
		// ------------------------------------------------------------------------------------
		eastPanel.add(panelTowers);
		eastPanel.add(panelTowerInfo);
		eastPanel.add(panelShop);
		eastPanel.add(panelTowerDescription);
		// ------------------------------------------------------------------------------------
		this.add(eastPanel, BorderLayout.EAST);

		// STANDARD WERTE: BILDER
		labelGameDesign1Image.setIcon(dataSkinImages.getImage("BSGameDesign1"));
		labelGameDesign2Image.setIcon(dataSkinImages.getImage("BSGameDesign2"));
		buttonTower1.setIcon(dataSkinImages.getImage("BStower (1)"));
		buttonTower2.setIcon(dataSkinImages.getImage("BStower (2)"));
		buttonTower3.setIcon(dataSkinImages.getImage("BStower (3)"));
		buttonTower4.setIcon(dataSkinImages.getImage("BStower (4)"));
		buttonTower5.setIcon(dataSkinImages.getImage("BStower (5)"));
		buttonTower6.setIcon(dataSkinImages.getImage("BStower (6)"));
		labelElectedTowerNameImage.setIcon(dataSkinImages
				.getImage("BSTowerName (0)"));
		labelElectedTowerImage.setIcon(dataSkinImages.getImage("BStower (1)"));
		labelElectedTowerDamageImage.setIcon(dataSkinImages
				.getImage("BSTowerRating (0)"));
		labelElectedTowerRangeImage.setIcon(dataSkinImages
				.getImage("BSTowerRating (0)"));
		labelElectedTowerRateImage.setIcon(dataSkinImages
				.getImage("BSTowerRating (0)"));

		// STANDARD WERTE: FARBEN
		panelGameDesign1.setBorder(BorderFactory
				.createLineBorder(currentSkinColor));
		southPanel.setBorder(BorderFactory.createLineBorder(currentSkinColor));
		labelLanguageText.setForeground(currentSkinColor);
		boxLanguage.setBackground(currentSkinColor);
		labelSkinText.setForeground(currentSkinColor);
		boxSkin.setBackground(currentSkinColor);
		buttonMenu.setBackground(currentSkinColor);
		buttonStart.setBackground(currentSkinColor);
		buttonExit.setBackground(currentSkinColor);
		westPanel.setBorder(BorderFactory.createLineBorder(currentSkinColor));
		labelMoneyText.setForeground(currentSkinColor);
		labelWaveText.setForeground(currentSkinColor);
		labelElectedTowerText.setForeground(currentSkinColor);
		labelLifeText.setForeground(currentSkinColor);
		eastPanel.setBorder(BorderFactory.createLineBorder(currentSkinColor));
		labelTowerPriceText.setForeground(currentSkinColor);
		labelElectedTowerPriceValue.setForeground(currentSkinColor);
		labelTowerDamageText.setForeground(currentSkinColor);
		labelTowerRangeText.setForeground(currentSkinColor);
		labelTowerRateText.setForeground(currentSkinColor);
		buttonUpgrade.setBackground(currentSkinColor);
		buttonSell.setBackground(currentSkinColor);
		labelElectedTowerDescriptionText.setForeground(currentSkinColor);
		labelElectedTowerDescriptionValue.setForeground(currentSkinColor);

		// STANDARD WERTE: TEXTE
		labelLanguageText.setText(dataLanguage.getText("DElanguageText"));
		labelSkinText.setText(dataLanguage.getText("DEskinText"));
		buttonMenu.setText(dataLanguage.getText("DEbuttonMenu"));
		buttonStart.setText(dataLanguage.getText("DEbuttonStart"));
		buttonExit.setText(dataLanguage.getText("DEbuttonExit"));
		labelMoneyText.setText(dataLanguage.getText("DEmoneyText"));
		labelMoneyValue.setText(" " + getMoney() + " ");
		labelWaveText.setText(dataLanguage.getText("DEwaveText"));
		labelWaveValue.setText(" " + getWave() + " ");
		labelElectedTowerText.setText(dataLanguage
				.getText("DEelectedTowerText"));
		labelLifeText.setText(dataLanguage.getText("DElifeText"));
		labelLifeValue.setText(" " + getLife() + " ");
		labelTowerPriceText.setText(dataLanguage.getText("DEtowerPriceText"));
		labelElectedTowerPriceValue.setText(" ");
		labelTowerDamageText.setText(dataLanguage.getText("DEtowerDamageText"));
		labelTowerRangeText.setText(dataLanguage.getText("DEtowerRangeText"));
		labelTowerRateText.setText(dataLanguage.getText("DEtowerRateText"));
		buttonUpgrade.setText(dataLanguage.getText("DEbuttonUpgrade"));
		buttonSell.setText(dataLanguage.getText("DEbuttonSell"));
		labelElectedTowerDescriptionText.setText(dataLanguage
				.getText("DEtowerDescriptionText"));
		labelElectedTowerDescriptionValue.setText(dataLanguage
				.getText("DEtower0Description"));
	}

	/**
	 * setzt die entsprechenden Bilder
	 * @param String skin, int number, int damage, int range, int rate
	 */
	public void setImages(String skin, int number, int damage, int range,
			int rate) {

		labelGameDesign1Image.setIcon(dataSkinImages.getImage(skin
				+ "GameDesign1"));
		labelGameDesign2Image.setIcon(dataSkinImages.getImage(skin
				+ "GameDesign2"));
		buttonTower1.setIcon(dataSkinImages.getImage(skin + "tower (1)"));
		buttonTower2.setIcon(dataSkinImages.getImage(skin + "tower (2)"));
		buttonTower3.setIcon(dataSkinImages.getImage(skin + "tower (3)"));
		buttonTower4.setIcon(dataSkinImages.getImage(skin + "tower (4)"));
		buttonTower5.setIcon(dataSkinImages.getImage(skin + "tower (5)"));
		buttonTower6.setIcon(dataSkinImages.getImage(skin + "tower (6)"));
		labelElectedTowerNameImage.setIcon(dataSkinImages.getImage(skin
				+ "TowerName (" + number + ")"));
		labelElectedTowerDamageImage.setIcon(dataSkinImages.getImage(skin
				+ "TowerRating (" + damage + ")"));
		labelElectedTowerRangeImage.setIcon(dataSkinImages.getImage(skin
				+ "TowerRating (" + range + ")"));
		labelElectedTowerRateImage.setIcon(dataSkinImages.getImage(skin
				+ "TowerRating (" + rate + ")"));
	}

	/**
	 * setzt das Bild für die geklickten Tower auf "nichts"
	 * @param ImageIcon deliveredImage
	 */
	public void setClickedTowerImage(ImageIcon deliveredImage) {
		labelElectedTowerImage.setIcon(deliveredImage);
	}

	/**
	 * setzt die Farbe des Skins
	 * @param Color electedSkinColor
	 */
	public void setSkinColor(Color electedSkinColor) {

		panelGameDesign1.setBorder(BorderFactory
				.createLineBorder(electedSkinColor));
		southPanel.setBorder(BorderFactory.createLineBorder(electedSkinColor));
		labelLanguageText.setForeground(electedSkinColor);
		boxLanguage.setBackground(electedSkinColor);
		labelSkinText.setForeground(electedSkinColor);
		boxSkin.setBackground(electedSkinColor);
		buttonMenu.setBackground(electedSkinColor);
		buttonStart.setBackground(electedSkinColor);
		buttonExit.setBackground(electedSkinColor);
		westPanel.setBorder(BorderFactory.createLineBorder(electedSkinColor));
		labelMoneyText.setForeground(electedSkinColor);
		labelWaveText.setForeground(electedSkinColor);
		labelElectedTowerText.setForeground(electedSkinColor);
		labelLifeText.setForeground(electedSkinColor);
		eastPanel.setBorder(BorderFactory.createLineBorder(electedSkinColor));
		labelTowerPriceText.setForeground(electedSkinColor);
		labelElectedTowerPriceValue.setForeground(electedSkinColor);
		labelTowerDamageText.setForeground(electedSkinColor);
		labelTowerRangeText.setForeground(electedSkinColor);
		labelTowerRateText.setForeground(electedSkinColor);
		buttonUpgrade.setBackground(electedSkinColor);
		buttonSell.setBackground(electedSkinColor);
		labelElectedTowerDescriptionText.setForeground(electedSkinColor);
		labelElectedTowerDescriptionValue.setForeground(electedSkinColor);
	}

	/**
	 * setzt die richtige Sprache
	 * @param String delivered
	 */
	public void setText(String delivered) {

		labelLanguageText.setText(dataLanguage.getText(delivered
				+ "languageText"));
		labelSkinText.setText(dataLanguage.getText(delivered + "skinText"));
		buttonMenu.setText(dataLanguage.getText(delivered + "buttonMenu"));
		buttonStart.setText(dataLanguage.getText(delivered + "buttonStart"));
		buttonExit.setText(dataLanguage.getText(delivered + "buttonExit"));
		labelMoneyText.setText(dataLanguage.getText(delivered + "moneyText"));
		labelWaveText.setText(dataLanguage.getText(delivered + "waveText"));
		labelElectedTowerText.setText(dataLanguage.getText(delivered
				+ "electedTowerText"));
		labelLifeText.setText(dataLanguage.getText(delivered + "lifeText"));
		labelTowerPriceText.setText(dataLanguage.getText(delivered
				+ "towerPriceText"));
		labelTowerDamageText.setText(dataLanguage.getText(delivered
				+ "towerDamageText"));
		labelTowerRangeText.setText(dataLanguage.getText(delivered
				+ "towerRangeText"));
		labelTowerRateText.setText(dataLanguage.getText(delivered
				+ "towerRateText"));
		buttonUpgrade
				.setText(dataLanguage.getText(delivered + "buttonUpgrade"));
		buttonSell.setText(dataLanguage.getText(delivered + "buttonSell"));
		labelElectedTowerDescriptionText.setText(dataLanguage.getText(delivered
				+ "towerDescriptionText"));
	}

	// GAME FIELD
	// <<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<
	// <<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<

	// PANEL
	private JLabel gameField;
	// CHARS
	private Character ln = new Character('\n');
	private Character border = new Character('#');
	private Character empty = new Character('_');
	private Character wayDown = new Character('v');
	private Character wayUp = new Character('^');
	private Character wayLeft = new Character('<');
	private Character wayRight = new Character('>');
	private Character spawn = new Character('S');
	private Character finish = new Character('X');
	private Character tow = new Character('t');
	// GAME FIELD VARIABLEN
	private int countSpawns = 0;
	private int countFinishs = 0;
	public int startYpixel;
	public int startXpixel;
	private int arrayYRows;
	private int arrayXCols;
	private char[][] mapArray;
	private char[][] mapArrayOriginal;
	private int[][] towerArea;
	private String[][] towerArray;
	private int[] currentShoppingField;
	private boolean gameStopped = false;
	private boolean towerSetted = false;
	private String currentSkin = "BS";
	private String currentLanguage = "DE";
	private Tower currentClickedTower = dataTower.getTower("tower1");
	private String currentMap = ControlWindowMenu.currentMap;
	private int currentMapDesign = ControlWindowMenu.currentMapDesign;
	private Vector<ViewGameFieldUnit> fieldUnits = new Vector<ViewGameFieldUnit>();

	/**
	 * Aktionsfeld wird initialisiert
	 */
	public void initGameField() {

		gameField = new JLabel();
		parseMapGetSize(currentMap);
		parseMapToArray(currentMap);
		checkMapSyntax();
		parseMapFromArrayToView();
		getLayeredPane().add(gameField, new Integer(-1));
		this.add(gameField, BorderLayout.CENTER);
		gameField.setLayout(new GridLayout(layoutYRows, layoutXCols));
	}

	/**
	 * eine Welle wird erstellt und losgeschickt
	 */
	public void startEnemyWave() {

		if (checkMapSyntax()) {

			getStart();
			setWavePlus(1);
			setWaveValue(getWave());

			for (int i = 0; i < 10; i++) {
				int randomNumber = (int) (Math.random() * (0 - 8) + 8);
				// Ein zufälliger Gegner kommt aus der Wave
				DataEnemy wave = new DataEnemy();
				Enemy enemy = wave.getEnemy(randomNumber);
				ViewEnemyMovement move = new ViewEnemyMovement(this,
						enemy.getImageIcon(), enemy.getLife(),
						enemy.getDamage(), enemy.getSpeed(), enemy.getReward(),
						startXpixel, startYpixel);
				int height = layoutYRows * 74;
				int width = layoutXCols * 74;
				getLayeredPane().add(move, new Integer(1));
				move.setBounds(180, 80, width, height);
			}
		}
	}

	/**
	 * ermitteln des Startpunktes; also wo der SpawnPoint in der Karte ist
	 */
	private void getStart() {
		for (int y = 0; y < arrayYRows; y++) {
			for (int x = 0; x < arrayXCols; x++) {
				if (mapArray[y][x] == spawn) {
					int leftX = (x - 1) * 74;
					int leftY = (y - 1) * 74;
					int rightX = leftX + 74;
					int rightY = leftY + 74;
					int diffX = (rightX - leftX) / 2;
					int diffY = (rightY - leftY) / 2;
					startXpixel = leftX + diffX;
					startYpixel = leftY + diffY;
				}
			}
		}
	}

	/**
	 * liest die Groeße der Karte in Zeile und Spalte aus
	 * @param String currentMap
	 */
	private void parseMapGetSize(String currentMap) {

		try {
			FileReader levelLoad = new FileReader(currentMap);
			boolean endOfText = false;
			int counterLines = 0;
			int counterBorders = 0;
			while (!endOfText) {
				int currentCharInt = levelLoad.read();
				char currentChar = (char) currentCharInt;
				if (currentChar == ln) {
					counterLines++;
				}
				if (currentChar == border) {
					counterBorders++;
				}
				if (currentChar == spawn) {
					countSpawns++;
				}
				if (currentChar == finish) {
					countFinishs++;
				}
				if (currentCharInt == -1) {
					endOfText = true;
				}
			}
			levelLoad.close();
			layoutYRows = counterLines - 2;
			layoutXCols = ((counterBorders - ((counterLines * 2) - 4)) / 2) - 2;
			arrayYRows = counterLines;
			arrayXCols = layoutXCols + 3;
			mapArray = new char[arrayYRows][arrayXCols];
			towerArray = new String[arrayYRows][arrayXCols];
			towerArea = new int[arrayYRows][arrayXCols];
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	/**
	 * steckt die Textdatei in ein zweidimensionales Array
	 * @param String currentMap
	 */
	private void parseMapToArray(String currentMap) {

		try {
			FileReader levelLoad = new FileReader(currentMap);
			boolean endOfText = false;
			int yRows = 0;
			int xCols = 0;
			while (!endOfText) {
				int currentCharInt = levelLoad.read();
				char currentChar = (char) currentCharInt;
				if (currentChar == empty) {
					mapArray[yRows][xCols] = empty;
					towerArea[yRows][xCols] = 0;
					towerArray[yRows][xCols] = dataTower.getTower("0")
							.getTowerID();
					xCols++;
				}
				if (currentChar == wayDown) {
					mapArray[yRows][xCols] = wayDown;
					towerArea[yRows][xCols] = 0;
					towerArray[yRows][xCols] = dataTower.getTower("0")
							.getTowerID();
					xCols++;
				}
				if (currentChar == wayUp) {
					mapArray[yRows][xCols] = wayUp;
					towerArea[yRows][xCols] = 0;
					towerArray[yRows][xCols] = dataTower.getTower("0")
							.getTowerID();
					xCols++;
				}
				if (currentChar == wayLeft) {
					mapArray[yRows][xCols] = wayLeft;
					towerArea[yRows][xCols] = 0;
					towerArray[yRows][xCols] = dataTower.getTower("0")
							.getTowerID();
					xCols++;
				}
				if (currentChar == wayRight) {
					mapArray[yRows][xCols] = wayRight;
					towerArea[yRows][xCols] = 0;
					towerArray[yRows][xCols] = dataTower.getTower("0")
							.getTowerID();
					xCols++;
				}
				if (currentChar == spawn) {
					mapArray[yRows][xCols] = spawn;
					towerArea[yRows][xCols] = 0;
					towerArray[yRows][xCols] = dataTower.getTower("0")
							.getTowerID();
					xCols++;
				}
				if (currentChar == finish) {
					mapArray[yRows][xCols] = finish;
					towerArea[yRows][xCols] = 0;
					towerArray[yRows][xCols] = dataTower.getTower("0")
							.getTowerID();
					xCols++;
				}
				if (currentChar == border) {
					mapArray[yRows][xCols] = border;
					towerArea[yRows][xCols] = 0;
					towerArray[yRows][xCols] = dataTower.getTower("0")
							.getTowerID();
					xCols++;
				}
				if (currentChar == ln) {
					mapArray[yRows][xCols] = ln;
					towerArea[yRows][xCols] = 0;
					towerArray[yRows][xCols] = dataTower.getTower("0")
							.getTowerID();
					yRows++;
					xCols = 0;
				}
				if (currentCharInt == -1) {
					endOfText = true;
				}
			}
			levelLoad.close();
			mapArrayOriginal = mapArray.clone();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	/**
	 * überprüft, ob die Karte syntaktisch korrekt ist
	 * @return boolean
	 */
	private boolean checkMapSyntax() {

		boolean bool = true;
		if (countFinishs > 1 || countFinishs < 1) {
			return false;
		}
		if (countSpawns > 1 || countSpawns < 1) {
			return false;
		}

		for (int y = 0; y < arrayYRows; y++) {
			for (int x = 0; x < arrayXCols; x++) {
				if (mapArrayOriginal[y][x] == spawn) {

					while (mapArrayOriginal[y][x] != finish) {

						if (mapArrayOriginal[y][x] == spawn
								&& mapArrayOriginal[y][x + 1] == wayRight) {
							x++;
						}
						if (mapArrayOriginal[y][x] == spawn
								&& mapArrayOriginal[y][x - 1] == wayLeft) {
							x--;
						}
						if (mapArrayOriginal[y][x] == spawn
								&& mapArrayOriginal[y + 1][x] == wayDown) {
							y++;
						}
						if (mapArrayOriginal[y][x] == spawn
								&& mapArrayOriginal[y - 1][x] == wayUp) {
							y--;
						}
						if (mapArrayOriginal[y][x] == wayRight) {
							x++;
						}
						if (mapArrayOriginal[y][x] == wayLeft) {
							x--;
						}
						if (mapArrayOriginal[y][x] == wayDown) {
							y++;
						}
						if (mapArrayOriginal[y][x] == wayUp) {
							y--;
						}
						if (mapArrayOriginal[y][x] == empty) {
							bool = false;
							break;
						}
					}
				}
			}
		}

		return bool;
	}

	/**
	 * reset fuer MapSyntax
	 */
	public void resetMapSytax() {
		countFinishs = 0;
		countSpawns = 0;
	}

	/**
	 * setzt der Map entsprechend den Weg
	 * @param int y, int x
	 */
	private String waySetter(int y, int x) {

		String output = "";
		int yDown = y + 1;
		int xRight = x + 1;
		int yUp = y - 1;
		int xLeft = x - 1;
		if (y > 0 && y < arrayYRows && x > 0 && y < arrayXCols) {
			if (mapArray[y][x] == wayLeft && mapArray[y][xLeft] == wayLeft
					&& mapArray[yDown][x] == wayUp) {
				output = "linkskurve.nach.oben";
			}
			if (mapArray[y][x] == wayDown && mapArray[y][xRight] == wayLeft
					&& mapArray[yDown][x] == wayDown) {
				output = "linkskurve.nach.unten";
			}
			if (mapArray[y][x] == wayUp && mapArray[y][xLeft] == wayRight
					&& mapArray[yUp][x] == wayUp) {
				output = "rechtskurve.nach.oben";
			}
			if (mapArray[y][x] == wayRight && mapArray[yUp][x] == wayDown
					&& mapArray[y][xRight] == wayRight) {
				output = "rechtskurve.nach.unten";
			}
			if (mapArray[y][x] == wayUp && mapArray[y][xRight] == wayLeft
					&& mapArray[yUp][x] == wayUp) {
				output = "linkskurve.nach.oben(Uhrzeigersinn)";
			}
			if (mapArray[y][x] == wayLeft && mapArray[yUp][x] == wayDown
					&& mapArray[y][xLeft] == wayLeft) {
				output = "linkskurve.nach.unten(Uhrzeigersinn)";
			}
			if (mapArray[y][x] == wayRight && mapArray[y][xRight] == wayRight
					&& mapArray[yDown][x] == wayUp) {
				output = "rechtskurve.nach.oben(Uhrzeigersinn)";
			}
			if (mapArray[y][x] == wayDown && mapArray[y][xLeft] == wayRight
					&& mapArray[yDown][x] == wayDown) {
				output = "rechtskurve.nach.unten(Uhrzeigersinn)";
			}
			// Zielkurven
			if (mapArray[y][x] == wayRight && mapArray[y][xRight] == finish
					&& mapArray[yDown][x] == wayUp) {
				output = "rechtskurve.nach.oben(Uhrzeigersinn)";
			}
			if (mapArray[y][x] == wayUp && mapArray[y][xRight] == wayLeft
					&& mapArray[yUp][x] == finish) {
				output = "linkskurve.nach.oben(Uhrzeigersinn)";
			}
			if (mapArray[y][x] == wayLeft && mapArray[yUp][x] == wayDown
					&& mapArray[y][xLeft] == finish) {
				output = "linkskurve.nach.unten(Uhrzeigersinn)";
			}
			if (mapArray[y][x] == wayDown && mapArray[y][xLeft] == wayRight
					&& mapArray[yDown][x] == finish) {
				output = "rechtskurve.nach.unten(Uhrzeigersinn)";
			}
			if (mapArray[y][x] == wayLeft && mapArray[y][xLeft] == finish
					&& mapArray[yDown][x] == wayUp) {
				output = "linkskurve.nach.oben";
			}
			if (mapArray[y][x] == wayDown && mapArray[y][xRight] == wayLeft
					&& mapArray[yDown][x] == finish) {
				output = "linkskurve.nach.unten";
			}
			if (mapArray[y][x] == wayUp && mapArray[y][xLeft] == wayRight
					&& mapArray[yUp][x] == finish) {
				output = "rechtskurve.nach.oben";
			}
			if (mapArray[y][x] == wayRight && mapArray[yUp][x] == wayDown
					&& mapArray[y][xRight] == finish) {
				output = "rechtskurve.nach.unten";
			}
			// Startkurven
			if (mapArray[y][x] == wayLeft && mapArray[y][xLeft] == wayLeft
					&& mapArray[yDown][x] == spawn) {
				output = "linkskurve.nach.oben";
			}
			if (mapArray[y][x] == wayDown && mapArray[y][xRight] == spawn
					&& mapArray[yDown][x] == wayDown) {
				output = "linkskurve.nach.unten";
			}
			if (mapArray[y][x] == wayUp && mapArray[y][xLeft] == spawn
					&& mapArray[yUp][x] == wayUp) {
				output = "rechtskurve.nach.oben";
			}
			if (mapArray[y][x] == wayRight && mapArray[yUp][x] == spawn
					&& mapArray[y][xRight] == wayRight) {
				output = "rechtskurve.nach.unten";
			}
			if (mapArray[y][x] == wayUp && mapArray[y][xRight] == spawn
					&& mapArray[yUp][x] == wayUp) {
				output = "linkskurve.nach.oben(Uhrzeigersinn)";
			}
			if (mapArray[y][x] == wayLeft && mapArray[yUp][x] == spawn
					&& mapArray[y][xLeft] == wayLeft) {
				output = "linkskurve.nach.unten(Uhrzeigersinn)";
			}
			if (mapArray[y][x] == wayRight && mapArray[y][xRight] == wayRight
					&& mapArray[yDown][x] == spawn) {
				output = "rechtskurve.nach.oben(Uhrzeigersinn)";
			}
			if (mapArray[y][x] == wayDown && mapArray[y][xLeft] == spawn
					&& mapArray[yDown][x] == wayDown) {
				output = "rechtskurve.nach.unten(Uhrzeigersinn)";
			}
		}
		return output;
	}

	/**
	 * liefert die eigentliche Ansicht
	 */
	public void parseMapFromArrayToView() {

		if (checkMapSyntax()) {
			for (int yRows = 0; yRows < arrayYRows; yRows++) {
				for (int xCols = 0; xCols < arrayXCols; xCols++) {
					if (mapArray[yRows][xCols] == empty) {
						synchronized (fieldUnits) {
							ViewGameFieldUnit unit = new ViewGameFieldUnit(
									dataFieldImages.getFieldImage("TDmapEmpty ("
											+ currentMapDesign + ")"), yRows,
									xCols);
							unit.addMouseListener(this);
							fieldUnits.add(unit);
						}
					}
					if (mapArray[yRows][xCols] == wayLeft
							|| mapArray[yRows][xCols] == wayRight
							|| mapArray[yRows][xCols] == wayUp
							|| mapArray[yRows][xCols] == wayDown) {
						synchronized (fieldUnits) {
							ViewGameFieldUnit unit = new ViewGameFieldUnit(
									dataFieldImages.getFieldImage("TDmapway("
											+ currentMapDesign + ")"
											+ waySetter(yRows, xCols)), yRows,
									xCols);
							unit.addMouseListener(this);
							fieldUnits.add(unit);
						}
					}
					if (mapArray[yRows][xCols] == spawn) {
						synchronized (fieldUnits) {
							ViewGameFieldUnit unit = new ViewGameFieldUnit(
									dataFieldImages.getFieldImage("TDmapEmpty("
											+ currentMapDesign + ")startEnd"),
									yRows, xCols);
							unit.addMouseListener(this);
							fieldUnits.add(unit);
						}
					}
					if (mapArray[yRows][xCols] == finish) {
						synchronized (fieldUnits) {
							ViewGameFieldUnit unit = new ViewGameFieldUnit(
									dataFieldImages.getFieldImage("TDmapEmpty("
											+ currentMapDesign + ")startEnd"),
									yRows, xCols);
							unit.addMouseListener(this);
							fieldUnits.add(unit);
						}
					}
					if (towerArray[yRows][xCols] == dataTower
							.getTower("tower1").getTowerID()) {
						synchronized (fieldUnits) {
							ViewGameFieldUnit unit = new ViewGameFieldUnit(
									dataFieldImages.getFieldImage("TDmapEmpty("
											+ currentMapDesign
											+ ")tower"
											+ currentSkin
											+ dataFieldImages
													.getFieldImagePart(dataTower
															.getTower("tower1")
															.getTowerID())),
									yRows, xCols);
							unit.addMouseListener(this);
							fieldUnits.add(unit);
						}
					}
					if (towerArray[yRows][xCols] == dataTower
							.getTower("tower2").getTowerID()) {
						synchronized (fieldUnits) {
							ViewGameFieldUnit unit = new ViewGameFieldUnit(
									dataFieldImages.getFieldImage("TDmapEmpty("
											+ currentMapDesign
											+ ")tower"
											+ currentSkin
											+ dataFieldImages
													.getFieldImagePart(dataTower
															.getTower("tower2")
															.getTowerID())),
									yRows, xCols);
							unit.addMouseListener(this);
							fieldUnits.add(unit);
						}
					}
					if (towerArray[yRows][xCols] == dataTower
							.getTower("tower3").getTowerID()) {
						synchronized (fieldUnits) {
							ViewGameFieldUnit unit = new ViewGameFieldUnit(
									dataFieldImages.getFieldImage("TDmapEmpty("
											+ currentMapDesign
											+ ")tower"
											+ currentSkin
											+ dataFieldImages
													.getFieldImagePart(dataTower
															.getTower("tower3")
															.getTowerID())),
									yRows, xCols);
							unit.addMouseListener(this);
							fieldUnits.add(unit);
						}
					}
					if (towerArray[yRows][xCols] == dataTower
							.getTower("tower4").getTowerID()) {
						synchronized (fieldUnits) {
							ViewGameFieldUnit unit = new ViewGameFieldUnit(
									dataFieldImages.getFieldImage("TDmapEmpty("
											+ currentMapDesign
											+ ")tower"
											+ currentSkin
											+ dataFieldImages
													.getFieldImagePart(dataTower
															.getTower("tower4")
															.getTowerID())),
									yRows, xCols);
							unit.addMouseListener(this);
							fieldUnits.add(unit);
						}
					}
					if (towerArray[yRows][xCols] == dataTower
							.getTower("tower5").getTowerID()) {
						synchronized (fieldUnits) {
							ViewGameFieldUnit unit = new ViewGameFieldUnit(
									dataFieldImages.getFieldImage("TDmapEmpty("
											+ currentMapDesign
											+ ")tower"
											+ currentSkin
											+ dataFieldImages
													.getFieldImagePart(dataTower
															.getTower("tower5")
															.getTowerID())),
									yRows, xCols);
							unit.addMouseListener(this);
							fieldUnits.add(unit);
						}
					}
					if (towerArray[yRows][xCols] == dataTower
							.getTower("tower6").getTowerID()) {
						synchronized (fieldUnits) {
							ViewGameFieldUnit unit = new ViewGameFieldUnit(
									dataFieldImages.getFieldImage("TDmapEmpty("
											+ currentMapDesign
											+ ")tower"
											+ currentSkin
											+ dataFieldImages
													.getFieldImagePart(dataTower
															.getTower("tower6")
															.getTowerID())),
									yRows, xCols);
							unit.addMouseListener(this);
							fieldUnits.add(unit);
						}
					}
					if (towerArray[yRows][xCols] == dataTower.getTower(
							"tower1upgrade").getTowerID()) {
						synchronized (fieldUnits) {
							ViewGameFieldUnit unit = new ViewGameFieldUnit(
									dataFieldImages.getFieldImage("TDmapEmpty("
											+ currentMapDesign
											+ ")tower"
											+ currentSkin
											+ dataFieldImages
													.getFieldImagePart(dataTower
															.getTower(
																	"tower1upgrade")
															.getTowerID())),
									yRows, xCols);
							unit.addMouseListener(this);
							fieldUnits.add(unit);
						}
					}
					if (towerArray[yRows][xCols] == dataTower.getTower(
							"tower2upgrade").getTowerID()) {
						synchronized (fieldUnits) {
							ViewGameFieldUnit unit = new ViewGameFieldUnit(
									dataFieldImages.getFieldImage("TDmapEmpty("
											+ currentMapDesign
											+ ")tower"
											+ currentSkin
											+ dataFieldImages
													.getFieldImagePart(dataTower
															.getTower(
																	"tower2upgrade")
															.getTowerID())),
									yRows, xCols);
							unit.addMouseListener(this);
							fieldUnits.add(unit);
						}
					}
					if (towerArray[yRows][xCols] == dataTower.getTower(
							"tower3upgrade").getTowerID()) {
						synchronized (fieldUnits) {
							ViewGameFieldUnit unit = new ViewGameFieldUnit(
									dataFieldImages.getFieldImage("TDmapEmpty("
											+ currentMapDesign
											+ ")tower"
											+ currentSkin
											+ dataFieldImages
													.getFieldImagePart(dataTower
															.getTower(
																	"tower3upgrade")
															.getTowerID())),
									yRows, xCols);
							unit.addMouseListener(this);
							fieldUnits.add(unit);
						}
					}
					if (towerArray[yRows][xCols] == dataTower.getTower(
							"tower4upgrade").getTowerID()) {
						synchronized (fieldUnits) {
							ViewGameFieldUnit unit = new ViewGameFieldUnit(
									dataFieldImages.getFieldImage("TDmapEmpty("
											+ currentMapDesign
											+ ")tower"
											+ currentSkin
											+ dataFieldImages
													.getFieldImagePart(dataTower
															.getTower(
																	"tower4upgrade")
															.getTowerID())),
									yRows, xCols);
							unit.addMouseListener(this);
							fieldUnits.add(unit);
						}
					}
					if (towerArray[yRows][xCols] == dataTower.getTower(
							"tower5upgrade").getTowerID()) {
						synchronized (fieldUnits) {
							ViewGameFieldUnit unit = new ViewGameFieldUnit(
									dataFieldImages.getFieldImage("TDmapEmpty("
											+ currentMapDesign
											+ ")tower"
											+ currentSkin
											+ dataFieldImages
													.getFieldImagePart(dataTower
															.getTower(
																	"tower5upgrade")
															.getTowerID())),
									yRows, xCols);
							unit.addMouseListener(this);
							fieldUnits.add(unit);
						}
					}
					if (towerArray[yRows][xCols] == dataTower.getTower(
							"tower6upgrade").getTowerID()) {
						synchronized (fieldUnits) {
							ViewGameFieldUnit unit = new ViewGameFieldUnit(
									dataFieldImages.getFieldImage("TDmapEmpty("
											+ currentMapDesign
											+ ")tower"
											+ currentSkin
											+ dataFieldImages
													.getFieldImagePart(dataTower
															.getTower(
																	"tower6upgrade")
															.getTowerID())),
									yRows, xCols);
							unit.addMouseListener(this);
							fieldUnits.add(unit);
						}
					}
				}
			}
			for (int i = 0; i < fieldUnits.size(); i++) {
				gameField.add((ViewGameFieldUnit) fieldUnits.get(i));
			}
		}
	}

	/**
	 * macht aus der Map einen String / schreibt eine txt Datei
	 * @param String currentMap
	 */
	public String getMapString(String currentMap) {

		setMapDesign();
		parseMapGetSize(currentMap);
		parseMapToArray(currentMap);
		StringBuilder sb = new StringBuilder(1024);

		try {
			FileWriter fileWriter = new FileWriter("CurrentMap.txt");

			if (checkMapSyntax()) {
				for (int yRows = 0; yRows < arrayYRows; yRows++) {
					for (int xCols = 0; xCols < arrayXCols; xCols++) {
						fileWriter.write(mapArrayOriginal[yRows][xCols]);
						sb.append(mapArrayOriginal[yRows][xCols]);
					}
				}
				fileWriter.close();
				System.out.println("File is written! Look into the project folder!");
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		return sb.toString();

	}
	
	/**
	 * MouseListener Setter
	 */
	public void setMouseListener(MouseListener m) {

		buttonTower1.addMouseListener(m);
		buttonTower2.addMouseListener(m);
		buttonTower3.addMouseListener(m);
		buttonTower4.addMouseListener(m);
		buttonTower5.addMouseListener(m);
		buttonTower6.addMouseListener(m);
	}

	/**
	 * leert die Ansicht des Spielfeldes
	 */
	private void clearField() {

		// Die GameFieldUnits werden aus dem Vector und der Anzeige geloescht
		for (int i = 0; i < fieldUnits.size(); i++) {
			ViewGameFieldUnit unit = fieldUnits.get(i);
			unit.setVisible(false);
			gameField.remove(unit);
			synchronized (fieldUnits) {
				fieldUnits.remove(unit);
			}
			clearField();
		}
	}

	/**
	 * zeichnet das Spielfeld neu
	 */
	public void redrawField() {
		clearField();
		parseMapFromArrayToView();
	}

	/**
	 * zum upgraden eines ausgewaehlten Towers
	 */
	public void upgradeTower() {

		if (towerSetted) {
			int y = currentShoppingField[0];
			int x = currentShoppingField[1];

			// der Standard Tower auf dem momentanen Field
			Tower towerStandard = dataTower.getTower(towerArray[y][x]);
			// der dazugehoerige Upgrade Tower
			Tower towerUpgrade = dataTower.getTower("tower"
					+ towerStandard.getTowerNumber() + "upgrade");
			// Geldanzeige wird aktualisert
			enoughMoney(towerUpgrade);
			// wenn das Guthaben groß genug ist um den Upgrade Tower zu
			// kaufen...
			if (enoughMoney(towerUpgrade)) {
				// wird der Upgrade Tower an die Stelle des Standard Towers im
				// Array gesetzt
				towerArray[y][x] = towerUpgrade.getTowerID();
				// der Schaden des Towers auf die Gegner wird erhoeht
				towerArea[y][x] += 1;
				towerArea[y + 1][x] += 1;
				towerArea[y - 1][x] += 1;
				towerArea[y + 1][x + 1] += 1;
				towerArea[y - 1][x - 1] += 1;
				towerArea[y][x + 1] += 1;
				towerArea[y][x - 1] += 1;
				towerArea[y + 1][x - 1] += 1;
				towerArea[y - 1][x + 1] += 1;
				// die Shop Buttons werden deaktiviert
				getUpgradeButton().setEnabled(false);
				getSellButton().setEnabled(false);
				// ...der Preis des Upgrade Towers wird vom Guthaben abgezogen
				// und die Anzeige aktualisiert...
				setMoneyMinus(towerStandard.getTowerPrice());
				setMoneyValue(getMoney());
				// ...es soll jetzt kein "richtiger" Tower mehr ausgewaehlt
				// sein...
				currentShoppingField = new int[] { 0, 0 };
				// ...und auch kein ausgewaehltes Tower Bild mehr angezeigt
				// werden
				setClickedTowerImage(dataSkinImages.getImage(currentSkin
						+ "tower (" + currentClickedTower.getTowerNumber()
						+ ")"));
			}
			redrawField();
		}
	}

	/**
	 * regelt den Verkauf eines Turms
	 */
	public void sellTower() {

		if (towerSetted) {
			int y = currentShoppingField[0];
			int x = currentShoppingField[1];
			// der Tower auf dem momentanen Field
			Tower towerToSell = dataTower.getTower(towerArray[y][x]);
			// der Wirkungsbereich des Towers wird geloescht
			int minusDamage = towerToSell.getTowerDamage();
			towerArea[y][x] -= minusDamage;
			towerArea[y + 1][x] -= minusDamage;
			towerArea[y - 1][x] -= minusDamage;
			towerArea[y + 1][x + 1] -= minusDamage;
			towerArea[y - 1][x - 1] -= minusDamage;
			towerArea[y][x + 1] -= minusDamage;
			towerArea[y][x - 1] -= minusDamage;
			towerArea[y + 1][x - 1] -= minusDamage;
			towerArea[y - 1][x + 1] -= minusDamage;
			// der Tower wird aus den Arrays "geloescht"
			mapArray[y][x] = empty;
			towerArray[y][x] = dataTower.getTower("0").getTowerID();
			// die Shop Buttons werden deaktiviert
			getUpgradeButton().setEnabled(false);
			getSellButton().setEnabled(false);
			// ...der Preis des verkauften Towers / 2 wird zum Guthaben
			// hinzugefügt und die Anzeige aktualisiert...
			setMoneyPlus(towerToSell.getTowerPrice() / 2);
			setMoneyValue(getMoney());
			// ...es soll jetzt kein "richtiger" Tower mehr ausgewaehlt sein...
			currentShoppingField = new int[] { 0, 0 };
			// ...und auch kein ausgewaehltes Tower Bild mehr angezeigt werden
			setClickedTowerImage(dataSkinImages.getImage(currentSkin
					+ "tower (" + currentClickedTower.getTowerNumber() + ")"));
		}
		redrawField();
	}

	
	/**
	 * regelt die Platzierung eines Turms
	 * @param Tower towerToPlace
	 * @param int yPosition
	 * @param int xPosition
	 */
	private void placeTower(Tower towerToPlace, int yPosition, int xPosition) {

		// if (gameStarted) {
		// wenn der Tower NICHT der leere Tower ist...
		if (towerToPlace.getTowerNumber() != 0) {
			// ... und wenn hier ein leeres Feld vorhanden ist...
			if (mapArray[yPosition][xPosition] == '_') {
				// der Schaden des Towers wird in den Wirkungsbereich
				// eingetragen
				int plusDamage = towerToPlace.getTowerDamage();
				towerArea[yPosition][xPosition] = 0;
				towerArea[yPosition + 1][xPosition] += plusDamage;
				towerArea[yPosition - 1][xPosition] += plusDamage;
				towerArea[yPosition + 1][xPosition + 1] += plusDamage;
				towerArea[yPosition - 1][xPosition - 1] += plusDamage;
				towerArea[yPosition][xPosition + 1] += plusDamage;
				towerArea[yPosition][xPosition - 1] += plusDamage;
				towerArea[yPosition + 1][xPosition - 1] += plusDamage;
				towerArea[yPosition - 1][xPosition + 1] += plusDamage;
				// ...wird der Turm in die Arrays eingetragen...
				mapArray[yPosition][xPosition] = tow;
				towerArray[yPosition][xPosition] = towerToPlace.getTowerID();
				// ...tower setted wird true...
				towerSetted = true;
				// ...der Preis des platzierten Towers wird vom Guthaben
				// abgezogen und die Anzeige aktualisiert...
				setMoneyMinus(towerToPlace.getTowerPrice());
				setMoneyValue(getMoney());
				// ...es soll jetzt kein "richtiger" Tower mehr ausgewaehlt
				// sein...
				currentClickedTower = dataTower.getTower("0");
				// ...und auch kein ausgewaehltes Tower Bild mehr angezeigt
				// werden
				setClickedTowerImage(dataSkinImages.getImage(currentSkin
						+ "tower (" + currentClickedTower.getTowerNumber()
						+ ")"));
				// ... und die Shop Buttons werden aktiviert
				getUpgradeButton().setEnabled(true);
				getSellButton().setEnabled(true);
			}
		}
	}

	/**
	 * fraegt ab, ob genug Geld vorhanden ist
	 * @param Tower currentTower
	 */
	private boolean enoughMoney(Tower currentTower) {

		boolean bool = false;
		// wenn weniger Geld vorhanden ist als der Preis des aktuellen Turms...
		if (getMoney() < currentTower.getTowerPrice()) {
			// ...faerbt sich die Anzeige rot
			setMoneyColor(Color.red);
			bool = false;
		}
		// wenn mehr oder genauso viel Geld vorhanden ist wie der Preis des aktuellen Turms...
		if (getMoney() >= currentTower.getTowerPrice()) {
			// ...faerbt sich die Anzeige weiss
			setMoneyColor(Color.white);
			bool = true;
		}
		return bool;
	}

	// ACTION LISTENER SETTER
	// ---------------------------------------------------------------------------------------------------------------------------
	/**
	 * ActionListener Setter
	 */
	public void setActionListener(ActionListener l) {

		buttonExit.addActionListener(l);
		buttonStart.addActionListener(l);
		buttonMenu.addActionListener(l);
		buttonTower1.addActionListener(l);
		buttonTower2.addActionListener(l);
		buttonTower3.addActionListener(l);
		buttonTower4.addActionListener(l);
		buttonTower5.addActionListener(l);
		buttonTower6.addActionListener(l);
		buttonUpgrade.addActionListener(l);
		buttonSell.addActionListener(l);
		boxLanguage.addActionListener(l);
		boxSkin.addActionListener(l);
	}

	// MOUSE EVENTS
	// ---------------------------------------------------------------------------------------------------------------------------

	@Override
	/**
	 * Mouse Clicked Events
	 */
	public void mouseClicked(MouseEvent e) {

		for (int i = 0; i < fieldUnits.size(); i++) {
			ViewGameFieldUnit unit = fieldUnits.get(i);
			int yPosition = unit.getYPosition();
			int xPosition = unit.getXPosition();
			if (e.getSource() == unit) {
				// NEUER TOWER WIRD GESETZT:
				// Geldanzeige wird aktualisert
				enoughMoney(currentClickedTower);
				// wenn genug Geld vorhanden ist um des ausgewaehlten Turm zu
				// setzen
				if (enoughMoney(currentClickedTower)) {
					// ...soll dieser gesetzt werden
					placeTower(currentClickedTower, yPosition, xPosition);
				}
				// SCHON GESETZTER TOWER SOLL GEUPGRADED ODER VERKAUFT WERDEN:
				// Der Tower im angeklickten Feld (kann auch der leere Tower
				// sein)
				Tower currentFieldTower = dataTower
						.getTower(getTowerIDFromArray(yPosition, xPosition));
				// wenn der Tower im angeklickten Feld ein kein Tower ist
				if (currentFieldTower.getTowerEdition().equals("_")) {
					// ...soll kein Bild angezeigt werden...
					setClickedTowerImage(dataSkinImages.getImage(currentSkin
							+ "tower (" + currentFieldTower.getTowerNumber()
							+ ")"));
				}
				// wenn der Tower im angeklickten Feld ein Standard Tower ist
				if (currentFieldTower.getTowerEdition().equals("s")) {
					// ...soll das Bild des Standard Towers angezeigt werden...
					setClickedTowerImage(dataSkinImages.getImage(currentSkin
							+ "tower (" + currentFieldTower.getTowerNumber()
							+ ")"));
				}
				// wenn der Tower im angeklickten Feld ein Upgrade Tower ist
				if (currentFieldTower.getTowerEdition().equals("u")) {
					// ...soll das Bild des Upgrade Towers angezeigt werden...
					setClickedTowerImage(dataSkinImages.getImage("tower"
							+ currentSkin + " ("
							+ currentFieldTower.getTowerNumber() + ")upgrade"));
				}
				// wenn der Tower im angeklickten Feld nicht der leere Tower ist...
				if (currentFieldTower.getTowerNumber() != 0) {
					// ...und ein Standard Turm ist...
					if (currentFieldTower.getTowerEdition().equals("s")) {
						// ...aktiviere die Shop Buttons
						getUpgradeButton().setEnabled(true);
						getSellButton().setEnabled(true);
					}
					// ...wenn er ein Upgrade Tower ist...
					if (currentFieldTower.getTowerEdition().equals("u")) {
						// wird nur der Shop Button wieder aktiviert
						getSellButton().setEnabled(true);
					}
					// ... und das Feld wird gespeichert
					currentShoppingField = new int[] { yPosition, xPosition };
				}
				// das Spielfeld wird neu gezeichnet
				redrawField();
				e.consume();
				break;
			}
		}
	}

	@Override
	/**
	 * Mouse Entered Events
	 */
	public void mouseEntered(MouseEvent e) {

		for (int i = 0; i < fieldUnits.size(); i++) {
			// das momentane Feld
			ViewGameFieldUnit unit = fieldUnits.get(i);
			// die Position des Feldes
			int yPosition = unit.getYPosition();
			int xPosition = unit.getXPosition();
			if (e.getSource() == unit) {
				// der aktuell berührte Turm auf dem Game Field
				Tower currentFieldTower = dataTower
						.getTower(getTowerIDFromArray(yPosition, xPosition));
				// der Preis der Upgrade Edition des aktuellen Towers
				int upgradePrice = currentFieldTower.getTowerPrice() + 30;
				// ändere die Anzeigen
				if (currentFieldTower.getTowerNumber() != 0
						&& currentFieldTower.getTowerEdition().equals("s")) {
					setTowerPriceValue("<html>"
							+ currentFieldTower.getTowerPrice() + "<br>"
							+ upgradePrice + "(Upgrade)" + "</html>");
				}
				if (currentFieldTower.getTowerEdition().equals("u")) {
					setTowerPriceValue(" " + currentFieldTower.getTowerPrice()
							+ " ");
				}
				if (currentFieldTower.getTowerNumber() == 0) {
					setTowerPriceValue(" " + currentFieldTower.getTowerPrice()
							+ " ");
				}
				setTowerDescriptionValue(dataLanguage.getText(currentLanguage
						+ "tower" + currentFieldTower.getTowerNumber()
						+ "Description"));
				setImages(currentSkin, currentFieldTower.getTowerNumber(),
						currentFieldTower.getTowerDamage(),
						currentFieldTower.getTowerRange(),
						currentFieldTower.getTowerRate());
				e.consume();
				break;
			}
		}
	}

	@Override
	/**
	 * 
	 */
	public void mouseExited(MouseEvent e) {
	}

	@Override
	/**
	 * 
	 */
	public void mousePressed(MouseEvent e) {
	}

	@Override
	/**
	 * 
	 */
	public void mouseReleased(MouseEvent e) {
	}

	// SETTER
	// ---------------------------------------------------------------------------------------------------------------------------

	/**
	 * 
	 * @param plus
	 */
	public void setMoneyPlus(int plus) {
		money += plus;
	}

	/**
	 * 
	 * @param minus
	 */
	public void setMoneyMinus(int minus) {
		money -= minus;
	}

	/**
	 * 
	 * @param plus
	 */
	public void setWavePlus(int plus) {
		wave += plus;
	}

	/**
	 * 
	 * @param minus
	 */
	public void setLifeMinus(int minus) {
		life -= minus;
	}

	/**
	 * 
	 * @param delivered
	 */
	public void setMoneyValue(int delivered) {
		labelMoneyValue.setText("" + delivered + "");
	}

	/**
	 * 
	 * @param delivered
	 */
	public void setMoneyColor(Color delivered) {
		labelMoneyValue.setForeground(delivered);
	}

	/**
	 * 
	 * @param delivered
	 */
	public void setWaveValue(int delivered) {
		labelWaveValue.setText("" + delivered + "");
	}

	/**
	 * 
	 * @param delivered
	 */
	public void setTimeValue(int delivered) {
		labelTimeValue.setText("" + delivered + "");
	}

	/**
	 * 
	 * @param delivered
	 */
	public void setLifeValue(int delivered) {
		labelLifeValue.setText("" + delivered + "");
	}

	/**
	 * 
	 * @param delivered
	 */
	public void setTowerPriceValue(String delivered) {
		labelElectedTowerPriceValue.setText(delivered);
	}

	/**
	 * 
	 * @param delivered
	 */
	public void setTowerDescriptionValue(String delivered) {
		labelElectedTowerDescriptionValue.setText(delivered);
	}

	/**
	 * 
	 */
	public void setMapDesign() {
		currentMap = ControlWindowMenu.currentMap;
		currentMapDesign = ControlWindowMenu.currentMapDesign;
	}

	/**
	 * 
	 * @param delivered
	 */
	public void setCurrentSkin(String delivered) {
		currentSkin = delivered;
	}

	/**
	 * 
	 * @param delivered
	 */
	public void setCurrentLanguage(String delivered) {
		currentLanguage = delivered;
	}

	/**
	 * 
	 * @param delivered
	 */
	public void setCurrentClickedTower(Tower delivered) {
		currentClickedTower = delivered;
	}

	/**
	 * 
	 * @param b
	 */
	public void setGameStopped(boolean b) {
		gameStopped = b;
	}

	// GETTER
	// ---------------------------------------------------------------------------------------------------------------------------

	/**
	 * @return boolean
	 */
	public boolean getGameStopped() {
		return gameStopped;
	}

	/**
	 * @return char[][]
	 */
	public char[][] getMapArray() {
		return mapArray;
	}

	/**
	 * @return int[][]
	 */
	public int[][] getTowerArea() {
		return towerArea;
	}
	
	/**
	 * @return int
	 */
	public int getMoney() {
		return money;
	}
	
	/**
	 * @return int
	 */
	public int getWave() {
		return wave;
	}

	/**
	 * @return int
	 */
	public int getLife() {
		return life;
	}

	/**
	 * @return JButton
	 */
	public JButton getExitButton() {
		return buttonExit;
	}

	/**
	 * @return JButton
	 */
	public JButton getStartButton() {
		return buttonStart;
	}

	/**
	 * @return JButton
	 */
	public JButton getMenuButton() {
		return buttonMenu;
	}

	/**
	 * @return JButton
	 */
	public JButton getUpgradeButton() {
		return buttonUpgrade;
	}

	/**
	 * @return JButton
	 */
	public JButton getSellButton() {
		return buttonSell;
	}

	/**
	 * @param towerNumber
	 * @return JButton
	 */
	public JButton getTowerButton(int towerNumber) {

		JButton output = null;
		if (towerNumber == 1) {
			output = buttonTower1;
		}
		if (towerNumber == 2) {
			output = buttonTower2;
		}
		if (towerNumber == 3) {
			output = buttonTower3;
		}
		if (towerNumber == 4) {
			output = buttonTower4;
		}
		if (towerNumber == 5) {
			output = buttonTower5;
		}
		if (towerNumber == 6) {
			output = buttonTower6;
		}
		return output;
	}

	/**
	 * @return JComboBox<String>
	 */
	public JComboBox<String> getBoxLanguage() {
		return boxLanguage;
	}

	/**
	 * @return JComboBox<String>
	 */
	public JComboBox<String> getBoxSkin() {
		return boxSkin;
	}

	/**
	 * @param yRows
	 * @param xCols
	 * @return String
	 */
	public String getTowerIDFromArray(int yRows, int xCols) {
		return towerArray[yRows][xCols];
	}

}	