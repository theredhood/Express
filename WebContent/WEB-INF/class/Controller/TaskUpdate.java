package Controller;

import java.io.IOException;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import DBUtil.Control;

/**
 * Servlet implementation class TaskUpdate
 */
@WebServlet("/TaskUpdate")
public class TaskUpdate extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public TaskUpdate() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		request.setCharacterEncoding("utf-8");
		response.setContentType("text/html;charset=utf-8");
		HttpSession session = request.getSession(true);
		String taskNum=(String) session.getAttribute("taskNum");
		ResultSet rs=new Control().selectTask(request, false, taskNum);
		String name=request.getParameter("name");
		String department=request.getParameter("department");
		String email=request.getParameter("email");
		String phoneNum=request.getParameter("phoneNum");
		String company=request.getParameter("company");
		String inTime=request.getParameter("inTime");
		String IdNum=request.getParameter("IdNum");
	
		try{
			rs.next();
		if(name=="")
			name=rs.getString("Name");
		if(department=="")
			department=rs.getString("Department");
		if(email=="")
			email=rs.getString("Email");
		if(phoneNum=="")
			phoneNum=rs.getString("PhoneNumber");
		if(company=="")
			company=rs.getString("Company");
		if(inTime=="")
			inTime=rs.getString("InTime");
		if(IdNum=="")
			IdNum=rs.getString("IdentifyNumber");
		new Control().update(request, phoneNum, "task",name,department,email,taskNum,company,inTime,IdNum);
		}catch(SQLException e){
			e.printStackTrace();
		}
		String site = new String("http://localhost:8080/Express/ShowTask.jsp");

	      response.setStatus(response.SC_MOVED_TEMPORARILY);
	      response.setHeader("Location", site);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

}
