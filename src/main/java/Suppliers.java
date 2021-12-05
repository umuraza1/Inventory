

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import group11dynamicweb.Databaseconnect;
import group11dynamicweb.Producta;
import group11dynamicweb.Supplier;

/**
 * Servlet implementation class Suppliers
 */
@WebServlet("/Suppliers")
public class Suppliers extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Suppliers() {
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
		String supfname=request.getParameter("supfname");
		String suplname=request.getParameter("suplname");
		String phone=request.getParameter("phone");
		int proid=Integer.parseInt(request.getParameter("proid"));
		int quantity=Integer.parseInt(request.getParameter("quantity"));
		int price=Integer.parseInt(request.getParameter("price"));
		String date=request.getParameter("date");
		Supplier sup = new Supplier(supfname, suplname, phone,proid, quantity,  price, date);
		Databaseconnect connection = new Databaseconnect();
		String result= "successfully";
		result=connection.insertsup(sup);
				
		response.getWriter().print(result);
	}




	}


