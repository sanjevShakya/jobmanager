/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.leapfrog.sms;

import com.leapfrog.sms.service.StudentService;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author sanjeev
 */
public class Program {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        StudentService studentService = new StudentService();
        
        
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        Screen screen = new Screen(reader,studentService);//same instance can be used so easily passed
        int option=0;
        while(true){
        
            screen.mainMenu();
            try{
                option=Integer.parseInt(reader.readLine());
                switch (option){
                    case 1:
                        screen.addMenu();
                        break;
                    case 2:
                        screen.showAllMenu();
                        break;
                    case 3:
                        screen.searchByIdMenu();
                        break;
                    case 4:
                        System.exit(0);

                }
            }catch(IOException ioe){
                
            }
        }
    }
}
