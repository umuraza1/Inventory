

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import group11dynamicweb.Databaseconnect;
import group11dynamicweb.Employee;
import group11dynamicweb.Payment;

/**
 * Servlet implementation class Payments
 */
@WebServlet("/Payments")
public class Payments extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Payments() {
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
	int proid =Integer.parseInt(request.getParameter("proid"));
		int custid=Integer.parseInt(request.getParameter("custid"));
		int quantity=Integer.parseInt(request.getParameter("quantity"));
		int amountpaid=Integer.parseInt(request.getParameter("amountpaid"));
		String date= request.getParameter("date");
		Payment pay = new Payment(proid,custid,quantity,amountpaid,date);
		Databaseconnect connection = new Databaseconnect();
		String result= "successfully";
		result=connection.insertpay(pay);
				
		response.getWriter().print(result);
	}	}

