package p022Interface;

public class Kudo implements Canon {

	@Override
	public void work() {
		
		System.out.println(COMPANY);
		System.out.println("経理だにょ");
		
	}

	@Override
	public void salary() {
		System.out.println("777万");
	}

}
