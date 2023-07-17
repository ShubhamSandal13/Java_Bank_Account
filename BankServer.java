import java.rmi.*;
public class BankServer
{
public static void main(String args[])
{
try
{
BankImpl bankimpl=new  BankImpl();
Naming.rebind("Bank_Server",bankimpl);
System.out.println("Server is Ready");
}
catch(Exception e)
{
System.out.println("Exception:"+e);
}
}
}
