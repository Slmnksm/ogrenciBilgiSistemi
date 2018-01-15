/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tr.kasim.obs.model;

import java.util.*;// 4 arraylist+list
/**
 *
 * @author selman
 */
public class Student {

    String number;
    String name;
    String surname;
    String address;
    String telephone;

    List<Score> scores = new ArrayList();
    Department department;

    public Student() {
    }

    public Student(String number, String name, String surname, String address, String telephone, Department department) {
        this.number = number;
        this.name = name;
        this.surname = surname;
        this.address = address;
        this.telephone = telephone;
        this.department = department;
    }

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Student student) {
        this.department = department;
    }

    public List<Score> getScores() {
        return scores;
    }

    public void setScores(List<Score> scores) {
        this.scores = scores;
    }

    /**
     *
     * @return
     */
    public String getNumber() {
        return number;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getAddress() {
        return address;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

}
