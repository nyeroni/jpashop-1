package jpabook.jpashop;

import jakarta.persistence.*;
import jpabook.jpashop.domain.Book;
import jpabook.jpashop.domain.Item;

public class JpaMain {

    public static void main(String [] args){
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("jpashop");

        EntityManager em = emf.createEntityManager();

        EntityTransaction tx = em.getTransaction();

        tx.begin();

        try{

            Book book = new Book();
            book.setAuthor("yerin");
            book.setIsbn("1123");
            book.setName("babo");
            book.setPrice(12212);
            book.setStockQuantity(32);

            em.persist(book);

            tx.commit();

        }catch (Exception e){
            tx.rollback();
        }finally {
            em.close();
        }
        emf.close();
    }
}
