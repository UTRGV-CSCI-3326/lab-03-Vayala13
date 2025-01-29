public class BankAccount {
    public static void main(String[] args) {
        //our int main
        //Bob has a checking account with a starting balance of $2175. 37
        float bobBalance = 2175.37f;
        //Bob withdrew $302.50
       bobBalance = bobBalance - 302.50f;
        //Bob deposited $50.03
      bobBalance = bobBalance + 50.03f;
        //Bob withdrew half of his current balance 
      bobBalance = (bobBalance = bobBalance/2.00f) +20.00f;
        //Bob withdrew $1
      bobBalance = (bobBalance - 1.00f);
        //Bob deposited his paycheck that doubled his current balance 
       bobBalance = bobBalance * 2.00f;
        //Bob deposited $1
        //System.out.println(bobBalance = bobBalance + 1.00f);
        System.out.printf("%.2f%n",bobBalance = bobBalance + 1.00f);
    }
}
