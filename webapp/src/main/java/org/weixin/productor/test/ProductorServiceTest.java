package org.weixin.productor.test;

import org.myfacade.facade.ProductFacade;
import org.springframework.stereotype.Service;

@Service
public class ProductorServiceTest implements ProductFacade {

    @Override
    public String getProduct() {
        String helloworld="wwwww";
        return "成功get到我的消息OOO";
    }
}
