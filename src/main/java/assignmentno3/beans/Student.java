package assignmentno3.beans;

public class Student {
	private String seatNo;
	private String studentName;
	private int physics, chemistry, maths;
	private float percentage;
	private String grade;
	
	
	public Student() {
		super();
	}
	public Student(String seatNo, String studentName, int physics, int chemistry, int maths, float percentage,
			String grade) {
		super();
		this.seatNo = seatNo;
		this.studentName = studentName;
		this.physics = physics;
		this.chemistry = chemistry;
		this.maths = maths;
		this.percentage = percentage;
		this.grade = grade;
	}
	public String getSeatNo() {
		return seatNo;
	}
	public void setSeatNo(String seatNo) {
		this.seatNo = seatNo;
	}
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public int getPhysics() {
		return physics;
	}
	public void setPhysics(int physics) {
		this.physics = physics;
	}
	public int getChemistry() {
		return chemistry;
	}
	public void setChemistry(int chemistry) {
		this.chemistry = chemistry;
	}
	public int getMaths() {
		return maths;
	}
	public void setMaths(int maths) {
		this.maths = maths;
	}
	public float getPercentage() {
		return percentage;
	}
	public void setPercentage(float percentage) {
		this.percentage = percentage;
	}
	public String getGrade() {
		return grade;
	}
	public void setGrade(String grade) {
		this.grade = grade;
	}
}
