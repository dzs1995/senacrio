package servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet({ "/login", "/logout", "/atualizarsenha" })
public class AdminServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
    public AdminServlet() {
        super();
    }

    
    
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		
		if(request.getServletPath().equals("/login")){
			String login = request.getParameter("login");
			String senha = request.getParameter("senha");
			
			if(login.toLowerCase().equals("lpjr") && senha.equals("123")) {
				out.println("<h1>Logado</h1>");
			} else {
				out.print("<h1> Falha ao efetuar o login</h1>");
			}
		}
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
