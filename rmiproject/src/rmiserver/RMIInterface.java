package rmiserver;
/**
 * This interface defines the methods, which will be accessible remotely
 * It has to
 * - extend the java.rmi.Remote interface
 * - all its methods must throw java.rmt.RemoteException, which will be caught by the clients, so they know if a RMI was successful
 *
 * @author Dora Di
 */
import model.Student;
import rmiserver.RMIServer;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.ArrayList;
import java.util.List;

public interface RMIInterface extends Remote
{
    //student
    public List<Student> getAllStudents() throws IOException;

}