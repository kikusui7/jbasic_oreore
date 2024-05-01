package kadai06addKaisetsu;

import java.util.Scanner;

public class PlayGameSwitchIf {
	private static Scanner scan;
	private static Human[] list;
	
	//｛？｝static

	public static void main(String[] args) {
		//キーボード入力のおまじない
		scan = new Scanner(System.in);
		
		//パーティ３名を格納するHumanクラス型の配列の宣言
		list = new Human[3];
		
		//｛規｝scanなので；
		
		System.out.println("=== パーティを作成します ===");
		
		for (int i = 0; i < list.length; i++) {
			System.out.print("どちら（1:市民 2:戦士）を作成しますか：");
			int num = scan.nextInt();
			
			System.out.print("名前：");
			String name = scan.next();
			
			// ifの外に名前→==2で両方表示のため
			
			if (num == 1) {
				list[i] = new Human(name);
				
				//
				
			} else if (num == 2) {
				System.out.print("種別：");
				String type = scan.next();
				
				list[i] = new Warrior(name, type);
			}
			
		}
		
		System.out.println("=== パーティを作成しました ===");
		
		int selNo = -1;
		
		//｛規｝scanのため
		
		//？-1
		
		do {
			System.out.print("操作（1:一覧表示 2:攻撃 9:終了）を選択してください：");
			selNo = scan.nextInt();
			
			switch (selNo) {
			
			//｛注｝
			
			case 1:
				
				//｛？｝
				
				displayList();
				break;
			case 2:
				attackList();
				break;
			}
			
			System.out.println();
			
		} while (selNo != 9);
	}
	
	public static void displayList() {
		for (Human h : list) {
			h.info();
			
			//名詞「具」を拡張文するため
			
		}
	}
	
	public static void attackList() {
		for (Human h : list) {
			h.attack();
		}
	}

}
