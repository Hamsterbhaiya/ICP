import java.util.Scanner;
public class Problem_6 {
	public static int count(String str, char a) {
	    int count = 0;
		str=str.toLowerCase();
	    for (int i = 0; i < str.length(); i++) {
	        if (str.charAt(i) == a) {
	            count++;
	        }
	    }
	    return count;
	}
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String str = sc.nextLine();

        System.out.print("Enter a character: ");
        char a = sc.next().charAt(0);

        int count = count(str, a);
        System.out.println("The number of occurrences of " + a + " in \"" + str + "\" is " + count);
    }
}