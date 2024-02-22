public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        System.out.println("OOP");
        Student studentOne= new Student();
        Teacher teacherOne= new Teacher();

        studentOne.setBirthday(2000);
        //studentOne.setCode("A001");
        studentOne.setCode();
        studentOne.setName("John");
        studentOne.Age();
        studentOne.showInfor();
//        studentOne.toString();

    }
}


