package src;

public class StudentSystem {
    public static void main(String[] args) {

        Teacher t1 = new Teacher("Ali", "555", "MAT");
        Teacher t2 = new Teacher("Gizem", "505", "FIZ");
        Teacher t3 = new Teacher("Rabia", "554", "TAR");

        Course matematik = new Course("Matematik", "101", "MAT");
        matematik.addTeacher(t1);

        Course fizik = new Course("Fizik", "101", "FIZ");
        fizik.addTeacher(t2);

        Course tarih = new Course("Tarih", "101", "TAR");
        tarih.addTeacher(t3);

        Student s1 = new Student("Ceren", "215", "4", matematik, fizik, tarih);
        s1.addBulkExamNote(100, 75, 55);
        s1.isPass();

        }

    }
