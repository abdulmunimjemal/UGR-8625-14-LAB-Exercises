// Exercise: Class

/**
 * Create a class named BankAccount with the following properties:
    accountNumber: String (represents the unique account number)
    balance: Double (represents the current balance)
    Implement the following member functions:
    deposit: This function takes an amount (Double) as input and adds it to the account balance.
    withdraw: This function takes an amount (Double) as input and subtracts it from the account balance, but only if there are sufficient funds (handle negative balance scenario).
    printBalance: This function simply prints the current account balance.
 */

 class BankAccount(val accountNumber: String, private var balance: Double) {

    fun deposit(amount: Double) {
        if (amount > 0) {
            balance += amount
            println("Deposited \$$amount")
        } else {
            println("Invalid amount. Deposit amount must be positive.")
        }
        printBalance()
    }

    fun withdraw(amount: Double) {
        if (amount > 0) {
            if (amount <= balance) {
                balance -= amount
                println("Withdrew \$$amount")
            } else {
                println("Insufficient funds. Unable to withdraw \$$amount")
            }
        } else {
            println("Invalid amount. Withdrawal amount must be positive.")
        }
        printBalance()
    }

    fun printBalance() {
        println("Current balance: \$$balance")
    }
}

fun main() {
    val myAccount = BankAccount("123456789", 1000.0)
    // Demonstrate deposit and withdrawal functionality
    myAccount.deposit(500.0)   // Deposit $500
    myAccount.withdraw(200.0)  // Withdraw $200
    myAccount.withdraw(1500.0) // Should fail
}
