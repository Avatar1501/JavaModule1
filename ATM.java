public class ATM {
    public static void main(String args[])
    {
       double amt_to_withdraw=900, account_balance=1000;

       //check the input
        if( amt_to_withdraw>0 && amt_to_withdraw <= 2000 && amt_to_withdraw%5==0 && account_balance>0 && amt_to_withdraw<account_balance)
        {
            account_balance = account_balance-amt_to_withdraw - .5;
        }
        System.out.println("Account Balance:"+account_balance);
    }

}
