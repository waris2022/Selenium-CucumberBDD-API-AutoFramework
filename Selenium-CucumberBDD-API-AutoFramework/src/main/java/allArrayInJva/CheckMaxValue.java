package allArrayInJva;

public class CheckMaxValue {
	public static void maxValue(int[] value)
    {
        int max = value[0];
        int secondMax = 0;
        int min = value[0];
        int secondMin = 0;
       for(int i = 0; i < value.length; i++)
       {
           if(value[i] > max)
           {
               secondMax = max;
               max = value[i];
           }
           if(value[i] < min )
           {
               secondMin = min;
               min = value[i];
           }
       }
        System.out.println("Max: "+max);
        System.out.println("2nd Max: "+secondMax);
        System.out.println("Min: "+min);
        System.out.println("2nd Min: "+secondMin);
    }
    
    public static void main(String[] args) {
        int array[] = {2,5,8,9,1,11,13,14};
        CheckMaxValue.maxValue(array);
    }
}

