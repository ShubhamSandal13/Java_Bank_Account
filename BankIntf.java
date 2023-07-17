import java.rmi.*;
public interface BankIntf extends Remote
{
int withdraw(int a,int amt)throws RemoteException;
int deposit(int b,int amt)throws RemoteException;
int transfer(int c,int amt)throws RemoteException;
int balance(int amt)throws RemoteException;
}
