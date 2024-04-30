package p029Stringnado;

public class Sample05Sanshouka extends Object {

	public static void main(String[] args) {
		
		int a = 10;
		
		Integer x = 100;
		
		//（番地）参照化←ラッパー（包む）クラス
		//｛目的｝参照型での便利な
		
		//オートボクシング
		
		int b = x;
		
		//オートアンボクシング
		
		System.out.println(x);
		System.out.println(b);
		
		System.out.println(Integer.toBinaryString(10));
		
		System.out.println(x + x);

		
	}

}
