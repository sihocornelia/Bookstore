package entity;

import org.junit.Test;

import javax.persistence.EntityManager;

import static org.hibernate.testing.transaction.TransactionUtil.*;

public class IntegrationsTests{

        @Test
    public void test() {

            Book persistedBook = doInJPA(JPAUtility::getEntityManagerFactory, entityManager -> {
                                            Book book = new Book();
                                            book.setIsbn("123ax");
                                            book.setName("Book1");
                                            entityManager.persist(book);
                                            return book;
                                        });

    }
}
