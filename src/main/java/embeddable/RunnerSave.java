package embeddable;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class RunnerSave {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Course course = new Course();
		course.setMandatary("math,it,bio");
		course.setOptional("english,pe");
		// course.setStudent(st);

		Course course1 = new Course();
		course1.setMandatary("it");
		course1.setOptional("turkish,france");

		Students st = new Students();

		st.setName("ali");
		st.setId(101);
		st.setGrade("a");
		st.setCourse(course);

		Students st1 = new Students();

		st1.setName("murat");
		st1.setId(102);
		st1.setGrade("a");
		st1.setCourse(course1);

		Configuration con = new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Students.class);

		SessionFactory sf = con.buildSessionFactory();

		Session session = sf.openSession();

		Transaction tr = session.beginTransaction();

		//session.save(st);
		session.save(st1);

		tr.commit();

		session.close();
		sf.close();

	}
}
