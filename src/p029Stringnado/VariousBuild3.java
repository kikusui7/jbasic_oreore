package p029Stringnado;

public class VariousBuild3 extends Object {

	public static void main(String[] args) {
		
		StringBuilder sb = new StringBuilder("cHoIchoiCHOI");

//		sb.append("shougunkayoOOOOO");
		sb.insert(2, "shougun");
		
		System.out.println(sb);

		System.out.println(sb.length());
		System.out.println(sb.capacity());
		//+16
		System.out.println(sb.replace(4, 8, "oioi"));

	}

}
