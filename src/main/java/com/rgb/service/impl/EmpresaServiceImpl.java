package com.rgb.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.rgb.model.entity.Empresa;
import com.rgb.model.repository.EmpresaRepository;
import com.rgb.service.EmpresaService;
@Service
public class EmpresaServiceImpl implements EmpresaService {
	@Autowired
	private EmpresaRepository EmpresaRepository;
	@Transactional(readOnly = true)
	@Override
	public List<Empresa> findAll() throws Exception {
		// TODO Auto-generated method stub
		return EmpresaRepository.findAll();
	}
	@Transactional(readOnly = true)
	@Override
	public Optional<Empresa> findById(String id) throws Exception {
		// TODO Auto-generated method stub
		return EmpresaRepository.findById(id);
	}
	@Transactional
	@Override
	public Empresa save(Empresa entity) throws Exception {
		// TODO Auto-generated method stub
		return EmpresaRepository.save(entity);
	}
	@Transactional
	@Override
	public Empresa update(Empresa entity) throws Exception {
		// TODO Auto-generated method stub
		return EmpresaRepository.save(entity);
	}
	
	@Transactional
	@Override
	public void deleteById(String  id) throws Exception {
		// TODO Auto-generated method stub
		EmpresaRepository.deleteById(id);
	}
	@Transactional
	@Override
	public void deleteAll() throws Exception {
		// TODO Auto-generated method stub
		EmpresaRepository.deleteAll();
	}

}