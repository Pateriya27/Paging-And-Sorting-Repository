package com.runners;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.service.FlightMgmtServiceImpl;
@Component
public class CrudRepositoryTestRunner implements CommandLineRunner{
    @Autowired
	private FlightMgmtServiceImpl service;
	
	@Override
	public void run(String... args) throws Exception {
		
//          Iterable<FlightDetails> itr = service.showFlightsAsSort(true, "company","type");
//          itr.forEach(System.out::println);
//		
//		Page<FlightDetails> page = service.showFlightsByPageNo(0, 1);
//		System.out.println("Current Page : "+(page.getNumber()+1));
//		System.out.println("Total No of Pages : "+page.getTotalPages());
//		System.out.println("Is First : "+page.isFirst());
//		System.out.println("Is Last : "+page.isLast());
//		System.out.println("Page Size : "+page.getSize());
//		System.out.println("Page Element Count : "+page.getNumberOfElements());
//		page.forEach(System.out::println);
		
		
//		
//		Page<FlightDetails> page = service.showFlightsByPageNoAsSorted(1, 6,true,"capacity");
//		System.out.println("Current Page : "+(page.getNumber()+1));
//		System.out.println("Total No of Pages : "+page.getTotalPages());
//		System.out.println("Is First : "+page.isFirst());
//		System.out.println("Is Last : "+page.isLast());
//		System.out.println("Page Size : "+page.getSize());
//		System.out.println("Page Element Count : "+page.getNumberOfElements());
//		page.forEach(System.out::println);
		
		service.showFlightsByPagination(7);
		
		
		
	}

}
