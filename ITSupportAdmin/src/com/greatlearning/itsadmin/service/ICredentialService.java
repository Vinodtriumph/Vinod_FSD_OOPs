package com.greatlearning.itsadmin.service;

import com.greatlearning.itsadmin.model.Employee;

public interface ICredentialService {

	public void generateEmail(Employee employee);
	public void generatePassword(Employee employee);
	public void showCredentials(Employee employee);
}
