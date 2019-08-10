package HashMap;

public class HashMap {
    private String[] data;
    private int length = 0;

    public HashMap(int size) {
        this.data = new String[size];
    }

    private int hash(String key) {
        int hash = 0;

        for (int i = 0; i < key.length(); i++) {
            hash = (hash + key.charAt(i) * i) % this.data.length;
        }

        return hash;
    }

    public void set(String key, String value) {
        int address = this.hash(key);

        //if (this.data[address] != null) {
        //    this.data[address] = "";
       //}

        this.data[address] = value;
        this.length++;
    }

    public String get(String key) {
        int address = this.hash(key);

        return this.data[address];
    }

    public String[] getValues() {
        String[] values = new String[this.length];
        int index = 0;

        for (int i = 0; i < this.data.length; i++) {
            if (this.data[i] != null) {
                values[index++] = this.data[i];
            }
        }

        return values;
    }

}
