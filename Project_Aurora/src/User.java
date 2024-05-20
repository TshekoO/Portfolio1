/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Admin
 */
public class User {

    private int id;
    private String firstName;
    private String Question_1;
    private String Question_2;
    private String Question_3;
  
    
    public User(int ID, String FirstName, String Q1, 
            String Q2, String Q3){
        
        this.id = ID;
        this.firstName = FirstName;
        this.Question_1 = Q1;
        this.Question_2 = Q2;
        this.Question_3 = Q3;
     
        
    }
    
    public void setId(int id){
        this.id = id;    
    }
    
    public int getid(){
        return id;
    }
    
    public void setFirstName(String name){
        this.firstName = name;
    }
    
    public String getFirstName(){
        return firstName;
    }
    
    public void setQuestion1(String Q1){
        this.Question_1 = Q1;
    }
    
    public String getQ1(){
        return Question_1;
    }
    
    public void setQuestion2(String Q2){
        this.Question_2 = Q2;
    }
    
     public String getQ2(){
        return Question_2;
    }
     
     public void setQuestion3(String Q3){
        this.Question_3 = Q3;
    }
     
     public String getQ3(){
        return Question_3;
    }
     
   
}
