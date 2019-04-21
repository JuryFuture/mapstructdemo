package com.example.mapstructdemo.param;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Description:
 *
 * @author: 滕国栋
 * @date: 2019/4/21
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class HousePicParam {
    private long id;

    private String path;
}
