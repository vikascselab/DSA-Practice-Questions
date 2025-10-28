import java.util.*;

public class implementation {
  static class HashMap<K, V> {
    private class Node {
      K key;
      V value;

      public Node(K key, V value) {
        this.key = key;
        this.value = value;
      }
    }

    private int n; // number of key-value pairs
    private int N; // number of buckets
    private LinkedList<Node>[] buckets;

    @SuppressWarnings("unchecked")
    public HashMap() {
      this.N = 4;
      this.buckets = new LinkedList[4];
      for (int i = 0; i < 4; i++) {
        this.buckets[i] = new LinkedList<>();
      }
    }

    private int hashFunction(K key) {
      int hc = key.hashCode();
      return Math.abs(hc) % N;
    }

    private int searchInLL(K key, int bi) {
      LinkedList<Node> ll = buckets[bi];
      for (int i = 0; i < ll.size(); i++) {
        Node node = ll.get(i);
        if (node.key.equals(key)) {
          return i; // found
        }
      }
      return -1; // not found
    }

    // rehash function
    @SuppressWarnings("unchecked")
    private void rehash() {
      LinkedList<Node>[] oldBuckets = buckets;
      N = 2 * N;
      buckets = new LinkedList[N];
      for (int i = 0; i < N; i++) {
        buckets[i] = new LinkedList<>();
      }

      n = 0; // reset count and re-insert all
      for (LinkedList<Node> ll : oldBuckets) {
        for (Node node : ll) {
          put(node.key, node.value);
        }
      }
    }

    // put function
    public void put(K key, V value) {
      int bi = hashFunction(key);
      int di = searchInLL(key, bi);

      if (di != -1) { // key exists, update
        Node node = buckets[bi].get(di);
        node.value = value;
      } else { // key doesn't exist, insert
        buckets[bi].add(new Node(key, value));
        n++;
      }

      double lambda = (double) n / N;
      if (lambda > 2.0) {
        rehash();
      }
    }

    // contains key

    public boolean containsKey(K key) {
      int bi = hashFunction(key);
      int di = searchInLL(key, bi);

      if (di != -1) { // key exists, update
        return true;
      } else { // key doesn't exist, insert
        return false;
      }

    }
    // get function

    public V get(K key) {
      int bi = hashFunction(key);
      int di = searchInLL(key, bi);

      if (di != -1) { // key exists, update
        Node node = buckets[bi].get(di);
        return node.value;
      } else { // key doesn't exist, insert
        return null;
      }

    }

    // remove function
    public V remove(K key) {
      int bi = hashFunction(key);
      int di = searchInLL(key, bi);

      if (di != -1) { // key exists, update
        Node node = buckets[bi].remove(di);
        n--;
        return node.value;
      } else { // key doesn't exist, insert
        return null;
      }

    }

    // keysets
    public ArrayList<K> keySet() {
      ArrayList<K> keys = new ArrayList<>();

      for (int i = 0; i < buckets.length; i++) {
        LinkedList<Node> ll = buckets[i];
        for (Node node : ll) {

          keys.add(node.key);
        }
      }
      return keys;
    }

    // isempty

    public boolean isEmpty() {
      return n == 0;
    }

  }

  public static void main(String[] args) {
    System.out.println("Welcome to HashMap implementation");

    HashMap<String, Integer> hm = new HashMap<>();
    hm.put("India", 700);
    hm.put("China", 765);
    hm.put("Bhutan", 78);
    hm.put("Nepal", 70);
    hm.put("Pakistan", 1);

    // System.out.println(hm);

    ArrayList<String> keys = hm.keySet();

    for (String key : keys) {
      System.out.println(key);

    }

    System.out.println(hm.get("China"));

  }
}
