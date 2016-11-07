/**
 * Created by IRGeekSauce on 3/19/16.
 */
import java.util.Scanner;

public class HexToASCIIConverter {

    public static void main(String [] args) {

        Scanner input  = new Scanner(System.in);

        System.out.print("Enter the String to convert: ");
        String hexString = input.nextLine();
        System.out.println("CONVERTED HEX STRING: " + convertString(hexString));
    }
    private static String convertString(String hexString) {

        StringBuilder output = new StringBuilder();

        for(int i = 0; i < hexString.length(); i += 2) {
            String str = hexString.substring(i, i + 2);
            output.append((char)Integer.parseInt(str, 16));
        }
        return output.toString();
    }
}
