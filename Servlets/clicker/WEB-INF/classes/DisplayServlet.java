// To save as "<TOMCAT_HOME>\webapps\clicker\WEB-INF\classes\QueryServlet.java".
import java.io.*;
import java.sql.*;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;


@WebServlet("/display")   // Configure the request URL for this servlet (Tomcat 7/Servlet 3.0 upwards)
public class DisplayServlet extends HttpServlet {

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
        
         String sqlstrTable = "CREATE TABLE results SELECT choice, COUNT(*) AS count FROM responses GROUP BY choice;";

            // COMMENTS
            String sqlstr1comment = "select stdcomment from comments where questionNo=1;";
            ResultSet rset1comment = stmt.executeQuery(sqlstr1comment); // run the SQL statement
            String q1comment = "";
            if(rset1comment.next()){
               q1comment = rset1comment.getString("stdcomment");
            }

            String sqlstr2comment = "select stdcomment from comments where questionNo=2;";
            ResultSet rset2comment = stmt.executeQuery(sqlstr2comment); // run the SQL statement
            String q2comment = "";
            if(rset2comment.next()){
               q2comment = rset2comment.getString("stdcomment");
            }

            String sqlstr3comment = "select stdcomment from comments where questionNo=3;";
            ResultSet rset3comment = stmt.executeQuery(sqlstr3comment); // run the SQL statement
            String q3comment = "";
            if(rset3comment.next()){
               q3comment = rset3comment.getString("stdcomment");
            }

            String sqlstr4comment = "select stdcomment from comments where questionNo=4;";
            ResultSet rset4comment = stmt.executeQuery(sqlstr4comment); // run the SQL statement
            String q4comment = "";
            if(rset4comment.next()){
               q4comment = rset4comment.getString("stdcomment");
            }

            String sqlstr5comment = "select stdcomment from comments where questionNo=5;";
            ResultSet rset5comment = stmt.executeQuery(sqlstr5comment); // run the SQL statement
            String q5comment = "";
            if(rset5comment.next()){
               q5comment = rset5comment.getString("stdcomment");
            }

            String sqlstr6comment = "select stdcomment from comments where questionNo=6;";
            ResultSet rset6comment = stmt.executeQuery(sqlstr6comment); // run the SQL statement
            String q6comment = "";
            if(rset6comment.next()){
               q6comment = rset6comment.getString("stdcomment");
            }

            String sqlstr7comment = "select stdcomment from comments where questionNo=7;";
            ResultSet rset7comment = stmt.executeQuery(sqlstr7comment); // run the SQL statement
            String q7comment = "";
            if(rset7comment.next()){
               q7comment = rset7comment.getString("stdcomment");
            }

            String sqlstr8comment = "select stdcomment from comments where questionNo=8;";
            ResultSet rset8comment = stmt.executeQuery(sqlstr8comment); // run the SQL statement
            String q8comment = "";
            if(rset8comment.next()){
               q8comment = rset8comment.getString("stdcomment");
            }

            String sqlstr9comment = "select stdcomment from comments where questionNo=9;";
            ResultSet rset9comment = stmt.executeQuery(sqlstr9comment); // run the SQL statement
            String q9comment = "";
            if(rset9comment.next()){
               q9comment = rset9comment.getString("stdcomment");
            }

            String sqlstr10comment = "select stdcomment from comments where questionNo=10;";
            ResultSet rset10comment = stmt.executeQuery(sqlstr10comment); // run the SQL statement
            String q10comment = "";
            if(rset10comment.next()){
               q10comment = rset10comment.getString("stdcomment");
            }


            // QUESTION 1

            String sqlstr1A = "SELECT count(*) FROM responses WHERE questionNo=1 AND choice='a';";
            ResultSet rsetA = stmt.executeQuery(sqlstr1A); // run the SQL statement
            int q1oA = 0;
            if(rsetA.next()){
               q1oA = rsetA.getInt("count(*)");
            }
            //out.println("<p>Your SQL statement is: " + sqlstrA + "</p>"); // Echo for debugging
            //out.println("<p>OptionA: " + q1oA + "</p>"); // Echo for debugging

