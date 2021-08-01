package life.majd.jetak.jetak.service;

import life.majd.jetak.jetak.model.Business;

import java.util.List;

public interface BusinessService {
    Business saveBusiness(Business business);

    Business getBusiness(String name);

    Business addOwner(String businessName, String ownerName);

    List<Business> getBusinesses();

    List<Business> getBusinessesByOwner(String name);


}
