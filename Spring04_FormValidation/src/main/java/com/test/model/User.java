package com.test.model;
import java.util.Date;
import java.util.List;

import javax.validation.constraints.Email;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Past;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.stereotype.Component;
@Component
public class User {
 
	 @NotEmpty
	 private String name;
	 
	 @NotEmpty
	 @Size(min=1,max=10,message="size upto 10 Characters..")  
	 private String role;
	 
	  @NotNull(message = "is required")
	    @Email(message = "Invalid email! Please enter valid email")
    private String email;
    @NotEmpty
    
    @Pattern(regexp="^[a-zA-Z0-9]{2,7}",message="password must be 2 to 7 charachters")
    private String password;
    
    @NotNull @Min(value=18, message="must be equal or greater than 18")  
    @Max(value=45, message="must be equal or less than 45")  
    private Integer age;
     
    @NotEmpty(message="Enter addresss details")
    private String address;
    @NotNull(message="Select gender")
    private String gender;
     
    @DateTimeFormat(pattern="dd/mm/yyyy")
    @NotNull @Past
    private Date birthday;
    
    @NotEmpty(message = "Select at least one language.")
    private List<String> languages;
    
    
	@Override
	public String toString() {
		return "User [name=" + name + ", role=" + role + ", email=" + email + ", password=" + password + ", age=" + age
				+ ", address=" + address + ", gender=" + gender + ", birthday=" + birthday + ", languages=" + languages
				+ "]";
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public List<String> getLanguages() {
		return languages;
	}
	public void setLanguages(List<String> languages) {
		this.languages = languages;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public Date getBirthday() {
		return birthday;
	}
	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
     
    
}