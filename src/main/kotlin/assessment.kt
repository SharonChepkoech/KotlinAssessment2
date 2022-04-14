
fun main(){
    var acc =CurrentAccount(1112234,"Sharon Chepkoech", 1200.00)
    println(acc.balance)
    println(acc.details())

    var prod = Product("Cabbage", 0.1, 12, "Groceries")
    println(prod.category)

}
//1.Create a classCurrentAccount with the following attributes:account
//number, account name, balance. It has the following functions:
//a.deposit(amount: Double) - Increments the balance by the
//amount deposited
//b.withdraw(amount: Double) - Decrements the balance by the
//amount withdrawn
//c.details() - Prints out the account number and balance and
//name in this format: “Account number x with balance y is operated by z"

open class CurrentAccount(var accountNumber:Int, var accountName:String, var balance: Double){

    fun deposit( amount:Double) :Double{
       var amount = 0.0
      balance =+ amount
        balance++
        return balance

    }
    open fun withdraw(amount: Double) :Double{
        balance -= amount
        return balance

    }
    fun details(){
        println("Account number $accountNumber with balance $balance is operated by $accountName ")
    }

}
//2.Create another classSavingsAccount. It has the same functions and
//attributes as the current account except for one attribute,
//withdrawals: Int. Withdrawals is a counter variable that is used to
//keep track of how many withdrawals have been made from the account
//in a year. The only other difference is that the savings account
//withdraw() method first checks if the number of withdrawals is less
//than 4 for it to allow one to withdraw money from the account. It also
//increments the withdrawals attribute after a successful withdrawal.

class SavingsAccount( var withdrawals: Int, accountNumber:Int, accountName:String, balance: Double) :CurrentAccount(accountNumber,accountName, balance){
    override fun withdraw(amount: Double): Double {
        var withdrrawals = withdrawals++
        for (withdraws)
            if( withdraws < 4){
                println("You can withdraw")}
        else println("You have exceeded your withdrrawal limit of 4 ")


}

//3. A product is represented by a data class with these attributes: name,
//weight, price, category. Category can either be groceries, hygiene or
//other. Write a function that takes in a product and uses a when
//statement to assign each product to a list based on its category
data class Product (var name: String, var weight: Double, var price: Int, var category: String){
    fun categoriseProduct(category: String){
        when (category){
            "Hygiene"  -> println("Your category is Hygiene")
            "Groceries"  -> println("Your category is Groceries")

            else-> println(" Your category is other")
    }
    }
}

//4.Write a function that given a string returns a string composed of only
//the characters in even indices. For example given “banana” it will return
fun returnEvenIndices(item:String) :String{
    for (words in item ){
        if (words  2 != 0)
       return words

    }

}
