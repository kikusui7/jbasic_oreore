package p034Enum;

public enum Canon {
	
	OKU(1,"奥"),
	KUDO(2,"工藤"),
	ENDO(3,"遠藤");
	//定数
	//共通の「具」→じゃんけん
	
	private int id;
	private String name;
	
	Canon(int id, String name){
		
		this.id = id;
		this.name = name;
		
	}
	//コンストラクタとの紐付け必要

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	

}
