package com.coding.chobo.member.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.coding.chobo.member.mapper.MemberMapper;

@Service
public class MemberServiceImpl implements MemberService {

	@Autowired MemberMapper memberMapper;
	
	@Override
	public String getTime() {
		
		String now_time = memberMapper.getTimeNow();
		
		System.out.println(now_time);
		
		return now_time;
	}
}