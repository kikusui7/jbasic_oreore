package p012KeishouKapuseru;

public class Camera {
	
	//クラス設計図同士で「継承」
	
	//「名詞」
	
	protected String maker;
	//protected←「継承」
	
	//コンストラクタ←｛目的｝
	
	public Camera(int a) {
	}
	
	//オーバーロード←多め
	public Camera() {
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
