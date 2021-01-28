package com.estudo.pontointeligente.api.utils;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

public class PasswordUltils {

	private static final Logger log = LoggerFactory.getLogger(PasswordUltils.class);
	
	public PasswordUltils(){
		
	}
	
	public static String gerarBCrypt(String senha) {
		if (senha == null)
			return senha;

		log.info("Gerar hash com BCrypt. ");
		BCryptPasswordEncoder bCryptEnconder = new BCryptPasswordEncoder();
		return bCryptEnconder.encode(senha);
	}

}
