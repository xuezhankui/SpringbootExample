package com.xuezk.study.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.util.Assert;

import com.xuezk.study.domain.MemberInfo;
import com.xuezk.study.domain.OrderInfo;
import com.xuezk.study.repository.MemberInfoJDBCRepository;
import com.xuezk.study.repository.MemberInfoJpaRepository;
import com.xuezk.study.repository.OrderInfoJpaRepository;

@Service
public class DBService {
	@Autowired
	private MemberInfoJDBCRepository jdbcRepository;
	@Autowired
	private MemberInfoJpaRepository jpaRepository;
	@Autowired
	private OrderInfoJpaRepository jpaOrderRepository;
	public List<MemberInfo> jdbcFindByName(String name){
		Assert.notNull(name, "name can not be null");
		List<MemberInfo> ms = jdbcRepository.findByNames(name);
		ms.stream().forEach(a->System.err.print(a+" "));
		return ms;
	}
	public MemberInfo jdbcFindById(Long id) {
		System.err.println("jdbcFindById");
		Assert.notNull(id,"id can`t be null");
		MemberInfo m = jdbcRepository.findById(id);
		System.err.println(m);
		return m;
	}
	
	public void jpaFindByPage(Pageable pageable) {
		System.err.println("jpaFindByPage");
		Page<MemberInfo> page = jpaRepository.findAll(pageable);
		System.err.println(page);
	}
	
	public void jpaFindByDivPage(Pageable pageable, String name) {
		System.err.println("jpaFindByDivPage");
		Page<MemberInfo> page = jpaRepository.findByName(name,pageable);
		System.err.println(page);
	}
	public void jpaOrderGetOne(Long orderId) {
		System.err.println("jpaOrderGetOne");
		Assert.notNull(orderId,"orderId can`t be null");
		OrderInfo order = jpaOrderRepository.getOne(orderId);
		System.err.println(order);
		System.err.println(order.getMemberInfo());
	}
	public void jpaFindByOrder(Long orderId) {
		System.err.println("jpaFindByOrder");
		Assert.notNull(orderId,"orderId can`t be null");
		OrderInfo order = jpaOrderRepository.getOne(orderId);
		Assert.notNull(order,"no order exist");
		MemberInfo mem = jpaRepository.findByOrders(order);
		System.err.println(mem);
	}
	
}
