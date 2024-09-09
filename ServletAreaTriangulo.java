

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ServletAreaTriangulo
 */
public class ServletAreaTriangulo extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * Default constructor. 
     */
    public ServletAreaTriangulo() {
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
		Double base = Double.parseDouble(request.getParameter("base"));
		Double altura  = Double.parseDouble(request.getParameter("altura"));
		
		Double area = (base * altura)/2;
		
		PrintWriter saida = response.getWriter();
		saida.println("<html lang=\"pt-br\">"
				+ "<meta charset=\"UTF-8\">"
				+ "<head><title>Área do Triangulo</title></head>"
				+ "<body><h1>A area do triangulo é: " + area + 
				"</h1></body></html>");
		
		
		
		
		
		doGet(request, response);
	}

}
 