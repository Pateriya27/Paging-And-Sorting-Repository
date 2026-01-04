package com.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.entity.FlightDetails;
import com.repository.IFlightDetailsRepository;

@Service
public class FlightMgmtServiceImpl implements IFlightMgmtService {

	@Autowired
	private IFlightDetailsRepository repository;

	@Override
	public Iterable<FlightDetails> showFlightsAsSort(boolean ascOrder, String... props) {
		
		Sort sort=Sort.by(ascOrder?Sort.Direction.ASC:Sort.Direction.DESC,props);
		
		Iterable<FlightDetails> it = repository.findAll(sort);
		
		return it;
	}

	@Override
	public Page<FlightDetails> showFlightsByPageNo(int pageNo, int pageSize) {
		Pageable page=PageRequest.of(pageNo, pageSize);
		Page<FlightDetails> itr = repository.findAll(page);
		return itr;
	}

	@Override
	public Page<FlightDetails> showFlightsByPageNoAsSorted(int pageNo, int pageSize, boolean ascOrder,
			String... props) {
		Sort sort=Sort.by(ascOrder?Sort.Direction.ASC:Sort.Direction.DESC, props);
		Pageable pageable=PageRequest.of(pageNo, pageSize, sort);
		Page<FlightDetails> page=repository.findAll(pageable);
		return page;
	}

	@Override
	public void showFlightsByPagination(int pageSize) {
		
		long count = repository.count();
		
		int pageCount=(int)count/pageSize;
		
		if(count%pageSize!=0) 
			pageCount++;
		
		
		Sort sort=Sort.by(Sort.Direction.ASC, "fno");
		
		for(int i=0;i<pageCount;i++) {
		Pageable pageable=PageRequest.of(i, pageSize,sort);
		Page<FlightDetails> page = repository.findAll(pageable);
		System.out.println("------------------------------------------------------");
		System.out.println("Page No :: "+(page.getNumber()+1));
		page.forEach(System.out::println);
		System.out.println("------------------------------------------------------");
		}
		
	}
	
   
}
