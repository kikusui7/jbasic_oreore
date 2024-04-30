package p011KeishouKapuseru.copy;

public class Camera {
	
	//クラス設計図同士で「継承」
	
	//コンストラクタ←｛目的｝
	
	public Camera(int a) {
		System.out.println("ここだ！の1");
		
		//"ここぐちゃぐちゃだにょう！"の上に"ここだ！"
		
	}
	
	//オーバーロード←多め
	public Camera() {
		System.out.println("ここだ！の1");
		
		
	}
	
	//「名詞」
	
	private String maker;
		
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
