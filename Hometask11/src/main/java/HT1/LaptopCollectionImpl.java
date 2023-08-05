package HT1;

import java.util.Arrays;

public class LaptopCollectionImpl implements GenericCollection <Laptop>{

    private int size = 10;

    public LaptopCollectionImpl(int size) {
        this.size = size;
    }

    public LaptopCollectionImpl() {
    }

    Laptop[] arr = new Laptop[size];

    @Override
    public void add(Laptop device) {

        if (arr[arr.length - 1] == null) {
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] == null) {
                    arr[i] = device;
                    break;
                }
            }
        } else {
            Laptop[] arr1 = Arrays.copyOf(arr, arr.length + 1);
            for (int i = 0; i < arr1.length; i++) {
                if (arr1[i] == null) {
                    arr1[i] = device;
                    break;
                }
            }
            arr = arr1;

        }

    }

    @Override
    public Laptop getElem(int index) {
        return arr[index];
    }

    @Override
    public void delete(int index) {

        arr[index] = null;

        for (int i = index + 1; i < arr.length; i++) {
            arr[i - 1] = arr[i];
            arr[i] = null;
        }

    }

    @Override
    public boolean contains(Laptop device) {

        for (Laptop laptop : arr) {
            if (laptop == device) {
                return true;
            }
        }
        return false;
    }

    @Override
    public void clear() {

        for (int i = 0; i < arr.length; i++) {
            arr[i] = null;
        }

    }

    @Override
    public void showCollection() {
        System.out.println(Arrays.toString(arr));
    }

}
