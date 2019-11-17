package com.shop.web.controller;

import com.shop.service.IShopSysUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value="/shop/sysUser")
public class ShopSysUserController {

    @Autowired
    private IShopSysUserService sysUserService;

    @RequestMapping(value="/getById")
    public String GETbYiD(){
        return  sysUserService.getBYid("1").toString();
    }

}
