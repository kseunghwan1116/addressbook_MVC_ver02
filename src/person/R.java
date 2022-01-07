package person;

import java.util.ArrayList;

import person.controller.PersonController;
import person.model.PersonVo;
import person.view.DeleteView;
import person.view.DetailView;
import person.view.EditView;
import person.view.InsertView;
import person.view.ListView;
import person.view.LoadView;
import person.view.MenuView;
import person.view.SaveView;
import person.view.SearchView;
import person.view.View;


public class R {
	public static int choice;
	public static PersonVo personVo;
	public static ArrayList<PersonVo> personArr;
	public static String fileName = "default";
	
	public static final View menu = new MenuView();
	public static final View insert = new InsertView();
	public static final View list = new ListView();
	public static final View search = new SearchView();
	public static final View detail = new DetailView();
	public static final View edit = new EditView();
	public static final View delete = new DeleteView();
	public static final View save = new SaveView();
	public static final View load = new LoadView();
	
	public static final PersonController controller = new PersonController();
}
