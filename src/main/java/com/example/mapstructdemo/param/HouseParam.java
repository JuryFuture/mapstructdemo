package com.example.mapstructdemo.param;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
import java.util.List;

/**
 * Description:
 *
 * @author: 滕国栋
 * @date: 2019/4/21
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class HouseParam {
    private Long id;

    private String houseNo;

    private Date upDate;

    private List<HousePicParam> housePics;
}
