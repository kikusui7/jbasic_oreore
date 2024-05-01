package p029Stringnado;

public class Sample011CheckReigai extends Object {

	public static void main(String[] args) {

		//		try {
		//			
		//			System.out.println(10 / 2);
		//			System.out.println(Integer.parseInt("Z400"));
		//			
		//			throw new Exception("エラーっつてんだろうがい");
		//			
		//			//throw new ArithmeticException();
		//			//自力でエラーを投げる
		//			
		//		} catch (Exception e) {
		//			
		//			System.out.println("エラーだにょい");
		//			System.out.println();
		//			e.printStackTrace();
		//			//エラー箇所の表示！！
		//			
		//		} catch (ArithmeticException e) {
		//			
		//			System.out.println("割れんわい！！");
		//			
		//		} catch (Exception e) {
		//			
		//			System.out.println("エラーだにょい");
		//			
		//		} finally {
		//			System.out.println("正常だにょい");
		//
		//		}
		//		System.out.println("終わりっ");

		try {
			System.out.println(waru(10, 0));
		} catch (Exception e) {
			
			System.out.println(e.getMessage());
			
			e.printStackTrace();
		}

	}

	public static int waru(int x, int y) throws Exception {
		
		//「throws構文」でしか、どのような例外処理が行われているのかを判断できない
		
		if (y == 0) {
			//throw new ArithmeticException();
			//非チェック例外なので、throws必要なし
			
			throw new Exception("0では割れんわい！");
			//throws必要あり
			
			//｛注意｝
			//チェック例外には、必ず「例外処理」を
			
		}

		return x / y;

	}

}
