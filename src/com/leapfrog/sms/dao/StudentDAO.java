/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.leapfrog.sms.dao;

import com.leapfrog.sms.entity.Student;
import java.util.List;

/**
 *
 * @author sanjeev
 */
public interface StudentDAO {
   int insert(Student s);
   List<Student> getAll();
   Student getByID(int id);
    
}
