package ArrayUsingInterface;

public class ArrayInterface {
        private long[] a;                   //referance to array a
        private int ElementCount;           //variable for ElementCount
        public ArrayInterface(int size){    //Constructor
            a = new long[size];
            ElementCount = 0;
    }
    //find function for searching
    public  void find(long ElementToBesearch){
        int j;
        for(j=0; j<ElementCount; j++){
            if(a[j] == ElementToBesearch){
                System.out.println("Element "+"found at "+j+" index");
            }
        }
        if(j==ElementCount){
            System.out.println("Element not found");
        }

    }

}
