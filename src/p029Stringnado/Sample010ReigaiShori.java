package p029Stringnado;

public class Sample010ReigaiShori extends Object {

	public static void main(String[] args) {
		
		try {
			
//			System.out.println(10 / 2);
//			System.out.println(Integer.parseInt("Z400"));
			
			throw new Exception("エラーっつてんだろうがい");
			
			//throw new ArithmeticException();
			//自力でエラーを投げる
			
		} catch (Exception e) {
			
			System.out.println("エラーだにょい");
			System.out.println();
			e.printStackTrace();
			//エラー箇所の表示！！
//			
//		} catch (ArithmeticException e) {
//			
//			System.out.println("割れんわい！！");
//			
//		} catch (Exception e) {
//			
//			System.out.println("エラーだにょい");
			
		} finally {
			System.out.println("正常だにょい");

		}
		System.out.println("終わりっ");
		
	}

}
