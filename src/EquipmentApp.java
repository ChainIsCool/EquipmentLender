import java.util.Scanner;
import java.util.ArrayList;
public class EquipmentApp {
    private ArrayList<Equipment> inventory = new ArrayList<Equipment>();
    public void signOutEquipment(Scanner input) {
        // Facilitates the signing out of Equipment
        String userTag = getTag(input);
        Equipment foundItem = null;
        for (Equipment item : inventory) {
            if (userTag.equalsIgnoreCase(item.getTag())) {
                foundItem = item;
                break;
            }
        }
        if (foundItem != null) {
            if (foundItem.getIsLoaned()) {
                System.out.println("Error: The \"" + foundItem.getTag() + "\" is already signed out by \"" + foundItem.getLoaner() + "\".");
            } else {
                String loaner = getName(input);
                long NumDays = getNumDays(input);
                foundItem.equipmentCheckout(loaner, NumDays);
                System.out.println("Item \"" + foundItem.getTag() + "\" has been signed out by \"" + loaner + "\".");
            }
        }
        else {
            System.out.println("Error: No Equipment was found with the tag \"" + userTag + "\".");
        }
    }
    public void returnEquipment(Scanner input) {
        // Facilitates the return of Equipment
        String userTag = getTag(input);
        Equipment foundItem = null;
        for (Equipment item : inventory) {
            // Checks if tag is valid
            if (userTag.equalsIgnoreCase(item.getTag())) {
                foundItem = item;
                break;
            }
        }
        if (foundItem != null) {
            // Actually returns item
            foundItem.equipmentReturn();
        }
    }
    public void listOverdueInventory() {
        // Displays all overdue inventory
    }
    public void addInventory() {
        // Displays overdue inventory
    }
    public String getName(Scanner input) {
        System.out.println("Enter name: ");
        return input.nextLine();
    }
    public long getNumDays(Scanner input) {
        System.out.println("Enter # of days: ");
        long numDays = input.nextLong();
        input.nextLine();
        return numDays;
    }
    public String getTag(Scanner input) {
        System.out.println("Enter equipment tag");
        String tag = input.next();
        input.nextLine();
        return tag;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        EquipmentApp app = new EquipmentApp();
        // Testing Inventory
        app.inventory.add(new Equipment("Sony FX30", "Cam-001"));
        app.inventory.add(new Equipment("Tripod", "TRI-001"));
        app.inventory.add(new Equipment("DJI Lav", "DJI-001"));

        // Loop
        boolean running = true;
        while (running) {
            System.out.println("Equipment Inventory App");
            System.out.println("\t1. List all inventory");
            System.out.println("\t2. Sign out equipment");
            System.out.println("\t3. Return equipment");
            System.out.println("\t4. List all overdue inventory");
            System.out.println("\t5. Add to inventory");
            System.out.println("\t6. Quit");
            System.out.print("\tChoice: ");
            int choice = input.nextInt();
            input.nextLine();
            switch (choice) {
                case 1:
                    for(Equipment item: app.inventory) {
                        System.out.println(item.toString());
                    }
                    break;

                case 2:
                    app.signOutEquipment(input);
                    break;

                case 3:
                    app.returnEquipment(input);
                    break;

                case 4:

                    break;

                case 5:

                    break;

                case 6:
                    running = false;
                    break;

                default:
                    System.out.println("Invalid Input. Please enter an integer between 1 and 5 (Inclusive)");
            }

        }
    }
}
