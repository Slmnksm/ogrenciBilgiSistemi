/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tr.kasim.obs.model;
/**
 *
 * @author selman
 */
public class Score {

    Student student;
    Lecture lecture;
    String scoreValue;
    

    public Score(Student student, Lecture lecture, String scoreValue) {
        this.student = student;
        this.lecture = lecture;
        this.scoreValue = scoreValue;
    }
    
    public Score() {
    
}
   

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    public void setLecture(Lecture lecture) {
        this.lecture = lecture;
    }

    public void setScoreValue(String scoreValue) {
        this.scoreValue = scoreValue;
    }

    public Lecture getLecture() {
        return lecture;
    }

    public String getScoreValue() {
        return scoreValue;
    }

   


   

}
