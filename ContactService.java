package com.ankur.nidhitya.service;

import java.util.List;

import com.ankur.nidhitya.entity.Contact;

public interface ContactService {
	List<Contact> getAllStudentList();
	Contact saveStudent(Contact contact);
	Contact getStudentById(Long id);
	Contact updateStudent(Contact contact);
	void deleteStudentById(Long id);

}
