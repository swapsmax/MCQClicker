// To save as "<TOMCAT_HOME>\webapps\clicker\WEB-INF\classes\QueryServlet.java".
import java.io.*;
import java.sql.*;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;


@WebServlet("/console")   // Configure the request URL for this servlet (Tomcat 7/Servlet 3.0 upwards)
public class ConsoleServlet extends HttpServlet {

   // The doGet() runs once per HTTP GET request to this servlet.
   @Override
   public void doGet(HttpServletRequest request, HttpServletResponse response)
               throws ServletException, IOException {
      // Set the MIME type for the response message
      response.setContentType("text/html");
      // Get a output writer to write the response message into the network socket
      PrintWriter out = response.getWriter();

      // Print an HTML page as the output of the query
      out.println("<!DOCTYPE html>");
      out.println("<html>");
      out.println("<head><title>Query Response</title></head>");
      out.println("<body>");

      try (
         // Step 1: Allocate a database 'Connection' object
         Connection conn = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/clicker?user=myuser&password=xxxx&useUnicode=true&characterEncoding=UTF-8");   // For MySQL
               // The format is: "jdbc:mysql://hostname:port/databaseName", "username", "password"

         // Step 2: Allocate a 'Statement' object in the Connection
         Statement stmt = conn.createStatement();
      ) {
         // Step 3 & 4 of the database servlet

         int random_int = (int)(Math.random() * 999999 + 100000);

         String sqlstrTable1 = "INSERT INTO enable(value) VALUE ('1');";
         String sqlstrTable2 = "INSERT INTO code(value) VALUE ('"+ random_int +"');";

         int count = stmt.executeUpdate(sqlstrTable1); // run the SQL statement
         int count2 = stmt.executeUpdate(sqlstrTable2); // run the SQL statement

         out.println("The 6-digit test code is: " +random_int);


      } catch(Exception ex) {
         out.println("<p>Error: " + ex.getMessage() + "</p>");
         out.println("<p>Check Tomcat console for details.</p>");
         ex.printStackTrace();
      }  // Step 5: Close conn and stmt - Done automatically by try-with-resources (JDK 7)
 
      out.println("</body></html>");
      out.close();
   }


}

