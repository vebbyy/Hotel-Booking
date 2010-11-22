package com.xebia.hotelBooking.service.impl;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.criterion.Restrictions;
import org.jboss.seam.annotations.In;

import com.xebia.hotelBooking.domain.Hotel;
import com.xebia.hotelBooking.hibernate.HibernateTemplate;
import com.xebia.hotelBooking.model.SearchModel;
import com.xebia.hotelBooking.service.SearchHotelService;


public class SearchHotelServiceImpl implements SearchHotelService {

	private HibernateTemplate<Hotel> hibernateTemplate;

	@In
	private SearchModel searchModel;

	@Override
	public List<Hotel> getHotelList() {

		return hibernateTemplate.executeCriteria(Hotel.class,
				new HibernateTemplate.HibernateCallBack<Hotel>() {

					@Override
					public void setCriteriaData(Criteria criteria) {
						criteria.add(Restrictions.like("name", searchModel
								.getHotelName()
								+ "%"));
						criteria.add(Restrictions.eq("isBooked", 0));

					}

				});

	}

}
