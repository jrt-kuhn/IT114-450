import java.util.Arrays;

public class Problem3 {
    public static void main(String[] args) {
        //Don't edit anything here
        Integer[] a1 = new Integer[]{-1, -2, -3, -4, -5, -6, -7, -8, -9, -10};
        Integer[] a2 = new Integer[]{-1, 1, -2, 2, 3, -3, -4, 5};
        Double[] a3 = new Double[]{-0.01, -0.0001, -.15};
        String[] a4 = new String[]{"-1", "2", "-3", "4", "-5", "5", "-6", "6", "-7", "7"};

        bePositive(a1);
        bePositive(a2);
        bePositive(a3);
        bePositive(a4);
    }
    static <T> void bePositive(T[] arr){
        System.out.println("Processing Array:" + Arrays.toString(arr));
        //your code should set the indexes of this array
        Object[] output = new Object[arr.length];

        //TODO convert each value to positive
      //JCK38, 6/5/22, I separated each data type and multiplied each negative by -1.
        for (int i = 0; i<arr.length;i++)
        {
        	if (arr[i] instanceof Integer)
        	{
        		int x = (Integer) arr[i];
        		output[i] =  x*-1;
        	}
        	
        		
        	if (arr[i] instanceof Double)
        		{
        		Double y = (Double) arr[i];
        		output[i] = y*-1;
        		}
        	

        	if (arr[i] instanceof String)
        		{
        		String z = (String) arr[i];
        		if (Integer.parseInt(z) < 0)
        		{
        			String m = Integer.toString((Integer.parseInt(z)*-1));
        			output[i] = m;
        		}
        		else
        		output[i] = arr[i];
        		}
        	

        }
        //set the result to the proper index of the output array
        //hint: don't forget to handle the data types properly

        //end edit section

        StringBuilder sb = new StringBuilder();
        for(Object i : output){
            if(sb.length() > 0){
                sb.append(",");
            }
            sb.append(String.format("%s (%s)", i, i.getClass().getSimpleName().substring(0,1)));
        }
        System.out.println("Result: " + sb.toString());
    }
}
