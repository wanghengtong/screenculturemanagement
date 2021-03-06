package com.cpy.screenculturemanagement.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.cpy.screenculturemanagement.entity.Customer;
import com.cpy.screenculturemanagement.param.CustomerPageParam;
import com.cpy.screenculturemanagement.vo.CustomerQueryVo;

import org.springframework.stereotype.Repository;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import org.apache.ibatis.annotations.Param;
import java.io.Serializable;

/**
 *  Mapper 接口
 *
 * @author wanght
 * @since 2020-10-12
 */
@Repository
public interface CustomerMapper extends BaseMapper<Customer> {

    /**
     * 根据ID获取查询对象
     *
     * @param id
     * @return
     */
    CustomerQueryVo getCustomerById(Serializable id);

    /**
     * 获取分页对象
     *
     * @param page
     * @param customerQueryParam
     * @return
     */
    IPage<CustomerQueryVo> getCustomerPageList(@Param("page") Page page, @Param("param") CustomerPageParam customerPageParam);

}
