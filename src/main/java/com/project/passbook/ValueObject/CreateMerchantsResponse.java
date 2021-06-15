package com.project.passbook.ValueObject;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @Description 创建商户相应对象
 * @date 2021/6/14-20:39
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class CreateMerchantsResponse {
    /** 商户 id: 创建失败则为 -1 */
    private Integer id;
}
