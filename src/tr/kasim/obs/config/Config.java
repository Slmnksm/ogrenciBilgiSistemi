/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tr.kasim.obs.config;

import java.util.Map; 
import tr.kasim.obs.model.Lecture;
import tr.kasim.obs.model.Student;
import tr.kasim.obs.model.User;
import java.util.*; // 4 arraylist + list
import tr.kasim.obs.model.Score;

/**
 *
 * @author selman
 */
public class Config {

    final static List<User> allowedUsers = new ArrayList();
    final static Map<String, User> allowedUserMapByUserName = new HashMap<String, User>();
    final static Map<String, User> allowedUserMapByPassword = new HashMap<String, User>();
    
    


    final static List<Lecture> lectures = new ArrayList();
    final static List<Student> students = new ArrayList();
    final static List<Score> scores = new ArrayList();

    static {
        allowedUsers.add(new User("volkan-teacher", "volkan123"));
        allowedUsers.add(new User("selman-student", "selman123"));
        
        allowedUsers.stream().forEach((user) -> {
            allowedUserMapByUserName.put(user.getUsername(), user );
            allowedUserMapByPassword.put(user.getPassword(), user );
        });
    }

    public static User getUserByUserName(String userName) {
        return allowedUserMapByUserName.get(userName);
    }
    
    public static User getUserByPassword(String password){
        return allowedUserMapByPassword.get(password);
    }

    public static List<Lecture> getLectures() {
        return lectures;
    }

    public static List<Student> getStudents() {
        
        return students;
    }
    
    public static List<Score> getScores(){
        
        return scores;
    }

}