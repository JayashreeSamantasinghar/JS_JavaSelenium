package Assignment1;

public class NetBalance {
	//String="HDFC";
	//String="ICICI";
	//String="AXIS";
	static int accbalance=10000;
	
public static void main(String[]args) {
		
		NetBalance hdfc=new NetBalance();
		hdfc.checkbalance("HDFC");
		
		NetBalance icici=new NetBalance();
		hdfc.checkbalance("ICICI");
		
		NetBalance axis=new NetBalance();
		hdfc.checkbalance("AXIS");
	}

void checkbalance (String s) {
	accbalance=accbalance-2000;
	System.out.println("new balance after withdraw for" + s +"is" +accbalance );
	
}

}


