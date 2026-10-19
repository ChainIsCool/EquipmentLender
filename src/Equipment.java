import java.time.LocalDate;
class Equipment {
    // Attributes
    private final String name;
    private boolean isLoaned;
    private final String tag;
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
        if (isLoaned) {
            return "Item: " + name + " | Tag: " + tag + " | Loaned: " + isLoanedString() +
                    "\nLoaner: " + loanerString() + " | Signed Out: " + loanDate + " | Due: " + dueDate;
        } else {
            return "Item: " + name + " | Tag: " + tag + " | Loaned: " + isLoanedString() ;
        }
    }
    // Getters
    public boolean getIsLoaned() {return isLoaned;}
    public String getName() {return name;}
    public String getTag() {return tag;}
    public String getLoaner() {return loaner;}
    public LocalDate getLoanDate() {return loanDate;}
    public LocalDate getDueDate() {return dueDate;}
    // Setters
    private void setLoaned(boolean isLoaned) {this.isLoaned = isLoaned;}
    public void setLoaner(String loaner) {this.loaner = loaner;}
    public void setLoanDate(LocalDate loanDate) {this.loanDate = loanDate;}
    public void setDueDate(LocalDate dueDate) {this.dueDate = dueDate;}
    // Class Specific
    public String isLoanedString() {
        // isLoaned in String form
        if (isLoaned) {
            return "Yes";
        } else {
            return "No";
        }
    }
    public String loanerString() {
        // Loaner in string form
        if (loaner.isEmpty()) {
            return "None";
        } else {
            return loaner;
        }
    }
    public boolean equipmentCheckout(String loaner, long days) {
        // Used to handle equipment checkouts
        if (isLoaned) {return false;}
        setLoaned(true);
        setLoaner(loaner);
        loanDate = LocalDate.now();
        dueDate = loanDate.plusDays(days);
        return true;
    }
    public void equipmentReturn() {
        // Used to handle equipment returns
        setLoaned(false);
        setLoaner("");
        setLoanDate(null);
        setDueDate(null);
    }
    public boolean isOverdue() {
        // Used to check if instance is overdue
        return isLoaned && LocalDate.now().isAfter(getDueDate());
    }
}
