public class ArrayClass {
    int[] ar = new int[5];                      //declare array
    int[] arr = {10,20,30,40,50,40};            //declaring array using alternate method
    //traverse function
    public void traverseFunction(){
        for(int i =0; i<arr.length;i++){
            System.out.println("Element at index "+i+" is "+arr[i]);
        }
    }
    //insert function
    public void insertFunction(int item, int match){
        for(int i =0; i<arr.length;i++){
            if(arr[i]==match){
                arr[i]=item;
            }
        }
    }
    //searching function
    public void searchFunction(int searchItem){
        for(int i =0; i<arr.length;i++){
            if(arr[i]==searchItem){
                System.out.println("Element found at "+i+" index");
            }
        }
    }
    //
    public static void main(String[] args) {
        ArrayClass arrobj = new ArrayClass();
        /*System.out.println("Array before insertion is----");
        arrobj.traverseFunction();
        System.out.println("Array after insertion is----");
        arrobj.insertFunction(80,40);
        arrobj.traverseFunction();*/
        arrobj.searchFunction(40);
    }
}
