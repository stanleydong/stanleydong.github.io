package Lession2; /**
 * Creation of Hiber01.
 * <p/>
 * Created by cdong
 * Created date 8/2/17 2:22 PM
 * <p/>
 * $Revision:  $ $Date:  $
 * $Log: ,v $
 */
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.AnnotationConfiguration;
import org.hibernate.cfg.Configuration;

public class StoreData {
  public static void main(String[] args) {
    Session session=new AnnotationConfiguration().configure().buildSessionFactory().openSession();
    Transaction t=session.beginTransaction();
    Lession2.Employee e1=new Lession2.Employee();
    e1.setId(1001);
    e1.setFirstName("Stanley");
    e1.setLastName("Dong");

    Lession2.Employee e2=new Lession2.Employee();
    e2.setId(1002);
    e2.setFirstName("Stanley");
    e2.setLastName("Dong");
    session.persist(e1);
    session.persist(e2);
    t.commit();//transaction is commited
    session.close();

    System.out.println("successfully saved");

  }
}