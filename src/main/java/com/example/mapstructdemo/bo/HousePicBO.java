package com.example.mapstructdemo.bo;

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
@NoArgsConstructor
@AllArgsConstructor
public class HousePicBO {
    private long id;

    private String path;
}
