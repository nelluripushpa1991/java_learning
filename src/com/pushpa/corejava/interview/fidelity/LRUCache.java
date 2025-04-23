package com.pushpa.corejava.interview.fidelity;

import java.util.LinkedHashMap;
import java.util.Map;

class LRUCache {
    private final Float loadFactor = 0.75f;
    private final int capacity;
    private final Map<Integer, Integer> cache;


    LRUCache(int capacity) {
        this.capacity = capacity;
        this.cache = new LinkedHashMap<Integer, Integer>(capacity, loadFactor, true) {
            @Override
            protected boolean removeEldestEntry(Map.Entry<Integer, Integer> eldest) {
                return size() > capacity;
            }
        };
    }
    public int get(int key) {
        return cache.getOrDefault(key, -1);
    }
    public void put(int key, int value) {
        cache.put(key,value);
    }
}
