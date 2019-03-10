package com.xuezk.study.repository;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.NoRepositoryBean;

@NoRepositoryBean
public interface BaseDBRepository<T, ID extends Serializable> extends JpaRepository<T, ID>{
	
}
