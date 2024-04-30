package p029Stringnado;

public class Sample09ReigaiShori extends Object {

	public static void main(String[] args) {
		
		try {
			
			System.out.println(10 / 2);
			System.out.println(Integer.parseInt("Z400"));
			
		} catch (Exception e) {
			
			System.out.println("エラーだにょい");
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
