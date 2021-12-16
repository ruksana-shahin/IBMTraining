
public class TestAlfaBeta {
	public static void main(String[] args) {
		Alfa a=new Alfa();
		a.demo();
		//Beta bt=a;//illiegal
		Beta b= new Beta();
		b.test();
		b.demo();
		 Alfa ab=b;
		 ab.demo();
		 //ab.test();//invalid
		  
		 Beta ba=(Beta)ab;
		 ba.demo();
		 ba.test();
		 
	}

}
