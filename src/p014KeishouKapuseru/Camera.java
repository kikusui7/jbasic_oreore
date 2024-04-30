package p014KeishouKapuseru;

public class Camera {
	
	//クラス設計図同士で「継承」
	
	//「名詞」
	
	private String maker;
	//！カプセル化の場合
	
	//コンストラクタ←｛目的｝
	
	//オーバーロード←多め
	public Camera() {
	}
	
	public Camera(String maker) {
		
		this.maker = maker;
		
	}
	
	
	//プライベートでも、「具」

	public String getMaker() {
		return maker;
	}

	public void setMaker(String maker) {
		this.maker = maker;
	}
	
	//「動詞」

	public void takePicture () {
		System.out.println("メーカー：" + maker);
		System.out.println("撮影中だにょ");

	}


}
