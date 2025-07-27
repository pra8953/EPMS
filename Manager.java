public  class Manager extends Employee implements PerformanceReviewable {

    public Manager(int id, String name, String designation, int baseSalary) {
        super(id, name, designation, baseSalary);
        
    }

   public int calculateBonus() {
    return (int)(getBaseSalary() * 0.15)+5000; 
}

    public String reviewPerformance() {
    if (getPerformance().equals("Excellent")) {
        return "Outstanding contribution";
    } else if (getPerformance().equals("Good")) {
        return "Keep up the good work";
    } else {
        return "Needs improvement";
    }
}

    
}
