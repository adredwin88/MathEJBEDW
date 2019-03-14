package mathejbedw;

import bca.db.EAIDb;

import java.util.Hashtable;

import java.util.Vector;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;

import org.apache.log4j.Logger;

public class MathAddition {
    Logger logger = Logger.getLogger("MathAdditionEDW");

    public String execute(String hashCode, Hashtable input) throws Exception {
// Deklarasi variabel output sebafai variabel return
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
