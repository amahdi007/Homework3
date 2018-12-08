package abstraction;

public class TestSchool {

	public static void main(String[] args) {
	School school = new HighSchool();
	school.start();
	school.finish();
	
	HighSchool freshman = new HighSchool();
	freshman.lunch();
	freshman.start();
	}

}
 

