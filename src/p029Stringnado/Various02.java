package p029Stringnado;

public class Various02 extends Object {

	public static void main(String[] args) {
		
		String s1 = "っておいぃぃぃぃぃ";
		String s2 = "将軍かよぉぉぉ！？";
		String s3 = " ちょい　チョイ　ちょーい！？　";
		String s4 = "cHoIchoiCHOI";


		
		System.out.println(s1.equals("っておいぃぃぃぃぃ"));
		
		System.out.println(s1 + s2);
		System.out.println(s1.concat(s2));
		System.out.println(s3.trim());
		
		System.out.println(s4.toLowerCase());
		System.out.println(s4.toUpperCase());

		
	}

}
