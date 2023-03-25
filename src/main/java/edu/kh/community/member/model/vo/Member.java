package edu.kh.community.member.model.vo;

public class Member {
	private int memberNo;
	private String memberEmail;
	private String memberPw;
	private String memberNickname;
	private String memberTel;
	private String memberAddress;
	private String profilemage;
	private String enrollDate;
	private String secesstionFlag;
	
	public Member() {
		
	}
	
	public Member(int memberNo, String memberEmail, String memberPw, String memberNickname, String memberTel,
			String memberAddress, String profilemage, String enrollDate, String secesstionFlag) {
		super();
		this.memberNo = memberNo;
		this.memberEmail = memberEmail;
		this.memberPw = memberPw;
		this.memberNickname = memberNickname;
		this.memberTel = memberTel;
		this.memberAddress = memberAddress;
		this.profilemage = profilemage;
		this.enrollDate = enrollDate;
		this.secesstionFlag = secesstionFlag;
	}
	
	public Member(int memberNo, String memberEmail, String memberNickname) {
		this.memberNo = memberNo;
		this.memberEmail = memberEmail;
		this.memberNickname = memberNickname;
	}
	
	public int getMemberNo() {
		return memberNo;
	}
	public void setMemberNo(int memberNo) {
		this.memberNo = memberNo;
	}
	public String getMemberEmail() {
		return memberEmail;
	}
	public void setMemberEmail(String memberEmail) {
		this.memberEmail = memberEmail;
	}
	public String getMemberPw() {
		return memberPw;
	}
	public void setMemberPw(String memberPw) {
		this.memberPw = memberPw;
	}
	public String getMemberNickname() {
		return memberNickname;
	}
	public void setMemberNickname(String memberNickname) {
		this.memberNickname = memberNickname;
	}
	public String getMemberTel() {
		return memberTel;
	}
	public void setMemberTel(String memberTel) {
		this.memberTel = memberTel;
	}
	public String getMemberAddress() {
		return memberAddress;
	}
	public void setMemberAddress(String memberAddress) {
		this.memberAddress = memberAddress;
	}
	public String getProfilemage() {
		return profilemage;
	}
	public void setProfilemage(String profilemage) {
		this.profilemage = profilemage;
	}
	public String getEnrollDate() {
		return enrollDate;
	}
	public void setEnrollDate(String enrollDate) {
		this.enrollDate = enrollDate;
	}
	public String getSecesstionFlag() {
		return secesstionFlag;
	}
	public void setSecesstionFlag(String secesstionFlag) {
		this.secesstionFlag = secesstionFlag;
	}
	@Override
	public String toString() {
		return "Member [memberNo=" + memberNo + ", memberEmail=" + memberEmail + ", memberPw=" + memberPw
				+ ", memberNickname=" + memberNickname + ", memberTel=" + memberTel + ", memberAddress=" + memberAddress
				+ ", profilemage=" + profilemage + ", enrollDate=" + enrollDate + ", secesstionFlag=" + secesstionFlag
				+ "]";
	}
	
	
}
