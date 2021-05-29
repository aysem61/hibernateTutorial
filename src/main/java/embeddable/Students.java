package embeddable;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Students_all")
public class Students {
	@Id
	private int id;
	private String name;
	private String grade;
	private Course course;

	int getId() {
		return id;
	}

	void setId(int id) {
		this.id = id;
	}

	String getName() {
		return name;
	}

	void setName(String name) {
		this.name = name;
	}

	String getGrade() {
		return grade;
	}

	void setGrade(String grade) {
		this.grade = grade;
	}

	@Override
	public String toString() {
		return "Students [id=" + id + ", name=" + name + ", grade=" + grade + ", course=" + course + "]";
	}

	Course getCourse() {
		return course;
	}

	void setCourse(Course course) {
		this.course = course;
	}

}