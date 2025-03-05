// Create EmployeeSalaryAndBonus Class to calculate bonus based on employee's salary and years of service and then compute new salary
class EmployeeSalaryAndBonus {

    static final int NUM_EMPLOYEES = 10;

    // Method to generate employee data (salary and years of service)
    public static int[][] generateEmployeeData() {
        int[][] employeeData = new int[NUM_EMPLOYEES][2];

        for (int i = 0; i < NUM_EMPLOYEES; i++) {
            employeeData[i][0] = (int) (Math.random()*90000) + 10000 ; // Random salary between 10000 and 99999
            employeeData[i][1] = (int) (Math.random()*10) + 1; // Random years of service between 1 and 10
        }
        return employeeData;
    }

    // Method to calculate bonus and new salary
    public static double[][] calculateBonus(int[][] employeeData) {
        double[][] updatedData = new double[NUM_EMPLOYEES][3]; // Stores new salary and bonus

        for (int i = 0; i < NUM_EMPLOYEES; i++) {
            int salary = employeeData[i][0];
            int yearsOfService = employeeData[i][1];
            double bonusPercentage = (yearsOfService > 5) ? 0.05 : 0.02;
            double bonus = salary * bonusPercentage;
            double newSalary = salary + bonus;

            updatedData[i][0] = newSalary;
            updatedData[i][1] = bonus;
            updatedData[i][2] = salary; // Store old salary for calculations
        }
        return updatedData;
    }

    // Method to display results in tabular format
    public static void displayResults(int[][] employeeData, double[][] updatedData) {
        double totalOldSalary = 0, totalNewSalary = 0, totalBonus = 0;

        System.out.println("---------------------------------------------------------------------------");
        System.out.printf("%-5s %-12s %-10s %-12s %-10s\n", "ID", "Old Salary", "Years", "Bonus", "New Salary");
        System.out.println("---------------------------------------------------------------------------");

        for (int i = 0; i < NUM_EMPLOYEES; i++) {
            totalOldSalary += updatedData[i][2];
            totalNewSalary += updatedData[i][0];
            totalBonus += updatedData[i][1];

            System.out.printf("%-5d %-12.2f %-10d %-12.2f %-10.2f\n",
                    (i + 1), updatedData[i][2], employeeData[i][1], updatedData[i][1], updatedData[i][0]);
        }

        System.out.println("---------------------------------------------------------------------------");
        System.out.printf("TOTAL:  %-12.2f %-10s %-12.2f %-10.2f\n", totalOldSalary, "", totalBonus, totalNewSalary);
    }

    // Main method
    public static void main(String[] args) {
        int[][] employeeData = generateEmployeeData();
        double[][] updatedData = calculateBonus(employeeData);
        displayResults(employeeData, updatedData);
    }
}

