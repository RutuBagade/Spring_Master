package com.app.beans;

import java.util.List;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;
import javax.persistence.CollectionTable;
import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OrderColumn;
import javax.persistence.Table;
import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name="StudTable")
public class Student {
	
	
	@Id
	@Column(name="stid")
	@GeneratedValue(generator="mygen")
	@GenericGenerator(name="mygen",strategy="increment")
	private Integer studId;
	@NotEmpty
	@Column(name="studname")
	private String studName;
	@NotEmpty
	 @Pattern(regexp="^[a-zA-Z0-9]{2,7}",message="password must be 2 to 7 charachters")
	@Column(name="studpwd")
	private String studPwd;
	
	  @NotNull(message="Select gender")
	@Column(name="studgen")
	private String studGen;
	  @NotEmpty(message="Enter addresss details")
	@Column(name="studaddr")
	private String studAddr;
	  @NotEmpty
	@Column(name="studcntry")
	private String studCntry;
	@ElementCollection
	@CollectionTable(name="studlangtab", //table name
	joinColumns=@JoinColumn(name="stid") //key column
	)
	@OrderColumn(name="pos") //index column
	@NotEmpty
	@Column(name="lang") //element column
	private List<String> studLang;
	public Integer getStudId() {
		return studId;
	}
	public void setStudId(Integer studId) {
		this.studId = studId;
	}
	public String getStudName() {
		return studName;
	}
	public void setStudName(String studName) {
		this.studName = studName;
	}
	public String getStudPwd() {
		return studPwd;
	}
	public void setStudPwd(String studPwd) {
		this.studPwd = studPwd;
	}
	public String getStudGen() {
		return studGen;
	}
	public void setStudGen(String studGen) {
		this.studGen = studGen;
	}
	public String getStudAddr() {
		return studAddr;
	}
	public void setStudAddr(String studAddr) {
		this.studAddr = studAddr;
	}
	public String getStudCntry() {
		return studCntry;
	}
	public void setStudCntry(String studCntry) {
		this.studCntry = studCntry;
	}
	public List<String> getStudLang() {
		return studLang;
	}
	public void setStudLang(List<String> studLang) {
		this.studLang = studLang;
	}
	@Override
	public String toString() {
		return "Student [studId=" + studId + ", studName=" + studName + ", studPwd=" + studPwd + ", studGen=" + studGen
				+ ", studAddr=" + studAddr + ", studCntry=" + studCntry + ", studLang=" + studLang + "]";
	}

	
}
