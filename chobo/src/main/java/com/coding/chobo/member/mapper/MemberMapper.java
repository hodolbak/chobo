package com.coding.chobo.member.mapper;

import org.apache.ibatis.annotations.Mapper;
import com.coding.chobo.member.model.MemberVO;

@Mapper
public interface MemberMapper {
	
	public String getTimeNow();
	
	public void insertMember(MemberVO vo);
	
}
