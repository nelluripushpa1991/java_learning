package com.pushpa.corejava.interview;

import java.util.*;

class BrowserCacheLeastRecentlyUsed {
    private Float loadFactor = 0.5f;

    private final int capacity;
    private final LinkedHashMap<String, String> lruCache;

    BrowserCacheLeastRecentlyUsed(int capacity) {
        this.capacity = capacity;
        this.lruCache = new LinkedHashMap<String, String>(capacity, loadFactor, true) {
            @Override
            protected boolean removeEldestEntry(Map.Entry<String, String> older) {
                return size() > BrowserCacheLeastRecentlyUsed.this.capacity;
            }
        };
    }

    public void visitSite(String site) {
        lruCache.put(site, site+"-visited");
    }

    public void showSites() {
        for (Map.Entry<String, String> entry : this.lruCache.entrySet()) {
            System.out.println("visited sites : "+entry.getKey()+"<---->"+entry.getValue());
        }
    }

    public static void main(String[] args) {
        BrowserCacheLeastRecentlyUsed browseCache = new BrowserCacheLeastRecentlyUsed(5);
        browseCache.visitSite("abc1.com");
        browseCache.visitSite("abc2.com");
        browseCache.visitSite("abc3.com");
        browseCache.visitSite("abc4.com");
        browseCache.visitSite("abc5.com");
        browseCache.showSites();

        System.out.println("##################### capacity full for the map ##########################");
        // extra site added
        browseCache.visitSite("abc6.com");
        browseCache.showSites();

        System.out.println("*********************** added already visited site ***************************");
        // already visited site
        browseCache.visitSite("abc3.com");
        browseCache.showSites();
        System.out.println("done");
    }
}


