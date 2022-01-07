package person.view;

import person.R;

public class LoadView extends View {
	@Override
	public void display() {
		System.out.println("■■■■■■■■■■■■■■■■■■■■■ LOAD ■■■■■■■■■■■■■■■■■■■■■");
		System.out.print("LOAD파일명 >> ");
		R.fileName = sc.next();
	}
}
