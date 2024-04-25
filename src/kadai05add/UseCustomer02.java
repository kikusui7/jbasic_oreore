package kadai05add;

import java.util.Scanner;


public class UseCustomer02 {

	public static void main(String[] args) {

		Customer[] customerList = new Customer[3];
		
		//「ボタン」+「配列」
		
		Scanner scan = new Scanner(System.in);
		
		// 顧客データの読み込み
		for (int index = 0; index < customerList.length; index++) {
			
			//実質「拡張」
			
			System.out.println((index + 1)
					+ "人目の顧客情報を入力してください。");
			
			System.out.print("ID：");
			int id = scan.nextInt(); // IDの入力
			
			System.out.print("名前：");
			String name = scan.next(); // 名前の入力
			
			Customer customer;
			
			//
			
			if (id == -1) {
				// IDが-1なら名前だけ登録
				customer = new Customer(name);
				
			} else {
				// IDが-1でなければIDと名前を登録
				customer = new Customer(id, name);
			}
			customerList[index] = customer;
			
			//？
			
		}
		
		do {
			
			System.out.print("操作（1:一覧表示 2:変更 9:終了）を選択してください：");
			int ch = scan.nextInt();
			
			if (ch == 1) {
				
				// 顧客データ表示
				System.out.println();
				System.out.println("=== 顧客データ一覧 ===");
				
				for (Customer customer : customerList) {
					
					//customerList
					
					customer.showData();
				}
			}
			
			else if (ch == 2) {
				//「==」
				
				System.out.print("更新するID：");
				int chid = scan.nextInt();
				
				if (chid !== customerList[]) {
					
					System.out.println("指定したIDは存在しません。");
					
				}
				
				System.out.print("新しいID：");
				System.out.print("新しい名前：");
				
			}
			
			
		} while (ch !== 9);
		
		
		
		
		scan.close();
	}

}
