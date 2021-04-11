import java.util.*;

class DOB{
    int day;
    int month;
    int year;

    DOB(int day,int month,int year){
        this.day = day;
        this.month=month;
        this.year=year;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    @Override
    public String toString(){
        String x = this.day+"/"+this.month+"/"+this.year;
        return x;
    }

    @Override
    public int hashCode() {
        // final int prime = 31;
        int result = 1;
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        DOB other = (DOB) obj;
        if (day == other.day && month == other.month)
            return false;
        return true;
    }
}

class EmpName{
    String Name;
    EmpName(String Name){
        this.Name=Name;
    }
    public String getName() {
        return Name;
    }
    public void setName(String name) {
        Name = name;
    }

    @Override
    public String toString(){
        return getName();
    }
    
}
public class Collection4 {

    public static void main(String[] args) {
        DOB b = new DOB(1,1,3);
        EmpName e = new EmpName("kunal");
        
        HashMap<DOB,EmpName> map = new HashMap<DOB,EmpName>();
        map.put(b, e);
        map.put(new DOB(3,2,1),new EmpName("a"));
        map.put(new DOB(3,2,2),new EmpName("b"));
        for(Map.Entry<DOB,EmpName> m:map.entrySet()){
            DOB dob = m.getKey();

            System.out.println("Unique Employee DOB: " + dob.toString());
        }       
    }