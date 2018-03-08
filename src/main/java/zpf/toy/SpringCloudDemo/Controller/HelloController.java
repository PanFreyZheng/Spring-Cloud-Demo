package zpf.toy.SpringCloudDemo.Controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author :LoseMyself    pengfei.zheng@hand-china.com
 * @version :1.0
 * @description :
 * @date :2018/3/8 16:22
 */
@RestController
public class HelloController {

    @Value("${book.name}")
    private String n;

    @RequestMapping("/hello")
    public String index(){

        return "Hello World," + n;
    }
}
