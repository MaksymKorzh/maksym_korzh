package com.tagsoft.korzh.service;

import com.tagsoft.korzh.model.StateEntity;

import java.util.List;

public interface StateService {

    List<StateEntity> findStatesByName(String name);
}
