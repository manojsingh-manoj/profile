package com.rupine.profile.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.rupine.profile.model.Address;
import com.rupine.profile.model.Profile;
import com.rupine.profile.model.UserDetail;

@Repository
public class ProfileRepo {

	private static List<UserDetail> userDetailList = new ArrayList<UserDetail>();
	
	static {
		UserDetail userDetail1=  new UserDetail();
		userDetail1.setProfile(new Profile("John", "Doe"));
		userDetail1.setAddress(new Address("London", "England"));
		
		UserDetail userDetail2=  new UserDetail();
		userDetail2.setProfile(new Profile("Steve", "Root"));
		userDetail2.setAddress(new Address("Sydny", "Australia"));
		
		userDetailList.add(userDetail1);
		userDetailList.add(userDetail2);
	}
	public List<UserDetail> getUserProfile(){
		return userDetailList;
	}
}
