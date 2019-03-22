import org.hibernate.tool.schema.internal.exec.ScriptTargetOutputToFile;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class MyJavaDB {

    public static void main(String[] args){

        System.out.println("it works");
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("test");

        EntityManager em = emf.createEntityManager();

        System.out.println("Result: " + em.createNativeQuery("select 1 +1").getSingleResult());

        em.close();

        emf.close();

    }
}
