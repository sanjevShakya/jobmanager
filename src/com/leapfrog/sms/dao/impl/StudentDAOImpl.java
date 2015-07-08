/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.leapfrog.sms.dao.impl;

import com.leapfrog.sms.dao.StudentDAO;
import com.leapfrog.sms.entity.Student;
import java.util.List;

/**
 *
 * @author sanjeev
 */
public class StudentDAOImpl implements StudentDAO{
    
    private List<Student> studentList;
    
    public StudentDAOImpl(List<Student> studentList){
        this.studentList=studentList;
        
    }
    @Override
    public int insert(Student s) {
        studentList.add(s);
        return 1;
    }

    @Override
    public List<Student> getAll() {
        return studentList;
    }

    @Override
    public Student getByID(int id) {
        Student student=null;
        for(Student s: studentList)
        {
            if(s.getId()==id){
                student=s;
                break;
            }
        }
        return student;
    }
    
   
    
}
