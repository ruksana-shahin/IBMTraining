import com.ibm.emp.Employee;
import com.ibm.emp.Executive;
import com.ibm.emp.Manager;

public class TestEmployee {		

		public static void main(String[] args) {
			Employee e1= new Employee(200,"Ruksana",3550);
			e1.payslip();
			Executive exec=new Executive("polo",4000,20000);
			exec.payslip();
          
			Manager mgr=new Manager("lilli",5000,30000);
			mgr.payslip();
			
			Employee emp=mgr;
			System.out.println(mgr.getSalary());
			System.out.println(emp.getSalary());
			
			
		}
	

}
