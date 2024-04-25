package kadai03;

import java.util.Scanner;

public class UserRegistration01otameshi {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.print("名前を入力してください：");
		String name = scan.next();

		if (name.length() > 20) {
			System.out.println("名前は20文字以内で入力してください");
			return;
			
		} else if (name.equals("admin")) {
		// 名前が20文字より大きい場合エラー

		System.out.println("利用できない名前です");
		return;
		
		}
		// 名前が「admin」に一致する場合エラー

		System.out.println("名前に禁止文字が含まれています");
		// 名前に禁止文字「㌔」が含まれている場合エラー

		System.out.print("年齢を入力してください：");
		int age = scan.nextInt();

		System.out.println("年齢は0以上130以下で入力してください");
		// 年齢が0未満、または、130より大きい場合エラー

		System.out.println("名前：" + name + "、年齢：" + age + "で登録しました。");
		scan.close();
	}
}
