package com.xuezk.study.domain;

import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.Data;


@Data
@Entity
@Table(name="member_info")
public class MemberInfo {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long id;
	
	@Column(name="create_date")
	private Date createDate;
	
	@Column(name="insure_no")
	private String insureNo;
	//与数据库中字段名字相同
	private String idCard;
	private String mobile;
	private String name;
	
	@OneToMany(fetch=FetchType.LAZY,mappedBy="memberId")
	private List<OrderInfo> orders;
	
	public MemberInfo(Long id, Date createDate) {
		super();
		this.id = id;
		this.createDate = createDate;
	}

	public MemberInfo() {
	}

	@Override
	public String toString() {
		return id+" "+name+" "+createDate;
	}
}
