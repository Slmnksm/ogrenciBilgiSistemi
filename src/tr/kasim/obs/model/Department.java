/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tr.kasim.obs.model;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author selman
 */
public class Department {

    String name;
    String address;

    List<Lecture> lectures = new ArrayList();
    List<Student> students = new ArrayList();

    public Department() {
    }

    
    public Department(String name, String address, List<Lecture> lectures, List<Student> students) {
        this.name = name;
        this.address = address;
        this.lectures = lectures;
        this.students = students;
    }

    public List<Lecture> getLectures() {
        return lectures;
    }

    public void setLectures(List<Lecture> lectures) {
        this.lectures = lectures;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

}
