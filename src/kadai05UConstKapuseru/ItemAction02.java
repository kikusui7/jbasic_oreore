package kadai05UConstKapuseru;

public class ItemAction02 {

	public static void main(String[] args) {
		
		//ボタン精製
		
		//「具」

		//Item01[] items = new Item01[3];
		
		Item01[] items = {
				
				new Item01("ロボット掃除機", 50000),
				new Item01("空気清浄機", 20000),
				new Item01("扇風機", 4000)
		};
		
					// = new Item01 ("シャンプー", 222);
					//と全く同じ型
		
/*		items[0] = new Item01("ロボット掃除機", 50000);
		items[1] = new Item01("空気清浄機", 20000);
		items[2] = new Item01("扇風機", 4000);
*/		
		//items[0] = "ロボット掃除機", 50000;
		
		//items.setName("ロボット掃除機");
		
		//「具」
		
		/*for (int i = 0 ; i < items.length ; i++) {
			
			items.showInfo();
			
			//別で
			
			System.out.println("---");
		}*/
		
		for (Item01 hairetsu : items) {
			
			//｛規｝同じようにボタン？
			
			hairetsu.showInfo();
			System.out.println("---");
		}
		
		
		//①for ( : items)
		

		/*Item01 shop2 = new Item01 ("シャンプー", 222);
		
		shop2.showInfo();*/
		
	}

}
