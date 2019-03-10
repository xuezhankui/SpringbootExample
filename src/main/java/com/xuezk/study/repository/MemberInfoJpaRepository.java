package com.xuezk.study.repository;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.xuezk.study.domain.MemberInfo;
import com.xuezk.study.domain.OrderInfo;

public interface MemberInfoJpaRepository extends BaseDBRepository<MemberInfo, Long>{

	public MemberInfo findByOrders(OrderInfo order);
	
	@Query(" from MemberInfo m where m.name like '%'|| :name ||'%'")
	public Page<MemberInfo> findByName(@Param("name")String name, Pageable pageable);

}
