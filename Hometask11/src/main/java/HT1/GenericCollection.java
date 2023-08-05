package HT1;

public interface GenericCollection <T>{

    void add(T device);

    T getElem (int index);

    void delete(int index);

    boolean contains (T device);

    void clear ();

    void showCollection ();



}
