package com.example.Img_Store;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PropService {
    
    @Autowired
    PropRepository pr;

    public void save(Prop prop) {
        pr.save(prop);
    }

    public List<Prop> getAllInquiries() {
        return pr.findAll();
    }

}
