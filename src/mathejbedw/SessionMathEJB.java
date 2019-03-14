package mathejbedw;

import java.util.Hashtable;

import javax.ejb.Remote;

@Remote
public interface SessionMathEJB {
//    public Hashtable mathAddition(String hashCode, Hashtable input) throws Exception;
//    public Hashtable mathSubtraction(String hashCode, Hashtable input) throws Exception;
//    public Hashtable mathMultiply(String hashCode, Hashtable input) throws Exception;
//    public Hashtable mathDivision(String hashCode, Hashtable input) throws Exception;
    public Hashtable mathOperation(String hashCode, Hashtable input) throws Exception;

}
