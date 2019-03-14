package mathejbedw;

import java.util.Hashtable;

import javax.annotation.Resource;

import javax.ejb.SessionContext;
import javax.ejb.Stateless;

import org.apache.log4j.Logger;

@Stateless(name = "SessionMathEJB", mappedName = "TrainingJava-MathEJBEDW-SessionMathEJB")
public class SessionMathEJBBean implements SessionMathEJB {
    public String mathOperation(String hashCode, Hashtable input) throws Exception {
        long start = System.currentTimeMillis();
        Logger logger = Logger.getLogger("MathOperationEDW");
        logger.info(hashCode + "Start Call mathAddition");

        switch (input.get("operator")){
            case "add":
                MathAddition getAddition = new MathAddition();
                String output = getAddition.execute(hashCode,input);
                break;
            case "subs":
                MathSubstraction getSubs = new MathSubstraction();
                String output = getSubs.execute(hashCode,input);
                break;
            case "multi":
                MathMultiply getMulti = new MathMultiply();
                String output = getMulti.execute(hashCode,input);
                break;
            case "divs":
                MathDivision getDivs = new MathDivision();
                String output = getDivs.execute(hashCode,input);
                break;
            default:
                break;
        }


        logger.info(hashCode + "End Process in " + (System.currentTimeMillis()-start) + "ms");

        return output;
    }

}
