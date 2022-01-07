package person.view;

import person.R;
import person.model.PersonVo;

public class SearchView extends View {
	@Override
	public void display() {
		System.out.println("■■■■■■■■■■■■■■■■■■■■ SEARCH ■■■■■■■■■■■■■■■■■■■■");
			System.out.print("이름 >>");
			String name = sc.next();
			R.personVo = new PersonVo(name,"","");
			System.out.println("검색완료!");
			return;
	}
}
