public class ArrayToString {
    public static void main(String[] args) {
        String [] arr = new String[]{"I am Atul Yadav a third year computer engineer.","I am learning java",};
        StringBuilder sb = new StringBuilder();
        for (String str: arr)
        {
        sb.append(str).append("")  ;
        }
        System.out.println(sb);

    }
}
