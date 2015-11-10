package com.angulartest.app.services;

import java.util.List;

import com.angulartest.app.model.Alumno;

public interface AlumnosService {
	List <Alumno> find();
	Alumno load(Long id);
	Alumno persist(Alumno alumno);
	Alumno merge(Alumno alumno);
	Alumno delete(Alumno alumno);
}
