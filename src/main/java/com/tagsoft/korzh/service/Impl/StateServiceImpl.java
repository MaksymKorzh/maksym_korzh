package com.tagsoft.korzh.service.Impl;

import com.tagsoft.korzh.model.StateEntity;
import com.tagsoft.korzh.repository.CountryRepository;
import com.tagsoft.korzh.repository.StateRepository;
import com.tagsoft.korzh.service.StateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StateServiceImpl implements StateService {

    @Autowired
    private StateRepository stateRepository;

    @Autowired
    private CountryRepository countryRepository;

    @Override
    public List<StateEntity> findStatesByName(String name) {
        int countryId = countryRepository.findByName(name).getId();
        return stateRepository.findAllByCountryId(countryId);
    }
}
