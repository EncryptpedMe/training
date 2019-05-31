package MappingRealtionship;
import javax.persistence.*;

@Entity
@Table (name = "StudentTable")
public class Students {
	
	@Id
	private int sid;
	private String name;
	private int age;
	
	public Students(int sid, String name, int age) {
		this.sid = sid;
		this.name = name;
		this.age = age;
	}

	public int getSid() {
		return sid;
	}

	public void setSid(int sid) {
		this.sid = sid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public Points getPoint() {
		return point;
	}

	public void setPoint(Points point) {
		this.point = point;
	}

	
	@OneToOne(mappedBy = "student")
	Points point;
	
	public Students() {}

}
	
	
