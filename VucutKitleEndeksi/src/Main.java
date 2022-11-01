import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Lütfen boyunuzu metre cinsinden giriniz(Örnek: 1,72): ");
		double boy = scanner.nextDouble();
		
		System.out.print("Lütfen kilonuzu giriniz: ");
		int kilo = scanner.nextInt();
		
		double index = kilo / (boy * boy);
		
		System.out.println("Vücut kitle indeksiniz: " + index);

	}

}
