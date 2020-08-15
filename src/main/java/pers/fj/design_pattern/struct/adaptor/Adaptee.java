package pers.fj.design_pattern.struct.adaptor;

import java.util.HashMap;
import java.util.Map;

public class Adaptee {
    private final Map<Integer, AdapteeResult> cache;

    public Adaptee() {
        cache = new HashMap<>();
        cache.put(1, new AdapteeResult(1, "a1"));
        cache.put(2, new AdapteeResult(2, "b1"));
    }

    public AdapteeResult request(int type) {
        return cache.get(type);
    }
}
