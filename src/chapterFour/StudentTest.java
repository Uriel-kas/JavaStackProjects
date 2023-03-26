package chapterFour;

public class StudentTest {
    public static void main(String[] args) {
        Student account1 = new Student("John Green", 93.5);
        Student account2 = new Student("Adamu Yusuf", 48.9);
        Student account3 = new Student("Yomi Bankole", 89.5);

        System.out.printf("%s's Letter Grade is: %s%n", account1.getName(), account1.getLetterGrade());
        System.out.printf("%s's Letter Grade is: %s%n", account2.getName(), account2.getLetterGrade());
        System.out.printf("%s's Letter Grade is: %s%n", account3.getName(), account1.getLetterGrade());
    }
}
