package com.example.mapstructdemo;

import com.example.mapstructdemo.bo.HouseBO;
import com.example.mapstructdemo.converter.HouseConverter;
import com.example.mapstructdemo.param.HouseParam;
import com.example.mapstructdemo.param.HousePicParam;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@SpringBootApplication
public class MapstructdemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(MapstructdemoApplication.class, args);

        HousePicParam housePicParam = new HousePicParam(1, "123");
        HousePicParam housePicParam2 = new HousePicParam(2, "456");
        List<HousePicParam> housePicParams = new ArrayList<>();
        housePicParams.add(housePicParam);
        housePicParams.add(housePicParam2);

        HouseParam houseParam = new HouseParam(null, "1", new Date(), housePicParams);
        HouseBO houseBO = HouseConverter.INSTANCE.houseParam2HouseBO(houseParam);
        System.out.println(houseBO);
    }

}