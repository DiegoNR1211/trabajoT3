package com.rgb.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.rgb.model.entity.Evento;
import com.rgb.model.repository.EventoRepository;
import com.rgb.service.EventoService;
@Service
public class EventoServiceImpl implements EventoService {
	@Autowired
	private EventoRepository EventoRepository;
	@Transactional(readOnly = true)
	@Override
	public List<Evento> findAll() throws Exception {
		// TODO Auto-generated method stub
		return EventoRepository.findAll();
	}
	@Transactional(readOnly = true)
	@Override
	public Optional<Evento> findById(Integer id) throws Exception {
		// TODO Auto-generated method stub
		return EventoRepository.findById(id);
	}
	@Transactional
	@Override
	public Evento save(Evento entity) throws Exception {
		// TODO Auto-generated method stub
		return EventoRepository.save(entity);
	}
	@Transactional
	@Override
	public Evento update(Evento entity) throws Exception {
		// TODO Auto-generated method stub
		return EventoRepository.save(entity);
	}
	
	@Transactional
	@Override
	public void deleteById(Integer  id) throws Exception {
		// TODO Auto-generated method stub
		EventoRepository.deleteById(id);
	}
	@Transactional
	@Override
	public void deleteAll() throws Exception {
		// TODO Auto-generated method stub
		EventoRepository.deleteAll();
	}

}