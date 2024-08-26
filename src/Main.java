public class Main {

    public static String convertMillis(long millis) {
        // Calculate total seconds
        long totalSeconds = millis / 1000;

        // Calculate times
        long hours = totalSeconds / 3600;
        long minutes = (totalSeconds % 3600) / 60;
        long seconds = totalSeconds % 60;

        // Return in format
        return String.format("%d:%d:%d", hours, minutes, seconds);
    }

    public static void main(String[] args) {
        // Scanner to allow input from user
        java.util.Scanner scanner = new java.util.Scanner(System.in);

        // Prompt user to enter milliseconds
        System.out.print("Enter milliseconds: ");
        long millis = scanner.nextLong();

        // Convert milliseconds and display result
        String result = convertMillis(millis);
        System.out.println("Converted time: " + result);
    }
}



