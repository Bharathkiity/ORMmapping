package com.edubridge.Fan.main;

import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.edubridge.Fan.Model.Fan;
import com.edubridge.Fan.utils.HibernateUtils;

public class UpdateFan {
    public static void main(String[] args) {
        int fanId = 1;
        Transaction tx = null;

        try (Session session = HibernateUtils.getSessionFactory().openSession()) {
            tx = session.beginTransaction();


            Fan fan = session.get(Fan.class, fanId);

            if (fan != null) {
                // Updating fan details
                fan.setBrand("CoolAir");  
                fan.setSpeed(3);        

               
                session.merge(fan);  
                tx.commit();

                System.out.println("Fan details updated successfully.");
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

	public static void UpdateFan(Scanner scanner) {
		// TODO Auto-generated method stub
		
	}
}
