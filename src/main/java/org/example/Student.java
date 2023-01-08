package org.example;

public class Student {
    String name;
    int age;
    String sex;

    public static void main(String[] args) {
        Student s1 = new Student();
        Student s2 = new Student();
        Student s3 = new Student();

        s1.setDetails("priya S", 16, "female");
        s2.setDetails("Lavanya S", 70, "female");
        s3.setDetails("Jagan S", 9, "male");

        Student[] students = {s1, s2, s3};
        for (int i = 0; i < students.length; i++) {
            if (students[i].sex == "female" || students[i].age > 40) {
                printDetails(students[i]);
            }
        }
    }

    public void setDetails(String sname, int sage, String ssex) {
        // Student s=new Student();
        name = sname;
        age = sage;
        sex = ssex;
    }

    static String getStudentType(Student students) {
        if (students.age > 60) {
            return "senior";
        } else {
            return "regular";
        }
    }

    public static void printDetails(Student students) {
        String studentType = getStudentType(students);
        System.out.println(students.name + " is a " + studentType);
    }
}