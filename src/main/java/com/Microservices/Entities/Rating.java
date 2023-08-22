package com.Microservices.Entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class Rating {

	private String ratingId;
	private String userId;
	private String hotelId;
	private String feedBAck;
	private int rateing;
	
	private Hotels hotel;
}
