package p031;

public class Oku implements Canon {

	@Override
	public void work() {
		
		System.out.println(Canon.COMPANY);
		System.out.println("SEだにょ");
	}

	@Override
	public void salary() {
		
		System.out.println("300万");
	}

}
