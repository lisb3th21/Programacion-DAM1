
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Suma
 */
@WebServlet("/Suma")
public class Suma extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int a = Integer.parseInt(request.getParameter("a"));
		System.out.println(a);
		
		int b = Integer.parseInt(request.getParameter("b"));
		System.out.println(b);
		
		int suma = a+b;
		System.out.println(suma);
		
		response.addHeader("Access-Control-Allow-Origin","*" );
		response.getWriter().append(String.valueOf(suma));
	}

}
