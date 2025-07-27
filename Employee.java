public abstract class Employee {
    private int id;
    private String name;
    private String designation;
    private int baseSalary;
    private int bonus;
    private String performance;
    private String remarks;

    // Constructor
    public Employee(int id, String name, String designation, int baseSalary) {
        this.id = id;
        this.name = name;
        this.designation = designation;
        this.baseSalary = baseSalary;
    }

    // Abstract method for bonus
    public abstract int calculateBonus();

    // Getters and Setters
    public int getId() { return id; }
    public String getName() { return name; }
    public String getDesignation() { return designation; }
    public int getBaseSalary() { return baseSalary; }
    public int getBonus() { return bonus; }
    public String getPerformance() { return performance; }
    public String getRemarks() { return remarks; }

    public void setPerformance(String performance) {
        this.performance = performance;
    }
    
    public void setRemarks(String remarks) {
        this.remarks = remarks;
    }

    public void setBonus(int bonus) {
        this.bonus = bonus;
    }

    @Override
    public String toString() {
        return String.format(
            "Name: %s\nDesignation: %s\nBase Salary: %d\nBonus: %d\nPerformance Score: %s\nRemarks: %s",
            name, designation, baseSalary, bonus, performance, remarks
        );
    }
}