            String sqlstr1B = "SELECT count(*) FROM responses WHERE questionNo=1 AND choice='b';";
            ResultSet rsetB = stmt.executeQuery(sqlstr1B); // run the SQL statement
            int q1oB = 0;
            if(rsetB.next()){
               q1oB = rsetB.getInt("count(*)");
            }
            //out.println("<p>Your SQL statement is: " + sqlstrA + "</p>"); // Echo for debugging
            //out.println("<p>Option B: " + q1oB + "</p>"); // Echo for debugging

            String sqlstr1C = "SELECT count(*) FROM responses WHERE questionNo=1 AND choice='c';";
            ResultSet rsetC = stmt.executeQuery(sqlstr1C); // run the SQL statement
            int q1oC = 0;
            if(rsetC.next()){
               q1oC = rsetC.getInt("count(*)");
            }
            //out.println("<p>Your SQL statement is: " + sqlstrA + "</p>"); // Echo for debugging
            //out.println("<p>Option C: " + q1oC + "</p>"); // Echo for debugging
            
            String sqlstr1D = "SELECT count(*) FROM responses WHERE questionNo=1 AND choice='d';";
            ResultSet rsetD = stmt.executeQuery(sqlstr1D); // run the SQL statement
            int q1oD = 0;
            if(rsetD.next()){
               q1oD = rsetD.getInt("count(*)");
            }
            //out.println("<p>Your SQL statement is: " + sqlstrA + "</p>"); // Echo for debugging
            //out.println("<p>Option D: " + q1oD + "</p>"); // Echo for debugging

            
            // QUESTION 2

            String sqlstr2A = "SELECT count(*) FROM responses WHERE questionNo=2 AND choice='a';";
            ResultSet rset2A = stmt.executeQuery(sqlstr2A); // run the SQL statement
            int q2oA = 0;
            if(rset2A.next()){
               q2oA = rset2A.getInt("count(*)");
            }
            

            String sqlstr2B = "SELECT count(*) FROM responses WHERE questionNo=2 AND choice='b';";
            ResultSet rset2B = stmt.executeQuery(sqlstr2B); // run the SQL statement
            int q2oB = 0;
            if(rset2B.next()){
               q2oB = rset2B.getInt("count(*)");
            }
            

            String sqlstr2C = "SELECT count(*) FROM responses WHERE questionNo=2 AND choice='c';";
            ResultSet rset2C = stmt.executeQuery(sqlstr2C); // run the SQL statement
            int q2oC = 0;
            if(rset2C.next()){
               q2oC = rset2C.getInt("count(*)");
            }
            
            
            String sqlstr2D = "SELECT count(*) FROM responses WHERE questionNo=2 AND choice='d';";
            ResultSet rset2D = stmt.executeQuery(sqlstr2D); // run the SQL statement
            int q2oD = 0;
            if(rset2D.next()){
               q2oD = rset2D.getInt("count(*)");
            }

            // QUESTION 3

            String sqlstr3A = "SELECT count(*) FROM responses WHERE questionNo=3 AND choice='a';";
            ResultSet rset3A = stmt.executeQuery(sqlstr3A); // run the SQL statement
            int q3oA = 0;
            if(rset3A.next()){
               q3oA = rset3A.getInt("count(*)");
            }
            

            String sqlstr3B = "SELECT count(*) FROM responses WHERE questionNo=3 AND choice='b';";
            ResultSet rset3B = stmt.executeQuery(sqlstr3B); // run the SQL statement
            int q3oB = 0;
            if(rset3B.next()){
               q3oB = rset3B.getInt("count(*)");
            }
            

            String sqlstr3C = "SELECT count(*) FROM responses WHERE questionNo=3 AND choice='c';";
            ResultSet rset3C = stmt.executeQuery(sqlstr3C); // run the SQL statement
            int q3oC = 0;
            if(rset3C.next()){
               q3oC = rset3C.getInt("count(*)");
            }
            
            
            String sqlstr3D = "SELECT count(*) FROM responses WHERE questionNo=3 AND choice='d';";
            ResultSet rset3D = stmt.executeQuery(sqlstr3D); // run the SQL statement
            int q3oD = 0;
            if(rset3D.next()){
               q3oD = rset3D.getInt("count(*)");
            }

            // QUESTION 4

            String sqlstr4A = "SELECT count(*) FROM responses WHERE questionNo=4 AND choice='a';";
            ResultSet rset4A = stmt.executeQuery(sqlstr4A); // run the SQL statement
            int q4oA = 0;
            if(rset4A.next()){
               q4oA = rset4A.getInt("count(*)");
            }
            

