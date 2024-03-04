import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in) ;
        System.out.println("enter numbers of students");
        int n = input.nextInt();
        System.out.println("enter teacher name");
        String name = input.next();
        System.out.println("enter the week day");
        String day = input.next();
        Lab Az = new Lab( name , day , 20);

        double tmp = 0 ;
        int num = 0 ;
        student[] esm = new student[n] ;
        for (int i = 0; i < n ; i++) {
            System.out.println("please enter students information in this form:");
            System.out.println("<name> <familyname> <id> <grade>");
            String firstName = input.next();
            String lastName = input.next();
            String id = input.next();
            String grade = input.next();
            esm[i] = new student(firstName , lastName , id , grade) ;
            esm[i].PrintStudentInfo();

            if (Double.valueOf(grade) >= 0 && Double.valueOf(grade) <= 20) {
                tmp += Double.valueOf(grade);
                num ++ ;
            }
        }

        Az.printLab();
        System.out.println("average : " + tmp / num);

    }
}

