package util;

public class MenuUtil {
	public static void proccessMenu(int menu) throws Exception {
		switch(menu) {
		case 1 :
			StudentUtil.registerStudent();

			break;
		case 2 :
			StudentUtil.printAllStudent();

			break;
		case 3 :
			StudentUtil.findAndPrintStudent();

			break;
		case 4 :
			StudentUtil.updateStudentV3();

			break;
		default :
			System.out.println("invalid implementation !");
			System.exit(0);
		}
	}
	
	public static String requireName() {
		return InputUtil.requiretext("enter name :");
	}
	public static String requireSurname() {
		return InputUtil.requiretext("enter surname :");
	}
	public static int requireAge() {
		return InputUtil.requireNumber("enter age :");
	}
	public static String requireClass() {
		return InputUtil.requiretext("enter class name :");
	}
}
