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
public class MainScreen extends Screen {

    User user;

    public MainScreen(Application application) {
        super(application);
    }

    public void showWelcome() {
        System.out.println("HoşGeldin " + user.getUsername()+" !");
        showMainScreen();
    }

    @Override
    public void showMainScreen() {
        System.out.println("Menu : ");
        System.out.println("1)New Lecture");
        System.out.println("2)Ask Lecture");
        System.out.println("3)New Student");
        System.out.println("4)Ask Student");
        System.out.println("5)New Note");
        System.out.println("6)Ask Note");

        System.out.println("The part you wantted to go: ");
        String sayi = GeneralUtil.readConsole();
        getApplication().gotoMenu(GeneralUtil.toInt(sayi));
    }

    @Override
    public void showFailScreen() {
        System.out.println("The number which you entered is doesn't found at menu.");
        System.out.println("Please enter a number between 1-6.");
        showMainScreen();

    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

}
