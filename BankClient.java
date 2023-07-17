import java.io.*;
import java.rmi.*;
public class BankClient
{
public static void main(String args[])
{
int ch;
try
{
BankIntf bankintf=(BankIntf)Naming.lookup("Bank_Server");
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
System.out.println("\nEnter the User Name:");
String s=br.readLine();
System.out.println("\nEnter the Account Number:");
int ac=Integer.parseInt(br.readLine());
System.out.println("\nEnter the Initial Amount:");
int amt=Integer.parseInt(br.readLine());
do
{
System.out.println("\n\t1.Withdraw\n\t2.Deposit\n\t3.Transfer\n\t4.Balance\n\t5.Exit");
System.out.println("\nEnter your choice:");
ch=Integer.parseInt(br.readLine());
switch(ch)
{
case 1:
System.out.println("\nEnter Day of Withdrawl:");
int date=Integer.parseInt(br.readLine());
System.out.println("\nEnter Month:");
String month=br.readLine();
System.out.println("\nEnter Year:");
int year=Integer.parseInt(br.readLine());
System.out.println("\nEnter amount of Withdraw:");
int wd=Integer.parseInt(br.readLine());
System.out.println("\nUserName:"+s);
System.out.println("\nAccount Number:"+ac);
if(wd>amt)
System.out.println("\nBalance is less unable to withdraw");
else
{
amt=bankintf.withdraw(wd,amt);
System.out.println("\nRS "+wd+"  has been withdrawn from account number "+ac);
System.out.println("\nDate for Withdrawn  is "+date+"/"+month+"/"+year);
System.out.println("\nBalance:"+amt);
}
break;
case 2:
System.out.println("\nEnter Amount of Deposit");
int dp=Integer.parseInt(br.readLine());
System.out.println("\nEnter Day of Deposit:");
int date1=Integer.parseInt(br.readLine());
System.out.println("\nEnter Month:");
String month1=br.readLine();
System.out.println("\nEnter Year:");
int year1=Integer.parseInt(br.readLine());
System.out.println("\nUsername:"+s);
System.out.println("\nAccountNumber"+ac);
amt=bankintf.deposit(dp,amt);
System.out.println("\nRS "+dp+"  has been deposited to account number "+ac);
System.out.println("\nDate of Deposit  is "+date1+"/"+month1+"/"+year1);
System.out.println("\nBalance:"+amt);
break;
case 3:
System.out.println("\nEnter amount of Transfer:");
int wdt=Integer.parseInt(br.readLine());
System.out.println("\nEnter Day of Transfer:");
int date2=Integer.parseInt(br.readLine());
System.out.println("\nEnter Month:");
String month2=br.readLine();
System.out.println("\nEnter Year:");
int year2=Integer.parseInt(br.readLine());
System.out.println("\nUserName:"+s);
System.out.println("\nAccount Number:"+ac);
System.out.println("\nEnter the Account Number in which you want to Transfer:");
int act=Integer.parseInt(br.readLine());
if(wdt>amt)
System.out.println("\nBalance is less unable to transfer");
else
{
amt=bankintf.transfer(wdt,amt);
System.out.println("\nRs"+wdt+" Transfered to Account Number: "+act+" from Account Number "+ac);
System.out.println("\nDate for Withdrawn  is "+date2+"/"+month2+"/"+year2);
System.out.println("\nBalance:"+amt);
}
break;
case 4:
System.out.println("\nUsername:"+s);
System.out.println("\nAccountNumber"+ac);
amt=bankintf.balance(amt);
System.out.println("\nBalance:"+amt);
break;
}
}
while(ch<5);
}
catch(Exception e)
{
System.out.println("Exception"+e);
}
}
}
