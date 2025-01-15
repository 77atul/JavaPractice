import java.util.Scanner;

public class demo {
    public static int dataTypeSize(String dataType) {
        // Determine the size in bytes of the given data type
        switch (dataType.toLowerCase()) { // Convert input to lowercase for case-insensitive matching
            case "char":
                return 1;
            case "int":
                return 4;
            case "float":
                return 4;
            case "double":
                return 8;
            case "long":
                return 8;
            case "short":
                return 2;
            case "bool": // Assuming "bool" as a boolean type
                return 1;
            default:
                return -1; // Return -1 for invalid data type
        }
    }

    public static void main(String[] args) {
        // Create a Scanner object for taking input
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter a data type
        System.out.print("Enter the data type: ");
        String inputDataType = scanner.nextLine();

        // Call the function and print the result
        int size = dataTypeSize(inputDataType);
        if (size != -1) {
            System.out.println("The size of " + inputDataType + " is: " + size + " byte(s).");
        } else {
            System.out.println("Invalid data type!");
        }

        // Close the scanner
        scanner.close();
    }
}