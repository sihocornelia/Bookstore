package entity;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class JPAUtility {

    private static final EntityManagerFactory emFactory;
    static {
        emFactory = Persistence.createEntityManagerFactory("BookstoreDB");
    }
    public static EntityManager getEntityManager(){
        return emFactory.createEntityManager();
    }
    public static EntityManagerFactory getEntityManagerFactory(){
        return emFactory;
    }
    public static void close(){
        emFactory.close();
    }

}
