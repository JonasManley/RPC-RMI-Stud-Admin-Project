package rmiclient;
/**
 * This is a simple client program that uses methods as a service from another, server program.
 *
 * There are two services provided by the server and consumed by this client:
 * - calculation
 * - date/time info
 *
 * The client gets input from the console: two operands/numbers and the operator/character
 * Then the client builds a stub, which searches for a service and connects with the server for getting it
 * Finally, the client prints out the results on the console
 *
 * @author Dora Di
 */
import java.rmi.*;
import java.util.Scanner;

import model.Student;
import rmiserver.RMIInterface;
import rmiserver.RMIServer.*;

public class RMIClient
{

    private static char op;


    public static void getInput()
    {
        Scanner inp = new Scanner(System.in);
    }

    public static void getService() throws Exception
    {
        // name =  rmi:// + ServerIP +  /EngineName;
        String remoteEngine = "rmi://localhost/Compute";

        // Create local stub, lookup in the registry searching for the remote engine - the interface with the methods we want to use remotely
        RMIInterface obj = (RMIInterface) Naming.lookup(remoteEngine);

        // Send requests to the remote services the usual way, as if they are local

        for (
                Student student:obj.getAllStudents()) {
            System.out.println("Student" + student);
        }

    }






    public static void main(String[] args)
    {
        try
        {
            getInput();
            getService();
        }
        catch (Exception e)
        {
            System.out.println("Exception: " + e);
        }
    }
}
