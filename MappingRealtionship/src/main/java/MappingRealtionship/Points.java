package MappingRealtionship;
import javax.persistence.*;

@Entity
@Table (name = "PointTable")
public class Points {
	
	@Id
	private int credits;
	private int marks;
	
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "Student_id")
	Students student;
	
	public int getCredits() {
		return credits;
	}
	public void setCredits(int credits) {
		this.credits = credits;
	}
	public int getMarks() {
		return marks;
	}
	public void setMarks(int marks) {
		this.marks = marks;
	}
	public Points(int credits, int marks) {
		
		this.credits = credits;
		this.marks = marks;
	}
	public Students getStudent() {
		return student;
	}
	public void setStudent(Students student) {
		this.student = student;
	}
	
	
}
	
	
