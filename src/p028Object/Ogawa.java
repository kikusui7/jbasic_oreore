package p028Object;

public class Ogawa {
	
	int data;
	
	//家建築
	
	Ogawa (int data){
		this.data = data;
	}
	
	public boolean equals(Object obj) {
		
		//オーバーライド
		
		Ogawa o = (Ogawa)obj;
		
		if (this.data == o.data) {
			return true;
		}
		return false;
	}

}
