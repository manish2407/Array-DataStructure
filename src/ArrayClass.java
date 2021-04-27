public class ArrayClass {
    int[] ar = new int[5];                      //declare array
    int[] arr = {10,20,30,40,50,60};            //declaring array using alternate method
    public void traverse(){
        for(int i =0; i<arr.length;i++){
            System.out.println("Element at index "+i+" is "+arr[i]);
        }
    }
    public static void main(String[] args) {
        ArrayClass arrobj = new ArrayClass();
        arrobj.traverse();
    }
}
