package hibernate04;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity 
@Table(name="Students_dt")
public class Studentsdt04 {
	@Id
	private int id;
	
	private String name;
	
	private int grade;
	
	private String depermant;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getGrade() {
		return grade;
	}

	public void setGrade(int grade) {
		this.grade = grade;
	}

	public String getDepermant() {
		return depermant;
	}

	public void setDepermant(String depermant) {
		this.depermant = depermant;
	}

	@Override
	public String toString() {
		return "Studentsdt04 [id=" + id + ", name=" + name + ", grade=" + grade + ", depermant=" + depermant + "]";
	}
	
}
