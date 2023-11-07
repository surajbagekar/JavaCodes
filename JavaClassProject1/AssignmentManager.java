package JavaClassProject1;
import java.time.LocalDate;
import java.util.Scanner;

class Student {
    String name;
    int prnno;

Student(String name, int prnno) {
    this.name = name;
    this.prnno = prnno;
    }

class Trainer {
     String name;
    }

class Assignment {

    private String title;
    private Date date;
    private String description;
    private String assignee;
    private Student std;
    private Trainer trainr;

Assignment(String title, String date, String description, String assignee, Student std, Trainer trainr) {
    this.title = title;
    this.date = date;
    this.description = description;
    this.assignee = assignee;
    this.std = std;
    this.trainr = trainr;
        }
void createAssignment() {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter a title: ");
        String title = sc.nextLine();
        
        LocalDate date = LocalDate.now();

        System.out.println("Enter a description: ");
        String des = sc.nextLine();

        System.out.println("Enter assignee: ");
        String assign = sc.nextLine();

        System.out.println("Title: " + trainr);
        
        }
    }

}

public class AssignmentManager {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        Assignment as = new Assignment();
        System.out.println("Enter the Choice: \n1. Create Assignment 2.Add Assignment to the Collection\n3.Show Assignment\n4. save Assignment to Dile\n5.Load Assignment to File\n6.Check Assignment on the Basis of Date ");
        int choice = sc.nextInt();

        switch (choice) {
            case 1:
                as.createAssignment();
                break;
            case 2:
                as.addAssignemnt();
                break;
            case 3:
                as.showAssignemnt();
                break
            case 4:
                as.showAssignemnt();
            case 5:
                as.loadAssignment();
                break;
            case 6:
                as.chkAssignment();
                break;
            case 0:
                System.exit(0);
            default:
                System.out.println("Enter the Valid Choice: ");
        }

    }

}
