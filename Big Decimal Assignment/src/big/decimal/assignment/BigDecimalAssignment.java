package big.decimal.assignment;

import java.math.BigDecimal;
/**
 *
 * @author Jheremy Morales
 */
public class BigDecimalAssignment {

    public static class Account{

        private String name;
        private BigDecimal balance;
        public Account(String name, BigDecimal bal){
            this.name=name;
            if(bal.doubleValue()>0.0)
            this.balance=new BigDecimal(bal.doubleValue());

        }
        public void deposit(BigDecimal depositAmount){
            if(depositAmount.doubleValue()>0.0){
            balance = balance.add(depositAmount);
            }
        }
        public BigDecimal getBalance(){
            return balance;
        }
    }
    public static void main(String args[]){
        Account account = new Account("TestName", new BigDecimal("2000.1212"));
        
        System.out.println("Initial Balance : " + String.format("%.2f", account.getBalance()) );
        //now we deposit 5000.212
        account.deposit(new BigDecimal("5000.212"));
        System.out.println("New Balance : " + String.format("%.2f", account.getBalance()) );
    }
    
}
