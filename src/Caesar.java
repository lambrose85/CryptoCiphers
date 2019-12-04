import java.util.Scanner;
import java.util.Arrays;
public class Caesar {

	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		
		int incr = 5;
		String plain;
		String cipher= "";
		String recovered="";
		
		
		System.out.println("enter string to encrypt");
		plain = kb.nextLine();
		plain.toLowerCase();
		System.out.println(plain);
		cipher = encrypt(plain);
		
		System.out.println(cipher);
		System.out.println("Encrypted text: "+cipher);
		recovered = decrypt(cipher);
		System.out.println("decrypted text: "+recovered);
	}
	//encrypt string using addition and modulo arithmetic 
	private static String decrypt(String cipher) {
		char alpha[] = {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};
 		String plain= "";
		int incr = 5;
		int index;
		char temp;
		
		for(int i=0; i<cipher.length();i++) {
			System.out.println(cipher.charAt(i));
			temp = cipher.charAt(i);
			if(temp == ' ') {
				plain= plain+temp;
			}
			index = findPosition(temp,alpha);
			System.out.println(index);
			int check = (index-incr)%26;
			if(check <0) {
				check = 26+check;
			}
			System.out.println("new index "+check);
			temp = alpha[check];
			plain = plain+temp;
			
		}
		return plain;
	}
	private static String encrypt(String plain) {
		char alpha[] = {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};
 		String cipher= "";
		
		int incr = 5;
		int index;
		char temp;
		
		for(int i=0; i<plain.length();i++) {
			System.out.println(plain.charAt(i));
			temp = plain.charAt(i);
			if(temp == ' ') {
				cipher= cipher+temp;
			}
			index = findPosition(temp,alpha);
			System.out.println(index);
			temp = alpha[(index+incr)%26];
			cipher = cipher+temp;
			
		}
		
		return cipher;
		
	}
	private static int findPosition(char temp, char alpha[]) {
		int size = alpha.length;
		int val = 0;
		for(int i=0; i<size; i++) {
			if(temp == alpha[i]) {
				val =i;
				break;
			}
		}
		return val;
	}

}
