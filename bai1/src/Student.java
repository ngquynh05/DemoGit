import java.util.Calendar;

public class Student {
    public String name;
    public String code;
    public int birthday;
    public int age;


    public Student() {


    }

/*
    public Student(String name, String code, int birthday) {
        this.name = name;
        this.code = code;
        this.birthday = birthday;
    }
*/
    //setter


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public void setCode() {
        this.code = "000";
    }
    public int getBirthday() {
        return birthday;
    }

    public void setBirthday(int birthday) {
        this.birthday = birthday;
    }

    public int Age(){
        Calendar now = Calendar.getInstance();
        return now.get(Calendar.YEAR) - this.getBirthday();
    }

    public void showInfor(){
        System.out.println("name:"+this.getName());
        System.out.println("code:"+this.getCode());
        System.out.println("birthday:"+this.getBirthday());
        System.out.println("age:"+this.Age());
    }

}
