package controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RefreshScope
@Controller
@RequestMapping("/get")
public class ClientController {
    @Value("${msg}")
    private String msg;

    @RequestMapping(path = "/msg", method = RequestMethod.GET, produces = {"application/json"})
    String getMsg() {
        return this.msg;
    }
}
