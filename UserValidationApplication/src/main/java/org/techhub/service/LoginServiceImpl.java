package org.techhub.service;

import org.techhub.model.LoginModel;
import org.techhub.repository.RegisterRepositoryImpl;

public class LoginServiceImpl implements LoginService{

	RegisterRepositoryImpl regRepo= new RegisterRepositoryImpl();
	@Override
	public boolean isValidateUser(LoginModel model) {
		// TODO Auto-generated method stub
		//boolean b=regRepo.isValidateUser(model);
		//return b;
		return regRepo.isValidateUser(model);
	}

}
