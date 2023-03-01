package org.user;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
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

import com.mysql.cj.xdevapi.PreparableStatement;

/**
 * Servlet implementation class Register
 */
@WebServlet("/Register")
@MultipartConfig
public class Register extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Register() {
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
		PrintWriter out = response.getWriter();
		
		String name = request.getParameter("user_name");
		String email = request.getParameter("user_email");
		String password = request.getParameter("user_password");
		Part p = request.getPart("image");
		String filename = p.getSubmittedFileName();
		out.println(filename);
		
		
		try {
			//Connection
			Thread.sleep(2000);
			
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/register","root","Ravi85423@");
			
			//query
			String query = "insert into user1(name,email,password,image) values(?,?,?,?)";
			
			PreparedStatement pstmt = conn.prepareStatement(query);
			
			pstmt.setString(1, name);
			pstmt.setString(2, email);
			pstmt.setString(3, password);
			pstmt.setString(4, filename);
			
			
			pstmt.executeUpdate();
			
			//upload
			InputStream is = p.getInputStream();
			byte[] data = new byte[is.available()];
			
			is.read(data);
			String path = request.getRealPath("/")+"pics"+File.separator+filename;
			FileOutputStream fos = new FileOutputStream(path);
			fos.write(data);
			fos.close();
			
			out.println("done");
		} catch (Exception e) {
			// TODO: handle exception
			out.println("error");
		}
		
	}

}
