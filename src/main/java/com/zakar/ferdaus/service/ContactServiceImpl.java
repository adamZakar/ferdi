package com.zakar.ferdaus.service;

import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by Ádám on 2017. 09. 17..
 */
@Service
public class ContactServiceImpl implements ContactService {
    public boolean contactRequestHandler() {
        return true;
    }


    public boolean sendEmail(List<String> addresses, String text) {
        return true;
    }


}
