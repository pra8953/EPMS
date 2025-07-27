public class Intern extends Employee implements PerformanceReviewable{
      public Intern(int id, String name, String designation, int baseSalary) {
        super(id, name, designation, baseSalary);
        
    }

   public int calculateBonus() {
    return 1000; 
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
