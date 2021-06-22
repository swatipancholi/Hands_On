package oneTooneUni;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class EmployeeClient {

	public static void main(String[] args) {
		SessionFactory sf=new Configuration().configure().buildSessionFactory();
		Session ses=sf.openSession();
		Transaction tx=ses.beginTransaction();
		/*Employee emp=new Employee("Sumit", 76000, new Address("Noida", "India", 110087));
		ses.save(emp);
		tx.commit();*/
		
		Employee e=ses.find(Employee.class, 3);
		ses.delete(e);
		tx.commit();
		System.out.println("Deleted....");
		/*System.out.println(e.getName()+"\t"+e.getSalary());
		ses.evict(e);
		System.out.println("===========Address Of Employee==============");
		System.out.println(e.getAddress().getCity()+"\t"+e.getAddress().getCountry()+"\t"+e.getAddress().getZip());
		ses.close();
		sf.close();
		System.out.println("Employee Created....");*/
	}

}
