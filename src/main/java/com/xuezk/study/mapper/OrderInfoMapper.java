package com.xuezk.study.mapper;

import com.xuezk.study.mapper.OrderInfo;
import com.xuezk.study.mapper.OrderInfoExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
@Mapper
public interface OrderInfoMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table order_info
     *
     * @mbg.generated Wed Nov 20 20:16:07 CST 2019
     */
    long countByExample(OrderInfoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table order_info
     *
     * @mbg.generated Wed Nov 20 20:16:07 CST 2019
     */
    int deleteByExample(OrderInfoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table order_info
     *
     * @mbg.generated Wed Nov 20 20:16:07 CST 2019
     */
    int deleteByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table order_info
     *
     * @mbg.generated Wed Nov 20 20:16:07 CST 2019
     */
    int insert(OrderInfo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table order_info
     *
     * @mbg.generated Wed Nov 20 20:16:07 CST 2019
     */
    int insertSelective(OrderInfo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table order_info
     *
     * @mbg.generated Wed Nov 20 20:16:07 CST 2019
     */
    List<OrderInfo> selectByExample(OrderInfoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table order_info
     *
     * @mbg.generated Wed Nov 20 20:16:07 CST 2019
     */
    OrderInfo selectByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table order_info
     *
     * @mbg.generated Wed Nov 20 20:16:07 CST 2019
     */
    int updateByExampleSelective(@Param("record") OrderInfo record, @Param("example") OrderInfoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table order_info
     *
     * @mbg.generated Wed Nov 20 20:16:07 CST 2019
     */
    int updateByExample(@Param("record") OrderInfo record, @Param("example") OrderInfoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table order_info
     *
     * @mbg.generated Wed Nov 20 20:16:07 CST 2019
     */
    int updateByPrimaryKeySelective(OrderInfo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table order_info
     *
     * @mbg.generated Wed Nov 20 20:16:07 CST 2019
     */
    int updateByPrimaryKey(OrderInfo record);
}