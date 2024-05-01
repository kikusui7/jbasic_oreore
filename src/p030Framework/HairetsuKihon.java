package p030Framework;

public class HairetsuKihon extends Object {

	public static void main(String[] args) {
		
		int [] canon = new int [3];
		
		canon [0] = 10;
		canon [1] = 20;
		canon [2] = 30;

		for (int data : canon) {
			System.out.println(data);
		}
		
		for (int i = 0; i < canon.length; i++) {
			
			System.out.println(canon[i]);
			
		}
		
	}

}
