package com.xebia.hotelBooking.action;

import java.util.List;

import org.jboss.seam.ScopeType;
import org.jboss.seam.annotations.In;
import org.jboss.seam.annotations.Name;
import org.jboss.seam.annotations.Out;

import com.xebia.hotelBooking.domain.Hotel;
import com.xebia.hotelBooking.service.SearchHotelService;

@Name("searchAction")
public class SearchAction {

	@In
	private SearchHotelService searchHotelService;

	@Out(required = false, scope=ScopeType.PAGE)
	private List<Hotel> hotelList;

	public void getHotelList() {

		hotelList = searchHotelService.getHotelList();
	}
}
