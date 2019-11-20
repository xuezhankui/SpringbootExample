package com.xuezk.study.mapper;

import com.xuezk.study.mapper.MemberInfo;
import com.xuezk.study.mapper.MemberInfoExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
@Mapper
public interface MemberInfoMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table member_info
     *
     * @mbg.generated Wed Nov 20 20:16:07 CST 2019
     */
    long countByExample(MemberInfoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table member_info
     *
     * @mbg.generated Wed Nov 20 20:16:07 CST 2019
     */
    int deleteByExample(MemberInfoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table member_info
     *
     * @mbg.generated Wed Nov 20 20:16:07 CST 2019
     */
    int deleteByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table member_info
     *
     * @mbg.generated Wed Nov 20 20:16:07 CST 2019
     */
    int insert(MemberInfo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table member_info
     *
     * @mbg.generated Wed Nov 20 20:16:07 CST 2019
     */
    int insertSelective(MemberInfo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table member_info
     *
     * @mbg.generated Wed Nov 20 20:16:07 CST 2019
     */
    List<MemberInfo> selectByExample(MemberInfoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table member_info
     *
     * @mbg.generated Wed Nov 20 20:16:07 CST 2019
     */
    MemberInfo selectByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table member_info
     *
     * @mbg.generated Wed Nov 20 20:16:07 CST 2019
     */
    int updateByExampleSelective(@Param("record") MemberInfo record, @Param("example") MemberInfoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table member_info
     *
     * @mbg.generated Wed Nov 20 20:16:07 CST 2019
     */
    int updateByExample(@Param("record") MemberInfo record, @Param("example") MemberInfoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table member_info
     *
     * @mbg.generated Wed Nov 20 20:16:07 CST 2019
     */
    int updateByPrimaryKeySelective(MemberInfo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table member_info
     *
     * @mbg.generated Wed Nov 20 20:16:07 CST 2019
     */
    int updateByPrimaryKey(MemberInfo record);
}