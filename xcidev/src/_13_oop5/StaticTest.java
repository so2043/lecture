package _13_oop5;


class Account {
	static int money1;
	int money2;
	
	Account(int money) {
		money1 += money;
		money2 += money;
	}
}


public class StaticTest {
	public static void main(String[] args) {
		
		System.out.println(Account.money1);
		
		Account a1 = new Account(1000);
		System.out.println("money1 : " + a1.money1);
		System.out.println("money2 : " + a1.money2);
		
		
		Account a2 = new Account(1000);
		System.out.println("money1 : " + a2.money1);
		System.out.println("money2 : " + a2.money2);
		
	}
}
