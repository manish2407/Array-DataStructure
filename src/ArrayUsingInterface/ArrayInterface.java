package ArrayUsingInterface;

public class ArrayInterface {
    private long[] a;                   //referance to array a
    private int ElementCount;           //variable for ElementCount

    public ArrayInterface(int size) {    //Constructor
        a = new long[size];
        ElementCount = 0;
    }

    //find function for searching
    public void find(long ElementToBesearch) {
        int j;
        for (j = 0; j < ElementCount; j++) {
            if (a[j] == ElementToBesearch) {
                System.out.println("Element " + "found at " + j + " index");
            }
        }
        if (j == ElementCount) {
            System.out.println("Element not found");
        }
    }
    //traverse function for traversing
    public void traverse() {
        for (int j = 0; j < ElementCount; j++) {
            System.out.println("Element at " + j + " index is" + a[j]);
        }
    }
    public void delete(long value) {
            int k;
            for(k=0; k<ElementCount; k++){
                if( value == a[k] )
                    break;
            }
            if(k==ElementCount){
                System.out.println("Element is not present in Array");
            }
            else{
                for(int l=k; l<ElementCount; l++){
                a[k] = a[k+1];
                }
                ElementCount--;
            }
    }
    public void insert(long value){
        a[ElementCount]= value;
        ElementCount++;
    }
}

