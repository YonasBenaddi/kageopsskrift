public class opgave {
public static void main(String[] args){
    String name = "Jonas Jensen";
    String id = "abcd0001";
    int[] grades = {10, 7, 12, 4, 10};

    int total = 0;
    for (int grade : grades ) {
        total += grade;
    }
    double averageGrade = (double) total / grades.length;

    System.out.println("Name: " + name);
    System.out.println("ID: " + id);
    System.out.println("Average Grade: " + averageGrade);
}
}
