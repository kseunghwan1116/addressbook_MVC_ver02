package person.controller;

import java.io.IOException;

import person.R;
import person.ViewContainer;
import person.model.PersonDao;

public class PersonController {
	private ViewContainer vc = new ViewContainer();
	private PersonDao dao = new PersonDao();
	
	public void action() throws IOException, ClassNotFoundException {
		if(R.choice == 0) {
			vc.run(R.menu);
		}
		
		switch(R.choice) {
		case 1:
			vc.run(R.insert);
			dao.insert(R.personVo);
			dao.autoSave(R.fileName);
			break;
		case 2:
			vc.run(R.list);
			break;
		case 3:
			vc.run(R.search);
			R.personVo = dao.selectByName(R.personVo);
			vc.run(R.detail);
			break;
		case 4:
			vc.run(R.search);
			R.personVo = dao.selectByName(R.personVo);
			vc.run(R.edit);
			dao.update(R.personVo);
			dao.autoSave(R.fileName);
			break;
		case 5:
			vc.run(R.delete);
			dao.delete(R.personVo);
			dao.autoSave(R.fileName);
			break;
		case 6:
			vc.run(R.save);
			dao.save(R.fileName);
			break;
		case 7:
			vc.run(R.load);
			dao.load(R.fileName);
			break;
		case 8:
			System.out.println("종료 되었습니다.");
			return;
		default:
			System.out.println("잘못 입력하셨습니다.");
		}
		R.choice = 0;
		action();
	}
	
}
