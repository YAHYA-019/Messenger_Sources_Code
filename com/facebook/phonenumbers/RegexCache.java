package com.facebook.phonenumbers;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.regex.Pattern;

/* loaded from: RegexCache.class */
public class RegexCache {
    public LRUCache cache;

    /* loaded from: RegexCache$LRUCache.class */
    public class LRUCache {
        public LinkedHashMap map;
        public int size;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [com.facebook.phonenumbers.RegexCache$LRUCache, java.lang.Object] */
    public RegexCache(int i) {
        ?? obj = new Object();
        obj.size = i;
        obj.map = new LinkedHashMap(((i * 4) / 3) + 1, 0.75f, true) { // from class: com.facebook.phonenumbers.RegexCache.LRUCache.1
            @Override // java.util.LinkedHashMap
            public boolean removeEldestEntry(Map.Entry entry) {
                boolean z = false;
                if (size() > LRUCache.this.size) {
                    z = true;
                }
                return z;
            }
        };
        this.cache = obj;
    }

    public Pattern getPatternForRegex(String str) {
        Object obj;
        LRUCache lRUCache = this.cache;
        synchronized (lRUCache) {
            try {
                obj = lRUCache.map.get(str);
            } catch (Throwable th) {
                throw th;
            }
        }
        Pattern pattern = (Pattern) obj;
        if (pattern == null) {
            pattern = Pattern.compile(str);
            lRUCache = this.cache;
            synchronized (lRUCache) {
                lRUCache.map.put(str, pattern);
            }
        }
        return pattern;
    }
}
