package com.service;

import org.springframework.data.domain.Page;

import com.entity.FlightDetails;

public interface IFlightMgmtService {
	
	public Iterable<FlightDetails> showFlightsAsSort(boolean ascOrder,String ...props);
	public Page<FlightDetails> showFlightsByPageNo(int pageNo,int pageSize);
	public Page<FlightDetails> showFlightsByPageNoAsSorted(int pageNo,int pageSize,boolean ascOrder,String ...props);
	
	public void showFlightsByPagination(int pageSize);

}
