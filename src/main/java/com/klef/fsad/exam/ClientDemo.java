package com.klef.fsad.exam;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class ClientDemo 
{
    public static void main(String[] args) 
    {
        Configuration cfg = new Configuration();
        cfg.configure("hibernate.cfg.xml");

        SessionFactory sf = cfg.buildSessionFactory();
        Session session = sf.openSession();

        Transaction tx = session.beginTransaction();

        // Insert Record
        Library lib = new Library();
        lib.setName("Central Library");
        lib.setDescription("Books and Journals");
        lib.setDate("2026-03-12");
        lib.setStatus("Open");

        session.save(lib);

        // Delete record based on ID
        Library l = session.get(Library.class,1);
        session.delete(l);

        tx.commit();

        session.close();
        sf.close();
    }
}