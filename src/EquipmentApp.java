import javax.xml.transform.Source;
import java.sql.SQLOutput;
import java.util.Scanner;
import java.util.ArrayList;
public class EquipmentApp {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<Equipment> inventory = new ArrayList<Equipment>();
        // Testing Inventory
        inventory.add(new Equipment("Sony FX30", "Cam-001"));
        inventory.add(new Equipment("Tripod", "TRI-001"));
        inventory.add(new Equipment("DJI Lav", "DJI-001"));

        // Loop
        boolean running = true;
        while (running) {
            System.out.println("Equipment Inventory App");
            System.out.println("\t1. List all equipment");
            System.out.println("\t2. Sign out equipment");
            System.out.println("\t3. Return equipment");
            System.out.println("\t4. List all overdue equipment");
            System.out.println("\t5. Quit");
            System.out.println("\tChoice: ");
            int choice = input.nextInt();
            input.nextLine();
            switch (choice) {
                case 1:

                    break;

                case 2:

                    break;

                case 3:

                    break;

                case 4:

                    break;

                case 5:
                    running = false;
                    break;

                default:
                    System.out.println("Invalid Input. Please enter an integer between 1 and 5 (Inclusive)");

            }

        }
    }
}