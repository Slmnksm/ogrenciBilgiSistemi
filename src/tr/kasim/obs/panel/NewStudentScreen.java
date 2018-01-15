/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tr.kasim.obs.panel;


import tr.kasim.obs.app.Application;
import tr.kasim.obs.config.Config;
import tr.kasim.obs.model.Student;
import tr.kasim.obs.util.GeneralUtil;

/**
 *
 * @author selman
 */
public class NewStudentScreen extends Screen{
     
    public NewStudentScreen(Application application) {
        super(application);
    }
    
    @Override
    public void showMainScreen() {
        System.out.println("Welcome to New Student Screen");
        
        System.out.print("Student Name: ");
        String studentName = GeneralUtil.readConsole();
        System.out.print("Student Surname: ");
        String studentSurname = GeneralUtil.readConsole();
        System.out.print("Student Number: ");
        String studentNumber = GeneralUtil.readConsole(); 
        System.out.print("Student Address: ");
        String studentAddress = GeneralUtil.readConsole();
        System.out.print("Student Telephone: ");
        String studentTelephone = GeneralUtil.readConsole();

        Student student = new Student();
        
        student.setName(studentName);
        student.setSurname(studentSurname);
        student.setNumber(studentNumber);
        student.setAddress(studentAddress);
        student.setTelephone(studentTelephone);
        
        student.setDepartment(student);

        Config.getStudents().add(student);

        System.out.println("");
        System.out.println(student.getName() +" "+student.getSurname()+ " is added successfully.");
        GeneralUtil.readConsole();
        getApplication().gotoMenu(0);
        
        
    }

    @Override
    public void showFailScreen() {

    }
}



   

    
