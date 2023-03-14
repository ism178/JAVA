package MagelightUniversity;
import java.time.LocalDate;
import java.time.Period;

public class person {
    private String name;
    private LocalDate bd;
    private String gender;
    private String phone;

    person(){
        name = "";
        bd = null;
        gender = "";
        phone = "";
    }


    person( String n, String b, String g, String p ){
        name = n;
        bd = parseBd(b);
        gender = g;
        phone = p;
    }
    
    private LocalDate parseBd(String bd) {
        int year = Integer.parseInt(bd.substring(0,4));
        int month = Integer.parseInt(bd.substring(5,7));
        int day = Integer.parseInt(bd.substring(8,10));
        return LocalDate.of(year, month, day);





    }

    public void setName(String n){
        name = n;
    }    
    public void setBd(String n){
        bd = parseBd(n);
    }    
    public void setGender(String n){
        gender = n;
    }    
    public void setPhone(String n){
        phone = n;
    }

    public String getName(){
        return name;
    }
    public LocalDate getBd(){
        return bd;
    }
    public String getGender(){
        return gender;
    }
    public String getPhone(){
        return phone;
    }
    public int getAge(){
        Period age = Period.between(bd, LocalDate.now());




        return age.getYears();
        
    }


    
}
