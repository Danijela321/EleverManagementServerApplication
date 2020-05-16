//package com.yrgo.elevermanagement;
//
//import java.util.List;
//import javax.ejb.Stateless;
//import javax.inject.Inject;
//import javax.jws.WebService;
//
//import com.yrgo.domain.Elever;
//
///**
// * 
// *@author Danijela
// *
// */
//
//@Stateless
//@WebService(name="EleverManagementWebService")
//public class EleverManagementWebserviceImplementation {
//
//	@Inject
//	private EleverManagementServiceLocal service;
//	
//	/**
//	 * @author Danijela
//	 * @param id
//	 * @return
//	 */
//	
//	public Elever getEleverById(int id) {
//		return service.getById(id);
//	}
//	
//	/**
//	 * @author Danijela
//	 * @return
//	 */
//	public List<Elever> getAllElever() {
//		return service.getAllElever();
//	}
//	
//	/**
//	 * @author Danijela
//	 * @param surname
//	 * @return
//	 */
//	public List<Elever> searchBysurname(String surname) {
//		return service.searchBysurname(surname);
//	}
//	
//}
