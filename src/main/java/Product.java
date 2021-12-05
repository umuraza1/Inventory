

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import group11dynamicweb.Databaseconnect;
import group11dynamicweb.Producta;

/**
 * Servlet implementation class Product
 */
@WebServlet("/Product")
public class Product extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Product() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String proname=request.getParameter("proname");
		String protype=request.getParameter("protype");
		String quantity=request.getParameter("quantity");
		String price=request.getParameter("price");
		String fabricationdate=request.getParameter("fabricationdate");
		String expireddate=request.getParameter("expireddate");
		Producta proa = new Producta(proname, protype,quantity, price, fabricationdate,
				expireddate);
		Databaseconnect connection = new Databaseconnect();
		String result= "successfully";
		result=connection.inputpro(proa);
				
		response.getWriter().print(result);
	}
	}


