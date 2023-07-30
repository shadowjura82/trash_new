package com.example.trash_new.service;

import java.util.List;

public interface TrashService {
    List<Integer> addItems(List<Integer> itemsIds);

    List<Integer> getItems();
}
