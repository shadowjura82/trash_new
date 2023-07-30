package com.example.trash_new.controller;

import com.example.trash_new.service.TrashServiceImpl;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class TrashController {
    private final TrashServiceImpl trashService;

    public TrashController(TrashServiceImpl trashService) {
        this.trashService = trashService;
    }

    @GetMapping("/add")
    public List<Integer> addItems(@RequestParam List<Integer> itemsIds) {
        return trashService.addItems(itemsIds);
    }

    @GetMapping("/get")
    public List<Integer> getItems() {
        return trashService.getItems();
    }
}
