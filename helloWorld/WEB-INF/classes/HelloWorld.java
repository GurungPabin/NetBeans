import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
public class HelloWorld extends HttpServlet{
/*public void doGet(HttpServletRequest request, HttpServletResponse response)
throws IOException , ServletException
{
response.setContentType("text/html");
PrintWriter out = response.getWriter();
out.println("<html>");
out.println("<head>");
out.println("<title>Hello Word!</title>");
out.println("</head>");
out.println("<body>");
out.println("<h1>Hello Word!</h1>");
out.println("</body>");
out.println("</html>");*/

public void doGet(HttpServletRequest request , HttpServletResponse response)
throws IOException,ServletException
{
	response.setContentType("text/html");
	PrintWriter show = response.getWriter();
    show.println("HelloWorld");



}
}



