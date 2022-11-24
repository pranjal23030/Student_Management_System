import model.Classes;
import model.Marks;
import model.Students;

public class Main {
    public static void main(String[] args) {

        Students student_1 = new Students("Ram", 11, 17);
        Students student_2 = new Students("Sabin", 12, 18);
        Students student_3 = new Students("Dip", 11, 16);

        Marks stu_1 = new Marks("Pranjal", 54, 67, 70);
        Marks stu_2 = new Marks("Ram", 56,69, 45);
        Marks stu_3 = new Marks("Harimaya", 71, 38, 67);

        Classes class_1 = new Classes("Lobutche", 11, "Ishan");
        Classes class_2 = new Classes("d5", 11, "Sabin" );
        Classes class_3 = new Classes("5B", 12, "Rijju");

        student_1.getFormat();
        stu_2.getPercentage(100);
    }
}