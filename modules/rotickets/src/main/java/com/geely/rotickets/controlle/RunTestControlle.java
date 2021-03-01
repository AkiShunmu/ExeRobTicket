package com.geely.rotickets.controlle;

import com.example.seckill.demo.service.IRunMvcService;
import org.springframework.stereotype.Controller;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/demo")
public class RunTestControlle {

//    @Autowired
    public IRunMvcService runMvcService;
//    @Autowired
    private RedisTemplate<String, String> redisTemplate;

    @RequestMapping("/runTest")
    public String hello(Model model) {
        model.addAttribute("name","Boy");
        return "RunTest";
    }

    @RequestMapping("/runMvc")
    public String mvcTest(Model model) {
        int number = 2;
        String str = "";
//        redisTemplate.boundValueOps("List:").set("runMvcService.runMvc(number).toString()");
//        redisTemplate.boundValueOps("List").get();
        str = "runMvcService.runMvc(number).toString()";
        model.addAttribute("getList",str);
        return "RunMvc";
    }


}
