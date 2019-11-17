package com.shop.mapper;

import com.shop.model.ShopSysUser;
import org.springframework.stereotype.Repository;

@Repository
public interface ShopSysUserMapper {
    ShopSysUser selectByPrimaryKey(String id);
}