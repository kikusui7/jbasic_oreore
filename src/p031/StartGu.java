package p031;

import java.util.ArrayList;
import java.util.List;

public class StartGu {

	public static void main(String[] args) {
		
		//「抽象」←｛目的｝
		
		//「ボタン精製」
		
		//Canon[] list = new Canon[2];
		
		List<Canon> list = new ArrayList<>();
		
		//list[0] = new Oku() ;
		
		list.add(new Oku());
		list.add(new Kudo());
		
		c = new Oku();
		
		//小さい方から大きい方へ
		
		c.work();
		c.salary();
		
		//名詞「具」
				
		
		//動詞「具」
		
		c = new Kudo();
		
		c.work();
		c.salary();

		
	}

}
