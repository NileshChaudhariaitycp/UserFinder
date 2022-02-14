

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/other")
public class SecondServlet extends HttpServlet {
	
    
    

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		PrintWriter out = response.getWriter();
		String b  =(String)request.getAttribute("key");
        String c =(String) request.getAttribute("key2");
		GetConfirm gc = new GetConfirm();
		boolean status =gc.getconfirm(b,c);
		if(status)
		{
			out.println("Valid User");
		}
		else
		{
			out.println("not valid user");
		}
		
		
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
