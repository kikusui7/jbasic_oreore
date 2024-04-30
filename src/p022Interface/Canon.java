package p022Interface;

//抽象クラス

public interface Canon {
	
	//定数（「名詞」）と
	
	//public static final String COMPANY = "キヤノンキャノン";
	String COMPANY = "キヤノンキャノン";
	
	//抽象メソッド（「動詞」）のみ
	
	public abstract void work (); /*{
		
	}*/
	
	//抽象なので、「名詞」も「動詞」も必要ない
	
	void salary ();

	//↑二つのがあるだけ
	
}
