package com.project.passbook.dao;

import com.project.passbook.entity.Merchants;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @Description Merchants Dao接口
 * @date 2021/6/14-16:58
 */
public interface MerchantsDao extends JpaRepository<Merchants,Integer> {
    /**
     * <h2>根据 id 获取商户对象</h2>
     * @param id 商户 id
     * @return {@link Merchants}
     * */
    Merchants findByID(Integer id);

    /**
     * <h2>根据商户名称获取商户对象</h2>
     * @param name 商户名称
     * @return {@link Merchants}
     * */
    Merchants findByName(String name);
}
