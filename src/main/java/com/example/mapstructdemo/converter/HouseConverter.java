package com.example.mapstructdemo.converter;

import com.example.mapstructdemo.bo.HouseBO;
import com.example.mapstructdemo.param.HouseParam;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;
import org.mapstruct.factory.Mappers;

import java.util.List;

/**
 * Description:
 *
 * @author: 滕国栋
 * @date: 2019/4/21
 */
@Mapper
public interface HouseConverter {
    HouseConverter INSTANCE = Mappers.getMapper(HouseConverter.class);

    @Mappings({
            @Mapping(source = "upDate", target = "upDateStr", dateFormat = "yyyy-MM-dd HH:mm:ss"),
            @Mapping(source = "id", target = "id", defaultValue = "20")
    })
    HouseBO houseParam2HouseBO(HouseParam houseParam);

    List<HouseBO> houseParams2HouseBOs(List<HouseParam> houseParams);
}
