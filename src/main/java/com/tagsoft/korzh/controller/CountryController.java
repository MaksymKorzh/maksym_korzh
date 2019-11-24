package com.tagsoft.korzh.controller;

import com.tagsoft.korzh.model.StateEntity;
import com.tagsoft.korzh.service.StateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping("/country")
public class CountryController {

    @Autowired
    private StateService stateService;

    @GetMapping(produces = "application/json; charset=UTF-8")
    @ResponseBody
    public List<StateEntity> getCities(@RequestParam String name) {
        return stateService.findStatesByName(name);
    }

}
