import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(urlPatterns = {"/patients", "/doctors"}, loadOnStartup = 1)
public class servlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException{
        resp.setContentType("text/html");

        if(req.getServletPath().equals("/patients") ){
            resp.getWriter().write("<HTML>\n" +
                    "\n" +
                    "<HEAD>\n" +
                    "\n" +
                    "<TITLE>Your Title Here</TITLE>\n" +
                    "\n" +
                    "</HEAD>\n" +
                    "\n" +
                    "<BODY BGCOLOR=\"FFFFFF\">\n" +
                    "\n" +
                    "<CENTER><IMG SRC=\"clouds.jpg\" ALIGN=\"BOTTOM\"> </CENTER>\n" +
                    "\n" +
                    "<HR>\n" +
                    "\n" +
                    "<a href=\"http://somegreatsite.com\">Link Name</a>\n" +
                    "\n" +
                    "is a link to another nifty site\n" +
                    "\n" +
                    "<H1>This is a Header</H1>\n" +
                    "\n" +
                    "<H2>This is a Medium Header</H2>\n" +
                    "\n" +
                    "Send me mail at <a href=\"mailto:support@yourcompany.com\">\n" +
                    "\n" +
                    "support@yourcompany.com</a>.\n" +
                    "\n" +
                    "<P> This is a new paragraph!\n" +
                    "\n" +
                    "<P> <B>This is a new paragraph!</B>\n" +
                    "\n" +
                    "<BR> <B><I>This is a new sentence without a paragraph break, in bold italics.</I></B>\n" +
                    "\n" +
                    "<HR>\n" +
                    "\n" +
                    "</BODY>\n" +
                    "\n" +
                    "</HTML> ");
        } else if (req.getServletPath().equals("/doctors")) {
            resp.getWriter().write("This is the doctors directory!");
        }
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
    }

}
