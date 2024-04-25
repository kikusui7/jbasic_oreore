package kadai03;

import java.util.Scanner;

public class UserRegistration02otameshi {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		System.out.print("名前を入力してください：");
		String name = scan.next();
		
		if (hasNameError(name)) {
			
			
		// 名前にエラーが存在した場合mainメソッドを終了する
		scan.close();
		return;
		}
		
		System.out.print("年齢を入力してください：");
		int age = scan.nextInt();
		
		if (hasAgeError(age)) {
		// 年齢にエラーが存在した場合mainメソッドを終了する
		scan.close();
		return;
		}
		
		System.out.println("名前：" + name + "、年齢：" + age + "で登録しました。");
		scan.close();
		}
	
	static void hasNameError ( String name) {
	
	if (name.length() > 20) {
		System.out.println("名前は20文字以内で入力してください");
		return;
	}

	// 名前が「admin」に一致する場合エラー 
	if (name.equals("admin")) {
		System.out.println("利用できない名前です");
		return;
	}

	// 名前に禁止文字「㌔」が含まれている場合エラー 
	if (name.contains("㌔")) {
		System.out.println("名前に禁止文字が含まれています");
		return;
	}
	}

		// 名前エラーチェックメソッドを作りなさい
		// 年齢エラーチェックメソッドを作りなさい
}
