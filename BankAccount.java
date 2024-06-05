public class BankAccount {
    
   private String AccountNo;
    double balance = 34567.89;
    public void deposit(){
     System.out.print("Depositing...");
    }
    //a method for getting the value of account number
    //getter method
    public String getAccountNo(){
        return this.AccountNo;
    }
    public void setAccountNo(String acc_no){
        this.AccountNo = acc_no;
    }
}
