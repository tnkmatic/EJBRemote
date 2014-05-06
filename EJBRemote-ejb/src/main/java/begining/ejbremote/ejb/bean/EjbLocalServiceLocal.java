/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package begining.ejbremote.ejb.bean;

import javax.ejb.Local;

/**
 *
 * @author Eiichi Tanaka
 */
public interface EjbLocalServiceLocal {
    public String getLocalName(final String name);
}
