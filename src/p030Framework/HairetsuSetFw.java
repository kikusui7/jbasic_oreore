package p030Framework;

import java.util.HashSet;
import java.util.Set;

public class HairetsuSetFw extends Object {

	public static void main(String[] args) {
				
		//<データ型>は、「参照型」のみ可
				
		Set<Integer> canon = new HashSet<>();
		
		//「番地」で管理しない
		
		//｛？｝大きい方 = 小さい方
		
		canon.add(10);
		canon.add(20);
		canon.add(30);
		
		//重複不可
		
		//canon.add(2,40);
		//「番地」で管理しないので不可
		
		//可変
		
//		for (int i = 0; i < canon.size(); i++) {
//			
//			System.out.println(canon.get(i));
//		}
		
		System.out.println("ーーーーーーーーーーーーーー");
		
		for (int data : canon) {
			System.out.println(data);
		}
		
		//｛？｝Integer = int
		
	}

}
