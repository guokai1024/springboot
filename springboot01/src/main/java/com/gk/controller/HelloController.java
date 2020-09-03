package com.gk.controller;

import com.gk.pojo.Car;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@RestController

public class HelloController {
    @RequestMapping("/hello")
    public String hello(String name){

        return name + "你好";
    }

    @RequestMapping("/getcar")
    public Car getCar(){
        Car car = new Car();
        car.setId(1);
        car.setName("兰博基尼");
        car.setPrice(100000.99F);
        car.setCreateDate(new Date());
        car.setMemo("汽车描述");
        car.setIsnull(null);
        return car;

    }

    @RequestMapping("/getcarlist1")
    public List<Car> getCarAll() {
        Car car = new Car();
        car.setId(1);
        car.setName("兰博基尼");
        car.setPrice(100000.99F);
        car.setCreateDate(new Date());
        car.setMemo("汽车描述");
        car.setIsnull("不为空显示");

        List<Car> list = new ArrayList<Car>();
        list.add(car);
        list.add(car);
        list.add(car);
        list.add(car);
        return list;
    }

    @RequestMapping("/add")
    public List<Car> add(Car car){
        List<Car> list = new ArrayList<>();
        list.add(car);
        return list;
    }

}
