package com.atguigu.educenter.mapper;

import com.atguigu.educenter.entity.UcenterMember;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;

/**
 * <p>
 * 会员表 Mapper 接口
 * </p>
 *
 * @author testjava
 * @since 2020-05-26
 */
public interface UcenterMemberMapper extends BaseMapper<UcenterMember> {

    //查询某一天的注册人数
    Integer countRegisterDay(String day);
}
