package memo;

//import java.util.Scanner;

public class Memo {
		public static void main(String[] args) {
			Game[] gameList = new Game[5];
			gameList[0] = new BoardGame("Splendor", 4, "Space Cowboys");

			for (int i = 0; i < gameList.length; i++) {
				if (gameList[i] != null) {
					gameList[i].info();
				}
			}
		}

	}

		class Game {
			private String name;
			private int playerCount;

			public Game(String name, int playerCount) {
				this.name = name;
				this.playerCount = playerCount;
			}

			public void info() {
				System.out.println("------ 게임 정보 ------");
				System.out.println("게임명 = " + name);
				System.out.println("플레이어수 = " + playerCount);
			}
		}

		class BoardGame extends Game {
			private String publisher;

			public BoardGame(String name, int playerCount, String publisher) {
				super(name, playerCount);
				this.publisher = publisher;
			}

			public void info() {
				super.info();
				System.out.println("발매사 = " + publisher);
			}
		}
		
	



