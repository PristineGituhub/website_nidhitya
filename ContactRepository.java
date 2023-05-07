package com.ankur.nidhitya.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ankur.nidhitya.entity.Contact;

public interface ContactRepository extends JpaRepository<Contact, Long>{

}
