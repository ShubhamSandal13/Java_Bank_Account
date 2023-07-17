Steps to Run the Project:
1) Open CMD and open the folder where all java files are located.
2) First make class file of all four java files by using "javac BankIntf.java", "javac BankImpl.java", "javac BankServer.java", "javac BankClient.java".
3) Now start the rmi registry using the command "start rmiregistry".
4) Now run the file named BankServer to make sure server is on so that client file can be used. Use command "java BankServer.
5) Open new cmd window and go to the folder where all files are located and now run the BankClient file using "java BankClient".