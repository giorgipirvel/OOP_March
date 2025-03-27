package giorgi_pirveli_2.quiz2.task_2;

import giorgi_pirveli_2.quiz2.task_2.A21;
import giorgi_pirveli_2.quiz2.task_2.A22;

public class R21 {
    public static void main(String[] args) {
        // Create instances of A21 and A22
        A21 rectangle = new A21();
        A22 month = new A22();

        // Calculate and print rectangle area
        int area = rectangle.width * rectangle.height;
        System.out.println(area);

        // Print month name with validation
        String[] monthNames = {
                "January", "February", "March", "April", "May", "June",
                "July", "August", "September", "October", "November", "December"
        };

        if (month.monthNumber >= 1 && month.monthNumber <= 12) {
            System.out.println(monthNames[month.monthNumber - 1]);
        } else {
            System.out.println("Invalid month number");
        }
    }
}