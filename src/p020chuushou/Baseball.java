package p020chuushou;

public class Baseball extends Controller {
	//オーバーライド（子優先）必須

	@Override //（「@から始まる」→アノテーション（注釈））「ちゃんとオーバーライドしてんの？」
	public void pushA() {

		System.out.println("打ったぁ");
	}

	@Override
	public void pushB() {

		System.out.println("投げたぁ");

	}

}
