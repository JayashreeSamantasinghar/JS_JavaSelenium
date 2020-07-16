package Assignment1;

public class AccBalance {
	
	 double balhdfc;
	 double balicici;
	 double balaxis;
	 static double withdraw=2000.00;
	 
	 public static void main(String[]args) {
		 
		 double mainbalance=10000.00;
		 
		 AccBalance balance=new AccBalance();
		 
		 balance.balhdfc=mainbalance-withdraw;
		 
		 System.out.println(balance.balhdfc);
		 
		 balance.balicici=balance.balhdfc-withdraw;
		 
		 System.out.println(balance.balicici);
		 
		 balance.balaxis=balance.balicici-withdraw;
		 
		 System.out.println(balance.balaxis);
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
	 }
	 

}
