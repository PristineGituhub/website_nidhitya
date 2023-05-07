package com.ankur.nidhitya.service.impl;

import java.util.List;

//import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ankur.nidhitya.entity.Contact;
import com.ankur.nidhitya.repository.ContactRepository;
import com.ankur.nidhitya.service.ContactService;

@Service
public class ContactServiceImpl implements ContactService{
	
	
	private ContactRepository contactRepository;
	
	//@Autowired
	public ContactServiceImpl(ContactRepository contactRepository) {
		this.contactRepository = contactRepository;
	}



	@Override
	public List<Contact> getAllStudentList() {
		return contactRepository.findAll();
	}



	@Override
	public Contact saveStudent(Contact contact) {
		// TODO Auto-generated method stub
		return contactRepository.save(contact);
	}



	@Override
	public Contact getStudentById(Long id) {
		return contactRepository.findById(id).get();
	}



	@Override
	public Contact updateStudent(Contact contact) {
		// TODO Auto-generated method stub
		return contactRepository.save(contact);
	}



	@Override
	public void deleteStudentById(Long id) {
		contactRepository.deleteById(id);
		
	}

}
