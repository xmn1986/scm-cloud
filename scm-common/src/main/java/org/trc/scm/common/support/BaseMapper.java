package org.trc.scm.common.support;

import tk.mybatis.mapper.common.Mapper;
import tk.mybatis.mapper.common.MySqlMapper;

/**
 * Created by hzcyn on 2018/12/15.
 */
public interface BaseMapper<T> extends Mapper<T>, MySqlMapper<T> {

}
