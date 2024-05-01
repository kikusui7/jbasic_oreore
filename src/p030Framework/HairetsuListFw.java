package p030Framework;

import java.util.ArrayList;
import java.util.List;

public class HairetsuListFw extends Object {

	public static void main(String[] args) {
		
		//ArrayList<int> canon = new ArrayList<int>();
		
		//<データ型>は、「参照型」のみ可
		
		//ArrayList<Integer> canonon = new ArrayList<Integer>();
		//省略可
		
		//ArrayList<Integer> canonon = new ArrayList<>();
		
		List<Integer> canon = new ArrayList<>();
		
		//リストというインターフェース（抽象？）
		
		//｛？｝大きい方 = 小さい方
		//｛答｝
		
		canon.add(10);
		canon.add(20);
		canon.add(30);
		
		//可変なのでadd
		
		canon.add(2,40);
		
		canon.remove(1);
		//空き部屋は詰める
		
		//可変
		
		for (int i = 0; i < canon.size(); i++) {
			
			//intは番地参照
			//size
			
			System.out.println(canon.get(i));
		}
		
		System.out.println("ーーーーーーーーーーーーーー");
		
		for (Integer data : canon) {
			System.out.println(data);
		}
		
		//｛？｝Integer = int
		
	}

}
