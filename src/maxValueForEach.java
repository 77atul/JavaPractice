public class maxValueForEach {
    public static void main(String[] args) {
        System.out.println("Welcome to finding the maximum value.");
        int[] arr = new int[]{ 10,25,30,67,10 };

        int max = Integer.MIN_VALUE;
        for (int num: arr){
            if (max<num){
                max = num;
            }
        }
        System.out.print("Maximum number is:" + max);

    }
}
