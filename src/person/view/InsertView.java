package person.view;

import person.R;
import person.model.PersonVo;

public class InsertView extends View{
	@Override
	public void display() {
		System.out.println("■■■■■■■■■■■■■■■■■■■■ INSERT ■■■■■■■■■■■■■■■■■■■■");
		System.out.print("이름 >>");
		String name = sc.next();
		System.out.print("전화번호 >>");
		String phoneNum = sc.next();
		System.out.print("이메일 >>");
		String email = sc.next();
		R.personVo = new PersonVo(name, phoneNum, email);
	}
}
