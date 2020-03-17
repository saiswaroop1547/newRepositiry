import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/validate")
public class validate extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public validate() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		int count=0;
		try {
			String name=request.getParameter("name");
			String pswd=request.getParameter("passwordd");
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/cts","root","root");
			ServletContext ctx=getServletContext();
			
			
			HttpSession session=request.getSession();
			Statement st=con.createStatement();
			System.out.println("connection created");
			ResultSet rs=st.executeQuery("select * from users");
			System.out.println("query executed");
			response.setContentType("text/html");
			PrintWriter out=response.getWriter();
			out.println("<html><body>");
			String t3="";
			System.out.println("bye");
			while(rs.next()) {
				System.out.println("hi");
				String t1=rs.getString(1);
				String t2=rs.getString(2);
				t3=rs.getString(3);
				System.out.println(t1);
				if(name.equals(t1)&& pswd.equals(t2)) {
					System.out.println("hi");
					count=1;
					break;
				}
				System.out.println(count);
			}
			if (count==1) {
				if(t3.equalsIgnoreCase("admin")) {
					System.out.println("Valid");
				    RequestDispatcher rd=ctx.getRequestDispatcher("/adminpage.jsp");
					request.setAttribute("User:", name);
					out.println("Welcome "+name);
				    rd.forward(request, response);
					//response.sendRedirect("/adminpage.jsp");
				}
				else {
					System.out.println("Valid");
					RequestDispatcher rd=ctx.getRequestDispatcher("/associatepage.jsp");
					session.setAttribute("User:", name);
					out.println("Welcome "+name);
					rd.forward(request, response);
				}
					
			}
			else
			{
				System.out.println("Invalid User ");
				RequestDispatcher rd=ctx.getRequestDispatcher("/login.jsp");
				rd.forward(request, response);
			}
			}
		catch(Exception e) {
			System.out.println(e);
		}
		
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
