package com.example.trash_new.model;

import org.springframework.stereotype.Component;
import org.springframework.web.context.annotation.SessionScope;

import java.util.ArrayList;
import java.util.List;

@Component
@SessionScope
public class Trash {
    private final List<Integer> items;

    public Trash() {
        this.items = new ArrayList<>();
    }

    public List<Integer> setItems(List<Integer> itemsIds) {
        items.addAll(itemsIds);
        return items;
    }

    public List<Integer> getItems() {
        return items;
    }
}
