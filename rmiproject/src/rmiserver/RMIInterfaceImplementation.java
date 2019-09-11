package rmiserver;
/**
 *
 * @author Dora Di
 *
 * java.rmi.server.UnicastRemoteObject is one of classes meant for implementation of various distribution schemes
 */

import model.Student;

import java.io.*;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.ArrayList;
import java.util.List;

public class RMIInterfaceImplementation extends UnicastRemoteObject implements RMIInterface
{
    public RMIInterfaceImplementation() throws RemoteException
    {
        super();
    }

    // provide the interface methods implementation
    public java.util.Date getDate() throws RemoteException
    {
        return new java.util.Date();
    }


    List<String> listOfStudentsInLine = new ArrayList<>(); //Går godt
    List<Student> listOfStudents = new ArrayList<>();
    @Override
    public List<Student> getAllStudents() throws IOException {

        try {

            File f = new File("C:\\Users\\Jonas\\IdeaProjects\\rmiproject\\src\\rmiserver\\questions.txt");

            BufferedReader b = new BufferedReader(new FileReader(f));

            String readLine = b.readLine();  //hele det indlæste doc.
            System.out.println("Reading file using Buffered Reader");



            //jonas,jonasmanley@hotmail.com
            String[] oneLineStudent = readLine.split(" ");
            for(int i = 0; i<oneLineStudent.length;i++){
                listOfStudentsInLine.add(oneLineStudent[i]);

            }


            //jonas,jonasmanley@hotmail.com
            for (String section:listOfStudentsInLine) {
                String[] listo = section.split(",");
                Student student = new Student(listo[0],listo[1]);
                listOfStudents.add(student);
            }

            for (Student student:listOfStudents) {
                System.out.println("x" + student);
            }


        } catch (IOException e) {
            e.printStackTrace();
        }
        return listOfStudents;
    }





}