            String sqlstr4B = "SELECT count(*) FROM responses WHERE questionNo=4 AND choice='b';";
            ResultSet rset4B = stmt.executeQuery(sqlstr4B); // run the SQL statement
            int q4oB = 0;
            if(rset4B.next()){
               q4oB = rset4B.getInt("count(*)");
            }
            

            String sqlstr4C = "SELECT count(*) FROM responses WHERE questionNo=4 AND choice='c';";
            ResultSet rset4C = stmt.executeQuery(sqlstr4C); // run the SQL statement
            int q4oC = 0;
            if(rset4C.next()){
               q4oC = rset4C.getInt("count(*)");
            }
            
            
            String sqlstr4D = "SELECT count(*) FROM responses WHERE questionNo=4 AND choice='d';";
            ResultSet rset4D = stmt.executeQuery(sqlstr4D); // run the SQL statement
            int q4oD = 0;
            if(rset4D.next()){
               q4oD = rset4D.getInt("count(*)");
            }

            // QUESTION 5

            String sqlstr5A = "SELECT count(*) FROM responses WHERE questionNo=5 AND choice='a';";
            ResultSet rset5A = stmt.executeQuery(sqlstr5A); // run the SQL statement
            int q5oA = 0;
            if(rset5A.next()){
               q5oA = rset5A.getInt("count(*)");
            }
            

            String sqlstr5B = "SELECT count(*) FROM responses WHERE questionNo=5 AND choice='b';";
            ResultSet rset5B = stmt.executeQuery(sqlstr5B); // run the SQL statement
            int q5oB = 0;
            if(rset5B.next()){
               q5oB = rset5B.getInt("count(*)");
            }
            

            String sqlstr5C = "SELECT count(*) FROM responses WHERE questionNo=5 AND choice='c';";
            ResultSet rset5C = stmt.executeQuery(sqlstr5C); // run the SQL statement
            int q5oC = 0;
            if(rset5C.next()){
               q5oC = rset5C.getInt("count(*)");
            }
            
            
            String sqlstr5D = "SELECT count(*) FROM responses WHERE questionNo=5 AND choice='d';";
            ResultSet rset5D = stmt.executeQuery(sqlstr5D); // run the SQL statement
            int q5oD = 0;
            if(rset5D.next()){
               q5oD = rset5D.getInt("count(*)");
            }

            // QUESTION 6

            String sqlstr6A = "SELECT count(*) FROM responses WHERE questionNo=6 AND choice='a';";
            ResultSet rset6A = stmt.executeQuery(sqlstr6A); // run the SQL statement
            int q6oA = 0;
            if(rset6A.next()){
               q6oA = rset6A.getInt("count(*)");
            }
            

            String sqlstr6B = "SELECT count(*) FROM responses WHERE questionNo=6 AND choice='b';";
            ResultSet rset6B = stmt.executeQuery(sqlstr6B); // run the SQL statement
            int q6oB = 0;
            if(rset6B.next()){
               q6oB = rset6B.getInt("count(*)");
            }
            

            String sqlstr6C = "SELECT count(*) FROM responses WHERE questionNo=6 AND choice='c';";
            ResultSet rset6C = stmt.executeQuery(sqlstr6C); // run the SQL statement
            int q6oC = 0;
            if(rset6C.next()){
               q6oC = rset6C.getInt("count(*)");
            }
            
            
            String sqlstr6D = "SELECT count(*) FROM responses WHERE questionNo=6 AND choice='d';";
            ResultSet rset6D = stmt.executeQuery(sqlstr6D); // run the SQL statement
            int q6oD = 0;
            if(rset6D.next()){
               q6oD = rset6D.getInt("count(*)");
            }

            // QUESTION 7

            String sqlstr7A = "SELECT count(*) FROM responses WHERE questionNo=7 AND choice='a';";
            ResultSet rset7A = stmt.executeQuery(sqlstr7A); // run the SQL statement
            int q7oA = 0;
            if(rset7A.next()){
               q7oA = rset7A.getInt("count(*)");
            }
            

            String sqlstr7B = "SELECT count(*) FROM responses WHERE questionNo=7 AND choice='b';";
            ResultSet rset7B = stmt.executeQuery(sqlstr7B); // run the SQL statement
            int q7oB = 0;
            if(rset7B.next()){
               q7oB = rset7B.getInt("count(*)");
            }
            

