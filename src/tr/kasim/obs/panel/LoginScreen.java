/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tr.kasim.obs.panel;

import tr.kasim.obs.app.Application;
import tr.kasim.obs.model.User;
import tr.kasim.obs.util.GeneralUtil;

/**
 *
 * @author selman
 */
public class LoginScreen extends Screen {

    public LoginScreen(Application application) {
        super(application);
    }

    @Override
    public void showMainScreen() {
        System.out.println("Welcome to Student Information Screen");
        System.out.println("User Name : ");
        String userName = GeneralUtil.readConsole();
        
        System.out.println("Password : ");
        String password = GeneralUtil.readConsole();
        
        
        User user = new User(userName, password);
        getApplication().login(user);

    }

    @Override
    public void showFailScreen() {
        System.out.println("Sorry but username and password doesn't matched.");
    }

}
