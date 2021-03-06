package com.wstro.dao;

import com.wstro.entity.SysRoleEntity;
import com.wstro.util.BaseDao;

/**
 * 角色管理
 *
 * @author weipeng
 * @Email weipeng@symdata.cn
 */
public interface SysRoleDao extends BaseDao<SysRoleEntity> {

    /**
     * 更新角色
     *
     * @param role SysRoleEntity
     */
    void updateNoMapper(SysRoleEntity role);

}
