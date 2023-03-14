package OPP;

import java.time.LocalDate;

public class person {
    private String name;
    private LocalDate dob;
    private String gender;
    private String phone;

    //CONSTRUCTORS
    person(){
        name = "nulll";
        dob = LocalDate.parse("1900-01-01");
        gender = "null";
        phone = "null";
    }
    person(String n, LocalDate d, String g, String p){
        name = n;
        dob = d;
        gender = g;
        phone = p;
    }
    //SETTERS
    public void setName(String n){
        name = n;




        
    }    
    public void setDob(String n){
        dob = LocalDate.parse(n);

    }    
    public void setGender(String n){
        gender = n;

    }    
    public void setPhone(String n){
        phone = n;

    }
    //GETTERS
    public String getName(){
        return name;
    }
    public LocalDate getDob(){
        return dob;
    }
    public String getGender(){
        return gender;
    }
    public String getPhone(){
        return phone;
    }










    
}
