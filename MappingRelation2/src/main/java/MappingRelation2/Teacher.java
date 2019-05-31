package MappingRelation2;
import javax.persistence.*;

@Entity
public class Teacher {

	@Id
	@Column(name = "ID")
	private String TeacherId;
	private String TeacherName;
	
	@OneToOne(mappedBy="teacher")
	private ClassRoom classroom;
	
	public Teacher(String teacherId, String teacherName, ClassRoom classroom) {
		super();
		TeacherId = teacherId;
		TeacherName = teacherName;
		this.classroom = classroom;
	}

	public Teacher() {}

	public Teacher(String teacherId, String teacherName) {
		super();
		TeacherId = teacherId;
		TeacherName = teacherName;
	}

	public String getTeacherId() {
		return TeacherId;
	}

	public void setTeacherId(String teacherId) {
		TeacherId = teacherId;
	}

	public String getTeacherName() {
		return TeacherName;
	}

	public void setTeacherName(String teacherName) {
		TeacherName = teacherName;
	}

	public ClassRoom getClassroom() {
		return classroom;
	}

	public void setClassroom(ClassRoom classroom) {
		this.classroom = classroom;
	}
}
