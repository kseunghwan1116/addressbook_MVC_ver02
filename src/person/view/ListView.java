package person.view;

import person.R;
import person.model.PersonDao;
import person.model.PersonVo;

public class ListView extends MenuView {
	@Override
	public void display() {
		System.out.println("■■■■■■■■■■■■■■■■■■■■■ LIST ■■■■■■■■■■■■■■■■■■■■■");
		PersonDao dao = new PersonDao();
		R.personArr = dao.selectAll();
		print();
		for(PersonVo person : R.personArr) {
			System.out.println(person);
		}
	}

}
