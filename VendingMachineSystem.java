package packflipkart;

	import java.util.Scanner;
	public class VendingMachineSystem {
	static int trayNum=0;
	static int ammount_tPAy ;
	public static void main(String[] args)
	{
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the Tray number : ");
	int trayNum =sc.nextInt();
	String prod1="Biscuit";
	int prod1_price=5;
	String prod2="Chocolate";
	int prod2_price=23;
	String prod3="Chips";
	int prod3_price=25;
	String prod4="Juice";
	int prod4_price=66;
	String prod5="Ice Cream";
	int pro51_price=100;
	String prod6="Coffee";
	int prod6_price=5;

	if(trayNum==1)
	{
	System.out.println("Product name : Biscuit");
	System.out.println("Price : 5 ");
	trayNum=1;
	ammount_tPAy=5;
	VendingMachineSystem.payment();
	}
	else if(trayNum==2)
	{
	System.out.println("Product name : Chocolate");
	System.out.println("Price : 23");
	trayNum=2;
	ammount_tPAy=23;
	VendingMachineSystem.payment();
	}
	else if(trayNum==3)
	{
	System.out.println("Product name : Chips ");
	System.out.println("Price : 25");
	trayNum=3;
	ammount_tPAy=25;
	VendingMachineSystem.payment();
	}
	else if(trayNum==4)
	{
	System.out.println("Product name : Juice");
	System.out.println("Price : 66 ");
	trayNum=4;
	ammount_tPAy=66;
	VendingMachineSystem.payment();

	}
	else if(trayNum==5)
	{
	System.out.println("Product name : Ice Cream");
	System.out.println("Price : 100");
	trayNum=5;
	ammount_tPAy=100;
	VendingMachineSystem.payment();
	}
	else if(trayNum==6)
	{
	System.out.println("Product name : Coffee ");
	System.out.println("Price : 51 ");
	trayNum=6;
	ammount_tPAy=51;
	VendingMachineSystem.payment();
	}
	}
	public static void payment()
	{
	System.out.println("Proceed with payment : Yes/No");
	Scanner pay=new Scanner(System.in);
	Scanner noteAmount=new Scanner(System.in);
	Scanner noOfNotes=new Scanner(System.in);
	String payinfo = pay.nextLine();
	if(payinfo.equals("Yes"))
	{
	System.out.println("Please enter note amount : ");
	int note_amount = noteAmount.nextInt();
	System.out.println("Please enter no of notes : ");
	int num_ofNotes = noOfNotes.nextInt();
	System.out.println("notes amount : "+note_amount*num_ofNotes);
	//int ammount_tPAy = 0;
	System.out.println("prod amount : "+ ammount_tPAy);
	if(ammount_tPAy==(note_amount*num_ofNotes))
	{
	System.out.println("Thank you for your purchase");
	}
	else
	{
	System.out.println("Amount is not matching. Please pay with exact change. Pay again?");
	}
	}
	else
	{
	System.out.println(" Cancelling Purchase , Transaction cancelled , Happy to Serve You");
	}
	}
	}


