package p009;

public class Startkiten {

	public static void main(String[] args) {
		
		/*Human h = new Human();

		h.name = "菊みず";
		h.age = 22;			*/
		
		//これらの「ボタンの製造」と「具」を、一行で行えるようにする
		//「コンストラクタ」 = 「特殊なメソッド」
		//「= new Human();」における「Human」が、「インスタンス名」
		
		//（例）
		
		Human h1 = new Human("菊子", 22);
		
		h1.introduce();

		
		Human h2 = new Human();

//		h2.name = "菊みず";
//		h2.age = 22;		

		h2.introduce();
		
	}

}
