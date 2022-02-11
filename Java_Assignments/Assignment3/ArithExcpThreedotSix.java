
class ArithExcpThreedotSix{  
	   void m1() throws ArithExcpThreedotSix{  
		throw new ArithExcpThreedotSix("Calculation error"); 
	   }  
	   void m2() throws ArithExcpThreedotSix{  
		m1();  
	   }  
	   void m3(){  
		try{  
		   m2();  
		}
		catch(ArithExcpThreedotSix e){
		   System.out.println("Arithmetic exception handled");
		}  
	   }  
	   public static void main(String args[]){  
		ArithExcpThreedotSix obj=new ArithExcpThreedotSix();  
		obj.m3();  
		System.out.println("Program ends");  
	   }  
	}