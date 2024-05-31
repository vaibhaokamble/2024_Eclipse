package org.techhub.repository;

import org.techhub.model.LoginModel;
import org.techhub.model.Register;

public interface RegisterRepository {
	public boolean isRegisterUser(Register register);
	public boolean isValidateUser(LoginModel loginModel);
}