            String sqlstr7C = "SELECT count(*) FROM responses WHERE questionNo=7 AND choice='c';";
            ResultSet rset7C = stmt.executeQuery(sqlstr7C); // run the SQL statement
            int q7oC = 0;
            if(rset7C.next()){
               q7oC = rset7C.getInt("count(*)");
            }
            
            
            String sqlstr7D = "SELECT count(*) FROM responses WHERE questionNo=7 AND choice='d';";
            ResultSet rset7D = stmt.executeQuery(sqlstr7D); // run the SQL statement
            int q7oD = 0;
            if(rset7D.next()){
               q7oD = rset7D.getInt("count(*)");
            }

            // QUESTION 8

            String sqlstr8A = "SELECT count(*) FROM responses WHERE questionNo=8 AND choice='a';";
            ResultSet rset8A = stmt.executeQuery(sqlstr8A); // run the SQL statement
            int q8oA = 0;
            if(rset8A.next()){
               q8oA = rset8A.getInt("count(*)");
            }
            

            String sqlstr8B = "SELECT count(*) FROM responses WHERE questionNo=8 AND choice='b';";
            ResultSet rset8B = stmt.executeQuery(sqlstr8B); // run the SQL statement
            int q8oB = 0;
            if(rset8B.next()){
               q8oB = rset8B.getInt("count(*)");
            }
            

            String sqlstr8C = "SELECT count(*) FROM responses WHERE questionNo=8 AND choice='c';";
            ResultSet rset8C = stmt.executeQuery(sqlstr8C); // run the SQL statement
            int q8oC = 0;
            if(rset8C.next()){
               q8oC = rset8C.getInt("count(*)");
            }
            
            
            String sqlstr8D = "SELECT count(*) FROM responses WHERE questionNo=8 AND choice='d';";
            ResultSet rset8D = stmt.executeQuery(sqlstr8D); // run the SQL statement
            int q8oD = 0;
            if(rset8D.next()){
               q8oD = rset8D.getInt("count(*)");
            }

            // QUESTION 9

            String sqlstr9A = "SELECT count(*) FROM responses WHERE questionNo=9 AND choice='a';";
            ResultSet rset9A = stmt.executeQuery(sqlstr9A); // run the SQL statement
            int q9oA = 0;
            if(rset9A.next()){
               q9oA = rset9A.getInt("count(*)");
            }
            

            String sqlstr9B = "SELECT count(*) FROM responses WHERE questionNo=9 AND choice='b';";
            ResultSet rset9B = stmt.executeQuery(sqlstr9B); // run the SQL statement
            int q9oB = 0;
            if(rset9B.next()){
               q9oB = rset9B.getInt("count(*)");
            }
            

            String sqlstr9C = "SELECT count(*) FROM responses WHERE questionNo=9 AND choice='c';";
            ResultSet rset9C = stmt.executeQuery(sqlstr9C); // run the SQL statement
            int q9oC = 0;
            if(rset9C.next()){
               q9oC = rset9C.getInt("count(*)");
            }
            
            
            String sqlstr9D = "SELECT count(*) FROM responses WHERE questionNo=9 AND choice='d';";
            ResultSet rset9D = stmt.executeQuery(sqlstr9D); // run the SQL statement
            int q9oD = 0;
            if(rset9D.next()){
               q9oD = rset9D.getInt("count(*)");
            }

            // QUESTION 10

            String sqlstr10A = "SELECT count(*) FROM responses WHERE questionNo=10 AND choice='a';";
            ResultSet rset10A = stmt.executeQuery(sqlstr10A); // run the SQL statement
            int q10oA = 0;
            if(rset10A.next()){
               q10oA = rset10A.getInt("count(*)");
            }
            

            String sqlstr10B = "SELECT count(*) FROM responses WHERE questionNo=10 AND choice='b';";
            ResultSet rset10B = stmt.executeQuery(sqlstr10B); // run the SQL statement
            int q10oB = 0;
            if(rset10B.next()){
               q10oB = rset10B.getInt("count(*)");
            }
            

