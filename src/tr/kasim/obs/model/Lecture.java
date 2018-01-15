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
public class Lecture {

    String name;
    String code;
    String numberStudent;

    Department department;
    
    List<Score> scores = new ArrayList();

    public Lecture() {
    }

    public Lecture(String name, String code,Lecture lecture, List<Score> scores) {
        this.name = name;
        this.code = code;
        this.department = department;
        this.scores = scores;
    }

    
   
    
    public Department getDepartment() {
        return department;
    }

    public String getName() {
        return name;
    }

    public String getCode() {
        return code;
    }
    
    public String getNumberStudent(){
        return numberStudent;
    }
    
    public void setDepartment(Lecture lecture) {
        this.department = department;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCode(String code) {
        this.code = code;
    }   
    
    public void setNumberStudent(String numberStudent){
        this.numberStudent = numberStudent;
    }
    
}
