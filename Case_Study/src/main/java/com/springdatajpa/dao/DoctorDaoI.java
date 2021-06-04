package com.springdatajpa.dao;

import java.util.List;

import com.springdatajpa.entities.Doctor;

public interface DoctorDaoI {
	public boolean addDoctor(Doctor doc);
	public Doctor getDoc(int id);
	public Doctor updateDoc(Doctor doc);
	public Doctor removeDoc(int id);
	public List<Doctor> getAllDoctors();
}