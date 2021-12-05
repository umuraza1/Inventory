

import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Part;

/**
 * Servlet implementation class Upload
 */
@MultipartConfig
@WebServlet("/Upload")
public class Upload extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Upload() {
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
		String connectionURL = "jdbc:mysql://localhost:3306/inventory";
		String user = "root";
		String pass = "";
		 
		int result = 0;
		Connection con = null;
		Part part = request.getPart("image");
		 
		if(part != null){
		try{
		Class.forName("com.mysql.jdbc.Driver");
		    con = DriverManager.getConnection(connectionURL, user, pass);
		    
		    PreparedStatement ps = con.prepareStatement("insert into image(image) values(?)");
		    InputStream is = part.getInputStream();
		    ps.setBlob(1, is);
		    result = ps.executeUpdate();
		}
		catch(Exception e){
		e.printStackTrace();
		}
		finally{
		if(con != null){
		try{
		con.close();
		}
		catch(Exception e){
		e.printStackTrace();
		}
		}
		}
		}
		if(result > 0){
		     response.sendRedirect("result.jsp?message=image+Uploaded");
		    }
		else{
		response.sendRedirect("result.jsp?message=Some+Error+Occurred");
		}
		}

	}


