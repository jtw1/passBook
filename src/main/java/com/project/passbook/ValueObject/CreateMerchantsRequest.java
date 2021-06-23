package com.project.passbook.ValueObject;

import com.project.passbook.DataObject.MerchantsDo;
import com.project.passbook.constant.ErrorCode;
import com.project.passbook.dao.MerchantsDao;
import com.project.passbook.dao.MerchantsDoMapper;
import com.project.passbook.entity.Merchants;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @Description 创建商户请求对象
 * @date 2021/6/14-20:09
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class CreateMerchantsRequest {
    /** 商户名称 */
    private String name;

    /** 商户 logo */
    private String logoUrl;

    /** 商户营业执照 */
    private String businessLicenseUrl;

    /** 商户联系电话 */
    private String phone;

    /** 商户地址 */
    private String address;

    /**
     * <h2>验证请求的有效性</h2>
     * @param merchantsDoMapper {@link MerchantsDoMapper}
     * @return {@link ErrorCode}
     * */
    public ErrorCode validate(MerchantsDoMapper merchantsDoMapper){
        if (merchantsDoMapper.selectByName(this.name)!=null){
            return ErrorCode.DUPLICATE_NAME;
        }

        if(null==this.logoUrl){
            return ErrorCode.EMPTY_LOGO;
        }

        if (null == this.businessLicenseUrl) {
            return ErrorCode.EMPTY_BUSINESS_LICENSE;
        }

        if (null == this.address) {
            return ErrorCode.EMPTY_ADDRESS;
        }

        if (null == this.phone) {
            return ErrorCode.ERROR_PHONE;
        }

        return ErrorCode.SUCCESS;
    }
    /**
     * <h2>将请求对象转换为商户对象</h2>
     * @return {@link Merchants}
     * */
    public MerchantsDo requestDaoToMerchants(){
        MerchantsDo merchantsDo=new MerchantsDo();

        merchantsDo.setName(name);
        merchantsDo.setLogoUrl(logoUrl);
        merchantsDo.setBusinessLicenseUrl(businessLicenseUrl);
        merchantsDo.setPhone(phone);
        merchantsDo.setAddress(address);

        return merchantsDo;
    }
}
