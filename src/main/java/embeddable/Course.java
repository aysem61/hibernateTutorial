package embeddable;

import javax.persistence.Embeddable;
import javax.persistence.JoinColumn;

@Embeddable
public class Course {

	private String mandatary;
	private String optional;

	String getMandatary() {
		return mandatary;
	}

	void setMandatary(String mandatary) {
		this.mandatary = mandatary;
	}

	String getOptional() {
		return optional;
	}

	void setOptional(String optional) {
		this.optional = optional;
	}

}
