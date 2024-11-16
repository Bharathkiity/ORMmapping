package com.edubridge.one2many;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.edubridge.one2many.model.Address;
import com.edubridge.one2many.model.Employee;
import com.edubridge.one2many.utils.HibernateUtils;

public class SaveEmployeeWithAddress {
    public static void main(String[] args) {

        Address address1 = new Address();
        address1.setEmployeeTemporaryAddress("a");
        address1.setEmployeePermanentAddress("b");
        address1.setEmployeeLocalAddress("c");

        Address address2 = new Address();
        address2.setEmployeeTemporaryAddress("d");
        address2.setEmployeePermanentAddress("e");
        address2.setEmployeeLocalAddress("f");

        
        Employee employee = new Employee();
        employee.setEmployeeName("bharath");
        employee.setEmployeeEmail("hyd");
        
        List<Address>addresslist=new ArrayList<>();
        
        addresslist.add(address1);
        addresslist.add(address2);
        
       

        Transaction tx = null;

        try (Session session = HibernateUtils.getSessionFactory().openSession()) {
            tx = session.beginTransaction(); 
            session.persist(employee);       
            tx.commit();                     
            System.out.println("New employee and addresses added!");
            System.out.println("================================");
        } catch (Exception e) {
            if (tx != null) {               
                tx.rollback();             
            }
            e.printStackTrace();            
        }
    }
}
