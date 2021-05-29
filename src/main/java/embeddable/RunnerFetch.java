package embeddable;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class RunnerFetch {

	public static void main(String[] args) {
		
		Students st=new Students();
		
		
		
		Configuration con=new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Students.class);
		
		SessionFactory sf=con.buildSessionFactory();
		
		Session session=sf.openSession();
		
		Transaction tr=session.beginTransaction();
		
		String hql="from Students";
		
		List<Object[]>  result=session.createQuery(hql).getResultList();
		
		for(Object[] w:result) {
			System.out.println(w);
		}
		
		
		tr.commit();
		
		session.close();
		
		sf.close();
		

	}

}
