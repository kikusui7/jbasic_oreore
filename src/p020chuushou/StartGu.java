package p020chuushou;

public class StartGu {

	public static void main(String[] args) {
		
		//「抽象」←｛目的｝
		
		//「ボタン精製」
		
		//Controller c = new Controller();
		//インスタンス「具」化不可
		
/*		Controller[] list = {
				new Baseball();
				
		}
*/		
		Controller con ;
		
		con = new Baseball();
		
		con.pushA();
		con.pushB();

		
		//名詞「具」
		
		
		
		//動詞「具」
		
		con = new Mario();
		
		con.pushA();
		con.pushB();
		
	}

}
