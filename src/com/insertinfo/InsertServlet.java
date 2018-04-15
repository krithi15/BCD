package com.insertinfo;

import java.io.IOException;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.dao.MyDao;
import com.model.Patient;

/**
 * Servlet implementation class InsertServlet
 */
@WebServlet("/insertServlet")
public class InsertServlet extends HttpServlet {
	
	String activity ="root";
	String name = "abc";
	String patientName =" ";
	String age = " ";
	String nsensors ="";
	String stime = "";
	String stoptime ="";
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public InsertServlet() {
        super();
       
    }

	/**
	 * @see Servlet#init(ServletConfig)
	 */
	public void init(ServletConfig config) throws ServletException {
		// TODO Auto-generated method stub
	}

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	/*protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		System.out.println("In the service method of Servlet");
		String ac = request.getParameter(activity);
		String nm = request.getParameter(name);
		String ag = request.getParameter(age);
		String nsensor =  request.getParameter(nsensors);
		String startime = request.getParameter(stime);
		String stoptim = request.getParameter(stoptime);
		System.out.println("Information Accepted");
	}*/

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		System.out.println("I have receievd the request...");
		String receivedActivity = request.getParameter("activity");
		
		Patient modelPatient = MyDao.getPatient();
		modelPatient.setActivity(receivedActivity);
		MyDao.insertInfo();
		System.out.println("finished insertion...");
		
		/*String pname = request.getParameter("pname");
		String age = request.getParameter("pname");
		System.out.println("Activity is "+ request.getParameter("pname"));*/
		
		//responsegetWriter().append("Served at: ").append(request.getContextPath());
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		System.out.println("I have receievd the request in doPost of insertServlet...");
		String receivedActivity = request.getParameter("activity");
		String receivedPname = request.getParameter("pname");
		String receivedAge = request.getParameter("age");
		String receivedSensorNumbers = request.getParameter("sensors");
		String receivedStartTime = request.getParameter("stime");
		String receivedStopTime = request.getParameter("stoptime");
		Patient modelPatient = MyDao.getPatient();
		modelPatient.setActivity(receivedActivity);
		modelPatient.setPname(receivedPname);
		modelPatient.setAge(receivedAge);
		modelPatient.setSensors(receivedSensorNumbers);
		modelPatient.setStartime(receivedStartTime);
		modelPatient.setStoptime(receivedStopTime);
		MyDao.insertInfo();
		System.out.println("finished insertion...");
		System.out.println("Response is getting redirected");
		response.sendRedirect("http://localhost:8080/Trail/sensor.jsp");
		//responsegetWriter().append("Served at: ").append(request.getContextPath());
	}
}
