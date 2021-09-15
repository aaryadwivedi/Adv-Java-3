
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Aarya
 */
@WebServlet(urlPatterns = {"/CalServlet"})
public class CalServlet extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
            String samount=request.getParameter("amount");
            String smonths=request.getParameter("months");
            float amount =Float.parseFloat(samount);
            float months =Float.parseFloat(smonths);
            float value=0;
            for(int i=0;i<months;i++)
            {
                value = value + amount *5/100.0f;
            }
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Your Final output</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h3>The final amount " + (value+amount) + " rupees</h3>");
            out.println("</body>");
            out.println("</html>");
    }
}
