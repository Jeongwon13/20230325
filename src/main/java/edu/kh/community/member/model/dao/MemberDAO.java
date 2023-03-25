package edu.kh.community.member.model.dao;
import static edu.kh.community.common.JDBCTemplate.close;

import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

import javax.servlet.ServletException;

import edu.kh.community.member.model.vo.Member;

public class MemberDAO {
	
	private Statement stmt;
	private PreparedStatement pstmt;
	private ResultSet rs;
	private Properties prop;
	
	public MemberDAO() {
		try {
			prop = new Properties();
			
			String filePath = MemberDAO.class.getResource
					("/edu/kh/community/sql/member-sql.xml").getPath();
			
			prop.loadFromXML(new FileInputStream(filePath));
			
			
		} catch(Exception e) {
			e.printStackTrace();
		}
		
	}

	public Member selectOne(Connection conn, String memberEmail) throws Exception {
		
		Member member = null;
		
		try {
			String sql = prop.getProperty("selectOne");
			
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, memberEmail);
			
			rs = pstmt.executeQuery();
			
			if(rs.next()) {
				member = new Member();
				
				member.setMemberEmail(rs.getString(1));
				member.setMemberNickname(rs.getString(2));
				member.setMemberTel(rs.getString(3));
				member.setMemberAddress(rs.getString(4));
				member.setEnrollDate(rs.getString(5));
				
				
			}
			
		} finally {
			close(rs);
			close(pstmt);
		}
		
		return member;
	}
	
	
	public List<Member> selectTwo(Connection conn) throws Exception, ServletException {
		 
		List<Member> selectTwo = new ArrayList<>();
		
		try {
			
			String sql = prop.getProperty("selectTwo");
			
			pstmt = conn.prepareStatement(sql);
			
			rs = pstmt.executeQuery();
			
			while(rs.next()) {
			int	memberNo = rs.getInt("MEMBER_NO");
			String memberEmail = rs.getString("MEMBER_EMAIL");
			String memberNick = rs.getString("MEMBER_NICK");
			
			selectTwo.add(
					new Member(memberNo, memberEmail, memberNick)
					);
			}
			
			
		} finally {
			close(rs);
			close(pstmt);
		}
		
		return selectTwo;
	}

}
