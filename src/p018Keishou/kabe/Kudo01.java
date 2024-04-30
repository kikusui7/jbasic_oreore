package p018Keishou.kabe;

public class Kudo01 extends Human01 {
	
	//動詞
	void listen () {
		
		System.out.println("名前：" + name);
		System.out.println("年齢：" + age);
		System.out.println("音楽聴いてるーにょ");
		
	}
	
	public void eat () {
		
//		super.eat();
		//スーパークラス指定
		
		System.out.println("ラーメン食うにょ");
	}
	
	//サブクラス（子）優先

}
