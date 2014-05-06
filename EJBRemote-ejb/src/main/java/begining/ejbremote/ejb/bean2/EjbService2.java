/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package begining.ejbremote.ejb.bean2;

import begining.ejbremote.lib.EjbRemoteInterface;
import javax.ejb.Local;
import javax.ejb.Remote;
import javax.ejb.Stateless;

/**
 *
 * @author Eiichi Tanaka
 */
@Stateless
@Local(EjbLocalInterface.class)
@Remote(EjbRemoteInterface.class)
public class EjbService2 implements EjbLocalInterface, EjbRemoteInterface {
    private static final java.util.logging.Logger logger =
            java.util.logging.Logger.getLogger(EjbService2.class.getName());

    @Override
    public String getName(String name) {
        logger.entering(EjbService2.class.getName(), "getName");
        
        final String returnName = "おはようございます、" + name + " さん。";
        
        logger.exiting(EjbService2.class.getName(), "getName");
        
        return returnName;
    }
}
