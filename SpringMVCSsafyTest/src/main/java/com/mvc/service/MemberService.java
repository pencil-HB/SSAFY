package com.mvc.service;

import com.mvc.vo.Member;

public interface MemberService {
	Member check(Member u);
	boolean registerMember(Member member);
}
