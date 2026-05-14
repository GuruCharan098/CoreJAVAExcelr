package JavaJDBCIntroduction;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

// JDBC : Java database Connectivity 
    // it allows java programs to connect database, Execute SQL queries, Insert, Update, Delete and retrieve data from database. 

// SQL Database : Use java.sql package. 

// JDBC helps java communicate with Database. 

/// JDBC Architecture :
      //  Java Application -----> JDBC API ------>  JDBC Drivers -----> Databases

// UseCase of JDBC : 
  //Banking Application , Student Management System , E-Commerce Web-sites, Hospital Management , Employee Payroll systems. 
public class JavaJDBCOverviewExample {

    public static void main(String[] args) throws Exception {

        // Load Driver (important for learning stage)
        Class.forName("com.mysql.cj.jdbc.Driver");

        // Correct JDBC URL
        String url = "jdbc:mysql://localhost:3306/your_database_name";

        String user = "root";
        String password = "root123";

        // Connection
        Connection con = DriverManager.getConnection(url, user, password);

        // Statement
        Statement st = con.createStatement();

        // Insert Query
        st.executeUpdate("INSERT INTO student VALUES(101,'Ram')");

        // Select Query
        ResultSet rs = st.executeQuery("SELECT * FROM student");

        // Read data
        while (rs.next()) {
            System.out.println(
                rs.getInt("id") + " " + rs.getString("name")
            );
        }

        // Close connection
        con.close();
    }
}

// Client-Server Architecture :  Client sends request, Server processes request and sends response. 
//                                             Browser ----> Server ----> Database
                
//Client(User/Browser) --(Request)--> Server(Application Server) --(query)--> Database ----(Response)---->  Client(User/Browser)


/// Types of Architecture : 
 //(a)  1-Tier Architecture :   Java program + database ; 
//(b)  2-Tier Architecture :    Client + Database;
//(c)  3-Tier Architecture : Client + Server + Database ;
             


/// Overview of Servlets : it is a java program that runs on server and handles client requests. 
 // Current version : jakarta.servlet
/// working flow :   Browser Request ----> Servlet Container( TomCat)----> Servlet(Java code)-----> response sent to browser. 


/// Servlet LifeCycle :  
///  Init()  
/// Service()
/// destroy()

/// JSP Java Server Pages : 


1. <% %>