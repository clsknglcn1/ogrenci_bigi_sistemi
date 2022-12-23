public class Main {

    public static void main(String[] args) {
        Course mat = new Course("Matematik", "100", "MAT");
        Course fizik = new Course("Fizik", "101", "FZK");
        Course kimya = new Course("Kimya", "102", "KMY");

        Teacher t1 = new Teacher("hayri ", "90550000000", "MAT");
        Teacher t2 = new Teacher(" Ayşe", "90550000001", "FZK");
        Teacher t3 = new Teacher("Ali ", "90550000002", "KMY");

        mat.addTeacher(t1);
        fizik.addTeacher(t2);
        kimya.addTeacher(t3);

        Student s1 = new Student("İnek Şaban", 4, "140144015", mat, fizik, kimya);
        s1.addBulkExamNote(100,60,80);
        s1.isPass();

        Student s2 = new Student("Güdük Necmi", 4, "2211133", mat, fizik, kimya);
        s2.addBulkExamNote(19,69,66);
        s2.isPass();

        Student s3 = new Student("Hayta İsmail", 4, "221121312", mat, fizik, kimya);
        s3.addBulkExamNote(70,90,60);
        s3.isPass();


    }

}