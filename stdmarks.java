public class StudentPercentage {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of subjects: ");
        int subjects = sc.nextInt();

        int totalMarks = 100;
        for (int i = 1; i <= subjects; i++) {
            System.out.print("Enter marks for subject " + i + ": ");
            int marks = sc.nextInt();
            totalMarks += marks;
        }
        double percentage = (double) totalMarks / subjects;
        System.out.println("\n--- Result ---");
        System.out.println("Total Marks = " + totalMarks);
        System.out.println("Percentage  = " + percentage + "%");

    
    }
}