package p008;

public class Startkiten {

	public static void main(String[] args) {
		
		Human h1 = new Human();
		Human h2;

		h1.setName("菊ちゃそ");
		h1.setAge(22);	
		
		h2 = h1;
		
		h2.setAge(-22);	

		//h.introduce();
		
		System.out.println("名前：" + h1.getName());
		System.out.println("年齢：" + h1.getAge());

		
	}

}
