package com.rgb.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.rgb.model.entity.Cotizacion;
import com.rgb.model.repository.CotizacionRepository;
import com.rgb.service.CotizacionService;
@Service
public class CotizacionServiceImpl implements CotizacionService {
	@Autowired
	private CotizacionRepository CotizacionRepository;
	@Transactional(readOnly = true)
	@Override
	public List<Cotizacion> findAll() throws Exception {
		// TODO Auto-generated method stub
		return CotizacionRepository.findAll();
	}
	@Transactional(readOnly = true)
	@Override
	public Optional<Cotizacion> findById(Integer  id) throws Exception {
		// TODO Auto-generated method stub
		return CotizacionRepository.findById(id);
	}
	@Transactional
	@Override
	public Cotizacion save(Cotizacion entity) throws Exception {
		// TODO Auto-generated method stub
		return CotizacionRepository.save(entity);
	}
	@Transactional
	@Override
	public Cotizacion update(Cotizacion entity) throws Exception {
		// TODO Auto-generated method stub
		return CotizacionRepository.save(entity);
	}
	
	@Transactional
	@Override
	public void deleteById(Integer  id) throws Exception {
		// TODO Auto-generated method stub
		CotizacionRepository.deleteById(id);
	}
	@Transactional
	@Override
	public void deleteAll() throws Exception {
		// TODO Auto-generated method stub
		CotizacionRepository.deleteAll();
	}

}