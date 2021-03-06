package MappingRelation2;

import javax.persistence.*;
@Entity
@Table(name = "Class")
public class ClassRoom {
	@Id
	private String classid;
	private int count;
	
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "TEACHER_ID")
	private Teacher teacher;

	public Teacher getTeacher() {
		return teacher;
	}

	public void setTeacher(Teacher teacher) {
		this.teacher = teacher;
	}

	public String getClassid() {
		return classid;
	}

	public void setClassid(String classid) {
		this.classid = classid;
	}

	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}

	public ClassRoom(String classid, int count,Teacher teacher) {
		super();
		this.classid = classid;
		this.count = count;
		this.teacher=teacher;
	}
	
	public ClassRoom() {}
	
}
