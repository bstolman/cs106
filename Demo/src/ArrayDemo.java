import java.util.*;

/**
 * @author BenStolman
 *
 */
public class ArrayDemo {
   
public static void main(String[] args) {
	        	       
	 
/* Create an array to hold 3 account balances. */
double[] accounts = new double[3];

/* Add $1500.00 to the first account. */
accounts[0] += 1500.00;
accounts[1] -= 1500.00;

/* Loop through the accounts and print balances. */
for (int i = 0; i < accounts.length; i++) {
    System.out.println(accounts[i]);
		}
int[] list = {33, 72, 69, 28, 21};
System.out.println(Arrays.toString(list));
int first = list[0];
for (int i = 0; i < list.length - 1; i++) {
    list[i] = list[i + 1];
}
list[list.length - 1] = first;
System.out.println(Arrays.toString(list));
	}

}