            String sqlstr10C = "SELECT count(*) FROM responses WHERE questionNo=10 AND choice='c';";
            ResultSet rset10C = stmt.executeQuery(sqlstr10C); // run the SQL statement
            int q10oC = 0;
            if(rset10C.next()){
               q10oC = rset10C.getInt("count(*)");
            }
            
            
            String sqlstr10D = "SELECT count(*) FROM responses WHERE questionNo=10 AND choice='d';";
            ResultSet rset10D = stmt.executeQuery(sqlstr10D); // run the SQL statement
            int q10oD = 0;
            if(rset10D.next()){
               q10oD = rset10D.getInt("count(*)");
            }
            










            out.println("<head>");
             out.println("<script type=\"text/javascript\" src=\"https://www.gstatic.com/charts/loader.js\"></script>");
             out.println("<script src=\"https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js\"></script>");
             out.println("<script src=\"https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.16.0/umd/popper.min.js\"></script>");
             out.println("<script src=\"https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js\"></script>");
             out.println("<meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">");
             out.println("<meta charset=\"utf-8\">");
             out.println("<link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css\">");
          


             out.println("<script type=\"text/javascript\">");
               out.println("google.charts.load('current', {'packages':['bar']});");
               out.println("google.charts.load('current', {'packages':['corechart']});");
               out.println("google.charts.setOnLoadCallback(drawChart);");
               out.println("google.charts.setOnLoadCallback(drawChart2);");
               out.println("google.charts.setOnLoadCallback(drawChart3);");
               out.println("google.charts.setOnLoadCallback(drawChart4);");
               out.println("google.charts.setOnLoadCallback(drawChart5);");
               out.println("google.charts.setOnLoadCallback(drawChart6);");
               out.println("google.charts.setOnLoadCallback(drawChart7);");
               out.println("google.charts.setOnLoadCallback(drawChart8);");
               out.println("google.charts.setOnLoadCallback(drawChart9);");
               out.println("google.charts.setOnLoadCallback(drawChart10);");

               


               out.println("function drawChart() {");
                 out.println("var data = google.visualization.arrayToDataTable([");
                   out.println("['Option', 'Frequency'],");
                   out.println("['A'," + q1oA + "],");
                   out.println("['B'," + q1oB + "],");
                   out.println("['C'," + q1oC + "],");
                   out.println("['D'," + q1oD + "]");
                 out.println("]);");

                 out.println("var options = {");
                   out.println("title: 'Question 1 Choice Distribution'");
                 out.println("};");

                 out.println("var chart = new google.visualization.PieChart(document.getElementById('question1_chart'));");

                 out.println("chart.draw(data, options);");
               out.println("}");

               out.println("function drawChart2() {");
                 out.println("var data = google.visualization.arrayToDataTable([");
                   out.println("['Option', 'Frequency'],");
                   out.println("['A'," + q2oA + "],");
                   out.println("['B'," + q2oB + "],");
                   out.println("['C'," + q2oC + "],");
                   out.println("['D'," + q2oD + "]");
                 out.println("]);");

                 out.println("var options = {");
                   out.println("title: 'Question 2 Choice Distribution'");
                 out.println("};");

                 out.println("var chart = new google.visualization.PieChart(document.getElementById('question2_chart'));");

                 out.println("chart.draw(data, options);");
               out.println("}");

               out.println("function drawChart3() {");
                 out.println("var data = google.visualization.arrayToDataTable([");
                   out.println("['Option', 'Frequency'],");
                   out.println("['A'," + q3oA + "],");
                   out.println("['B'," + q3oB + "],");
                   out.println("['C'," + q3oC + "],");
                   out.println("['D'," + q3oD + "]");
                 out.println("]);");

                 out.println("var options = {");
                   out.println("title: 'Question 3 Choice Distribution'");
                 out.println("};");

                 out.println("var chart = new google.visualization.PieChart(document.getElementById('question3_chart'));");

                 out.println("chart.draw(data, options);");
               out.println("}");

               out.println("function drawChart4() {");
                 out.println("var data = google.visualization.arrayToDataTable([");
                   out.println("['Option', 'Frequency'],");
                   out.println("['A'," + q4oA + "],");
                   out.println("['B'," + q4oB + "],");
                   out.println("['C'," + q4oC + "],");
                   out.println("['D'," + q4oD + "]");
                 out.println("]);");

                 out.println("var options = {");
                   out.println("title: 'Question 4 Choice Distribution'");
                 out.println("};");

                 out.println("var chart = new google.visualization.PieChart(document.getElementById('question4_chart'));");

                 out.println("chart.draw(data, options);");
               out.println("}");

               out.println("function drawChart5() {");
                 out.println("var data = google.visualization.arrayToDataTable([");
                   out.println("['Option', 'Frequency'],");
                   out.println("['A'," + q5oA + "],");
                   out.println("['B'," + q5oB + "],");
                   out.println("['C'," + q5oC + "],");
                   out.println("['D'," + q5oD + "]");
                 out.println("]);");

                 out.println("var options = {");
                   out.println("title: 'Question 5 Choice Distribution'");
                 out.println("};");

                 out.println("var chart = new google.visualization.PieChart(document.getElementById('question5_chart'));");

                 out.println("chart.draw(data, options);");
               out.println("}");

               out.println("function drawChart6() {");
                 out.println("var data = google.visualization.arrayToDataTable([");
                   out.println("['Option', 'Frequency'],");
                   out.println("['A'," + q6oA + "],");
                   out.println("['B'," + q6oB + "],");
                   out.println("['C'," + q6oC + "],");
                   out.println("['D'," + q6oD + "]");
                 out.println("]);");

                 out.println("var options = {");
                   out.println("title: 'Question 6 Choice Distribution'");
                 out.println("};");

                 out.println("var chart = new google.visualization.PieChart(document.getElementById('question6_chart'));");

                 out.println("chart.draw(data, options);");
               out.println("}");

               out.println("function drawChart7() {");
                 out.println("var data = google.visualization.arrayToDataTable([");
                   out.println("['Option', 'Frequency'],");
                   out.println("['A'," + q7oA + "],");
                   out.println("['B'," + q7oB + "],");
                   out.println("['C'," + q7oC + "],");
                   out.println("['D'," + q7oD + "]");
                 out.println("]);");

                 out.println("var options = {");
                   out.println("title: 'Question 7 Choice Distribution'");
                 out.println("};");

                 out.println("var chart = new google.visualization.PieChart(document.getElementById('question7_chart'));");

                 out.println("chart.draw(data, options);");
               out.println("}");

               out.println("function drawChart8() {");
                 out.println("var data = google.visualization.arrayToDataTable([");
                   out.println("['Option', 'Frequency'],");
                   out.println("['A'," + q8oA + "],");
                   out.println("['B'," + q8oB + "],");
                   out.println("['C'," + q8oC + "],");
                   out.println("['D'," + q8oD + "]");
                 out.println("]);");

                 out.println("var options = {");
                   out.println("title: 'Question 8 Choice Distribution'");
                 out.println("};");

                 out.println("var chart = new google.visualization.PieChart(document.getElementById('question8_chart'));");

                 out.println("chart.draw(data, options);");
               out.println("}");

               out.println("function drawChart9() {");
                 out.println("var data = google.visualization.arrayToDataTable([");
                   out.println("['Option', 'Frequency'],");
                   out.println("['A'," + q9oA + "],");
                   out.println("['B'," + q9oB + "],");
                   out.println("['C'," + q9oC + "],");
                   out.println("['D'," + q9oD + "]");
                 out.println("]);");

                 out.println("var options = {");
                   out.println("title: 'Question 9 Choice Distribution'");
                 out.println("};");

                 out.println("var chart = new google.visualization.PieChart(document.getElementById('question9_chart'));");

                 out.println("chart.draw(data, options);");
               out.println("}");

               out.println("function drawChart10() {");
                 out.println("var data = google.visualization.arrayToDataTable([");
                   out.println("['Option', 'Frequency'],");
                   out.println("['A'," + q10oA + "],");
                   out.println("['B'," + q10oB + "],");
                   out.println("['C'," + q10oC + "],");
                   out.println("['D'," + q10oD + "]");
                 out.println("]);");

                 out.println("var options = {");
                   out.println("title: 'Question 10 Choice Distribution'");
                 out.println("};");

                 out.println("var chart = new google.visualization.PieChart(document.getElementById('question10_chart'));");

                 out.println("chart.draw(data, options);");
               out.println("}");


             out.println("</script>");
            out.println("</head>");
            out.println("<body>");

            out.println("<!-- Tab links -->");
            out.println("<div class=\"tab\">");
              out.println("<button class=\"tablinks\" onclick=\"openCity(event, 'A1')\">Question 1</button>");
              out.println("<button class=\"tablinks\" onclick=\"openCity(event, 'A2')\">Question 2</button>");
              out.println("<button class=\"tablinks\" onclick=\"openCity(event, 'A3')\">Question 3</button>");
              out.println("<button class=\"tablinks\" onclick=\"openCity(event, 'A4')\">Question 4</button>");
              out.println("<button class=\"tablinks\" onclick=\"openCity(event, 'A5')\">Question 5</button>");
              out.println("<button class=\"tablinks\" onclick=\"openCity(event, 'A6')\">Question 6</button>");
              out.println("<button class=\"tablinks\" onclick=\"openCity(event, 'A7')\">Question 7</button>");
              out.println("<button class=\"tablinks\" onclick=\"openCity(event, 'A8')\">Question 8</button>");
              out.println("<button class=\"tablinks\" onclick=\"openCity(event, 'A9')\">Question 9</button>");
              out.println("<button class=\"tablinks\" onclick=\"openCity(event, 'A10')\">Question 10</button>");
            out.println("</div>");

            out.println("<!-- Tab content -->");
            out.println("<div id=\"A1\" class=\"tabcontent\">");
              out.println("<div id=\"question1_chart\" style=\"width: 900px; height: 500px;\"></div>");
              out.println("<p>Comments for Question 1: "+q1comment+" </p>");
            out.println("</div>");

            out.println("<div id=\"A2\" class=\"tabcontent\">");
              out.println("<div id=\"question2_chart\" style=\"width: 900px; height: 500px;\"></div>");
              out.println("<p>Comments for Question 2: "+q2comment+" </p>");
            out.println("</div>");

            out.println("<div id=\"A3\" class=\"tabcontent\">");
              out.println("<div id=\"question3_chart\" style=\"width: 900px; height: 500px;\"></div>");
              out.println("<p>Comments for Question 3: "+q3comment+" </p>");
            out.println("</div>");

            out.println("<div id=\"A4\" class=\"tabcontent\">");
              out.println("<div id=\"question4_chart\" style=\"width: 900px; height: 500px;\"></div>");
              out.println("<p>Comments for Question 4: "+q4comment+" </p>");
            out.println("</div>");

            out.println("<div id=\"A5\" class=\"tabcontent\">");
              out.println("<div id=\"question5_chart\" style=\"width: 900px; height: 500px;\"></div>");
              out.println("<p>Comments for Question 5: "+q5comment+" </p>");
            out.println("</div>");

            out.println("<div id=\"A6\" class=\"tabcontent\">");
              out.println("<div id=\"question6_chart\" style=\"width: 900px; height: 500px;\"></div>");
              out.println("<p>Comments for Question 6: "+q6comment+" </p>");
            out.println("</div>");

            out.println("<div id=\"A7\" class=\"tabcontent\">");
              out.println("<div id=\"question7_chart\" style=\"width: 900px; height: 500px;\"></div>");
              out.println("<p>Comments for Question 7: "+q7comment+" </p>");
            out.println("</div>");

            out.println("<div id=\"A8\" class=\"tabcontent\">");
              out.println("<div id=\"question8_chart\" style=\"width: 900px; height: 500px;\"></div>");
              out.println("<p>Comments for Question 8: "+q8comment+" </p>");
            out.println("</div>");

            out.println("<div id=\"A9\" class=\"tabcontent\">");
              out.println("<div id=\"question9_chart\" style=\"width: 900px; height: 500px;\"></div>");
              out.println("<p>Comments for Question 9: "+q9comment+" </p>");
            out.println("</div>");

            out.println("<div id=\"A10\" class=\"tabcontent\">");
              out.println("<div id=\"question10_chart\" style=\"width: 900px; height: 500px;\"></div>");
              out.println("<p>Comments for Question 10: "+q10comment+" </p>");
            out.println("</div>");

            out.println("<script>");

            out.println("function openCity(evt, cityName) {");
              out.println("// Declare all variables");
              out.println("var i, tabcontent, tablinks;");

              out.println("// Get all elements with class=\"tabcontent\" and hide them");
              out.println("tabcontent = document.getElementsByClassName(\"tabcontent\");");
              out.println("for (i = 0; i < tabcontent.length; i++) {");
                out.println("tabcontent[i].style.display = \"none\";");
              out.println("}");

              out.println("// Get all elements with class=\"tablinks\" and remove the class \"active\"");
              out.println("tablinks = document.getElementsByClassName(\"tablinks\");");
              out.println("for (i = 0; i < tablinks.length; i++) {");
                out.println("tablinks[i].className = tablinks[i].className.replace(\" active\", \"\");");
              out.println("}");

              out.println("// Show the current tab, and add an \"active\" class to the button that opened the tab");
              out.println("document.getElementById(cityName).style.display = \"block\";");
              out.println("evt.currentTarget.className += \" active\";");
            out.println("}");

            out.println("</script>");

             /* out.println("<div id=\"question1_chart\" style=\"width: 900px; height: 500px;\"></div>");
             out.println("<div id=\"question2_chart\" style=\"width: 900px; height: 500px;\"></div>");
             out.println("<div id=\"question3_chart\" style=\"width: 900px; height: 500px;\"></div>");
             out.println("<div id=\"question4_chart\" style=\"width: 900px; height: 500px;\"></div>");
             out.println("<div id=\"question5_chart\" style=\"width: 900px; height: 500px;\"></div>");
             out.println("<div id=\"question6_chart\" style=\"width: 900px; height: 500px;\"></div>");
             out.println("<div id=\"question7_chart\" style=\"width: 900px; height: 500px;\"></div>");
             out.println("<div id=\"question8_chart\" style=\"width: 900px; height: 500px;\"></div>");
             out.println("<div id=\"question9_chart\" style=\"width: 900px; height: 500px;\"></div>");
             out.println("<div id=\"question10_chart\" style=\"width: 900px; height: 500px;\"></div>"); */
            out.println("</body>"); 


   

         /* String sqlstr1 = "SELECT choice, COUNT(*) AS count FROM responses WHERE questionNo=1 GROUP BY choice;";
         int count1 = stmt.executeUpdate(sqlstr1); // run the SQL statement

         String sqlstr1 = "SELECT choice, COUNT(*) AS count FROM responses WHERE questionNo=2 GROUP BY choice;";
         int count2 = stmt.executeUpdate(sqlstr1); // run the SQL statement

         String sqlstr1 = "SELECT choice, COUNT(*) AS count FROM responses WHERE questionNo=3 GROUP BY choice;";
         int count3 = stmt.executeUpdate(sqlstr1); // run the SQL statement

         String sqlstr1 = "SELECT choice, COUNT(*) AS count FROM responses WHERE questionNo=4 GROUP BY choice;";
         int count4 = stmt.executeUpdate(sqlstr1); // run the SQL statement

         String sqlstr1 = "SELECT choice, COUNT(*) AS count FROM responses WHERE questionNo=5 GROUP BY choice;";
         int count5 = stmt.executeUpdate(sqlstr1); // run the SQL statement

         String sqlstr1 = "SELECT choice, COUNT(*) AS count FROM responses WHERE questionNo=6 GROUP BY choice;";
         int count6 = stmt.executeUpdate(sqlstr1); // run the SQL statement

         String sqlstr1 = "SELECT choice, COUNT(*) AS count FROM responses WHERE questionNo=7 GROUP BY choice;";
         int count7 = stmt.executeUpdate(sqlstr1); // run the SQL statement

         String sqlstr1 = "SELECT choice, COUNT(*) AS count FROM responses WHERE questionNo=8 GROUP BY choice;";
         int count8 = stmt.executeUpdate(sqlstr1); // run the SQL statement

         String sqlstr1 = "SELECT choice, COUNT(*) AS count FROM responses WHERE questionNo=9 GROUP BY choice;";
         int count9 = stmt.executeUpdate(sqlstr1); // run the SQL statement

         String sqlstr1 = "SELECT choice, COUNT(*) AS count FROM responses WHERE questionNo=10 GROUP BY choice;";
         int count10 = stmt.executeUpdate(sqlstr1); // run the SQL statement */


      } catch(Exception ex) {
         out.println("<p>Error: " + ex.getMessage() + "</p>");
         out.println("<p>Check Tomcat console for details.</p>");
         ex.printStackTrace();
      }  // Step 5: Close conn and stmt - Done automatically by try-with-resources (JDK 7)
 
      out.println("</body></html>");
      out.close();
   }


}

