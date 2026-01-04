package com.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;

import com.entity.FlightDetails;

public interface IFlightDetailsRepository extends CrudRepository<FlightDetails,Integer>,PagingAndSortingRepository<FlightDetails, Integer>{

}
