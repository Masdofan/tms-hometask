package HT1;

import java.util.Arrays;

public class TabletCollectionImpl implements GenericCollection <Tablet>{

    private int size = 10;

    public TabletCollectionImpl(int size) {
        this.size = size;
    }

    public TabletCollectionImpl() {
    }

    Tablet[] arr = new Tablet[size];

    @Override
    public void add(Tablet device) {

        if (arr[arr.length - 1] == null) {
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] == null) {
                    arr[i] = device;
                    break;
                }
            }
        } else {
            Tablet[] arr1 = Arrays.copyOf(arr, arr.length + 1);
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
    public Tablet getElem(int index) {
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
    public boolean contains(Tablet device) {

        for (Tablet tablet : arr) {
            if (tablet == device) {
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
