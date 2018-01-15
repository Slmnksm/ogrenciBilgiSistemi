/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tr.kasim.obs.panel;

import tr.kasim.obs.app.Application;
import tr.kasim.obs.config.Config;
//import tr.kasim.obs.model.Department;
import tr.kasim.obs.model.Lecture;
import tr.kasim.obs.util.GeneralUtil;

/**
 *
 * @author selman
 */
public class NewLectureScreen extends Screen {

    public NewLectureScreen(Application application) {
        super(application);
    }

    @Override
    public void showMainScreen() {
        System.out.println("Welcome to New Lecture Screen");
        //System.out.print("Departmant Name: ");
        //String departmentName = GeneralUtil.readConsole();
        //System.out.print("Departman Address: ");
        //String departmentAddress = GeneralUtil.readConsole();
        System.out.print("Lecture Name : ");
        String name = GeneralUtil.readConsole();
        System.out.print("Lecture Code : ");
        String code = GeneralUtil.readConsole();
        System.out.print("Student Capacity of Lecture: ");
        String studentNumber = GeneralUtil.readConsole();

        //Department department = new Department();
        //department.setName(departmentName);
        //department.setAddress(departmentAddress);

        Lecture lecture = new Lecture();
        lecture.setName(name);
        lecture.setCode(code);
        lecture.setNumberStudent(studentNumber);
        //lecture.setDepartment(lecture);

        Config.getLectures().add(lecture);

        System.out.println("");
        System.out.println(lecture.getName() + " is added successfully.");
        GeneralUtil.readConsole();
        getApplication().gotoMenu(0);
    }

    @Override
    public void showFailScreen() {

    }

}
