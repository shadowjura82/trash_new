package com.example.trash_new.service;

import com.example.trash_new.model.Trash;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class TrashServiceImpl implements TrashService{
    private final Trash trash;

    public TrashServiceImpl(Trash trash) {
        this.trash = trash;
    }

    @Override
    public List<Integer> addItems(List<Integer> itemsIds) {
        return trash.setItems(itemsIds);
    }

    @Override
    public List<Integer> getItems() {
        return trash.getItems();
    }
}
