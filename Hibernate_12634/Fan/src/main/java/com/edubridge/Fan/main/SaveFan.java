package com.edubridge.Fan.main;

import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.edubridge.Fan.Model.Fan;
import com.edubridge.Fan.utils.HibernateUtils;

public class SaveFan {
    public static void main(String[] args) {
        Fan fan = new Fan();
        fan.setBrand("usha");
        fan.setPrice(2500.00);
        fan.setColor("balck");
        fan.setSpeed(12000);

        Session session = HibernateUtils.getSessionFactory().openSession();
        Transaction tx = session.beginTransaction();

        try {
            session.persist(fan); 
            tx.commit();
            System.out.println("New fan is added: ");
        } catch (Exception e) {
            tx.rollback();
            e.printStackTrace();
        } finally {
            session.close();
        }
    }

	public static void SaveFan(Scanner scanner) {
		// TODO Auto-generated method stub
		
	}
}
