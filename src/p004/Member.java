package p004;

public class Member {
	
	//名詞（フィールド/メンバ変数）
	String myGoal;
	static String teamGoal;
	
	//動詞（メソッド）
	void displayGoal () {
		System.out.println("個人の目標：" + myGoal);
		System.out.println("チームの目標：" + teamGoal);
		test ();
		System.out.println("ーーーーーーーーーーーーーーーー");		
		
	}
	
	static void test () {
		System.out.println("菊みず");
		//displayGoal();
	}

}
