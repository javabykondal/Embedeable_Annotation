package org.example;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class Main {
    public static void main(String[] args) {
        Transaction tx=null;
        try{
            SessionFactory sessionFactory=HibernateUtil.getHibernateUtil();
            Session session=sessionFactory.openSession();
            tx=session.beginTransaction();
            Adress adress=new Adress("nar","Ap",523271);
            Customer customer=new Customer("KONDAL","KONDAL309@gmail.com",77766,adress);
            session.save(customer);
            tx.commit();
            session.close();

        }catch (Exception ex)
        { tx.rollback();
            ex.printStackTrace();
        }
        System.out.println("Hello world!");
    }
}