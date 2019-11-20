package com.xuezk.study.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.xuezk.study.mapper.MemberInfo;
import com.xuezk.study.mapper.MemberInfoExample;
import com.xuezk.study.mapper.MemberInfoMapper;

@Service
public class MapperService {
	
	@Autowired
	MemberInfoMapper memMaper;

	public MemberInfo findById(long l) {
		return memMaper.selectByPrimaryKey(l);
	}

	public List<MemberInfo> jdbcFindByName(String string) {
		MemberInfoExample ex = new MemberInfoExample();
		ex.createCriteria().andNameLike("%"+string);
		return memMaper.selectByExample(ex);
	}

}
