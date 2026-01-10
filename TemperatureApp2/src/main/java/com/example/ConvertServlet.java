package com.example;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

@WebServlet("/ConvertServlet")
public class ConvertServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) 
            throws ServletException, IOException {

        String celsiusStr = request.getParameter("celsius");
        double celsius = Double.parseDouble(celsiusStr);
        double fahrenheit = TemperatureService.celsiusToFahrenheit(celsius);


        request.setAttribute("fahrenheit", fahrenheit);
        request.getRequestDispatcher("result.jsp").forward(request, response);
    }
}
