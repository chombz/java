package CMT;

import java.io.IOException;
import java.io.PrintWriter;
import static java.lang.System.out;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.annotation.Resource;
import javax.ejb.EJB;
import javax.ejb.EJBException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.sql.rowset.CachedRowSet;
import javax.transaction.UserTransaction;

/**
 *
 * @author e.chomba
 */
public class CMTServlets extends HttpServlet
{

    @EJB
    private StudentAdmissionsBean studentAdmissionsBean;
    
    //Add a UserTransaction object
    @Resource
    UserTransaction utx;

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     * @throws java.lang.ClassNotFoundException
     * @throws java.sql.SQLException
     * @throws java.lang.InstantiationException
     * @throws java.lang.IllegalAccessException
     */
    protected void processRequest(HttpServletRequest request, 
                                  HttpServletResponse response)
    throws ServletException, IOException, ClassNotFoundException, 
           SQLException, InstantiationException, IllegalAccessException
    {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter())
        {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet CMTServlets</title>");
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet CMTServlets at " 
                       + request.getContextPath() + "</h1>");

            out.println("<h1>STUDENT DETAILS</h1>");
            String driver = "org.apache.derby.jdbc.ClientDriver";
            String url = "jdbc:derby://localhost:1527/sample";
            String username = "app";
            String password = "app";
            Class.forName(driver).newInstance();
            Connection conn = DriverManager.getConnection(url, username, 
                                                          password);
            out.println("Connection Done");
//          utx.begin();
//          out.println(studentAdmissionsBean.addStudent(conn));
//          out.println("Connection Done");
            CachedRowSet st = studentAdmissionsBean.display(conn);
            while(st.next())
            {
                out.println("Roll No: " + st.getString(1) + "Stud. Name1"
                           + st.getString(2));
            }
//          utx.commit();
            out.println("</body>");
            out.println("</html>");
        } catch (EJBException ex)
        {
            out.println(ex 
                       + "- Error: Method cannot execute in a transaction.");
        } catch (Exception ex)
        {
            out.println("Error: Other exception - " + ex);
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException
    {
        try
        {
            processRequest(request, response);
        } catch (ClassNotFoundException ex)
        {
            Logger.getLogger(CMTServlets.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex)
        {
            Logger.getLogger(CMTServlets.class.getName()).log(Level.SEVERE, null, ex);
        } catch (InstantiationException ex)
        {
            Logger.getLogger(CMTServlets.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex)
        {
            Logger.getLogger(CMTServlets.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException
    {
        try
        {
            processRequest(request, response);
        } catch (ClassNotFoundException | SQLException | InstantiationException | IllegalAccessException ex)
        {
            Logger.getLogger(CMTServlets.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo()
    {
        return "Short description";
    }// </editor-fold>

}
