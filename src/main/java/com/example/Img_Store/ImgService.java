package com.example.Img_Store;

import java.io.IOException;
import java.util.Base64;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ImgService {
    @Autowired
    ImgRepository ir;

    public void saveUser(Img i, byte[] imageData) throws IOException {
        if (imageData != null && imageData.length > 0) {
            i.setImage(imageData);
        }
        ir.save(i);
    }

    public List<Img> viewdetails() {
        List<Img> users = ir.findAll();
        for (Img user : users) {
            if (user.getImage() != null) {
                String imageName = Base64.getEncoder().encodeToString(user.getImage());
                user.setImageName(imageName);
            }
        }
        return users;
    }
}
