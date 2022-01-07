package person.view;

import person.R;

public class DetailView extends View {
	@Override
	public void display() {
		System.out.println("■■■■■■■■■■■■■■■■■■■■■ INFO ■■■■■■■■■■■■■■■■■■■■■");
		if(R.personVo == null) {
			System.out.println("정보가 없습니다.");
		} else {
			print();
			System.out.println(R.personVo);			
		}
	}

}
