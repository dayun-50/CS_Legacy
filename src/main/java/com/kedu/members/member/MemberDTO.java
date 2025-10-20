package com.kedu.members.member;

import java.security.Timestamp;

public class MemberDTO {
	private String email; // 사원 고유 아이디
	private int dept_code; // 부서코드 ( default : null , 관리자가 부여시 값등록 )
	private int level_code; // 직급코드 ( default : null , 관리자가 부여시 값등록 )
	private String pw; // 비밀번호
	private String name; // 이름
	private String phoen; // 전화번호
	private String company_code; // 회사코드
	private Timestamp signup_at; // 가입 날짜 및 승인 날짜
	
	public MemberDTO() {}
	public MemberDTO(String email, int dept_code, int level_code, String pw, String name, String phoen,
			String company_code, Timestamp signup_at) {
		super();
		this.email = email;
		this.dept_code = dept_code;
		this.level_code = level_code;
		this.pw = pw;
		this.name = name;
		this.phoen = phoen;
		this.company_code = company_code;
		this.signup_at = signup_at;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public int getDept_code() {
		return dept_code;
	}
	public void setDept_code(int dept_code) {
		this.dept_code = dept_code;
	}
	public int getLevel_code() {
		return level_code;
	}
	public void setLevel_code(int level_code) {
		this.level_code = level_code;
	}
	public String getPw() {
		return pw;
	}
	public void setPw(String pw) {
		this.pw = pw;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPhoen() {
		return phoen;
	}
	public void setPhoen(String phoen) {
		this.phoen = phoen;
	}
	public String getCompany_code() {
		return company_code;
	}
	public void setCompany_code(String company_code) {
		this.company_code = company_code;
	}
	public Timestamp getSignup_at() {
		return signup_at;
	}
	public void setSignup_at(Timestamp signup_at) {
		this.signup_at = signup_at;
	}
	
	
}
