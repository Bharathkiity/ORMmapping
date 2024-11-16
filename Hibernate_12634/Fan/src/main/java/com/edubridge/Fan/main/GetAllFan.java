package com.edubridge.Fan.main;

import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.edubridge.Fan.Model.Fan;
import com.edubridge.Fan.utils.HibernateUtils;

public class GetAllFan {
    public static void main(String[] args) {
        int fanId = 1; // Example fan ID to fetch

        try (Session session = HibernateUtils.getSessionFactory().openSession()) {
            // Fetch the fan object by its ID
            Fan fan = session.get(Fan.class, fanId);

            if (fan != null) {
                // Print fan details (assuming appropriate getter methods)
              
                System.out.println("Fan Brand: " + fan.getBrand());
                System.out.println("Fan Speed: " + fan.getSpeed());
             
                System.out.println("Fan Price: " + fan.getPrice()); // If you have a price field, for example
            } else {
                System.out.println("No fan found with the provided ID.");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

	public static void getFan(Scanner scanner) {
		// TODO Auto-generated method stub
		
	}
}
