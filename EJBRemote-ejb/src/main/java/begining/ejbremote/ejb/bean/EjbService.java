/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package begining.ejbremote.ejb.bean;

import begining.ejbremote.lib.EjbInterface;
import javax.ejb.EJB;
import javax.ejb.Stateless;
import javax.ejb.Remote;

/**
 *
 * @author Eiichi Tanaka
 * ※試作段階
 * Local, Remoteで同じメソッド名を定義できないので、以下の理由で、
 * 入り口を2つ準備する必要が考えた。
 * インターフェース側にアノテーションを付与すると、Remoteインターフェースを
 * スタンドアロンクライアント共有できなくなる(javax.ejbパッケージのため)ので。
 * しかしながら、EjbService2.javaの方法で1つのインターフェースをベースに、
 * Remote, Localインターフェースを継承して作成すると、同じメソッド名でも問題ないため、
 * EjbService2クラスを作成した
 */
@Stateless
@Remote(EjbInterface.class)
public class EjbService implements EjbInterface {
    private static final java.util.logging.Logger logger = 
            java.util.logging.Logger.getLogger(EjbService.class.getName());

    @EJB
    private EjbBussinessLogic ejb;
    
    @Override
    public String getName(final String name) {
        logger.entering(EjbService.class.getName(), "getName");

        final String returnName = ejb.addGreetingToName(name);

        logger.exiting(EjbService.class.getName(), "getName");

        return returnName;
    }
}
