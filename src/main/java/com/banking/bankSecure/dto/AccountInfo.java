package com.banking.bankSecure.dto;

import java.math.BigDecimal;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class AccountInfo {

	private String accountName;
	private BigDecimal accountBalance;
	private String accountNumber;
	public static Object builder() {
		// TODO Auto-generated method stub
		return null;
	}
	
}
