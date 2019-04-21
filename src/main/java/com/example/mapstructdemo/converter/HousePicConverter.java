package com.example.mapstructdemo.converter;

import com.example.mapstructdemo.bo.HousePicBO;
import com.example.mapstructdemo.param.HousePicParam;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import java.util.List;

/**
 * Description:
 *
 * @author: 滕国栋
 * @date: 2019/4/21
 */
@Mapper
public interface HousePicConverter {
    HousePicConverter INSTANCE = Mappers.getMapper(HousePicConverter.class);

    HousePicBO housePicParam2HousePicBO(HousePicParam housePicParam);

    List<HousePicBO> housePicParams2HousePicBOs(List<HousePicParam> housePicParams);
}
