package com.rgb.init;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import com.rgb.model.entity.Usuario;
import com.rgb.model.repository.AuthorityRepository;
import com.rgb.model.repository.UsuarioRepository;



@Service
public class InitDB implements CommandLineRunner{

	@Autowired
	private UsuarioRepository usuarioRepository;
	
	@Autowired
	private AuthorityRepository authorityRepository;
	
	@Autowired
    private PasswordEncoder passwordEncoder;

	@Override
	public void run(String... args) throws Exception {
		
		this.usuarioRepository.deleteAll();
		this.authorityRepository.deleteAll();
		
		Usuario diego = new Usuario();
		diego.setUsername("diego");
		diego.setPassword(passwordEncoder.encode("diego"));
		diego.setApellido("Diego");
		diego.setNombre("Noblecilla");
		diego.getTelefono();
		diego.setEnable(true);
		
		Usuario admin = new Usuario();
		admin.setUsername("admin");
		admin.setPassword(passwordEncoder.encode("admin"));
		admin.setApellido("Noblecilla");
		admin.setNombre("Diego");
		admin.setTelefono(null);
		admin.setEnable(true);
		
        Usuario manager = new Usuario();
        manager.setUsername("manager");
        manager.setPassword(passwordEncoder.encode("manager"));
        manager.setApellido("Noblecilla");
		manager.setNombre("Diego");
		manager.setTelefono(null);
        manager.setEnable(true);
        
        diego.addAuthority("ROLE_USER");
        admin.addAuthority("ROLE_ADMIN");
        admin.addAuthority("ACCESS_REST1");
        admin.addAuthority("ACCESS_REST2");
        manager.addAuthority("ROLE_MANAGER");
        manager.addAuthority("ACCESS_REST1");
        
        List<Usuario> usuarios = Arrays.asList(diego, admin, manager);        
        this.usuarioRepository.saveAll(usuarios);	
	}
}
