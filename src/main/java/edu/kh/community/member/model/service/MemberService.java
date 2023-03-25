package edu.kh.community.member.model.service;

import static edu.kh.community.common.JDBCTemplate.close;
import static edu.kh.community.common.JDBCTemplate.getConnection;

import java.sql.Connection;
import java.util.List;

import edu.kh.community.member.model.dao.MemberDAO;
import edu.kh.community.member.model.vo.Member;

public class MemberService {

	private MemberDAO dao = new MemberDAO();
	
	public Member selectOne(String memberEmail) throws Exception {
		Connection conn = getConnection();
		
		Member member = dao.selectOne(conn, memberEmail);
		
		close(conn);
		
		return member;
	}

	
	public List<Member> selectTwo() throws Exception {
		Connection conn = getConnection();
		
		List<Member> selectTwo = dao.selectTwo(conn);
		
		close(conn);
		
		return selectTwo;
		
	}
}
