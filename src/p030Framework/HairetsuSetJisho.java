package p030Framework;

import java.util.Set;
import java.util.TreeSet;

public class HairetsuSetJisho extends Object {

	public static void main(String[] args) {
				
		//<データ型>は、「参照型」のみ可
				
		Set<String> canon = new TreeSet<>();
		
		//「番号」で管理しない
		
		//｛？｝大きい方 = 小さい方
		
		canon.add("にょい");
		canon.add("あれい");
		canon.add("どんれい");
		
		//重複不可
		
		//canon.add(2,40);
		//「番号」で管理しない
		
		//可変
		
//		for (int i = 0; i < canon.size(); i++) {
//			
//			//
//			
//			System.out.println(canon.get(i));
//		}
		
		System.out.println("ーーーーーーーーーーーーーー");
		
		for (String data : canon) {
			System.out.println(data);
		}
		
		//｛？｝Integer = int
		
	}

}
