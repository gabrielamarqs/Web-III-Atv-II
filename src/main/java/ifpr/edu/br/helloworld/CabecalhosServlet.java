package ifpr.edu.br.helloworld;

import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Locale;

@WebServlet(name = "CabecalhosServlet", value = "/cabecalhos")
public class CabecalhosServlet extends HttpServlet {

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html");

        String host = req.getHeader("HOST");
        String headerUserAgent = req.getHeader("USER-AGENT");
        String headerAccEnc = req.getHeader("ACCEPT-ENCODING");
        String headerAccLang = req.getHeader("ACCEPT-LANGUAGE");

        PrintWriter writer = resp.getWriter();
        writer.println("<html><body>");
        writer.println("<h3> host: " + host + "</h3>");
        writer.println("<h3> user-agent: " + headerUserAgent + "</h3>");
        writer.println("<h3> accept-encoding: " + headerAccEnc + "</h3>");
        writer.println("<h3> accept-language: " + headerAccLang + "</h3>");
        writer.println("</body></html>");



    }
}
