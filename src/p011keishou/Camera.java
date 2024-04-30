package p011keishou;

public class Camera {
	
	//クラス設計図同士で「継承」
	
	//「名詞」
	
	String maker;
	
	//「動詞」
	
	public void takePicture () {
		System.out.println("メーカー：" + maker);
		System.out.println("撮影中だにょ");

	}


}
