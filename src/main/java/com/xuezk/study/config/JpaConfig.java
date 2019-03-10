package com.xuezk.study.config;

import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@Configurable
@EnableJpaRepositories("com.xuezk.study.repository")
public class JpaConfig {

}
