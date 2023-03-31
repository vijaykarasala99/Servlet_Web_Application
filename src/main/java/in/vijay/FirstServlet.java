package in.vijay;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/vijay")

public class FirstServlet extends HttpServlet {
	
	public void doGet(HttpServletRequest req, HttpServletResponse resp)throws IOException {
    PrintWriter writer=	resp.getWriter();
    writer.append("<h1>Welcome To HARSHA Constructions</h1>");
    
	}
}
