package org.example;



import java.util.HashMap;


public class CountingSet<K> extends HashMap<K, Double> {

    public Double increment(K key, double amount) {
        Double d = getCount(key);
        put(key, (d = d + amount));
        return d;
    }

    public double getCount(K key) {
        Double d = get(key);
        if (d == null) {
            return 0.0;
        }
        return d;
    }
}
