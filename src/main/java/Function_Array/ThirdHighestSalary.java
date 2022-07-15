//3. Suppose, in a company , here are some employee salaries in an array
//[35000, 25000, 28000, 32500, 44000, 32800]
//Find out the 3rd highest salary
package Function_Array;

import java.util.Arrays;

public class ThirdHighestSalary {
    public static void main(String[] args) {
        int []array={35000, 25000, 28000, 32500, 44000, 32800};
        System.out.println("The third highest salary is "+thirdHigestSalary(array));
    }
    public static int thirdHigestSalary(int[] array){
        Arrays.sort(array);
        //As it is sorted in ascending order, the third highest
        // will be the third element from the last index of the array
        return array[array.length-2-1];
    }
}
