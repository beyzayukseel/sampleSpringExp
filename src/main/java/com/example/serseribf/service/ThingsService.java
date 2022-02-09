package com.example.serseribf.service;

import com.example.serseribf.exception.IdNotFoundException;
import com.example.serseribf.model.Things;
import com.example.serseribf.repository.ThingsRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Random;

@RequiredArgsConstructor
@Service
public class ThingsService {

    private final ThingsRepository thingsRepository;

    public Things getAllThings() {

        Integer count = thingsRepository.findThingsCount();
        System.out.println(count);
        Random r = new Random();
        int id = r.nextInt(count);
        System.out.println(id);
        return thingsRepository.findById((long) id)
                .orElseThrow(() -> new IdNotFoundException("Id could not find: " + id));

//       List<Things> thing = new ArrayList<>();
//        thingsRepository.findAll().forEach(thing::add);
//        Things randomString = thing
//                .stream()
//                .sorted((o1, o2) -> ThreadLocalRandom.current().nextInt(-1, 2))
//                .findAny().orElse(null);
//        return randomString;

    }
}
