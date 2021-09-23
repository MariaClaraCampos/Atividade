package formulario;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class ServletForms1
 */
@WebServlet("/ServletForms1")
public class ServletForms1 extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private static final String PrintWriter = null;
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ServletForms1() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest req, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter resposta =  req.getWriter();
		
		resposta.write("<html>");
		resposta.write("<head>");
		resposta.write("<title>Formulário</title>");
		resposta.write("</head>");
		resposta.write("<body>");
		resposta.write("<h2>Preencha com seus Dados:</h2>");
		resposta.write("<form action=\"ServletForms2\" method=\"post\">");
		
		/*Etapa 2*/
		String nome = req.getParameter("nome");
		String sobrenome = req.getParameter("sobrenome");
		String  CPF = req.getParameter("CPF");
		String telefone = req.getParameter("telefone");
		String email = req.getParameter("email");
		String estadocivil = req.getParameter("estado civil");
		
		
		/*Etapa 3*/
		HttpServletRequest request;

		HttpSession nome_sessao = request.getSession();
		HttpSession sobrenome_sessao = request.getSession();
		HttpSession CPF_sessao = request.getSession();
		HttpSession telefone_sessao = request.getSession();
		HttpSession email_sessao = request.getSession();
		HttpSession estadocivil_sessao = request.getSession();
		
		
		nome_sessao.setAttribute("nome", nome);
		sobrenome_sessao.setAttribute("sobrenome", sobrenome);
		CPF_sessao.setAttribute("CPF", CPF);
		telefone_sessao.setAttribute("telefone", telefone);
		email_sessao.setAttribute("email", email);
		estadocivil_sessao.setAttribute("estado civil", estadocivil);
		
		resposta.write("</html></body>");
		
	}

}
