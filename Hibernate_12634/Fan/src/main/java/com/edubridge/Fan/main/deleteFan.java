package com.edubridge.Fan.main;

import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.edubridge.Fan.Model.Fan;
import com.edubridge.Fan.utils.HibernateUtils;

public class deleteFan {
    public static void main(String[] args) {
        int fanId = 1; 
        Transaction tx = null;

        try (Session session = HibernateUtils.getSessionFactory().openSession()) {
            tx = session.beginTransaction();

           
            Fan fan = session.get(Fan.class, fanId);

            if (fan != null) {
               
                session.remove(fan); 

                tx.commit();
                System.out.println("Fan with ID " + fanId + " is deleted.");
            } else {
                System.out.println("No fan found with the provided ID.");
            }

        } catch (Exception e) {
            if (tx != null) {
                tx.rollback();
            }
            e.printStackTrace();
        }
    }

	
}
