/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package begining.ejbremote.ejb.bean;

import javax.ejb.EJB;
import javax.ejb.Local;
import javax.ejb.Stateless;

/**
 *
 * @author Eiichi Tanaka
 */
@Stateless
@Local(EjbLocalServiceLocal.class)
public class EjbLocalService implements EjbLocalServiceLocal {
    private static final java.util.logging.Logger logger = 
            java.util.logging.Logger.getLogger(EjbLocalService.class.getName());
    @EJB
    EjbBussinessLogic ejb;
    
    @Override
    public String getLocalName(final String name) {
        logger.entering(EjbService.class.getName(), "getLocalName");
        
        final String returnName = ejb.addGreetingToName(name);
        
        logger.exiting(EjbService.class.getName(), "getLocalName");
        
        return returnName;
    }
}
