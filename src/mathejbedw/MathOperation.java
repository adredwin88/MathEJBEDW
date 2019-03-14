package mathejbedw;

import java.util.Hashtable;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;

import org.apache.log4j.Logger;

public class MathOperation {
    Logger logger = Logger.getLogger("MathOperationEDW");

    public String executeAddition(String hashCode, Hashtable input) throws Exception {
        String output = "";

        logger.info(hashCode + "Input : " + input);
        getInitialContext("t3://10.20.200.140:20015");
        logger.debug(hashCode + " Input : " + input.toString());
        output = input.get("no_1").toString() + ":" + input.get("no_2").toString() + ":" + input.get("operator").toString();

        logger.info(hashCode + "Output : " + output);

        return output;
    }

    public static Context getInitialContext(String contextURL) throws NamingException {
        Hashtable env = new Hashtable();

        env.put(Context.INITIAL_CONTEXT_FACTORY, "weblogic.jndi.WLInitialContextFactory");
        env.put(Context.PROVIDER_URL, contextURL);
        return new InitialContext(env);
    }
}
