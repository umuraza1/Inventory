

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import group11dynamicweb.Databaseconnect;
import group11dynamicweb.Employee;

/**
 * Servlet implementation class Employ
 */
@WebServlet("/Employ")
public class Employ extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Employ() {
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
		String empfname=request.getParameter("empfname");
		String emplname=request.getParameter("emplname");
		String phone=request.getParameter("phone");
		String username=request.getParameter("username");
		String password=request.getParameter("password");
		Employee emp = new Employee(empfname,emplname, phone, username,password);
		Databaseconnect connection = new Databaseconnect();
		String result= "successfully";
		result=connection.inputemp(emp);
				
		response.getWriter().print(result);
		  try {
	        	 String[] rows = new String[1];
				FileWriter f=new FileWriter("C:\\Users\\UMURAZA\\Desktop\\employee.csv",true);
				BufferedWriter br=new BufferedWriter(f);
				PrintWriter pw=new PrintWriter(br);

				  
			    for(int p = 1; p<rows.length; p++){
			      pw.append(rows[p]);
			    }
				
				pw.println(empfname+ ","+emplname+","+phone+","+username+","+password);
				
				pw.flush();
				f.close();
				
				
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	    }
		
	
	}
	


