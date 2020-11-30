package com.personmanage.model;

public class inform {
	private int id;
	private String name;
	private String birth;
	private String setpasswd;
	private String authority;
	private String sex;
	private String isemployee;
	private int department;
	private int job;
	private String email;
	private String tele;
	private String skill;
	private int edu;
	private String address;
	private String note;

	public inform() {
	}

	public inform(int id, String name, String birth, String setpasswd, String authority, String sex, String isemployee,
			int department, int job, String email, String tele, String skill, int edu, String address, String note) {
		super();
		this.id = id;
		this.name = name;
		this.birth = birth;
		this.setpasswd = setpasswd;
		this.authority = authority;
		this.sex = sex;
		this.isemployee = isemployee;
		this.department = department;
		this.job = job;
		this.email = email;
		this.tele = tele;
		this.skill = skill;
		this.edu = edu;
		this.address = address;
		this.note = note;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getAuthority() {
		return authority;
	}

	public void setAuthority(String authority) {
		this.authority = authority;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getBirth() {
		return birth;
	}

	public void setBirth(String birth) {
		this.birth = birth;
	}

	public String getSetpasswd() {
		return setpasswd;
	}

	public void setSetpasswd(String setpasswd) {
		this.setpasswd = setpasswd;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public String getIsemployee() {
		return isemployee;
	}

	public void setIsemployee(String isemployee) {
		this.isemployee = isemployee;
	}

	public int getDepartment() {
		return department;
	}

	public void setDepartment(int department) {
		this.department = department;
	}

	public int getJob() {
		return job;
	}

	public void setJob(int job) {
		this.job = job;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getTele() {
		return tele;
	}

	public void setTele(String tele) {
		this.tele = tele;
	}

	public String getSkill() {
		return skill;
	}

	public void setSkill(String skill) {
		this.skill = skill;
	}

	public int getEdu() {
		return edu;
	}

	public void setEdu(int edu) {
		this.edu = edu;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getNote() {
		return note;
	}

	public void setNote(String note) {
		this.note = note;
	}

}
