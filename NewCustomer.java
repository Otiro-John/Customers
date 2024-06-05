public class NewCustomer {
    public static void main(String[] args) {
   
    NewCustomer localCustomer = new NewCustomer(00023,"wanjala","1975-Street",01157,"Kenya");
    System.out.println("This is a local customer");
    System.out.println(localCustomer.country);
        //international Customers
     NewCustomer internationalCustomer = new NewCustomer(0003,"Alfred","199-50100-Streeet",+1988473277,"Brazil");
     System.out.println("This is an international customer");
     System.out.println(internationalCustomer.country);
  }
  //attributes for the customers
  int accountNumber;
  String name;
  String address;
  int phoneNumber;
  String country;

  //This is a constructor method for customers
public NewCustomer(int accountNumber,String name,String address, int phoneNumber,String country){
    this.accountNumber = accountNumber;
    this.name = name;
    this.address = address;
    this.phoneNumber = phoneNumber;
    this.country = country;
  }
  
  public void myDeposit(){
    System.out.println("Deposits");
  }
  public void myWithdrawals(){
    System.out.println("These are my withdrawals");
  }
  public void renew(){
    System.out.println("Do you want a new account");
  }
  public void myBalance(){
    System.out.println("This is your balance");
  }
}