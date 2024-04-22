package com.micro.i113_security.controller;

import com.micro.i113_security.model.Role;
import com.micro.i113_security.model.Status;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

@RestController
//@CrossOrigin //needed to Vue
@RequestMapping("/api/auth/admin/data")
public class DataController {

    @GetMapping("/status")
    public List<Status> getStatuses() {
        return Arrays.stream(Status.values()).collect(Collectors.toList());
    }

    @GetMapping("/roles")
    public List<Role> getRoles() {
        return Arrays.stream(Role.values()).collect(Collectors.toList());
    }
}
