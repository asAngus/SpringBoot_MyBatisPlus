package com.wstro.shiro;

import com.wstro.service.SysMenuService;
import com.wstro.service.SysUserService;
import com.wstro.util.Constant;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;

/**
 * @author weipeng
 * @Configuration导致Shiro比Service实例化先执行
 * @Email weipeng@symdata.cn
 */
@Component
public class TempUtil {

    public static SysMenuService sysMenuService;
    public static SysUserService sysUserService;
    public static Constant constant;

    @Resource
    public void setSysMenuService(SysMenuService sysMenuService) {
        TempUtil.sysMenuService = sysMenuService;
    }

    @Resource
    public void setSysUserService(SysUserService sysUserService) {
        TempUtil.sysUserService = sysUserService;
    }

    @Resource
    public void setConstant(Constant constant) {
        TempUtil.constant = constant;
    }

}
