package p018Keishou.kabe;

public class Oku01 extends Human01 {
	
	//動詞
	void cook () {
		
		System.out.println("名前：" + name);
		System.out.println("年齢：" + age);
		System.out.println("料理中だーにょ");
		
	}
	
	protected void eat () {
		
//		super.eat();
		//スーパークラス指定
		
		System.out.println("うどにょ食うにょ");
	}
	
	//サブクラス（子）優先

}
