/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author GOI
 */
public class Users {
    private int id, 	age;
    private String regNum, Name, dob, nationality, date_on_entry, class_on_entry,state,	gender, date_on_leaving,last_class_completed;
    public Users(int id, int age, String regNum, String Name, String dob, String nationality, String date_on_entry, String class_on_entry, String state, String gender, String date_on_leaving, String last_class_completed){
        this.id=id;
        this.age=age;
        this.regNum=regNum;
        this.Name=Name;
        this.dob=dob;
        this.nationality=nationality;
        this.date_on_entry=date_on_entry;
        this.class_on_entry=class_on_entry;
        this.state=state;
        this.gender=gender;
        this.date_on_leaving=date_on_leaving;
        this.last_class_completed=last_class_completed;
    }
    public int getid(){
        return id;
    }
     public int getage(){
        return age;
    }
    
     public String getregNum(){
         return regNum;
     }
     
     public String getName(){
         return Name;
     }
     public String getdob(){
         return dob;
     }
     public String getnationality(){
         return nationality;
     }public String getdate_on_entry(){
         return date_on_entry;
     }
     public String getclass_on_entry(){
         return class_on_entry;
     }
     public String getstate(){
         return state;
     }
     public String getgender(){
         return gender;
     }public String getdate_on_leaving(){
         return date_on_leaving;
     }
     public String getlast_class_completed(){
         return last_class_completed;
     }     
     
}
