package com.example.mapstructdemo.bo;

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
public class HouseBO {
    private long id;

    private String houseNo;

    private Date upDate;

    private String upDateStr;

    private List<HousePicBO> housePics;
}
