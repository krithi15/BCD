package com.insertinfo;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.dao.MyDao;
import com.model.Sensor;
/**
 * Servlet implementation class SensorServlet
 */
@WebServlet("/SensorServlet")
public class SensorServlet extends HttpServlet {
	String sensorNumber;
	String timeOn;
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public SensorServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		System.out.println("Received Sensor Request in doGet");
		//response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		System.out.println("Received Sensor Request in doPost");
		String receivedSensorNumber = request.getParameter("sensorNumber");
		String receivedTimeOn = request.getParameter("timeOn");
		Sensor modelSensor = new Sensor();
		modelSensor.setSensorNumber(receivedSensorNumber);
		modelSensor.setTimeOn(receivedTimeOn);
		MyDao.insertSensorInfo();
		System.out.println("Inserted Sensor Infomation");
		System.out.println("Redirecting to Detect JSP");
		response.sendRedirect("http://localhost:8080/Trail/detect.jsp");
		//doGet(request, response);
	}

}
