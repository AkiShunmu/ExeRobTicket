package com.example.seckill.demo.service.impl;

import com.example.seckill.demo.model.GetTicket;
import com.example.seckill.demo.model.LazyExample;
import com.example.seckill.demo.service.IRobTicketService;
import org.junit.Test;
import org.springframework.stereotype.Service;

@Service
public class RobTicketServiceImpl implements IRobTicketService {

    public static int ticketCont = 5;

    @Override
    public String robTicket() {
        GetTicket ticket = new GetTicket();
        return "t";
//        return Integer.toString(ticket.getTicket());
        /*Runnable myRunnable = new Runnable() {
            @Override
            public void run() {
                str = Integer.toString(new GetTicket().getTicket());
            }
        };
        class MyThread extends Thread {
            @Override
            public void run() {
                System.out.println("111");
                ticketCont = ticket.getTicket();
            }
        }
        for (int i = 0; i < 100; i++) {
            new Thread(new MyThread()).start();
        }
        return Integer.toString(ticketCont);*/

    }

    @Test
    public void test01() {
        GetTicket getTicket = new GetTicket();
        /*Runnable myRunnable = new Runnable() {
            @Override
            public void run() {
                str = Integer.toString(lazyExample.getTicket());
            }
        };
        Thread thread = new Thread() {
            @Override
            public void run() {
                System.out.println("2");
                SyWstem.out.println(new GetTicket().getTicket());
            }
        };*/
        class MyThread extends Thread {
            @Override
            public void run() {
                System.out.println(getTicket.getTicket());
            }
        }
        for (int i = 0; i < 100; i++) {
            new Thread(new MyThread()).start();
        }
    }

}
