/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tr.kasim.obs.panel;

import tr.kasim.obs.app.Application;
import tr.kasim.obs.config.Config;
import tr.kasim.obs.model.Score;
import tr.kasim.obs.util.GeneralUtil;

/**
 *
 * @author selman
 */
public class AskScoreScreen extends Screen{
    
    public AskScoreScreen(Application application) {
        super(application);
}

    @Override
    public void showMainScreen() {
        System.out.println("Number of created note is : " + Config.getScores().size());

        System.out.print("Enter Student Note: ");
        String ögName= GeneralUtil.readConsole();
        
    Score match = Config.getScores().stream().filter(s -> s.getScoreValue().equals(ögName)).findFirst().orElse(null);
    if(match != null){
        System.out.println(ögName+ " is found: ");
        
        System.out.println("Student Name: "+ match.getStudent());
        
        System.out.println("Lecture Name: "+ match.getLecture());
        
 
    }
    else {
        System.out.println("Score doesn't found.");
    }
        
        GeneralUtil.readConsole();
        getApplication().gotoMenu(0);
        










        
        
        
        
        
}
    
    @Override
    public void showFailScreen() {

    }

}