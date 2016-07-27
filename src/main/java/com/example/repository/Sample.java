package com.example.repository;

import org.apache.ibatis.annotations.Mapper;

import com.example.dto.AccountInfo;

@Mapper
public interface Sample {

	int countAll();
	AccountInfo getInfo1();
	AccountInfo getInfo2();
}
