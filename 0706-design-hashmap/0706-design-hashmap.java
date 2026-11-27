class MyHashMap {

    int[] values;
    boolean[] present;

    public MyHashMap() {
        values = new int[1000001];
        present = new boolean[1000001];
    }

    
    public void put(int key, int value) {
        values[key] = value;
        present[key] = true;
    }

   
    public int get(int key) {
        if (present[key]) {
            return values[key];
        }

        return -1;
    }

   
    public void remove(int key) {
        present[key] = false;
    }
}