package formulario;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class ServletForms2
 */
@WebServlet("/ServletForms2")
public class ServletForms2 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ServletForms2() {
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
		PrintWriter saida = response.getWriter();
		
		saida.write("<html>");
		saida.write("<head>");
		saida.write("<title>Formulário</title>");
		saida.write("</head>");
		saida.write("<body>");
		saida.write("<h2>Preencha com seus Dados:</h2>");
		saida.write("<form action=\"ServletForms1\" method=\"post\">");
		
		HttpServletRequest request;

		HttpSession nome_sessao = request.getSession();
		HttpSession sobrenome_sessao = request.getSession();
		HttpSession CPF_sessao = request.getSession();
		HttpSession telefone_sessao = request.getSession();
		HttpSession email_sessao = request.getSession();
		HttpSession estadocivil_sessao = request.getSession();
		
		
		String nome = (String) nome_sessao.getAttribute("nome");
		String sobrenome = (String) sobrenome_sessao.getAttribute("sobrenome");
		String telefone = (String) telefone_sessao.getAttribute("telefone");
		String CPF = (String) CPF_sessao.getAttribute("CPF");
		String email = (String) email_sessao.getAttribute("email");
		String estadocivil = (String) estadocivil_sessao.getAttribute("estado civil");
		
		
		
		
	}

}
