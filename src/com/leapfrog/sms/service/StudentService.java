/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.leapfrog.sms.service;

import com.leapfrog.sms.dao.StudentDAO;
import com.leapfrog.sms.dao.impl.StudentDAOImpl;
import com.leapfrog.sms.entity.Student;
import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

/**
 *
 * @author sanjeev
 */
public class StudentService {
    private StudentDAO studentDAO;
    
    public StudentService(){
        studentDAO= new StudentDAOImpl(new Vector<Student>());
        
    }
    public int insert (Student s){
        studentDAO.insert(s);
        return 1;
    }
    public List<Student> getAll(){
        return studentDAO.getAll();
    }
    public Student getByID(int id)
    {
        return studentDAO.getByID(id);
    }
}
