package MagelightUniversity;

import java.util.ArrayList;

public class MagelightUniversity {
    public static void main(String[] args) {

		    ArrayList<person> person = new ArrayList<person>();

            person p1 = new person("Rachel","1993-05-12","F","801-555-1212");
            person.add(p1);
            person p2 = new person("Jose","2004-12-01","M","480-555-1212");
            person.add(p2);
            person p3 = new person("Prya","2001-02-27","F","385-555-1212");
            person.add(p3);
            person p4 = new person("Bob","1984-06-06","M","916-555-1212");
            person.add(p4);



        
            System.out.printf("%-15s %-15s %-15s %s %n", "NAME","AGE","GENDER","PHONE#");
            for (person p : person) {

                System.out.printf("%-15s %-15s %-15s %s %n",p.getName(),p.getAge(), p.getGender(), p.getPhone());
            }



    }
}
