package com.example.seckill.demo.controlle;

import com.example.seckill.demo.model.GetTicket;
import com.example.seckill.demo.service.IRobTicketService;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;

@Controller
@RequestMapping("/demo")
public class RobTicketControlle {

    @Autowired
    public IRobTicketService robTicketService;

    GetTicket ticket = new GetTicket();

    public static int ticketCont = 0;

    public int ticket1 = 0;
    public int ticket2 = 0;
    public int ticket3 = 0;

    public String buttonId = "";

    @RequestMapping("/robticket")
    public String getRobticket(Model model) {

        /*switch (buttonId) {
            case "Button_ticket01":
                new Thread(new MyThread()).start();
                ticket1++;
                break;
            case "Button_ticket02":
                new Thread(new MyThread()).start();
                ticket2++;
                break;
            case "Button_ticket03":
                new Thread(new MyThread()).start();
                ticket3++;
                break;
        }*/
        /*for (int i = 0; i < 100; i++) {
            new Thread(new MyThread()).start();
            new Thread(new MyThread()).start();
            new Thread(new MyThread()).start();
        }*/
//        HttpServletRequest request = null;
//        String val = request.getParameter("val");
        model.addAttribute("ticket",Integer.toString(ticketCont));
        model.addAttribute("ticket1",ticket1);
        model.addAttribute("ticket2",ticket2);
        model.addAttribute("ticket3",ticket3);
        return "robticket";
    }

    class MyThread extends Thread {
        @Override
        public void run() {
            ticketCont = ticket.getTicket();
        }
    }

    public void button1() {
        new Thread(new MyThread()).start();
        ticket1++;
    }
    public void button2() {
        new Thread(new MyThread()).start();
        ticket2++;
    }
    public void button3() {
        new Thread(new MyThread()).start();
        ticket3++;
    }


}
