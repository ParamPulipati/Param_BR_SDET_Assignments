
class NestblocksThreedotSeven{
	
	   public static void main(String args[]){
		
	     try{
	    
	         try{
	            System.out.println("Inside block1");
	            int val =100/0;
	            System.out.println(val);
	         }
	         catch(ArithmeticException excep1){
	            System.out.println("Exception: excep1");
	         }
	        
	         try{
	            System.out.println("Inside block2");
	            int val =100/0;
	            System.out.println(val);
	         }
	         catch(ArrayIndexOutOfBoundsException excep2){
	            System.out.println("Exception: excep2");
	         }
	        System.out.println("Just other statement");
	    }
	    catch(ArithmeticException excep3){
	    	 System.out.println("Arithmetic Exception");
	         System.out.println("Inside parent try catch block");
	    }
	    catch(ArrayIndexOutOfBoundsException excep4){
	    	System.out.println("ArrayIndexOutOfBoundsException");
	         System.out.println("Inside parent try catch block");
	    }
	    catch(Exception excep5){
	    	System.out.println("Exception");
	         System.out.println("Inside parent try catch block");
	    }
	    System.out.println("Next statement..");
	  }
	}
