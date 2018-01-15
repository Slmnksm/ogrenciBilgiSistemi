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
public class AskStudentScreen extends Screen {
    
    public AskStudentScreen(Application application) {
        super(application);
    }

    
   @Override
    public void showMainScreen() {
        System.out.println("Number of created student is : " + Config.getStudents().size());
        

        System.out.print("Enter Student Number: ");
        String ögNo= GeneralUtil.readConsole();
        
    Student match = Config.getStudents().stream().filter(s -> s.getNumber().equals(ögNo)).findFirst().orElse(null);
    if(match != null){
        System.out.println(ögNo+ " is found: ");
        System.out.println("Student Name: "+ match.getName());
        
        System.out.println("Student Surname: "+ match.getSurname());
        
        System.out.println("Student Address: "+ match.getAddress());
        
        System.out.println("Student Telephone: "+ match.getTelephone());
    }
    else {
        System.out.println("Student doesn't found.");
    }
        
        GeneralUtil.readConsole();
        getApplication().gotoMenu(0);

}
    
    
    @Override
    public void showFailScreen() {

    }



}