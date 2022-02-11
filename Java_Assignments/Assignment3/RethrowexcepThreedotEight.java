
public class RethrowexcepThreedotEight {

	public static void main(String[] args) {
		try{
			rethrowexception("abc");
		}catch(FirstException | SecondException | ThirdException e){
			
			System.out.println(e.getMessage());
		}
	}

	static void rethrowexception(String s) throws FirstException, SecondException,ThirdException {
		try {
			if (s.equals("First"))
				throw new FirstException("First");
			else if (s.equals("Second"))
				throw new SecondException("Second");
			else
				throw new ThirdException("Third");
		} catch (Exception e) {
			
			throw e;
		}
	}

	static class FirstException extends Exception {

		public FirstException(String message) {
			super(message);
		}
	}

	static class SecondException extends Exception {

		public SecondException(String message) {
			super(message);
		}
	}

	static class ThirdException extends Exception {

		public ThirdException(String message) {
			super(message);
		}
	}

}