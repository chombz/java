package CMT;

import com.sun.rowset.CachedRowSetImpl;
import com.sun.xml.rpc.processor.modeler.j2ee.xml.string;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import javax.ejb.Stateless;
import javax.ejb.TransactionAttribute;
import javax.ejb.TransactionAttributeType;
import javax.ejb.TransactionManagement;
import javax.ejb.TransactionManagementType;
import javax.sql.rowset.CachedRowSet;

/**
 *
 * @author e.chomba
 */
@Stateless
@TransactionManagement(TransactionManagementType.CONTAINER)

public class StudentAdmissionsBean
{

    @TransactionAttribute(TransactionAttributeType.MANDATORY)
    public String addStudent(Connection c)
    {
        String message;
        try
        {
            c.createStatement();
            CachedRowSet st = new CachedRowSetImpl();
            String query = "insert into Students values('S007','Martha')";
            st.setCommand(query);
            st.execute(c);
            message = "Row Inserted";
        } catch (SQLException e)
        {
            message = e.toString();
        }
        return message;
    }

    @TransactionAttribute(TransactionAttributeType.NEVER)
    public CachedRowSet display(Connection c) throws SQLException
    {
        Statement stmt = c.createStatement();
        CachedRowSet st = new CachedRowSetImpl();
        String quer = "select * from Students";
        st.setCommand(quer);
        st.execute(c);
        return st;
    }

}
