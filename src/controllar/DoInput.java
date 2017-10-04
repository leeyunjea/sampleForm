package controllar;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.Order;

/**
 * Servlet implementation class DoInput
 */
@WebServlet("/doInput")
public class DoInput extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public DoInput() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String itemNumber = request.getParameter("itemNumber");
		String description = request.getParameter("description");
		String priceEach = request.getParameter("priceEach");
		String firstName = request.getParameter("firstName");
		String lastName = request.getParameter("lastName");
		String middleInitial = request.getParameter("middleInitial");
		String shippingAddress = request.getParameter("shippingAddress");
		String cardType = request.getParameter("cardType");
		String cardNumber = request.getParameter("cardNumber");
		String repeatCardNumber = request.getParameter("repeatCardNumber");
		
		if(itemNumber.equals("")) itemNumber = "No Value";
		
		else if(description.equals("")) description = "No Value";
		
		else if(priceEach.equals("")) priceEach = "No Value";
		
		else if(firstName.equals("")) firstName = "No Value";
		
		else if(lastName.equals("")) lastName = "No Value";
		
		else if(middleInitial.equals("")) middleInitial = "No Value";
		
		else if(shippingAddress.equals("")) shippingAddress = "No Value";
		
		else if(cardType.equals("")) cardType = "No Value";
		
		else if(cardNumber.equals("")) cardNumber = "No Value";
		
		
		Order order = new Order(itemNumber, description, priceEach, firstName, lastName, middleInitial, shippingAddress,
				cardType, cardNumber);

		request.setAttribute("order", order);

		String page;
		if (order == null)
			page = "/view/error.jsp";
		else if(!cardNumber.equals(repeatCardNumber))
			page = "/view/errorCard.jsp";
		else
			page = "/view/order.jsp";

		RequestDispatcher dispatcher = request.getRequestDispatcher(page);
		dispatcher.forward(request, response);
	}

}
