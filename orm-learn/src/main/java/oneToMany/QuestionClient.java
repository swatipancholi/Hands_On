package oneToMany;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class QuestionClient {

	public static void main(String[] args) {
		SessionFactory sf=new Configuration().configure().buildSessionFactory();
		Session ses=sf.openSession();
		Transaction tx=ses.beginTransaction();
		List<Answer> li=new ArrayList<Answer>();
		li.add(new Answer("Spring is IOC"));
		li.add(new Answer("Spring is simple"));
		
		Question que=new Question("What is Spring?", "Saurabh Sharma", li);
		ses.save(que);
		tx.commit();
		ses.close();
		System.out.println("Ctreated...................");

	}

}
