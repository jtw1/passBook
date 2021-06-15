package com.project.passbook.service.impl;

import com.project.passbook.ValueObject.CreateMerchantsRequest;
import com.project.passbook.ValueObject.CreateMerchantsResponse;
import com.project.passbook.ValueObject.PassTemplate;
import com.project.passbook.ValueObject.Response;
import com.project.passbook.constant.ErrorCode;
import com.project.passbook.dao.MerchantsDao;
import com.project.passbook.service.IMerchantsServ;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @Description 商户服务接口实现
 * @date 2021/6/14-20:46
 */
// log的注解
@Slf4j
@Service
public class MerchantsServImpl implements IMerchantsServ {
    /** Merchants 数据库接口 */
    @Autowired
    private MerchantsDao merchantsDao;

    @Override
    public Response createMerchants(CreateMerchantsRequest request) {
        Response response=new Response();
        CreateMerchantsResponse merchantsResponse = new CreateMerchantsResponse();

        ErrorCode errorCode = request.validate(merchantsDao);
        if (errorCode!=ErrorCode.SUCCESS){
            merchantsResponse.setId(-1);

            response.setErrorCode(errorCode.getErrCode());
            response.setErrorMsg(errorCode.getErrMessage());
        }else{
            merchantsResponse.setId(merchantsDao.save(request.requestDaoToMerchants()).getId());
        }

        response.setData(merchantsResponse);
        return response;
    }

    @Override
    public Response buildMerchantsInfoById(Integer id) {
        return null;
    }

    @Override
    public Response dropPassTemplate(PassTemplate template) {
        return null;
    }
}
