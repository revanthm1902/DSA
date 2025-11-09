
import java.util.*;

class Student {

    String name;
    double gpa;
    int age;
    String major;

    Student(String name, double gpa, int age, String major) {
        this.name = name;
        this.gpa = gpa;
        this.age = age;
        this.major = major;
    }
}

public class quickt {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        Student[] students = new Student[n];

        for (int i = 0; i < n; i++) {
            String name = sc.nextLine();
            double gpa = Double.parseDouble(sc.nextLine());
            int age = Integer.parseInt(sc.nextLine());
            String major = sc.nextLine();
            students[i] = new Student(name, gpa, age, major);
        }

        String criterion = sc.nextLine().toLowerCase();

        sort(students, 0, n - 1, criterion);

        System.out.println("Sorted Student Records:");
        System.out.println("Name\t\tGPA\tAge\tMajor");

        for (Student s : students) {
            System.out.printf("%-10s\t%.2f\t%-3d\t%-15s\n",
                    s.name, s.gpa, s.age, s.major);
        }
    }

    // QuickSort for Student array
    public static void sort(Student[] arr, int low, int high, String crit) {
        if (low < high) {
            int pi = partition(arr, low, high, crit);
            sort(arr, low, pi - 1, crit);
            sort(arr, pi + 1, high, crit);
        }
    }

    public static int partition(Student[] arr, int low, int high, String crit) {
        Student pivot = arr[low];
        int i = low + 1;
        int j = high;

        while (true) {
            while (i <= high && compare(arr[i], pivot, crit) < 0) {
                i++;
            }
            while (compare(arr[j], pivot, crit) > 0) {
                j--;
            }
            if (i < j) {
                swap(arr, i, j);
            } else {
                break;
            }
        }

        swap(arr, low, j);
        return j;
    }

    // Compare students based on chosen criterion
    public static int compare(Student a, Student b, String crit) {
        switch (crit) {
            case "gpa":
                return Double.compare(a.gpa, b.gpa);
            case "age":
                return Integer.compare(a.age, b.age);
            case "major":
                return a.major.compareToIgnoreCase(b.major);
            default:
                return 0;
        }
    }

    public static void swap(Student[] arr, int i, int j) {
        Student temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
