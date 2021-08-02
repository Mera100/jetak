package life.majd.jetak.jetak.service;

import life.majd.jetak.jetak.model.Business;
import life.majd.jetak.jetak.model.User;
import life.majd.jetak.jetak.repository.BusinessRepo;
import life.majd.jetak.jetak.repository.UserRepo;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
@RequiredArgsConstructor
@Slf4j
public class BusinessServiceImpl implements BusinessService {

    private final BusinessRepo businessRepo;
    private final UserRepo userRepo;


    @Override
    public Business saveBusiness(Business business) {
        log.info("A new Business with the name {} is being created", business.getName());
        return businessRepo.save(business);
    }

    @Override
    public Business getBusiness(String name) {
        return businessRepo.findByName(name);
    }

    @Override
    public Business addOwner(String businessName, String ownerUsername) {
        Business business = businessRepo.findByName(businessName);
        User user = userRepo.findByUsername(ownerUsername);
        business.getOwners().add(user);
        return business;
    }

    @Override
    public List<Business> getBusinesses() {
        return businessRepo.findAll();
    }

    @Override
    public List<Business> getBusinessesByOwner(String ownerName) {
        User user = userRepo.findByUsername(ownerName);
        return businessRepo.findByOwner(user);
    }
}
