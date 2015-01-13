package de.tu_darmstadt.gdi1.towerdefense.test.adapter.impl;

import de.tu_darmstadt.gdi1.towerdefense.test.adapter.TowerDefenseTestAdapterMinimal;

public class TowerDefenseTestAdapterMinimalImpl implements
		TowerDefenseTestAdapterMinimal {
	
	private char[][] testArray;
	private char[][] testArrayOriginal;
	private int[][] monsterArray;
	private int[] spawnpoint;
	private int countSpawns;
	private int countFinishs;
	private Character ln = new Character('\n');
	private Character border = new Character('#');
	private Character empty = new Character('_');
	private Character wayDown = new Character('v');
	private Character wayUp = new Character('^');
	private Character wayLeft = new Character('<');
	private Character wayRight = new Character('>');
	private Character spawn = new Character('S');
	private Character finish = new Character('X');
	private Character tower = new Character('t');
	private int arrayYRows;
	private int arrayXCols;
	private int life;
		
	@Override
	public void reset() {
		
		testArray = testArrayOriginal;
	
	}

	@Override
	public void loadLevelFromString(String level) {
		
		int counterLines = 0;
		int counterBorders = 0;
				
		for (int i = 0; i < level.length(); i++)	 {
			
			char currentChar =  level.charAt(i);
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
			
		}
				
		arrayYRows = counterLines + 1;
		arrayXCols = ((counterBorders - ((counterLines * 2) - 4)) / 2); 
		testArray = new char[arrayYRows][arrayXCols];
		monsterArray = new int[arrayYRows][arrayXCols];
		
		int xCols = 0;
		int yRows = 0;
		
		
		for (int i = 0; i < level.length(); i++)	 {
			
			char currentChar =  level.charAt(i);
			
			if (currentChar == empty) {
				testArray[yRows][xCols] = empty;
				xCols++;
			}
			if (currentChar == wayDown) {
				testArray[yRows][xCols] = wayDown;
				xCols++;
			}
			if (currentChar == wayUp) {
				testArray[yRows][xCols] = wayUp;
				xCols++;
			}
			if (currentChar == wayLeft) {
				testArray[yRows][xCols] = wayLeft;
				xCols++;
			}
			if (currentChar == wayRight) {
				testArray[yRows][xCols] = wayRight;
				xCols++;
			}
			if (currentChar == spawn) {
				testArray[yRows][xCols] = spawn;
				spawnpoint = new int[] {yRows, xCols};
				xCols++;
			}
			if (currentChar == finish) {
				testArray[yRows][xCols] = finish;
				xCols++;
			}
			if (currentChar == border) {
				testArray[yRows][xCols] = border;
				xCols++;
			}
			if (currentChar == ln) {
				testArray[yRows][xCols] = ln;
				yRows++;
				xCols = 0;
			}
						
		}
		
		testArrayOriginal = testArray.clone();
	}

	@Override
	public String levelToString() {
		 		
		StringBuilder sb = new StringBuilder();
		
		for (int yRows = 0; yRows < arrayYRows; yRows++) {
			for (int xCols = 0; xCols < arrayXCols; xCols++) {
				
				sb.append(testArray[yRows][xCols]);
			}
		}
		
		return sb.toString();
		
	}

	@Override
	public boolean levelIsValid() {
		
		boolean bool = true;
		if (countFinishs > 1 || countFinishs < 1) {
			return false;
		}
		if (countSpawns > 1 || countSpawns < 1) {
			return false;
		}

		for (int y = 0; y < arrayYRows; y++) {
			for (int x = 0; x < arrayXCols; x++) {
				if (testArray[y][x] == spawn) {

					while (testArray[y][x] != finish) {

						if (testArray[y][x] == spawn
								&& testArray[y][x + 1] == wayRight) {
							x++;
						}
						if (testArray[y][x] == spawn
								&& testArray[y][x - 1] == wayLeft) {
							x--;
						}
						if (testArray[y][x] == spawn
								&& testArray[y + 1][x] == wayDown) {
							y++;
						}
						if (testArray[y][x] == spawn
								&& testArray[y - 1][x] == wayUp) {
							y--;
						}
						if (testArray[y][x] == wayRight) {
							x++;
						}
						if (testArray[y][x] == wayLeft) {
							x--;
						}
						if (testArray[y][x] == wayDown) {
							y++;
						}
						if (testArray[y][x] == wayUp) {
							y--;
						}
						if (testArray[y][x] == empty) {
							bool = false;
							break;
						}
					}
				}
			}
		}

		return bool;
	}

	@Override
	public char levelElementAt(int x, int y) {
		
		return testArray[y][x];
	}

	@Override
	public int getPlayerHealth() {

		return life;
	}

	@Override
	public void placeTower(int x, int y) {

		if (testArray[y][x] == empty) {
			testArray[y][x] = tower;
		}
	}

	@Override
	public boolean isTowerAt(int x, int y) {

		boolean bool = true;
		
		if (testArray[y][x] != tower) {
			bool = false;
		}
		
		if (testArray[y][x] == tower) {
			bool = true;
		}
		
		return bool;
	}

	@Override
	public void spawnMonster(int x, int y) {

		if (y == spawnpoint[0] && x == spawnpoint[1]) {
		
			monsterArray[y][x] = 1;
		}
	}

	@Override
	public boolean isMonsterAt(int x, int y) {
		
		boolean bool = true;
		
		if (monsterArray[y][x] < 1) {
			bool = false;
		}
		
		if (monsterArray[y][x] > 1) {
			bool = true;
		}
		
		return bool;
	}

	@Override
	public int monsterCount(int x, int y) {

		return monsterArray[y][x];
	}

	@Override
	public void startGame() {
		
		life = 100;
	
	}

	@Override
	public void tick() {
		
		for (int y = 0; y < arrayYRows; y++) {
			for (int x = 0; x < arrayXCols; x++) {
				
				if (monsterArray[y][x] > 0 && testArray[y][x] == spawn || testArray[y][x] == wayRight) {
					monsterArray[y][x] = 0;
					monsterArray[y][x + 1] = monsterArray[y][x];
				}
				
				if (monsterArray[y][x] > 0 && testArray[y][x] == spawn || testArray[y][x] == wayLeft) {
					monsterArray[y][x] = 0;
					monsterArray[y][x - 1] = monsterArray[y][x];
				}
				
				if (monsterArray[y][x] > 0 && testArray[y][x] == spawn || testArray[y][x] == wayDown) {
					monsterArray[y][x] = 0;
					monsterArray[y + 1][x] = monsterArray[y][x];
				}
				
				if (monsterArray[y][x] > 0 && testArray[y][x] == spawn || testArray[y][x] == wayUp) {
					monsterArray[y][x] = 0;
					monsterArray[y - 1][x] = monsterArray[y][x];
				}
				
				}
			}
		}
}
