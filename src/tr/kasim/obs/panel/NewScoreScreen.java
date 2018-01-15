/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tr.kasim.obs.panel;

import tr.kasim.obs.app.Application;
import tr.kasim.obs.config.Config;
import tr.kasim.obs.model.Lecture;
import tr.kasim.obs.model.Score;
import tr.kasim.obs.model.Student;
import tr.kasim.obs.util.GeneralUtil;

/**
 *
 * @author selman
 */
public class NewScoreScreen extends Screen{
    

    public NewScoreScreen(Application application) {
        super(application);
}

@Override
    public void showMainScreen() {
        
         System.out.println("Welcome to New Score Screen");
         
         
         System.out.print("Student : ");
         String student1 = GeneralUtil.readConsole();
         
         System.out.print("Lecture: ");
         String lecture1 = GeneralUtil.readConsole();
         
         System.out.print("Score: ");
         String note = GeneralUtil.readConsole();
         
         Score score = new Score();
         Student student = new Student();
         student.setName(student1);
         Lecture lecture = new Lecture();
         lecture.setName(lecture1);
         
         score.setStudent(student);
         score.setLecture(lecture);
         score.setScoreValue(note);
         
         Config.getScores().add(score);
         
         
        System.out.println("");
        System.out.println(score.getScoreValue()+ " is added successfully.");
        GeneralUtil.readConsole();
        getApplication().gotoMenu(0);
         
        
        
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    }


    @Override
    public void showFailScreen() {

    }


}