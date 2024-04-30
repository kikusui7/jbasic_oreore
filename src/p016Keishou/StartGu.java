package p016Keishou;

public class StartGu {

	public static void main(String[] args) {
		
		//子クラス（遺伝子入り）だけでおけ
		
		//「ボタン精製」
		
		Oya01 o1 = new Oya01();
		Kodomo01 k1 = new Kodomo01();

		
		Oya01 o2 = new Kodomo01();
		//「親」という内側から、「子」という外側へ
		
//		Kodomo01 k2 = new Oya01();
//		Kodomo01 k3 = o1;
//		Kodomo01 k4 = (Kodomo01)o1;
		
		Kodomo01 k5 = (Kodomo01)o2;
		
		System.out.println();
		
		//名詞「具」
				
		//動詞「具」
		
	}

}
