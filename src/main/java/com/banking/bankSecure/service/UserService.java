package com.banking.bankSecure.service;

import com.banking.bankSecure.dto.BankResponse;
import com.banking.bankSecure.dto.UserRequest;

public interface UserService {

	BankResponse createAccount(UserRequest userRequest);
}
