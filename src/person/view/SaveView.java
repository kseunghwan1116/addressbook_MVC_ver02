package person.view;

import person.R;

public class SaveView extends View {
	@Override
	public void display() {
		
		System.out.println("■■■■■■■■■■■■■■■■■■■■■ SAVE ■■■■■■■■■■■■■■■■■■■■■");
		System.out.print("SAVE파일명 >> ");
		R.fileName = sc.next();
	}
}
