package kadai04ObShikouIntDoushi;

public class UserAction01 {

	public static void main(String[] args) {
		
		//ボタン生成
		
		User01 U1 = new User01();
		
		// 田中太郎（20）の情報を登録して出力
		
		U1.name = "田中太郎";
		U1.age = 20;
		
		U1.showInfo();
		
		System.out.println("---");
		
		// 鈴木一郎（25）の情報を登録して出力
		
		U1.name = "鈴木一郎";
		U1.age = 25;
		
		U1.showInfo();
		
	}

}
