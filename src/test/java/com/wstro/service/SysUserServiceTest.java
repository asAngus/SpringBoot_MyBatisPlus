package com.wstro.service;

import com.wstro.entity.SysUserEntity;

import javax.annotation.Resource;
import java.util.List;

/**
 * 系统用户测试
 *
 * @author weipeng
 * @Email weipeng@symdata.cn
 */
public class SysUserServiceTest {

    @Resource
    private SysUserService sysUserService;

    /**
     * 查询列表
     */
    // @Test
    public void selectList() {
        List<SysUserEntity> selectList = sysUserService.selectList(null);
        for (SysUserEntity sysUserEntity : selectList) {
            System.out.println(sysUserEntity);
        }
    }

}
