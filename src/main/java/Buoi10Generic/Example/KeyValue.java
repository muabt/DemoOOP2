package Buoi10Generic.Example;

public class KeyValue <K, V> {
    private K key;
    private V value;

    public KeyValue() {
    }

    public KeyValue(K k, V v) {
        this.key = k;
        this.value = v;
    }

    public K getKey() {
        return key;
    }

    public void setKey(K key) {
        this.key = key;
    }

    public V getValue() {
        return value;
    }

    public void setValue(V value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "KeyValue[" +
                "key=" + key +
                ", value=" + value +
                ']';
    }
}
