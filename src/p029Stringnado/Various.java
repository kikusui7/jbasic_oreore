package p029Stringnado;

public class Various extends Object {

	public static void main(String[] args) {
		
		String s = "っておいぃぃぃぃぃ";
		
		System.out.println(s.length());
		System.out.println(s.charAt(1));
		//
		System.out.println(s.substring(2));
		//3文字目（3号室目）以降
		System.out.println(s.substring(2,6));
		System.out.println(s.indexOf("ぃ"));
		System.out.println(s.indexOf("あ"));
		System.out.println(s.lastIndexOf("ぃ"));
		System.out.println(s.startsWith("って"));
		System.out.println(s.startsWith("おいぃ"));
		System.out.println(s.endsWith("ぃ"));
		System.out.println(s.startsWith("おいぃ",2));

	}

}
