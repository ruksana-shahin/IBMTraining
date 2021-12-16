import com.ibm.bank.AccountsFactory;
import com.ibm.bank.BalanceException;
import com.ibm.bank.Bank;

public class TestAccounts {
	public static void main(String[] args) throws Exception {
		//AccountsFactory factory= new AccountsFactory();
		
		Bank s1=AccountsFactory.openAccount("polo", "Savings");
		try{
			s1.withdraw(100);
		}catch (BalanceException e) {
			//e.printStackTrace();//For developers to trouble shoot problem
			//System.out.println(e);// For logging to audit application behaviour
		System.out.println(e.getMessage());//For end users
		}
		
//		c1.summary();
//		
//		c1.withdraw(3000);
//		c1.withdraw(5000);
//		c1.summary();
//
//		c1.deposit(2000);
//		c1.deposit(4000);
//		c1.summary();
//		
//        Bank s1=AccountsFactory.openAccount("lilli", "Savings");
//		s1.withdraw(100);
	}

}
