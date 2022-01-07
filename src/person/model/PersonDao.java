package person.model;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class PersonDao {
	private static final ArrayList<PersonVo> personArr = new ArrayList<PersonVo>();

	static {
		personArr.add(new PersonVo("김대표", "010-1111-1111", "kim@ceo.com"));
		personArr.add(new PersonVo("백대표", "010-2222-2222", "baek@ceo.com"));
		personArr.add(new PersonVo("박대표", "010-3333-3333", "bak@ceo.com"));
	}

	public ArrayList<PersonVo> selectAll() {
		ArrayList<PersonVo> nArr = new ArrayList<PersonVo>();
		for (int i = 0; i < personArr.size(); i++) {
			nArr.add(personArr.get(i));
		}
		return nArr;
	}

	public PersonVo selectByName(PersonVo vo) {
		for (PersonVo select : personArr) {
			if (vo.getName().equals(select.getName())) {
				return select;
			}
		}
		return null;
	}

	public void insert(PersonVo vo) {
		personArr.add(vo);
	}

	public void update(PersonVo vo) {
		if(vo == null) {
			return;
		}
		for (int i = 0; i < personArr.size(); i++) {
			PersonVo select = personArr.get(i);
			if (vo.getName().equals(select.getName())) {
				personArr.set(i, vo);
				return;
			}
		}		
	}

	public void delete(PersonVo vo) {
		for (int i = 0; i < personArr.size(); i++) {
			PersonVo select = personArr.get(i);
			if (vo.getName().equals(select.getName())) {
				personArr.remove(i);
				System.out.println("삭제되었습니다.");
				return;
			}
		}
		System.out.println(vo.getName() + "는 존재하지 않습니다.");
	}
	
	public void save(String name) throws IOException {
		File file = new File("save\\" + name + ".dat");
		FileOutputStream fis = new FileOutputStream(file);
		ObjectOutputStream oos = new ObjectOutputStream(fis);
		oos.writeObject(personArr);
		System.out.println("SAVE완료.");
	}
	
	public void load(String name) {
		try {
			File file = new File("save\\" + name + ".dat");
			FileInputStream fis = new FileInputStream(file);
			ObjectInputStream ois = new ObjectInputStream(fis);
			ArrayList<PersonVo> nArr = (ArrayList<PersonVo>)ois.readObject();
			personArr.clear();
			for(int i=0; i<nArr.size(); i++) { 
				personArr.add(i, nArr.get(i));
			}
			System.out.println("LOAD완료.");
		} catch (FileNotFoundException e) {
			System.out.println("파일을 찾을 수 없습니다.");
			return;
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public void autoSave(String name) throws IOException {
		File file = new File("save\\" + name + ".dat");
		FileOutputStream fis = new FileOutputStream(file);
		ObjectOutputStream oos = new ObjectOutputStream(fis);
		oos.writeObject(personArr);
		System.out.println("\n 。。。AUTO SAVE");
	}
}
