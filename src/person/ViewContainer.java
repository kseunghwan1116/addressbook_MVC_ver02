package person;

import person.view.View;

public class ViewContainer {
	public void run(View view) {
		System.out.println("-------------------------------------------------");
		view.display();
	}
}
