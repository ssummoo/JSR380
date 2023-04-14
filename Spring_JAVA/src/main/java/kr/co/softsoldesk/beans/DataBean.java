package kr.co.softsoldesk.beans;

import javax.validation.constraints.Email;
import javax.validation.constraints.Negative;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Positive;


import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
public class DataBean {
	
	@NotEmpty //공백을 인정함
	private String data1;
	
	@NotBlank //공백을 인정함
	private String data2;
	
	//0보다 커야함(양수)
		@Positive
		private int data3;
		
		//0 또는 양수만 허용
		@Positive
		private int data4;
		
		//음수만 허용
		@Negative
		private int data5;
		
		//0 또는 음수만 허용
		@Negative
		private int data6;
		
		@Email
		private String data7;
	
		public DataBean() {
			this.data1 = "abcd";
			this.data2 = "abcd";
			this.data3 = 50;
			this.data4 = 50;
			this.data5 = -50;
			this.data6 = -50;
		}
}