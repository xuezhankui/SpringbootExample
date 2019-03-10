package com.xuezk.study.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.Repository;
import org.springframework.data.repository.query.Param;

import com.xuezk.study.domain.MemberInfo;

public interface MemberInfoJDBCRepository extends Repository<MemberInfo, Long>{
	@Query("select new MemberInfo(id,createDate) from MemberInfo where name like '%'|| :name ||'%'")
	public List<MemberInfo> findByNames(@Param("name")String name);
	@Query("select new MemberInfo(id,createDate) from MemberInfo where id = :id")
	public MemberInfo findById(@Param("id")Long id);

}
