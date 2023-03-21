package ifpr.edu.br.helloworld;

import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

import java.io.IOException;
import java.io.PrintWriter;

import static java.lang.System.out;

@WebServlet(name = "RequisicaoServlet", value = "/requisicao")
public class RequisicaoServlet extends HttpServlet {
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html");

        String method = req.getMethod();
        String requestURI = req.getRequestURI();
        String protocol = req.getProtocol();
        String remoteAddr = req.getRemoteAddr();

        PrintWriter out = resp.getWriter();
        out.println("<html><body>");
        out.println("<h3> Método: " + method + "</h3>");
        out.println("<h3> Uri do Pedido: " + requestURI + "</h3>");
        out.println("<h3> Protocolo: " + protocol + "</h3>");
        out.println("<h3> Endereço remoto: " + remoteAddr + "</h3>");
        out.println("</body></html>");
    }
}
