public class List<T> {

    private T[] values;
    private int firstIndex;

    @SuppressWarnings("unchecked")
    public List() {
        this.values = (T[]) new Object[10];
        this.firstIndex = 0;
    }

    public void add(T value) {
        if (this.firstIndex == this.values.length) {
            grow();
        }

        this.values[this.firstIndex] = value;
        this.firstIndex++;
    }

    @SuppressWarnings("unchecked")
    private void grow() {
        int newSize = this.values.length + this.values.length / 2;
        T[] newValues = (T[]) new Object[newSize];

        for (int i = 0; i < this.values.length; i++) {
            newValues[i] = this.values[i];
        }

        this.values = newValues;
    }

    public boolean contains(T value) {
        return indexOfValue(value) >= 0;
    }

    public void remove(T value) {
        int indexOfValue = indexOfValue(value);
        if (indexOfValue < 0) {
            return;

        }

        moveToTheLeft(indexOfValue);
        this.firstIndex--;
    }

    public int indexOfValue(T value) {
        for (int i = 0; i < this.firstIndex; i++) {
            if (this.values[i].equals(value)) {
                return i;
            }
        }
        return -1;
    }

    private void moveToTheLeft(int fromIndex) {
        for (int i = fromIndex; i < this.firstIndex; i++) {
            this.values[i] = this.values[i + 1];
        }
    }

    public T value(int index) {
        if (index < 0 || index >= this.firstIndex) {
            throw new ArrayIndexOutOfBoundsException("Index " + index + " outside of [0, " + this.firstIndex + "]");

        }
        return this.values[index];
    }

    public int size() {
        return this.firstIndex;
    }
}
