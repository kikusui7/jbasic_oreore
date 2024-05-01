package kadai07ErrorFrameW;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StringCart02 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		String kaden;
		
		// 文字列を保持できるリストの作成
		
		List<String> kagu = new ArrayList<>();
		
		for (int i = 0; i < 3; i++) {
			
			//｛？｝条件式
			
			System.out.print("商品を追加してください：");
			
			kaden = scan.next();
			kagu.add(kaden);
			
			//｛注｝scan時は、分ける
			
			//｛？注｝（）内に式は無し

			
		}
				
		// 拡張for文を利用して全商品を出力する
		
		for (String l : kagu) {
			System.out.println(l);
		}

	}

}
