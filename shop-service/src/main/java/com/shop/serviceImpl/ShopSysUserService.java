package com.shop.serviceImpl;

import com.shop.mapper.ShopSysUserMapper;
import com.shop.model.ShopSysUser;
import com.shop.service.IShopSysUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class ShopSysUserService implements IShopSysUserService {

    @Autowired
    private ShopSysUserMapper userMapper;

    @Override
    public ShopSysUser getBYid(String id) {
        return userMapper.selectByPrimaryKey(id);
    }
}
