package p004;

public class Startkiten {
	
	static int a ;
	
	void kuku() {
		
	}

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		
		System.out.println(a);
		//kuku ();
		
		//リモコンごとに、具の作製
		Member m1 = new Member();
		Member m2 = new Member();
		Member m3 = new Member();
		
		m1.myGoal = "データキャラ";
		m2.myGoal = "ダル";
		m3.myGoal = "体を張れぃ";
		
		//m2.teamGoal = "今日も一日がんばるぞい";
		Member.teamGoal = "俺はやらん";
		
		m1.displayGoal();
		m2.displayGoal();
		m3.displayGoal();
		
		Member.test();
		
	}

}
