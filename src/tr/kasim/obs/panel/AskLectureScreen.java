/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tr.kasim.obs.panel;

import java.util.List;
import tr.kasim.obs.app.Application;
import tr.kasim.obs.config.Config;
import tr.kasim.obs.model.Department;
import tr.kasim.obs.model.Lecture;
import tr.kasim.obs.util.GeneralUtil;

/**
 *
 * @author selman
 */
public class AskLectureScreen extends Screen{

    
     
    public AskLectureScreen(Application application) {
        super(application);
    }
    
         @Override
    public void showMainScreen() {
        
       System.out.println("Number of created lecture is : " + Config.getLectures().size());
        
        System.out.print("Enter name of searced lecture: ");
        String name = GeneralUtil.readConsole();
        
       
        
        
    Lecture match = Config.getLectures().stream().filter(s -> s.getName().equals(name)).findFirst().orElse(null);
    
    if(match != null){
        System.out.println(name+ " is found: ");
       
        System.out.println("Lecture Code: "+ match.getCode());
        System.out.println("Capacity of Student: "+ match.getNumberStudent());

    }
    
    else {
        System.out.println("Lecture doesn't found.");
    }
      
        GeneralUtil.readConsole();
        getApplication().gotoMenu(0);

    } 
    
     @Override
    public void showFailScreen() {

    }

}