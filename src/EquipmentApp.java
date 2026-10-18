import java.util.Scanner;
import java.time.LocalDate;
class Equipment {
    // Attributes
    private String name;
    private boolean isLoaned;
    private String tag;
    private String loaner;
    private LocalDate loanDate;
    private LocalDate dueDate;

    // Constructor
    public Equipment(String name, String tag) {
        this.name = name;
        this.tag = tag;
        isLoaned = false;
        loaner = "";
        loanDate = null;
        dueDate = null;
    }
    // To String
    public String toString() {
        return "Item: " + name + "Tag: " + tag + "Loaned:" + isLoanedString();
    }
    // Getters
    public boolean getIsLoaned() {return isLoaned;}
    public String getName() {return name;}
    public String getTag() {return tag;}
    public String getBorrower() {
        if (loaner.isEmpty()) {
            return "None";
        } else {
            return loaner;
        }
    }
    public LocalDate getLoanDate() {
        if (loanDate.isEqual(null)) {
            return null;
        } else {
            return loanDate;
        }
    }
    public LocalDate getDueDate() {
        if (dueDate.isEqual(null)) {
            return null;
        } else {
            return dueDate;
        }
    }
    // Setters
    public void setLoaned(boolean isLoaned) {this.isLoaned = isLoaned;}
    public void setLoaner(String loaner) {this.loaner = loaner;}
    public void setLoanDate(LocalDate loanDate) {this.loanDate = loanDate;}
    public void setDueDate(LocalDate dueDate) {this.dueDate = dueDate;}
    // Class Specific
    public String isLoanedString() {
        if (isLoaned) {
            return "Yes";
        } else {
            return "No";
        }
    }
}
public class EquipmentApp {

}
