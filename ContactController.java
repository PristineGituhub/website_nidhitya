package com.ankur.nidhitya.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;


import com.ankur.nidhitya.entity.Contact;
import com.ankur.nidhitya.service.ContactService;

@Controller
public class ContactController {
	
	private ContactService contactService;
	
	public ContactController(ContactService contactService) {
		this.contactService = contactService;
	}
    	
	//Adding new Contact
	
	@GetMapping("/contact/new") 
	public String createStudentForm(Model model) {
		
		//Creating student obj to hold value from form
		Contact contact = new Contact();
		model.addAttribute("contact", contact);
		return "create_contact";
			}
	
	//Rest client to save the form data
	
	@PostMapping("/contacts")
	public String saveStudent(@ModelAttribute("contact") Contact contact) {
		contactService.saveStudent(contact);
		return "redirect:/thankyou";
	}
	
	
}


