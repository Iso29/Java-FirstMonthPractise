package main;

import util.InputUtil;
import util.MenuUtil;

public class Main {

	public static void main(String[] args) throws Exception {
		int menu =0;
		while(true) {
			menu = InputUtil.requireNumber("what do you want to do : "
					+ "\n 1.Register student"
					+ "\n 2.Show all sudents"
					+ "\n 3.Find student"
					+ "\n 4.Update student");
			MenuUtil.proccessMenu(menu);
		}
	}
		
		
}


