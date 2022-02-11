
public class AvgNoTwodotOne {
	
	public static void main(String[] args) {
        double[] array_input = {1, 2, 3, 4, 5};
        double total = 0;

        for(int i=0; i<array_input.length; i++){
        	total = total + array_input[i];
        }

        double average_value = total / array_input.length;
       
        System.out.format("The average value is: %.2f", average_value);
    }

}

