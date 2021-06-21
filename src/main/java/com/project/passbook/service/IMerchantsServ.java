package com.project.passbook.service;

import com.project.passbook.ValueObject.CreateMerchantsRequest;
import com.project.passbook.ValueObject.PassTemplate;
import com.project.passbook.ValueObject.Response;
import org.springframework.stereotype.Service;

/**
 * @Description 商户服务接口定义
 * @date 2021/6/14-20:42
 */
public interface IMerchantsServ {
    /**
     * <h2>创建商户服务</h2>
     * @param request {@link CreateMerchantsRequest} 创建商户请求
     * @return {@link Response}
     * */
    Response createMerchants(CreateMerchantsRequest request);

    /**
     * <h2>根据 id 构造商户信息</h2>
     * @param id 商户 id
     * @return {@link Response}
     * */
    Response buildMerchantsInfoById(Integer id);

    /**
     * <h2>投放优惠券</h2>
     * @param template {@link PassTemplate} 优惠券对象
     * @return {@link Response}
     * */
    Response dropPassTemplate(PassTemplate template);
}
