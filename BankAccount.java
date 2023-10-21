package p1;
public class BankAccount {
        private String accountNumber;
        private double balance;
        private String accountHolderName;
        private double minimumBalance;
        public BankAccount(String accountNumber, String accountHolderName, double initialBalance, double minimumBalance) {
            this.accountNumber = accountNumber;
            this.accountHolderName = accountHolderName;
            this.balance = initialBalance;
            this.minimumBalance = minimumBalance;
        }
        public void deposit(double amount) {
            if (amount > 0) {
                balance += amount;
                System.out.println("Deposited: " + amount);
            } else {
                System.out.println("Invalid deposit amount.");
            }
        }
        public void withdraw(double amount) {
            if (amount > 0) {
                if (balance - amount >= minimumBalance) {
                    balance -= amount;
                    System.out.println("Withdrawn: " + amount);
                } else {
                    System.out.println("Insufficient funds. Minimum balance of " + minimumBalance + " must be maintained.");
                }
            } else {
                System.out.println("Invalid withdrawal amount.");
            }
        }
        public double getBalance() {
            return balance;
        }

        public static void main(String[] args) {
            BankAccount account1 = new BankAccount("1011010229", "Ranjith ", 10000.0, 500.0);
            BankAccount account2 = new BankAccount("1901922310", "Arjun", 5000.0, 200.0);
            System.out.println("Initial balances:");
            System.out.println(account1.accountHolderName + "'s account balance: " + account1.getBalance());
            System.out.println(account2.accountHolderName + "'s account balance: " + account2.getBalance());
            account1.deposit(500.0);
            account2.deposit(1000.0);
            account1.withdraw(1500.0);
            account2.withdraw(2000.0);
            System.out.println("Final balances:");
            System.out.println(account1.accountHolderName + "'s account balance: " + account1.getBalance());
            System.out.println(account2.accountHolderName + "'s account balance: " + account2.getBalance());
        }
    }

