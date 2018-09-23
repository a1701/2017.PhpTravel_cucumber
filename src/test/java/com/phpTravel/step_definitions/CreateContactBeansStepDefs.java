package com.phpTravel.step_definitions;

import java.util.ArrayList;
import java.util.List;

import com.phpTravel.beans.ContactBean;

import cucumber.api.java.en.Then;
import io.cucumber.datatable.DataTable;



public class CreateContactBeansStepDefs {

	@Then("I save a new contact:")
	public void i_save_a_new_contact(List<String> contacts)  {
		
		System.out.println(contacts);
		
		String contactBean = contacts.get(0);
	}

}
