import java.util.ArrayList;
import java.util.Scanner;

  class Expense {   // Data class to store expenses
    String category;
    double amount;

    public Expense(String category, double amount) {
        this.category = category;
        this.amount = amount;
    }

    public String toString() {
        return category + " - ₹" + amount;
    }
}

 class Expenses{  // Main class with main() method
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Expense> expenses = new ArrayList<>();
        
        while (true) {
            System.out.println("\nExpense Tracker");
            System.out.println("1. Add Expense");
            System.out.println("2. View Expenses");
            System.out.println("3. Total Expenses");
            System.out.println("4. Exit");
            System.out.print("Choose an option: ");
            
            int choice = sc.nextInt();
            sc.nextLine();  // Consume newline
            
            switch (choice) {
                case 1:
                    System.out.print("Enter category: ");
                    String category = sc.nextLine();
                    System.out.print("Enter amount: ");
                    double amount = sc.nextDouble();
                    expenses.add(new Expense(category, amount));
                    System.out.println("Expense added successfully!");
                    break;
                    
                case 2:
                    if (expenses.isEmpty()) {
                        System.out.println("No expenses recorded.");
                    } else {
                        System.out.println("\nExpenses:");
                        for (Expense e : expenses) {
                            System.out.println(e);
                        }
                    }
                    break;
                    
                case 3:
                    double total = 0;
                    for (Expense e : expenses) {
                        total += e.amount;
                    }
                    System.out.println("Total Expenses: ₹" + total);
                    break;
                    
                case 4:
                    System.out.println("Exiting... Thank you!");
                    sc.close();
                    return;
                    
                default:
                    System.out.println("Invalid choice! Try again.");
            }
        }
    }
}
