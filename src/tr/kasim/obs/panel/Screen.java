/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tr.kasim.obs.panel;

import tr.kasim.obs.app.Application;

/**
 *
 * @author selman
 */
public abstract class Screen {

    Application application;

    public Screen(Application application) {
        this.application = application;
    }

    public Application getApplication() {
        return application;
    }

    public abstract void showMainScreen();

    public abstract void showFailScreen();

}
