package com.wstro.datasources;

import org.springframework.jdbc.datasource.lookup.AbstractRoutingDataSource;

/**
 * 动态切换数据源
 *
 * @author weipeng
 * @Email weipeng@symdata.cn
 */
public class DynamicDataSource extends AbstractRoutingDataSource {

    @Override
    protected Object determineCurrentLookupKey() {
        return DataSourceContextHolder.getDbType();
    }

}