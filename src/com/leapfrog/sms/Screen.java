/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.leapfrog.sms;

import com.leapfrog.sms.entity.Student;
import com.leapfrog.sms.service.StudentService;
import java.io.BufferedReader;
import java.io.IOException;

/**
 *
 * @author sanjeev
 */
public class Screen {
    
    //This is encapsulation
    private BufferedReader reader;
    private StudentService studentService;
    public Screen(BufferedReader reader,StudentService studentService)
    {
        this.reader= reader;
        this.studentService=studentService;
        
       
    }
    
    public void mainMenu(){
        System.out.println("====================================================");
        System.out.println("      Welcome to Student Management System          ");
        System.out.println("====================================================");
        System.out.println("1.      Add Student");
        System.out.println("2.      Show All Student");
        System.out.println("3.      Search by ID");
        System.out.println("4.      Exit");
        System.out.println("Enter your choice from 1 to 4");
    }
    
    public void addMenu() throws IOException
    {
        
        String choice="y";
        while(choice.equalsIgnoreCase("y")){
            Student student = new Student();
            System.out.println("Add Student");
            System.out.println("Enter Student ID:");
            student.setId(Integer.parseInt(reader.readLine()));
            System.out.println("Enter First name :");
            student.setFname(reader.readLine());
            System.out.println("Enter Last name:");
            student.setLname(reader.readLine());
            System.out.println("Enter Email:");
            student.setEmail(reader.readLine());
            System.out.println("Enter Contact no.");
            student.setContactNo(reader.readLine());
            System.out.println("Enter status");
            student.setStatus(Boolean.parseBoolean(reader.readLine()));
            
            studentService.insert(student);
            
            System.out.println("Do you want to add more y/n");
            choice = reader.readLine();
            
            
        }
        
    }
    
     public void searchByIdMenu() throws IOException
    {
        
        String choice="y";
        
                while(choice.equalsIgnoreCase("y")){
           System.out.println("enter Student id to search");
           Student student=studentService.getByID(Integer.parseInt(reader.readLine()));
           if(student!=null){
               System.out.println(student.toString());
           }
           else
           {
               System.out.println("404 error");
           }
            
            System.out.println("Do you want to search more");
            choice = reader.readLine();
            
            
        }
        
    }
    public void showAllMenu(){
        System.out.println("Listing all students");
        
        for(Student s: studentService.getAll())
        {
            System.out.println(s.toString());
        }
    }
}
