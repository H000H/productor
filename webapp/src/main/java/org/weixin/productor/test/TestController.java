package org.weixin.productor.test;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("test")
public class TestController {
    @RequestMapping("helloworld")
    @ResponseBody
    public String getHello(){
        return "啦啦啦啦啦啦啦，我是买包的小画家";
    }
}
