package ArrayUsingInterface;

public class ArrayMain {
    public static void main(String[] args) {
        ArrayInterface myobj = new ArrayInterface(7);
        myobj.insert(11);
        myobj.insert(22);
        myobj.insert(33);
        myobj.insert(44);
        myobj.insert(55);
        myobj.insert(66);
        myobj.insert(77);
        myobj.traverse();


    }
}
