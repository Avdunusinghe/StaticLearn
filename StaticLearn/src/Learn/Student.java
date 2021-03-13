package Learn;

public class Student {

		private String ditino;
		private String name;
		private static String batchId;
		
	public Student(String dintno, String name) {
		
		this.ditino = dintno;
		this.name = name;
	}
	public static void setBatchId (String mbatchId) {
		
		batchId = mbatchId;
	}
	
	public void showDetails() {
		
		System.out.println("Student Id Number:" + this.ditino);
		System.out.println("Student Name:" + this.name);
		System.out.println("Student Batch Id :" + batchId);
	}
}
