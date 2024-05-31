package org.techhub.service;

import org.techhub.model.Register;
import org.techhub.repository.RegisterRepositoryImpl;

public class RegisterServiceImpl implements RegisterService {
	RegisterRepositoryImpl regRepo = new RegisterRepositoryImpl();

	@Override
	public boolean isRegisterUser(Register register) {
//		String email=register.getEmail();
//		int index =email.indexOf("@gmail.com");
//		int index=register.getEmail().indexOf("@gmail.com");
		if (register.getEmail().indexOf("@gmail.com") != -1) {
			boolean b = regRepo.isRegisterUser(register);
			return b;
		} else {
			return false;
		}

	}

}
