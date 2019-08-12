package com.training.model;

import org.hibernate.validator.constraints.Range;
import org.springframework.format.annotation.NumberFormat;
import org.springframework.stereotype.Controller;
import org.springframework.format.annotation.NumberFormat.Style;



import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@NoArgsConstructor
@Getter
@Setter
@ToString

public class Doctor {

	@NumberFormat(style = Style.NUMBER)
	@Range(max=1000,min=100)
	private long doctorId;
	private String doctorName;
	private String specilization;
	private long phoneNumber;
}
