package p029Stringnado;

public class Sample012DokujiReigai extends Object {

	public static void main(String[] args) {
		
		
		
	}
		
		public static int tasu(int x, int y) throws Exception{

			int result = x / y;
			
			if (result <= 0) {
				
				throw new TasuException();
				
			}

			return result;

		}


	public static int waru(int x, int y) {

		int result = x / y;

		return result;
		
	}

	
}
