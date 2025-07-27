public class Developer extends Employee implements PerformanceReviewable {
      public Developer(int id, String name, String designation, int baseSalary) {
        super(id, name, designation, baseSalary);
        
    }

   public int calculateBonus() {
    return (int)(getBaseSalary() * 0.10); 
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
