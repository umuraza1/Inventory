

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import group11dynamicweb.Customer;
import group11dynamicweb.Databaseconnect;
import group11dynamicweb.Employee;

/**
 * Servlet implementation class Customers
 */
@WebServlet("/Customers")
public class Customers extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Customers() {
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
		String cfname=request.getParameter("cfname");
		String clname=request.getParameter("clname");
		String phone=request.getParameter("phone");
		int addid=Integer.parseInt(request.getParameter("addid"));
		Customer cust = new Customer(cfname,clname, phone, addid);
		Databaseconnect connection = new Databaseconnect();
		String result= "successfully";
		result=connection.insertcustomer(cust);
				
		response.getWriter().print(result);
	}

}
