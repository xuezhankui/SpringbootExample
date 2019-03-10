package com.xuezk.study.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name="order_info")
public class OrderInfo {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long id;
	
	@Column(name="order_no")
	private String orderNo;
	
	@Column(name="member_id")
	private Long memberId;
	
	@ManyToOne(targetEntity=MemberInfo.class,fetch=FetchType.EAGER)
	private MemberInfo memberInfo;

	@Override
	public String toString() {
		return "order"+" id:"+id+" orderNo:"+orderNo+" memberId:"+memberId;
	}
	
}
