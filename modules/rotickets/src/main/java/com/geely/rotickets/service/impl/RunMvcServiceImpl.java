package com.geely.rotickets.service.impl;

import com.example.seckill.demo.service.IRunMvcService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RunMvcServiceImpl implements IRunMvcService {

//    @Autowired
    private List list;

    @Override
    public List runMvc(int number) {
        switch (number) {
            case 1:
                list.add("name");
                break;
            case 2:
                list.add("name");
                list.add("age");
                break;
            case 3:
                list.add("name");
                list.add("age");
                list.add("from");
                break;

        }
        return list;
    }

}
