import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
public class servlet2 extends HttpServlet{
	public void doGet(HttpServletRequest request , HttpServletResponse response)
throws IOException,ServletException
{
	response.setContentType("text/html");
	PrintWriter show = response.getWriter();
    show.println("Niraj");



}
}
