package departments;
import visitors.*;

public class Comm  implements Dept1 {

	private int student;
	private int worker;
	public Comm(int student, int worker) {
		this.student = student;
		this.worker = worker;
	}
	  
	public int getstudent() {
		return student;
	}
	public void setstudent(int student) {
		this.student = student;
	}
	  
	public int getworker() {
		return worker;
	}
	public void setworker(int worker) {
		this.worker = worker;
	}
	  
	public int accept(Departmentvisitor DInspector) {
		return DInspector.visit(this);
	}
}