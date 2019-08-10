package Array;

public class Array {

    private int length = 0;
    private Object[] data;

    public Array(int size) {
        this.data = new Object[size];
    }

    public void add(Object item) {
        this.data[length] = item;
        this.length++;
    }

    public Object get(int index) {
        return this.data[index];
    }

    public void remove(int index) {
        this.shiftItems(index);
    }

    public int size() {
        return this.length;
    }

    private void shiftItems(int index) {
        for (int i = index; i < this.length; i++) {
            this.data[i] = this.data[i + 1];
        }

        this.data[length - 1] = null;
        this.length--;
    }

}
