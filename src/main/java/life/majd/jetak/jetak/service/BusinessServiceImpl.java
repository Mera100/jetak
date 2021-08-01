package life.majd.jetak.jetak.service;

import life.majd.jetak.jetak.model.Business;
import life.majd.jetak.jetak.repository.BusinessRepo;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@RequiredArgsConstructor
@Transactional
@Slf4j
public class BusinessServiceImpl implements BusinessService {
    @Autowired
    private final BusinessRepo businessRepo;


    @Override
    public Business saveBusiness(Business business) {
        return businessRepo.save(business);
    }

    @Override
    public Business getBusiness(String name) {
        return null;
    }

    @Override
    public Business addOwner(String username) {
        return null;
    }

    @Override
    public List<Business> getBusinesses() {
        return businessRepo.findAll();
    }
}
