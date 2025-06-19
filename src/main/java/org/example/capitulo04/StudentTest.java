package org.example.capitulo04;

public class StudentTest {
    public static void main(String[] args) {
        Student account1 = new Student("Douglas", 84.5);
        Student account2 = new Student("Andressa", 95.0);
        Student account3 = new Student("Beto", 63.28);

        System.out.printf("%s's letter grade is: %s%n",
                account1.getName(), account1.getLetterGrade());
        System.out.printf("%s's letter grade is: %s%n",
                account2.getName(), account2.getLetterGrade());
        System.out.printf("%s's letter grade is: %s%n",
                account3.getName(), account3.getLetterGrade());

    }
}
