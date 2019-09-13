# RPC-RMI-Stud-Admin-Project
RMI assignement

<h1> ASSINGMENT :clipboard: </h1>

**DESCRIPTION**

CPH Business Academy collects data about their PBA SOU students – name, email address, etc. Imagine, the data of the second semester students is already stored in a SQL database, while the same kind of data of the new students is still in a text file.



Create an application, which can read the data from all sources, regardless the input format, can merge it and then to print it out on the console, one line per student.



The application should illustrate the use of RPC/RMI technology.

 

**Hint:**

Develop a simple RMI server that shares services, which enable a client to open, read, and process two types of data sources:
a text-file, either .txt or .csv
SQL database
Develop a RMI client, which can connect to the server and take use of the remote services.


**Optional:**

add a service, which can read the data from the file and store it in the database

<h1> RMI TECHNOLIGY :pen: </h1>

The RMI architecture, shown in Figure, describes how remote objects behave and how parameters are passed between remote methods. Remote method invocation allows the program to define separately the behaviour and the code that implements the behaviour and allows running them on separate JVMs

<img src="https://github.com/JonasManley/RPC-RMI-Stud-Admin-Project/blob/master/Java-RMI-architecture-from-13.png" alt="UML" height="auto" width="auto" style="max-width:100%;">
