import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
public class servlet1 extends HttpServlet{
	public void doGet(HttpServletRequest request , HttpServletResponse response)
throws IOException,ServletException
{
	response.setContentType("text/html");
	PrintWriter show = response.getWriter();
    show.println("Hello");

RequestDispatcher rd = request.getRequestDispatcher("/serv2");
rd.include(request,response);


}
}
