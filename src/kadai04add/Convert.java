package kadai04add;

public class Convert {
	static void reverse(int x) {
//		char[] moji = String.valueOf(x).toCharArray();
//		
//		for (int i = moji.length - 1; i >= 0; i--) {
//			System.out.print(moji[i]);
//		}
//		
//		System.out.println();
		
		//別解
		for (int i = x; i > 0; i /= 10) {
			System.out.print(i % 10);
			
			// (123 / 10) = 12 余り 3
			
		}
		
		System.out.println();
	}
	
	static void reverse(double x) {
		char[] moji = String.valueOf(x).toCharArray();
		
		//String.valueOf(x)で、String化
		
		for (int i = moji.length - 1; i >= 0; i--) {
			System.out.print(moji[i]);
		}
		
		System.out.println();
	}
	
	static void reverse(String s) {
//		char[] moji = s.toCharArray();
		
		//Stringで定義された、単語を「単文字」にして、配列（リスト）に入れる
//		
//		for (int i = moji.length - 1; i >= 0; i--) {
//			System.out.print(moji[i]);
//		}
		
		for (int i = s.length() - 1; i >= 0; i--) {
			
			//逆（総数）から、-1して表示
			
			System.out.print(s.charAt(i));
			
			//System.out.print(s.charAt(0));
			//System.out.print(s.charAt(1));
			//System.out.print(s.charAt(2));
			
			//のような形で、String s = "QED"
								  // = "Q","E","D"
			
		}
		
		System.out.println();
	}
}
