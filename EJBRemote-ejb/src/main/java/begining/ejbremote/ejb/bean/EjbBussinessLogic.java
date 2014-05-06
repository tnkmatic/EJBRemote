/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package begining.ejbremote.ejb.bean;

import javax.ejb.Stateless;
import javax.ejb.LocalBean;

/**
 *
 * @author Eiichi Tanaka
 */
@Stateless
@LocalBean
public class EjbBussinessLogic {
    public String addGreetingToName(final String name) {
        return "こんにちは "  + name + " さん！！";
    }
}
