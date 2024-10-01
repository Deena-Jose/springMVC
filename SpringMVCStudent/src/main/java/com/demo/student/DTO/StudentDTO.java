package com.demo.student.DTO;

	import java.io.Serializable;

	import javax.persistence.Column;
	import javax.persistence.Entity;
	import javax.persistence.Id;
	import javax.persistence.Table;

	@Entity
	@Table(name = "Student")
	public class StudentDTO implements Serializable {
		@Id
		@Column(name = "sname")
		private String sname;
		@Column(name = "pwd")
		private String pwd;
		
		public StudentDTO() {
			System.out.println("dto object creted");
			
		}
		public String getSname() {
			return sname;
		}
		public void setSname(String sname) {
			this.sname = sname;
		}
		public String getPwd() {
			return pwd;
		}
		public void setPwd(String pwd) {
			this.pwd = pwd;
		}
		
		

	}


