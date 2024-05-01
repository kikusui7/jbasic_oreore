package p030Framework;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HairetsuMap extends Object {

	public static void main(String[] args) {
				
		//<データ型>は、「参照型」のみ可
				
		Map<String, Integer> canon = new HashMap<>();
		
		//<KEY , >
		
		//｛？｝大きい方 = 小さい方
		
		canon.put("YOU", 10);
		canon.put("I", 20);
		canon.put("WE", 30);
		
		//キーワードを置く
		
		System.out.println(canon.get("YOU"));
		
		Set<String> list = canon.keySet();
		
		//｛？｝keySet
		
		for (String key : list) {
			System.out.println(key + "：" + canon.get(key));
		}
		
		//可変
		
//		for (int i = 0; i < canon.size(); i++) {
//			
//			System.out.println(canon.get(i));
//		}
		
		System.out.println("ーーーーーーーーーーーーーー");
		
//		for (String data : canon) {
//			System.out.println(data);
//		}
		
		//｛？｝Integer = int
		
	}

}
