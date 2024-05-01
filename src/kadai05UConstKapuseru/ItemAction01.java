package kadai05UConstKapuseru;

public class ItemAction01 {

	public static void main(String[] args) {
		
		//ボタン精製
		
		Item01 shop = new Item01();
		
		//

		shop.setName("絵本");
		shop.setPrice(1000);		
		
		//

		System.out.println("商品名：" + shop.getName());
		System.out.println("価格：" + shop.getPrice() + "円");
		
		//｛規｝ボタン.
		
		System.out.println("---");
		
		Item01 shop2 = new Item01 ("シャンプー", 222);
		
		//（）内で別物確定←「this」
		
		shop2.showInfo();
		
	}

}
