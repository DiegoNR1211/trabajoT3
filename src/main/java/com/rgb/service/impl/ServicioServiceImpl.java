package com.rgb.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.rgb.model.entity.Servicio;
import com.rgb.model.repository.ServicioRepository;
import com.rgb.service.ServicioService;
@Service
public class ServicioServiceImpl implements ServicioService {
	@Autowired
	private ServicioRepository ServicioRepository;
	@Transactional(readOnly = true)
	@Override
	public List<Servicio> findAll() throws Exception {
		// TODO Auto-generated method stub
		return ServicioRepository.findAll();
	}
	@Transactional(readOnly = true)
	@Override
	public Optional<Servicio> findById(String  id) throws Exception {
		// TODO Auto-generated method stub
		return ServicioRepository.findById(id);
	}
	@Transactional
	@Override
	public Servicio save(Servicio entity) throws Exception {
		// TODO Auto-generated method stub
		return ServicioRepository.save(entity);
	}
	@Transactional
	@Override
	public Servicio update(Servicio entity) throws Exception {
		// TODO Auto-generated method stub
		return ServicioRepository.save(entity);
	}
	
	@Transactional
	@Override
	public void deleteById(String  id) throws Exception {
		// TODO Auto-generated method stub
		ServicioRepository.deleteById(id);
	}
	@Transactional
	@Override
	public void deleteAll() throws Exception {
		// TODO Auto-generated method stub
		ServicioRepository.deleteAll();
	}

}