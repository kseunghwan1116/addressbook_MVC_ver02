package person.view;

import person.R;
import person.model.PersonVo;

public class DeleteView extends View {
	@Override
	public void display() {
		System.out.println("■■■■■■■■■■■■■■■■■■■ DELETE ■■■■■■■■■■■■■■■■■■■");
		System.out.print("삭제하고 싶은 사람의 이름 입력 >>");
		String name = sc.next();
		R.personVo = new PersonVo(name,"","");
	}
}
